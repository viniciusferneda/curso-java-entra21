package br.com.vinicius.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.dao.ProdutosDAO;
import br.com.vinicius.jdbc.hsqldb.ConnectionPool;
import br.com.vinicius.model.Produto;

public class TestaInsercaoDeProduto {

	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa Vermelha", "Mesa com 4 pés");
		try (Connection con = new ConnectionPool().getConnection()) {
			ProdutosDAO dao = new ProdutosDAO(con);
			
			dao.salva(mesa);
			
			List<Produto> produtos = dao.lista();
            for (Produto produto : produtos) {
                System.out.println("Existe o produto: " + produto);
            }
            
		}
	}
	
}
