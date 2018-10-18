package alunos.guilherme;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String forca[] = new String[7];
		forca[0] = "_ ";
		forca[1] = "_ ";
		forca[2] = "_ ";
		forca[3] = "_ ";
		forca[4] = "_ ";
		forca[5] = "_ ";
		forca[6] = "_ ";
		String letra;
		int i = 7;
		int x = 0;
		while (i > 0 && x < 7){
			System.out.println("\nDigite uma letra (maiúscula):");
			letra = scanner.next();
			switch(letra){
			case "E": forca[0] = "E ";
			x++;
			break;
			case "S": forca[1] = "S ";
			x++;
			break;
			case "T": forca[2] = "T ";
			x++;
			break;
			case "U": forca[3] = "U ";
			x++;
			break;
			case "D": forca[4] = "D ";
			x++;
			break;
			case "A": forca[5] = "A ";
			x++;
			break;
			case "R": forca[6] = "R ";
			x++;
			break;
			default: System.out.println("\nA palavra não contem essa letra!");
			i--;
			if(i > 0){
				System.out.println("\nVocê ainda tem " + i + " tentativa(s).");
			}
			break;
			}
			if (i == 0){
				System.out.println("VOCÊ FOI ENFORCADO!!!!");
			} else {
				for (int j = 0; j < forca.length; j++) {
					System.out.print(forca[j]);
				}				
			}
			if(x == 7){
				System.out.println("\nPARABÉNS!!!! Você completou a palavra!");
			}
		}
		scanner.close();
	}

}

