package alunos.luizcarlos;

import java.util.Scanner;

public class Quinta {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String primeiro;
		System.out.println("Coloque a 1� letra");
		primeiro = scanner.nextLine();

		String segundo;
		System.out.println("Coloque a 2� letra");
		segundo = scanner.nextLine();

		String terceiro;
		System.out.println("Coloque a 3� letra");
		terceiro = scanner.nextLine();

		String quarto;
		System.out.println("Coloque a 4� letra");
		quarto = scanner.nextLine();

		String quinto;
		System.out.println("Coloque a 5� letra");
		quinto = scanner.nextLine();

		String sexto;
		System.out.println("Coloque a 6� letra");
		sexto = scanner.nextLine();

		String setimo;
		System.out.println("Coloque a 7� letra");
		setimo = scanner.nextLine();

		if (primeiro.equals("E,S,T,U,D,A,R")) {
		} else if (segundo.equals("E,S,T,U,D,A,R")) {
		} else if (terceiro.equals("E,S,T,U,D,A,R")) {
		} else if (quarto.equals("E,S,T,U,D,A,R")) {
		} else if (quinto.equals("E,S,T,U,D,A,R")) {
		} else if (sexto.equals("E,S,T,U,D,A,R")) {
		} else if (setimo.equals("E,S,T,U,D,A,R")) {
			{
				System.out.println("Que pena voc� n�o conseguiu");
			}
		} else {
			System.out.println("Parab�ns voc� conseguiu!");
		}

		scanner.close();

	}

}
