package br.ufes.inf.prog3.lista2.exercicio04.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufes.inf.prog3.lista2.exercicio04.dominio.IContato;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoEmail;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoEndereco;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefone;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneCelular;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneComercial;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneResidencial;

public class AplAgenda {

	private static final Scanner scanner = new Scanner(System.in);

	/** Onde s�o mantidos os contatos. */
	private static List<IContato> contatos = new ArrayList<>();

	/** Adiciona um contato. */
	private static void adicionarContato(IContato contato) {
		contatos.add(contato);
	}

	/** Obt�m um contato, dado o �ndice. */
	private static IContato obterContato(int indice) {
		if (indice < contatos.size()) {
			return (IContato) contatos.get(indice);
		} else {
			return null;
		}
	}

	/** Imprime todos os contatos e seus �ndices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0) {
			System.out.println("\tAgenda vazia.");
		} else {
			for (int i = 0; i < contatos.size(); i++) {
				IContato contato = (IContato) contatos.get(i);
				System.out.println("\t" + i + ": " + contato.getNome() + " (" + contato.getTipo().getDescricao() + ") "
						+ contato.getContato());
			}
		}
		System.out.println();

	}

	/** L� do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** M�todo main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo � Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
		// L� o comando.
		String comando = lerTeclado();
		// Continua pedindo comandos at� encontrar o comando S, de sair.
		while (!"S".equalsIgnoreCase(comando)) {
			// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println("\nCOMANDOS DISPON�VEIS:\n" + " ?: Mostra esta lista de comandos;\n\n"
						+ " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n"
						+ "+T: Adiciona um telefone;\n"
						+ "+E: Adiciona um email;\n"
						+ "+L: Adiciona um endere�o;\n");
			}
			// Comando A: mostrar agenda.
			else if ("A".equalsIgnoreCase(comando)) {
				System.out.println("\nAGENDA:");
				imprimirContatos();
			}
			// Comando C: mostrar contato.
			else if ("C".equalsIgnoreCase(comando)) {
				executarMostrarContato();
			}
			// Comando +T: adicionar telefone.
			else if ("+T".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone();
			}
			// Comando +E: adicionar email.
			else if ("+E".equalsIgnoreCase(comando)) {
				executarAdicionarEmail();
			}
			// Comando +L: adicionar endere�o.
			else if ("+L".equalsIgnoreCase(comando)) {
				executarAdicionarEndereco();
			}
			// L� o pr�ximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
		// L� o �ndice.
		System.out.print("\nN�mero: ");

		String indice = lerTeclado();
		// Verifica se � um n�mero.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice);
			// Verifica se o �ndice existe.
			IContato contato = obterContato(i);
			if (contato != null) {
				// Imprime o contato.
				System.out.println("\nNome: " + contato.getNome() + "\n" + contato.getTipo().getDescricao() + ": "
						+ contato.getContato());
			} else {// N�o existe.
				System.out.println("Agenda n�o cont�m item de n�mero " + i);
			}
		} else {// N�o � n�mero.
			System.out.println("N�o � um n�mero.");
		}
	}

	/** Comando +T: adicionar telefone. */
	public static void executarAdicionarTelefone() {
		ContatoTelefone contatoTelefone = null;
		while (contatoTelefone == null) {
			System.out.println("Informe o tipo do telefone (1-Residencial, 2-Comercial, 3-Celular)");
			int tipo = Integer.valueOf(lerTeclado());
			try {
				if (tipo == 1) {
					contatoTelefone = new ContatoTelefoneResidencial();
				} else if (tipo == 2) {
					contatoTelefone = new ContatoTelefoneComercial();
				} else if (tipo == 3) {
					contatoTelefone = new ContatoTelefoneCelular();
				} else {
					throw new IllegalArgumentException(
							"Tipo de Telefone inv�lido. Informe um tipo v�lido para prosseguir.");
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Informe o nome:");
		String nome = lerTeclado();

		System.out.println("Informe o n�mero do telefone:");
		String numeroTelefone = lerTeclado();

		contatoTelefone.setNome(nome);
		contatoTelefone.setContato(numeroTelefone);

		adicionarContato(contatoTelefone);
	}

	/** Comando +E: adicionar email. */
	public static void executarAdicionarEmail() {
		ContatoEmail contatoEmail = new ContatoEmail();

		System.out.println("Informe o nome:");
		String nome = lerTeclado();

		System.out.println("Informe o email:");
		String numeroTelefone = lerTeclado();

		contatoEmail.setNome(nome);
		contatoEmail.setContato(numeroTelefone);

		adicionarContato(contatoEmail);
	}

	/** Comando +L: adicionar email. */
	public static void executarAdicionarEndereco() {
		ContatoEndereco contatoEndereco = new ContatoEndereco();

		System.out.println("Informe o nome:");
		String nome = lerTeclado();

		System.out.println("Informe o endere�o completo:");
		String numeroTelefone = lerTeclado();

		contatoEndereco.setNome(nome);
		contatoEndereco.setContato(numeroTelefone);

		adicionarContato(contatoEndereco);
	}
}
