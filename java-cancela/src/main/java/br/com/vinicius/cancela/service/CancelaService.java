package br.com.vinicius.cancela.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.vinicius.cancela.dao.CancelaDAO;
import br.com.vinicius.cancela.dominio.Cancela;
import br.com.vinicius.cancela.jdbc.oracle.ConnectionPoolOracle;

public class CancelaService {

	public Cancela buscarCancelaPorCodigo(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CancelaDAO(con).buscarCancelaPorCodigo(codigo);
		}
	}
	
	public void abrir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CancelaDAO(con).alterar(codigo, true);
		}
	}
	
	public void fechar(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CancelaDAO(con).alterar(codigo, false);
		}
	}
	
	public String buscarPosicaoCancela(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CancelaDAO(con).buscarPosicaoCancelaPorCodigo(codigo) ? "Aberta" : "Fechada";
		}
	}
	
}
