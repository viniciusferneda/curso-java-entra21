package alunos.luizcarlos;

import java.util.Scanner;

public class Terceira {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = i +1;
			numeros[i] = numeros[i];
			System.out.println("Informe o " + numeros[i] + "º número");
			numeros[i] = scanner.nextInt();

		}scanner.close();
			System.out.println(numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8]+numeros[9]);
	}
			
}
