package alunos.antonio;

import java.util.Scanner;

public class Questao04a {

	public static void main(String[] args) {
		//FIXME: N�o � necess�rio utilizar dois scanners
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int umNumero = entrada1.nextInt();

		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int outroNumero = entrada2.nextInt();

		int resultado = umNumero + outroNumero;

		//FIXME: O exercicio pede para que a obtenha o resto da vari�vel umNumero 
		if (resultado / 10 == outroNumero / 5) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
		
		//FIXME: Faltou fechar o scanner no final do algoritmo.

	}

}
