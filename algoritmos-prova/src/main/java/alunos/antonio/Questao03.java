	package alunos.antonio;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite os numeros aqui: ");
		int inicio = entrada.nextInt();

		
		int[] numeros = new int [10];
		
		numeros [0] = inicio;
		numeros [1] = inicio;
		numeros [2] = inicio;
		numeros [3] = inicio;
		numeros [4] = inicio;
		numeros [5] = inicio;
		numeros [6] = inicio;
		numeros [7] = inicio;
		numeros [8] = inicio;
		numeros [9] = inicio;
		
		
		for(int numero = 0; numero < numeros.length; numero++) {
		System.out.println(numero);
		
	}
	
}
}