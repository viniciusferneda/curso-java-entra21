/*
 * Desenvolver um algoritmo do jogo da forca, onde a palavra pré-definida seja ESTUDAR. 
 * O usuário irá possuir 7 tentativas para acertar a palavra.
 */
package alunos.andiara.questao5.java;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String palavra = "estudar";
		String letra;

		System.out.println("Você tem 7 tentativas para descobrir a palavra");

		for (int aux = 1; aux < 8; aux++) {

			System.out.println("Digite uma letra");
			letra = scanner.next();

			if (letra.equals("e")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("s")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("t")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("u")) {
				System.out.println("Acertou" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("d")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("a")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else if (letra.equals("r")) {
				System.out.println("Acertou!" + " Essa foi a tentativa número: " + aux);

			} else {
				System.out.println("Você errou! Essa foi a tentativa número: " + aux);
			}
			
			System.out.println();
		}
		System.out.println("Acabaram as tentativas. A palavra é: " + palavra);
		scanner.close();
	}
}
