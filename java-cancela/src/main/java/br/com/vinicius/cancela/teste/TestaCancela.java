package br.com.vinicius.cancela.teste;

import java.sql.SQLException;

import br.com.vinicius.cancela.dominio.Cancela;
import br.com.vinicius.cancela.service.CancelaService;

public class TestaCancela {

	public static void main(String[] args) throws SQLException {
		CancelaService cancelaService = new CancelaService();

		Cancela cancela = cancelaService.buscarCancelaPorCodigo(1);

		cancelaService.fechar(cancela.getCodigo());
		
		imprimirPosicao(cancelaService, cancela);
		
		cancelaService.abrir(cancela.getCodigo());

		imprimirPosicao(cancelaService, cancela);

	}

	private static void imprimirPosicao(CancelaService cancelaService, Cancela cancela) throws SQLException {
		System.out.println("Posição da Cancela: " + cancelaService.buscarPosicaoCancela(cancela.getCodigo()));
	}

}
