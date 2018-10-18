package alunos.itamar.Questao5;

import java.util.Scanner;

/*5.	(5,0) Desenvolver um algoritmo do jogo da forca, 
 * onde a palavra pré-definida seja ESTUDAR. O usuário irá possuir 7 
 * tentativas para acertar a palavra.*/

public class resposta5 {//FIXME: Nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palavra = "ESTUDAR";
		System.out.println("Descubra a palavra você tem 7 chances\n");
		for (int aux = 0; aux <= 7;) {
			if (aux == 7) {
				System.out.println("\nTERMINOU SUAS CHANCES");
				break;
			}
			System.out.println("Digite uma palavra.Você já disperdiçou " + aux + " chances.");
			String chute = scanner.nextLine();
			if (chute.length() == palavra.length()) {
				System.out.println("\nVOCÊ ACERTOU A PALAVRA");
				break;
			} else {
				aux++;
			}
		}

		scanner.close();
	}
}
