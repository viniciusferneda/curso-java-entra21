package alunos.renan;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 100;
		for (num = 100; num <= 300; num++) {
			if (num % 5 == 0 && num % 10 == 0)
				System.out.println(num);
		}
		// FIXME: No final do algoritmo deve ser finalizado o scanner
	}
	
}
