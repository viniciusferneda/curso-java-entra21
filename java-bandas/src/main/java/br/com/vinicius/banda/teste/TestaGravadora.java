package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.GravadoraDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Gravadora;

public class TestaGravadora {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Gravadora> gravadoras = new GravadoraDAO(con).lista();
            for(Gravadora gravadora : gravadoras) {
                System.out.println(gravadora.getNome());
            }
		}
	}

}
