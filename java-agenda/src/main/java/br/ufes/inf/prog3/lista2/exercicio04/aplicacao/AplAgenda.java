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

	/** Onde são mantidos os contatos. */
	private static List<IContato> contatos = new ArrayList<>();

	/** Adiciona um contato. */
	private static void adicionarContato(IContato contato) {
		contatos.add(contato);
	}

	/** Obtém um contato, dado o índice. */
	private static IContato obterContato(int indice) {
		if (indice < contatos.size()) {
			return (IContato) contatos.get(indice);
		} else {
			return null;
		}
	}

	/** Imprime todos os contatos e seus índices. */
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

	/** Lê do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** Método main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo à Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
		// Lê o comando.
		String comando = lerTeclado();
		// Continua pedindo comandos até encontrar o comando S, de sair.
		while (!"S".equalsIgnoreCase(comando)) {
			// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println("\nCOMANDOS DISPONÍVEIS:\n" + " ?: Mostra esta lista de comandos;\n\n"
						+ " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n"
						+ "+T: Adiciona um telefone;\n"
						+ "+E: Adiciona um email;\n"
						+ "+L: Adiciona um endereço;\n");
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
			// Comando +L: adicionar endereço.
			else if ("+L".equalsIgnoreCase(comando)) {
				executarAdicionarEndereco();
			}
			// Lê o próximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
		// Lê o índice.
		System.out.print("\nNúmero: ");

		String indice = lerTeclado();
		// Verifica se é um número.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice);
			// Verifica se o índice existe.
			IContato contato = obterContato(i);
			if (contato != null) {
				// Imprime o contato.
				System.out.println("\nNome: " + contato.getNome() + "\n" + contato.getTipo().getDescricao() + ": "
						+ contato.getContato());
			} else {// Não existe.
				System.out.println("Agenda não contém item de número " + i);
			}
		} else {// Não é número.
			System.out.println("Não é um número.");
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
							"Tipo de Telefone inválido. Informe um tipo válido para prosseguir.");
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Informe o nome:");
		String nome = lerTeclado();

		System.out.println("Informe o número do telefone:");
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

		System.out.println("Informe o endereço completo:");
		String numeroTelefone = lerTeclado();

		contatoEndereco.setNome(nome);
		contatoEndereco.setContato(numeroTelefone);

		adicionarContato(contatoEndereco);
	}
}
