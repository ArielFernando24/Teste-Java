package Modelo;
import java.sql.*;

import factory.ConnectionFactory;


public class testaInsercaoComParametros { // quando o tiver uma descriçao, quando insere o produto
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		try (Connection connection = factory.conn()){
			connection.setAutoCommit(false);
		
			try (PreparedStatement stm = connection.prepareStatement
					("INSERT INTO PRODUTO(nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)){
				
				adicionarVariavel("SmartTV", "48 pol", stm);
				adicionarVariavel("Radio", "radinho de pilha", stm);
				
				connection.commit();
				
				stm.close();
				connection.close();
			}catch (Exception e) { // garante que ou todo mundo é valido, ou ninguem entra
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				connection.rollback();
			}
			}
	}

private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
	stm.setString(1, nome);
	stm.setString(2, descricao);
	
	if(nome.equals("Radio")){
		throw new RuntimeException("Nao foi possivel adicionar o produto");
		}
	
	stm.execute();
	
	try(ResultSet rst = stm.getGeneratedKeys()){
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
	}
	}
}
}
