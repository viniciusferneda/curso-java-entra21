package br.com.vinicius.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.dao.GatoDAO;
import br.com.vinicius.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.animais.model.Gato;

public class GatoService {

	public void inserir(Gato gato) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).inserir(gato);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDAO(con).excluir(codigo);
		}
	}
	
	public List<Gato> listarGatos() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new GatoDAO(con).lista();
		}
	}
	
}
