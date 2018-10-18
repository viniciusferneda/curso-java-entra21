package br.com.vinicius.animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.dao.PorquinhoDaIndiaDAO;
import br.com.vinicius.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.animais.model.PorquinhoDaIndia;

public class PorquinhoDaIndiaService {

	public void inserir(PorquinhoDaIndia porquinhoDaIndia) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDAO(con).inserir(porquinhoDaIndia);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDAO(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDAO(con).excluir(codigo);
		}
	}
	
	public List<PorquinhoDaIndia> listarPorquinhosDaIndia() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PorquinhoDaIndiaDAO(con).lista();
		}
	}
	
}
