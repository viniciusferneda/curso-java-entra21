package br.com.vinicius.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.vinicius.model.Categoria;
import br.com.vinicius.model.Produto;

public class ProdutosDAO {

	private Connection con;

    public ProdutosDAO(Connection con) {
        this.con = con;
    }
    
    public void salva(Produto produto) throws SQLException {
		String sql = "insert into Produto (nome, descricao) values(?, ?)";
		try (PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());

			statement.execute();

		    try (ResultSet rs = statement.getGeneratedKeys()) {
		        if (rs.next()) {
		            int id = rs.getInt("id");
		            produto.setId(id);
		        }
		    }
		    System.out.println("A mesa foi inserida com sucesso " + produto);
		}
	}
    
    public List<Produto> lista() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "select * from Produto";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.execute();
            transformaResultadoEmProdutos(produtos, stmt);
        }
        return produtos;
    }

	private void transformaResultadoEmProdutos(List<Produto> produtos, PreparedStatement stmt) throws SQLException {
		try (ResultSet rs = stmt.getResultSet()) {
		    while (rs.next()) {
		        int id = rs.getInt("id");
		        String nome = rs.getString("nome");
		        String descricao = rs.getString("descricao");
		        Produto produto = new Produto(nome, descricao);
		        produto.setId(id);
		        produtos.add(produto);
		    }
		}
	}
	
	public List<Produto> busca(Categoria categoria) throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        
        String sql = "select * from Produto where categoria_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, categoria.getId());
            stmt.execute();
            transformaResultadoEmProdutos(produtos, stmt);
        }
        
        return produtos;
    }
}
