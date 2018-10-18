package alunos.lucasdraeger;

import java.util.Scanner;

/*Solicitar ao usuário para que informe 10 números.
Estes números devem ser armazenados em um array do tipo int.
Utilizando um for some os valores de todos os números dentro do array
e imprima no console o total da soma dos números.*/

public class Questão3 {// FIXME: Nome da classe não pode conter acentuação
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number[] = new int[10];
		int soma[] = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.println("Digite um Numero:");
			number[i] = scanner.nextInt();
			soma[i] = soma[i] + number[i];

		}

		for (int i = 0; i < soma.length; i++) {
			System.out.print(soma[i]);
		}

		scanner.close();
	}

}
