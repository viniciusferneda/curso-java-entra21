package alunos.luizantonio.Questao3;

import java.util.Scanner;

public class questao3 {// FIXME: O nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		int valores[] = new int[10];

		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[1] = entrada.nextInt();

		Scanner entrada2 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[2] = entrada.nextInt();

		Scanner entrada3 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[3] = entrada.nextInt();

		Scanner entrada4 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[4] = entrada.nextInt();

		Scanner entrada5 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[5] = entrada.nextInt();

		Scanner entrada6 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[6] = entrada.nextInt();

		Scanner entrada7 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[7] = entrada.nextInt();

		Scanner entrada8 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[8] = entrada.nextInt();

		Scanner entrada9 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[9] = entrada.nextInt();

		Scanner entrada10 = new Scanner(System.in);
		System.out.println(" Digite um numero ");
		valores[10] = entrada.nextInt();

		for (int a = 0; a < valores.length; a++) {
			System.out.println(valores[a]);
		}

	}
}
