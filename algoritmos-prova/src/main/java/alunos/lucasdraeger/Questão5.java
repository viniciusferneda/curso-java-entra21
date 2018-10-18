package alunos.lucasdraeger;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Desenvolver um algoritmo do jogo da forca, onde a palavra
		 * pré-definida seja ESTUDAR. O usuário irá possuir 7 tentativas para
		 * acertar a palavra.
		 */
		String palavra[] = new String[7];
		String confirma[] = new String[7];
		palavra[0] = "E";
		palavra[1] = "S";
		palavra[2] = "T";
		palavra[3] = "U";
		palavra[4] = "D";
		palavra[5] = "A";
		palavra[6] = "R";

		for (int i = 0; i < palavra.length; i++) {
			System.out.println("Fale uma letra");
			confirma[i] = scanner.next();
		}

		for (int i = 0; i < confirma.length; i++) {
			if (confirma[i] == palavra[i]) {
				System.out.println("Você acertou");
			} else {
				System.out.println("Você errou");
			}
			scanner.close();
		}

	}
}
