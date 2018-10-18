package br.com.vinicius.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.dao.CachorroDAO;
import br.com.vinicius.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.animais.model.Cachorro;

public class CachorroService {
	
	public void inserir(Cachorro cachorro) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDAO(con).inserir(cachorro);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDAO(con).excluir(codigo);
		}
	}

	public List<Cachorro> listarCachorros() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CachorroDAO(con).lista();
		}
	}
	
}
