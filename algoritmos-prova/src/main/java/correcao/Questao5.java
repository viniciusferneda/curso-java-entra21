package correcao;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// Desenvolver um algoritmo do jogo da forca,
		// Onde a palavra pr�-definida seja ESTUDAR,
		// Haver� 7 tentativas.

		Scanner scanner = new Scanner(System.in);

		String[] palavra = { "E", "S", "T", "U", "D", "A", "R" };
		String[] palavraDigitada = { "_", "_", "_", "_", "_", "_", "_" };
		String[] letrasDigitadas = new String[20];
		int _tentativasErradas = 7;
		int _tentativasCorretas = 7;
		while (_tentativasErradas > 0) {
			System.out.println("Informe uma letra:");
			String letra = scanner.nextLine();
			boolean letraJaExiste = false;
			boolean errrrrou = true;
			for (int aux = 0; aux < palavraDigitada.length; aux++) {
				if (palavraDigitada[aux] != null && palavraDigitada[aux].equalsIgnoreCase(letra)) {
					System.out.println("Letra j� existente.");
					letraJaExiste = true;
				}
			}
			if (!letraJaExiste) {
				for(int aux = 0; aux < letrasDigitadas.length; aux++){
					if(letrasDigitadas[aux] == null){
						letrasDigitadas[aux] = letra;
						break;
					}
				}
				for (int aux = 0; aux < palavra.length; aux++) {
					if (palavra[aux].equalsIgnoreCase(letra)) {
						errrrrou = false;
						palavraDigitada[aux] = letra.toUpperCase();
						_tentativasCorretas--;
					}
				}
				if (errrrrou) {
					_tentativasErradas--;
					System.out.println("Letra digitada n�o existe.");
				}
			}
			if(_tentativasCorretas == 0){
				System.out.println("Parab�ns Rap�, vc acertou a palavra!!");
				System.out.println("A palavra da forca �:");
				for (int aux = 0; aux < palavraDigitada.length; aux++) {
					if (palavraDigitada[aux] != null) {
						System.out.print(palavraDigitada[aux]);
					}
				}
				_tentativasErradas = 0;
			}else if (_tentativasErradas > 0) {
				System.out.println("---------------------------------");
				System.out.println("Foram digitadas as seguintes letras da forca:");
				for (int aux = 0; aux < palavraDigitada.length; aux++) {
					if (palavraDigitada[aux] != null) {
						System.out.print(palavraDigitada[aux]);
					}
				}
				System.out.println("\n---------------------------------");
				System.out.println("Foram digitadas as seguintes letras no geral:");
				for (int aux = 0; aux < letrasDigitadas.length; aux++) {
					if (letrasDigitadas[aux] != null) {
						System.out.print(letrasDigitadas[aux]);
					}
				}
				System.out.println("\n---------------------------------");
				System.out.println("Voc� ainda tem "+_tentativasErradas+" tentativas.");
				System.out.println("---------------------------------");
			} else {
				System.out.println("Perdeu Rap�!!");
			}
		}
		
		scanner.close();
	}
}
