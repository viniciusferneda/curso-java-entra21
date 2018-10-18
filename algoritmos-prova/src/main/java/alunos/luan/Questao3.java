package alunos.luan;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[10];

		System.out.println("Digite 1º n: ");
		num[0] = scanner.nextInt();
		System.out.println("Digite 2º n: ");
		num[1] = scanner.nextInt();
		System.out.println("Digite 3º n: ");
		num[2] = scanner.nextInt();
		System.out.println("Digite 4º n: ");
		num[3] = scanner.nextInt();
		System.out.println("Digite 5º n: ");
		num[4] = scanner.nextInt();
		System.out.println("Digite 6º n: ");
		num[5] = scanner.nextInt();
		System.out.println("Digite 7º n: ");
		num[6] = scanner.nextInt();
		System.out.println("Digite 8º n: ");
		num[7] = scanner.nextInt();
		System.out.println("Digite 9º n: ");
		num[8] = scanner.nextInt();
		System.out.println("Digite 10º n: ");
		num[9] = scanner.nextInt();

		int soma = 0;
		for (int aux = 0; aux < num.length; aux++) {
			soma += num[aux];
		}
		System.out.println("A soma dos Valores Digitados é: " + soma);


		scanner.close();
	}
}
