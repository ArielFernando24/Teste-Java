package Modelo;
import java.sql.SQLException;

import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class testaRemocao {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.conn();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID <?");
		stm.setInt(1, 2);
		
		stm.execute();
		
		Integer linhasM = stm.getUpdateCount();
		
		System.out.println("Quantas linhas foram modificadas? " + linhasM);
		
		stm.close();
		connection.close();
	}
}
