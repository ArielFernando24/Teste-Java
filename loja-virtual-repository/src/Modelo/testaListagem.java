package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConnectionFactory;
 

public class testaListagem {

    public static void main(String[] args) throws SQLException {
    	
        ConnectionFactory cria = new ConnectionFactory();
        Connection con = cria.conn();
        
        PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        stm.execute();
        ResultSet rst =stm.getResultSet();
        
        while (rst.next()) {
        	Integer id = rst.getInt("ID");
        	System.out.println(id);
        	String nome = rst.getString("NOME");
        	System.out.println(nome);
        	String descricao = rst.getString("DESCRICAO");
        	System.out.println(descricao);
        }
        con.close();
    }
}
