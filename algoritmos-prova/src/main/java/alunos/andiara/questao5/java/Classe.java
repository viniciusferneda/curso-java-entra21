/*
 * Desenvolver um algoritmo do jogo da forca, onde a palavra pr�-definida seja ESTUDAR. 
 * O usu�rio ir� possuir 7 tentativas para acertar a palavra.
 */
package alunos.andiara.questao5.java;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String palavra = "estudar";
		String letra;

		System.out.println("Voc� tem 7 tentativas para descobrir a palavra");

		for (int aux = 1; aux < 8; aux++) {

			System.out.println("Digite uma letra");
			letra = scanner.next();

			if (letra.equals("e")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("s")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("t")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("u")) {
				System.out.println("Acertou" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("d")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("a")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else if (letra.equals("r")) {
				System.out.println("Acertou!" + " Essa foi a tentativa n�mero: " + aux);

			} else {
				System.out.println("Voc� errou! Essa foi a tentativa n�mero: " + aux);
			}
			
			System.out.println();
		}
		System.out.println("Acabaram as tentativas. A palavra �: " + palavra);
		scanner.close();
	}
}
