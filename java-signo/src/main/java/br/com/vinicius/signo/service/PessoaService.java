package br.com.vinicius.signo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.signo.dao.PessoaDAO;
import br.com.vinicius.signo.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.signo.model.Pessoa;

public class PessoaService {
	
	public void inserir(Pessoa pessoa) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PessoaDAO(con).inserir(pessoa);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PessoaDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PessoaDAO(con).excluir(codigo);
		}
	}

	public List<Pessoa> listarPessoas() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PessoaDAO(con).lista();
		}
	}
	
}
