package br.com.vinicius.signo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.vinicius.signo.model.Pessoa;
import br.com.vinicius.signo.model.Signo;

public class PessoaDAO {

	private final Connection conn;

	public PessoaDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(Pessoa pessoa) throws SQLException {
		String sql = "INSERT INTO PESSOA (CODIGO, NOME, DT_NASCIMENTO, CODIGO_SIGNO) VALUES (SEQ_PESSOA.nextval, ?, ?, ?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, pessoa.getNome());
		statement.setDate(2, new Date(pessoa.getDtNascimento().getTime()));
		statement.setInt(3, pessoa.getSigno().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Integer codigo, String nome) throws SQLException {
		String sql = "UPDATE PESSOA SET NOME = ? WHERE CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(Integer codigo) throws SQLException {
		String sql = "DELETE PESSOA WHERE CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	public List<Pessoa> lista() throws SQLException {
		List<Pessoa> lPessoas = new ArrayList<>();

		String sql = "SELECT CODIGO, NOME, DT_NASCIMENTO, ";
		sql += "SIG.CODIGO, SIG.NOME, SIG.DIA_INICIAL, SIG.DIA_FINAL, SIG.MES_INICIAL, SIG.MES_FINAL ";
		sql += " FROM PESSOA PES ";
		sql += " INNER JOIN SIGNO SIG ON (PES.CODIGO_SIGNO = SIG.CODIGO) ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					String nome = rs.getString(2);
					Date dtNascimento = rs.getDate(3);
					int codigoSigno = rs.getInt(4);
					String nomeSigno = rs.getString(5);
					int diaInicial = rs.getInt(6);
					int diaFinal = rs.getInt(7);
					int mesInicial = rs.getInt(8);
					int mesFinal = rs.getInt(9);
					Pessoa pessoa = new Pessoa(codigo, nome, dtNascimento, new Signo(codigoSigno, nomeSigno, diaInicial, diaFinal, mesInicial, mesFinal));
					lPessoas.add(pessoa);
				}
			}
		}

		return lPessoas;

	}
}
