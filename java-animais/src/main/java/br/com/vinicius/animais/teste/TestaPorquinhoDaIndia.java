package br.com.vinicius.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.vinicius.animais.model.PorquinhoDaIndia;
import br.com.vinicius.animais.service.PorquinhoDaIndiaService;

public class TestaPorquinhoDaIndia {

	public static void main(String[] args) throws SQLException {
		// Instância da classe Service
		PorquinhoDaIndiaService porquinhoDaIndiaService = new PorquinhoDaIndiaService();

		// Listagem dos Porquinhos da Índia
		List<PorquinhoDaIndia> lPorquinhosDaIndia = porquinhoDaIndiaService.listarPorquinhosDaIndia();
		for (PorquinhoDaIndia por : lPorquinhosDaIndia) {
			imprimirPorquinhoDaIndia(por);
		}

		// Inserir um novo Porquinho Da India
		PorquinhoDaIndia gato = new PorquinhoDaIndia("Dexter", "Preto", 4);
		porquinhoDaIndiaService.inserir(gato);

		// Alterar o nome de um Porquinho Da India
		porquinhoDaIndiaService.alterar(3, "Soninho");

		// Remover um Porquinho Da India
		porquinhoDaIndiaService.excluir(2);

		System.out.println();

		System.out.println("*******Lista Atualizada**********");

		// Listagem dos Porquinhos da Índia
		List<PorquinhoDaIndia> lPorquinhosDaIndia2 = porquinhoDaIndiaService.listarPorquinhosDaIndia();
		for (PorquinhoDaIndia por : lPorquinhosDaIndia2) {
			imprimirPorquinhoDaIndia(por);
		}

	}

	private static void imprimirPorquinhoDaIndia(PorquinhoDaIndia por) {
		System.out.println("Nome: " + por.getNome() + ", Som: " + por.getSom());
	}

}
