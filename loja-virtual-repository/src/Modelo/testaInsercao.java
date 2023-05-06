package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.ConnectionFactory;

public class testaInsercao {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.conn();
		
		Statement stm = connection.createStatement();
		
		stm.execute("INSERT INTO PRODUTO(nome, descricao) VALUES('Celular', 'Nokia tijolao')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
	}
}
