package alunos.luizcarlos;

import java.util.Scanner;

public class Quinta {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String primeiro;
		System.out.println("Coloque a 1ª letra");
		primeiro = scanner.nextLine();

		String segundo;
		System.out.println("Coloque a 2ª letra");
		segundo = scanner.nextLine();

		String terceiro;
		System.out.println("Coloque a 3ª letra");
		terceiro = scanner.nextLine();

		String quarto;
		System.out.println("Coloque a 4ª letra");
		quarto = scanner.nextLine();

		String quinto;
		System.out.println("Coloque a 5ª letra");
		quinto = scanner.nextLine();

		String sexto;
		System.out.println("Coloque a 6ª letra");
		sexto = scanner.nextLine();

		String setimo;
		System.out.println("Coloque a 7ª letra");
		setimo = scanner.nextLine();

		if (primeiro.equals("E,S,T,U,D,A,R")) {
		} else if (segundo.equals("E,S,T,U,D,A,R")) {
		} else if (terceiro.equals("E,S,T,U,D,A,R")) {
		} else if (quarto.equals("E,S,T,U,D,A,R")) {
		} else if (quinto.equals("E,S,T,U,D,A,R")) {
		} else if (sexto.equals("E,S,T,U,D,A,R")) {
		} else if (setimo.equals("E,S,T,U,D,A,R")) {
			{
				System.out.println("Que pena você não conseguiu");
			}
		} else {
			System.out.println("Parabéns você conseguiu!");
		}

		scanner.close();

	}

}
