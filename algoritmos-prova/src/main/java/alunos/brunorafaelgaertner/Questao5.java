package alunos.brunorafaelgaertner;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Questao5 {
	public static void main(String[] args) {
		// 5. (5,0) Desenvolver um algoritmo do jogo da forca, onde a palavra
		// pré-definida seja ESTUDAR. O usuário irá possuir 7 tentativas para
		// acertar a palavra.

		// Scaner
		Scanner letras = new Scanner(System.in);

		// Array da palavra "ESTUDAR"
		String[] estudar = new String[7];

		estudar[0] = "";
		estudar[1] = "";
		estudar[2] = "";
		estudar[3] = "";
		estudar[4] = "";
		estudar[5] = "";
		estudar[6] = "";

		// Variavel que contará as tentativas
		int contador = 0;

		// Iniciando o jogo
		System.out.println("Este é o jogo da forca.");
		System.out.println("A palavra tem sete letras, portanto você terá sete tentativas");
		System.out.println("");

		// While
		while (contador != 8) {

			String letra;

			if (1 == 1) {
				System.out.println("Digite uma letra: " + estudar[0] + "_ " + estudar[1] + "_ " + estudar[2] + "_ "
						+ estudar[3] + "_ " + estudar[4] + "_ " + estudar[5] + "_ " + estudar[6]);
				letra = letras.next();
			}

			// Switch
			switch (letra) {
			case "e":
				letra = estudar[0] = "E";
				break;
			case "s":
				letra = estudar[1] = "S";
				break;
			case "t":
				letra = estudar[2] = "T";
				break;
			case "u":
				letra = estudar[3] = "U";
				break;
			case "d":
				letra = estudar[4] = "D";
				break;
			case "a":
				letra = estudar[5] = "A";
				break;
			case "r":
				letra = estudar[6] = "R";
				break;

			}

			// Contador
			contador++;

		}

		// Condição de tentativas esgotadas
		if (contador == 8) {
			System.out.println("Acabaram as tentativas");

		}
		// Fechando o Scanner
		letras.close();
	}
}
