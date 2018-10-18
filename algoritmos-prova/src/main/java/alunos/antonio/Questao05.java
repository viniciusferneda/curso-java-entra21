package alunos.antonio;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		String palavra[] = { "E", "S", "T", "U", "D", "A", "R" };
		Scanner sc = new Scanner(System.in);
		int forca = 1, ganhar = 0, perder = 0, contador = 0;

		String digito, letrasDigitadas[] = new String[20];
		while (forca == 1)
			;
		{
			int existePalavra = 0;
			System.out.println("Digite a letra: ");
			digito = sc.next();
			letrasDigitadas[contador] = digito;
			for (int i = 0; i < letrasDigitadas.length; i++) {
				if (letrasDigitadas[i].equals(digito)) {
					existePalavra++;
				}
			}
		}
	}
}
