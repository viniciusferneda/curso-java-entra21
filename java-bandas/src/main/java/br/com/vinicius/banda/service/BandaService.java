package br.com.vinicius.banda.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.dao.BandaDAO;
import br.com.vinicius.banda.jdbc.oracle.ConnectionPoolOracle;
import br.com.vinicius.banda.model.Banda;

public class BandaService {

	/*public void inserirBanda(String nomeBanda, Date dataCriacao, Pais pais){
		if(dataCriacao.after(new Date())){
			throw new IllegalArgumentException("A data de criação deve ser menor que a data atual");
		}
		
		Banda banda = new Banda();
		banda.setNome(nome);
		
		BandaDAO dao = new BandaDAO(con);
		dao.inserir(banda);
	}*/
	
	public List<Banda> listarBandas() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new BandaDAO(con).lista();
		}
		
	}
}
