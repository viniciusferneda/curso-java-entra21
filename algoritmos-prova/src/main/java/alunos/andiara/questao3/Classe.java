/*
 * Solicitar ao usuário para que informe 10 números. 
 * Estes números devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os números dentro do array e imprima no 
 * console o total da soma dos números.
 */
package alunos.andiara.questao3;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		int soma = 0;

		for (int aux = 0; aux < numeros.length; aux++) {
			System.out.println("Informe um número");
			numeros[aux] = scanner.nextInt();
			soma = soma + numeros[aux];
		}
		System.out.println();
		System.out.println("Soma de todos os números: " + soma);
		scanner.close();
	}
}
