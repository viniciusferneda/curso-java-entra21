package correcao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número:");
			numeros[i] = scanner.nextInt();
		}
		
		double soma = 0d;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		System.out.println("Soma = "+soma);
		
		scanner.close();
	}
}
