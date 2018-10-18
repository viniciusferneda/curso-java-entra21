package br.com.vinicius.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vinicius.animais.model.Cachorro;

public class CachorroDAO {

	private final Connection conn;
	
	public CachorroDAO(Connection con) {
		this.conn = con;
	}
	
	public boolean inserir(Cachorro cachorro) throws SQLException{
		String sql = "INSERT INTO CACHORRO (CAC_CODIGO, CAC_NOME, CAC_COR, CAC_QTD_PATAS, CAC_SOM) VALUES (SEQ_CACHORRO.nextval, ?, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, cachorro.getNome());
		statement.setString(2, cachorro.getCor());
		statement.setInt(3, cachorro.getQtdPatas());
		statement.setString(4, cachorro.getSom());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Integer codigo, String nome) throws SQLException{
		String sql = "UPDATE CACHORRO SET CAC_NOME = ? WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE CACHORRO WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> lCachorros = new ArrayList<>();

		String sql = "select * from CACHORRO";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("CAC_CODIGO");
					String nome = rs.getString("CAC_NOME");
					String cor = rs.getString("CAC_COR");
					int qtdPtas = rs.getInt("CAC_QTD_PATAS");
					String som = rs.getString("CAC_SOM");
					Cachorro cachorro = new Cachorro(codigo, nome, cor, qtdPtas, som);
					lCachorros.add(cachorro);
				}
			}
		}

		return lCachorros;

	}
}
