package br.com.vinicius.banda.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.EstiloDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Estilo;

public class TestaEstilo {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Estilo> estilos = new EstiloDAO(con).lista();
            for(Estilo estilo : estilos) {
                System.out.println(estilo.getNome());
            }
		}
	}

}
