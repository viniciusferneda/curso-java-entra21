package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.CantaDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Canta;

public class TestaCanta {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			//List<Canta> cantas = new CantaDAO(con).lista();
			List<Canta> cantas = new CantaDAO(con).listaPorNomeBanda("Red Hot Chili Peppers");
			for (Canta canta : cantas) {
				System.out.println(
						canta.getCodigo() + " " + canta.getBanda().getNome() + " " + canta.getEstilo().getNome() + " "
								+ canta.getGravadora().getNome() + " " + canta.getMusica().getNome());
			}
		}
	}

}
