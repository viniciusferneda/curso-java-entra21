package br.com.vinicius.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.model.Cachorro;
import br.com.vinicius.animais.service.CachorroService;

public class TestaCachorro {

	public static void main(String[] args) throws SQLException {
		//Inst�ncia da classe Service
		CachorroService cachorroService = new CachorroService();
		
		// Listagem dos cachorros
		List<Cachorro> lCachorros = cachorroService.listarCachorros();
		for (Cachorro cac : lCachorros) {
			imprimirCachorro(cac);
		}

		// Inserir um novo cachorro
		Cachorro cachorro = new Cachorro("Bidu", "Amarelo", 4);
		cachorroService.inserir(cachorro);

		// Alterar o nome de um cachorro
		cachorroService.alterar(21, "Pluto");

		// Remover um cachorro
		cachorroService.excluir(26);

		System.out.println();
		
		System.out.println("*******Lista Atualizada**********");
		
		// Listagem dos cachorros
		List<Cachorro> lCachorros2 = cachorroService.listarCachorros();
		for (Cachorro cac : lCachorros2) {
			imprimirCachorro(cac);
		}

	}

	private static void imprimirCachorro(Cachorro cac) {
		System.out.println("Nome: "+ cac.getNome() + ", Som: "+cac.getSom());
	}

}
