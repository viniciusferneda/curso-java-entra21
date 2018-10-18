package br.com.vinicius.cancela.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.vinicius.cancela.dominio.Cancela;

public class CancelaDAO {

	private final Connection conn;

	public CancelaDAO(Connection con) {
		this.conn = con;
	}
	
	public Cancela buscarCancelaPorCodigo(Integer codigo) throws SQLException {
		Cancela cancela = new Cancela();
		String sql = "select * from CANCELA WHERE CODIGO = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.setInt(1, codigo);
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigoCancela = rs.getInt("codigo");
					boolean posicao = rs.getBoolean("posicao");
					cancela = new Cancela(codigoCancela, posicao);
				}
			}
		}
		return cancela;
	}

	public boolean alterar(Integer codigo, Boolean posicao) throws SQLException {
		String sql = "UPDATE CANCELA SET POSICAO = ? WHERE CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setBoolean(1, posicao);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}

	public Boolean buscarPosicaoCancelaPorCodigo(Integer codigo) throws SQLException {
		String sql = "select POSICAO from CANCELA WHERE CODIGO = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, codigo);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					return rs.getBoolean("POSICAO");
				}
			}
		}
		return false;
	}
}
