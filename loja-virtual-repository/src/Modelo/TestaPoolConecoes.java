package Modelo;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TestaPoolConecoes {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for (int i = 1; i <= 20; i++) {
			connectionFactory.conn();
			System.out.println("Conexão de número: " + i);
		}

	}

}
