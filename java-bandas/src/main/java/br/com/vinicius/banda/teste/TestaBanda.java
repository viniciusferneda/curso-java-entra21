package br.com.vinicius.banda.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.banda.model.Banda;
import br.com.vinicius.banda.service.BandaService;

public class TestaBanda {

	public static void main(String[] args) throws SQLException {
		List<Banda> lBandas = new BandaService().listarBandas();
		for(Banda banda : lBandas) {
            System.out.println(banda.getNome());
        }
	}

}
