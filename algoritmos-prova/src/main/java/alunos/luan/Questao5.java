package alunos.luan;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {

		System.out.println("---------------");
		System.out.println(" JOGO DA FORCA ");
		System.out.println("---------------");

		System.out.println("Você pode errar apenas 7 vezes");
		System.out.println(" ");
		System.out.println("           BOA SORTE          ");
		System.out.println(" ");
		System.out.println("_._._._._._._.");
		System.out.println(" ");

		Scanner scanner = new Scanner(System.in);

		String letra1;
		System.out.println("Digite uma letra: ");
		letra1 = scanner.next();

		String letra2;
		System.out.println("Digite uma letra: ");
		letra2 = scanner.next();

		String letra3;
		System.out.println("Digite uma letra: ");
		letra3 = scanner.next();

		String letra4;
		System.out.println("Digite uma letra: ");
		letra4 = scanner.next();

		String letra5;
		System.out.println("Digite uma letra: ");
		letra5 = scanner.next();

		String letra6;
		System.out.println("Digite uma letra: ");
		letra6 = scanner.next();

		String letra7;
		System.out.println("Digite uma letra: ");
		letra7 = scanner.next();

		System.out.println(" ");

		if (letra1.equals("e,s,t,u,d,a,r")) {

		} else if (letra2.equals("e,s,t,u,d,a,r")) {

		} else if (letra3.equals("e,s,t,u,d,a,r")) {
		} else if (letra4.equals("e,s,t,u,d,a,r")) {
		} else if (letra5.equals("e,s,t,u,d,a,r")) {
		} else if (letra6.equals("e,s,t,u,d,a,r")) {
		} else if (letra7.equals("e,s,t,u,d,a,r")) {
			System.out.println("Parabéns");
			System.out.println("A palavra é: ESTUDAR");
		} else {
			System.out.println("Você não consegui descobrir a palavra");
		}

		scanner.close();

	}
}
