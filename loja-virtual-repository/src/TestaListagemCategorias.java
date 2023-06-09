import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import DAO.CategoriaDAO;
import Modelo.Categoria;
import Modelo.Produto;
import factory.ConnectionFactory;

public class TestaListagemCategorias {

	public static void main(String[] args) throws SQLException{
		
		try(Connection connection = new ConnectionFactory().conn()){
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection); 
			
			List<Categoria> listaDeCategoria = categoriaDAO.listarComProdutos();
			listaDeCategoria.stream().forEach(ct->{
				System.out.println(ct.getNome());
					for (Produto produto : ct.getProdutos()) {
						System.out.println(ct.getNome() + " - " + produto.getNome());
						
		
				}
			});
		}

	}

}
