package br.com.vinicius.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vinicius.animais.model.Gato;

public class GatoDAO {

	private final Connection conn;

	public GatoDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(Gato gato) throws SQLException {
		String sql = "INSERT INTO GATO (GAT_CODIGO, GAT_NOME, GAT_COR, GAT_QTD_PATAS, GAT_SOM) VALUES (SEQ_GATO.nextval, ?, ?, ?, ?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, gato.getNome());
		statement.setString(2, gato.getCor());
		statement.setInt(3, gato.getQtdPatas());
		statement.setString(4, gato.getSom());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException {
		String sql = "UPDATE GATO SET GAT_NOME = ? WHERE GAT_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(Integer codigo) throws SQLException {
		String sql = "DELETE GATO WHERE GAT_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	public List<Gato> lista() throws SQLException {
		List<Gato> lGatos = new ArrayList<>();

		String sql = "select * from GATO";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("GAT_CODIGO");
					String nome = rs.getString("GAT_NOME");
					String cor = rs.getString("GAT_COR");
					int qtdPtas = rs.getInt("GAT_QTD_PATAS");
					String som = rs.getString("GAT_SOM");
					Gato gato = new Gato(codigo, nome, cor, qtdPtas, som);
					lGatos.add(gato);
				}
			}
		}

		return lGatos;

	}

}
