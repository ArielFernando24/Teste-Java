package Modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import DAO.ProdutoDAO;
import factory.ConnectionFactory;

public class TesteInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("Comoda", "Comoda Vertical");

		try(Connection connection = new ConnectionFactory().conn()){
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.salvar(comoda);
			List<Produto> listaDeProdutos = ProdutoDAO.listar();
			listaDeProdutos.stream().forEach(lp-> System.out.println(lp));
		
	}

}
}