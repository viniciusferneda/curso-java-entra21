package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.MusicaDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Musica;

public class TestaMusica {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Musica> musicas = new MusicaDAO(con).lista();
            for(Musica musica : musicas) {
                System.out.println(musica.getNome());
            }
		}
	}

}
