package br.com.vinicius.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vinicius.animais.model.PorquinhoDaIndia;

public class PorquinhoDaIndiaDAO {

	private final Connection conn;
	
	public PorquinhoDaIndiaDAO(Connection con) {
		this.conn = con;
	}
	
	public boolean inserir(PorquinhoDaIndia porquinhoDaIndia) throws SQLException{
		String sql = "INSERT INTO POR_INDIA (POR_CODIGO, POR_NOME, POR_COR, POR_QTD_PATAS, POR_SOM) VALUES (SEQ_POR_INDIA.nextval, ?, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, porquinhoDaIndia.getNome());
		statement.setString(2, porquinhoDaIndia.getCor());
		statement.setInt(3, porquinhoDaIndia.getQtdPatas());
		statement.setString(4, porquinhoDaIndia.getSom());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Integer codigo, String nome) throws SQLException{
		String sql = "UPDATE POR_INDIA SET POR_NOME = ? WHERE POR_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE POR_INDIA WHERE POR_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<PorquinhoDaIndia> lista() throws SQLException {
		List<PorquinhoDaIndia> lPorquinhoDaIndia = new ArrayList<>();

		String sql = "select * from POR_INDIA";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("POR_CODIGO");
					String nome = rs.getString("POR_NOME");
					String cor = rs.getString("POR_COR");
					int qtdPtas = rs.getInt("POR_QTD_PATAS");
					String som = rs.getString("POR_SOM");
					PorquinhoDaIndia porquinhoDaIndia = new PorquinhoDaIndia(codigo, nome, cor, qtdPtas, som);
					lPorquinhoDaIndia.add(porquinhoDaIndia);
				}
			}
		}

		return lPorquinhoDaIndia;

	}
	
}
