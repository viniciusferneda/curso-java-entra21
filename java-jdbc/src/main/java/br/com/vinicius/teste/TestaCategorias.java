package br.com.vinicius.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.dao.CategoriasDAO;
import br.com.vinicius.jdbc.hsqldb.ConnectionPool;
import br.com.vinicius.model.Categoria;
import br.com.vinicius.model.Produto;

public class TestaCategorias {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPool().getConnection()) {
			List<Categoria> categorias = new CategoriasDAO(con).listaComProdutos();
            for(Categoria categoria : categorias) {
                System.out.println(categoria.getNome());
                for(Produto produto : categoria.getProdutos()) {
                    System.out.println(categoria.getNome() + " - " + produto.getNome());
                }
            }
		}
	}

}
