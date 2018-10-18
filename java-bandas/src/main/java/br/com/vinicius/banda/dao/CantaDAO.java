package br.com.vinicius.banda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.vinicius.banda.model.Banda;
import br.com.vinicius.banda.model.Canta;
import br.com.vinicius.banda.model.Estilo;
import br.com.vinicius.banda.model.Gravadora;
import br.com.vinicius.banda.model.Musica;
import br.com.vinicius.banda.model.Pais;

public class CantaDAO {

	private final Connection con;

	public CantaDAO(Connection con) {
		this.con = con;
	}

	public List<Canta> lista() throws SQLException {
		List<Canta> cantas = new ArrayList<>();

		String sql = "SELECT CAN.CAN_CODIGO, CAN.CAN_ANO_GRAVACAO, BAN.BAN_CODIGO, BAN.BAN_NOME, BAN.BAN_DT_CRIACAO, "
				+ " PBA.PAI_CODIGO, PBA.PAI_NOME, GRA.GRA_CODIGO, GRA.GRA_NOME, PGR.PAI_CODIGO, PGR.PAI_NOME, "
				+ " EST.EST_CODIGO, EST.EST_NOME, MUS.MUS_CODIGO, MUS.MUS_NOME, MUS.MUS_DURACAO ";
		sql += " FROM CANTA CAN ";
		sql += " INNER JOIN MUSICA MUS ON (CAN.CAN_MUSICA = MUS.MUS_CODIGO) ";
		sql += " INNER JOIN ESTILO EST ON (CAN.CAN_ESTILO = EST.EST_CODIGO) ";
		sql += " INNER JOIN GRAVADORA GRA ON (CAN.CAN_GRAVADORA = GRA.GRA_CODIGO) ";
		sql += " INNER JOIN PAIS PGR ON (GRA.GRA_PAIS = PGR.PAI_CODIGO) ";
		sql += " INNER JOIN BANDA BAN ON (CAN.CAN_BANDA = BAN.BAN_CODIGO) ";
		sql += " INNER JOIN PAIS PBA ON (BAN.BAN_PAIS = PBA.PAI_CODIGO) ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					// CANTA
					int id = rs.getInt(1);
					int anoGravacao = rs.getInt(2);

					// BANDA
					int bandaID = rs.getInt(3);
					String bandaNome = rs.getString(4);
					Date bandaDataCriacao = rs.getDate(5);

					// PAIS da BANDA
					int bandaPaisID = rs.getInt(6);
					String bandaPaisNome = rs.getString(7);

					// GRAVADORA
					int gravadoraID = rs.getInt(8);
					String gravadoraNome = rs.getString(9);

					// PAIS da GRAVADORA
					int gravadoraPaisID = rs.getInt(10);
					String gravadoraPaisNome = rs.getString(11);

					// ESTILO
					int estiloID = rs.getInt(12);
					String estiloNome = rs.getString(13);

					// MUSICA
					int musicaID = rs.getInt(14);
					String musicaNome = rs.getString(15);
					long musicaDuracao = rs.getLong(16);

					Canta canta = new Canta(id, anoGravacao,
							new Banda(bandaID, bandaNome, bandaDataCriacao, new Pais(bandaPaisID, bandaPaisNome)),
							new Musica(musicaID, musicaNome, musicaDuracao),
							new Gravadora(gravadoraID, gravadoraNome, new Pais(gravadoraPaisID, gravadoraPaisNome)),
							new Estilo(estiloID, estiloNome));
					cantas.add(canta);
				}
			}
		}

		return cantas;

	}
	
	public List<Canta> listaPorNomeBanda(String nomeBanda) throws SQLException {
		List<Canta> cantas = new ArrayList<>();

		String sql = "SELECT CAN.CAN_CODIGO, CAN.CAN_ANO_GRAVACAO, BAN.BAN_CODIGO, BAN.BAN_NOME, BAN.BAN_DT_CRIACAO, "
				+ " PBA.PAI_CODIGO, PBA.PAI_NOME, GRA.GRA_CODIGO, GRA.GRA_NOME, PGR.PAI_CODIGO, PGR.PAI_NOME, "
				+ " EST.EST_CODIGO, EST.EST_NOME, MUS.MUS_CODIGO, MUS.MUS_NOME, MUS.MUS_DURACAO ";
		sql += " FROM CANTA CAN ";
		sql += " INNER JOIN MUSICA MUS ON (CAN.CAN_MUSICA = MUS.MUS_CODIGO) ";
		sql += " INNER JOIN ESTILO EST ON (CAN.CAN_ESTILO = EST.EST_CODIGO) ";
		sql += " INNER JOIN GRAVADORA GRA ON (CAN.CAN_GRAVADORA = GRA.GRA_CODIGO) ";
		sql += " INNER JOIN PAIS PGR ON (GRA.GRA_PAIS = PGR.PAI_CODIGO) ";
		sql += " INNER JOIN BANDA BAN ON (CAN.CAN_BANDA = BAN.BAN_CODIGO) ";
		sql += " INNER JOIN PAIS PBA ON (BAN.BAN_PAIS = PBA.PAI_CODIGO) ";
		sql += " WHERE BAN.BAN_NOME = ? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, nomeBanda);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					// CANTA
					int id = rs.getInt(1);
					int anoGravacao = rs.getInt(2);

					// BANDA
					int bandaID = rs.getInt(3);
					String bandaNome = rs.getString(4);
					Date bandaDataCriacao = rs.getDate(5);

					// PAIS da BANDA
					int bandaPaisID = rs.getInt(6);
					String bandaPaisNome = rs.getString(7);

					// GRAVADORA
					int gravadoraID = rs.getInt(8);
					String gravadoraNome = rs.getString(9);

					// PAIS da GRAVADORA
					int gravadoraPaisID = rs.getInt(10);
					String gravadoraPaisNome = rs.getString(11);

					// ESTILO
					int estiloID = rs.getInt(12);
					String estiloNome = rs.getString(13);

					// MUSICA
					int musicaID = rs.getInt(14);
					String musicaNome = rs.getString(15);
					long musicaDuracao = rs.getLong(16);

					Canta canta = new Canta(id, anoGravacao,
							new Banda(bandaID, bandaNome, bandaDataCriacao, new Pais(bandaPaisID, bandaPaisNome)),
							new Musica(musicaID, musicaNome, musicaDuracao),
							new Gravadora(gravadoraID, gravadoraNome, new Pais(gravadoraPaisID, gravadoraPaisNome)),
							new Estilo(estiloID, estiloNome));
					cantas.add(canta);
				}
			}
		}

		return cantas;

	}

}
