package Modelo;
import java.sql.*;

import factory.ConnectionFactory;


public class TestaConecao {

    public static void main(String[] args) throws SQLException {
    	ConnectionFactory cria = new ConnectionFactory();
        Connection con = cria.conn();
        System.out.println("Fechando conexão ");
        
        con.close();
    }
}
	