package br.com.vinicius.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.model.Gato;
import br.com.vinicius.animais.service.GatoService;

public class TestaGato {

	public static void main(String[] args) throws SQLException {
		// Instância da classe Service
		GatoService gatoService = new GatoService();

		// Listagem dos Gatos
		List<Gato> lGatos = gatoService.listarGatos();
		for (Gato gat : lGatos) {
			imprimirGato(gat);
		}

		// Inserir um novo Gato
		Gato gato = new Gato("Mingau", "Branco", 4);
		gatoService.inserir(gato);

		// Alterar o nome de um Gato
		gatoService.alterar(1, "Garfield");

		// Remover um Gato
		gatoService.excluir(2);

		System.out.println();

		System.out.println("*******Lista Atualizada**********");

		// Listagem dos Gatos
		List<Gato> lGatos2 = gatoService.listarGatos();
		for (Gato gat : lGatos2) {
			imprimirGato(gat);
		}
	}

	private static void imprimirGato(Gato gato) {
		System.out.println("Nome: " + gato.getNome() + ", Som: " + gato.getSom());
	}

}
