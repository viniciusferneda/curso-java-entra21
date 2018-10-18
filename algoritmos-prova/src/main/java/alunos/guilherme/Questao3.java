package alunos.guilherme;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeros[] = new int[10];
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = scanner.nextInt();
			soma = soma + numeros[i];
		}
		System.out.println("O total da soma dos números é: " + soma);
		scanner.close();
	}

}
