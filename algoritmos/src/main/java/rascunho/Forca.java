package rascunho;

import java.util.Scanner;

public class Forca {

	public static void main(String[] args) {
		// Desenvolver um algoritmo do jogo da forca,
		// Onde a palavra pr�-definida seja ESTUDAR,
		// Haver� 7 tentativas.

		Scanner scanner = new Scanner(System.in);

		String[] palavra = { "E", "S", "T", "U", "D", "A", "R" };
		int forca = 1, vencer = 0, perder = 0, contador = 0;
		String letra;
		String letrasDigitadas[] = new String[30];
		while (forca == 1) {
			int letraDigitada = 0;  
		    System.out.println("Digite a letra:");  
		    letra = scanner.next();  
		    letrasDigitadas[contador] = letra;  
		    
		    //for criado para verificar se a letra j� foi digitada.  
		    for (int i = 0; i < letrasDigitadas.length; i++) {  
		        if (letrasDigitadas[i] != null) {  
		            if (letrasDigitadas[i].equals(letra)) {  
		                letraDigitada++;  
		            }  
		        }  
		    }
		    
		    //Se a letra n�o foi digitada ainda verifica se est� correta, caso contrario exibe a mensagem  
		    if (!(letraDigitada > 1)) {  
		        //Faz o loop no array da palavra, que n�o estava sendo feito
		        for (int x = 0; x < palavra.length; x++) {  
		            //Verifica se a letra est� correta  
		            if (palavra[x].equals(letra)) {  
		                System.out.println("Letra correta.");  
		                vencer++;  
		                break;  
		            } else {  
		                if (x == 6) {  
		                    System.out.println("Letra inexistente.");  
		                    perder++;  
		                }  
		            }  
		        }  
		        if (perder == 7) {  
		            System.out.println("Voc� perdeu.");  
		            System.exit(0);  
		        } else if (vencer == 7) {  
		            System.out.println("Voce venceu.");  
		            System.exit(0);  
		        }  
		    } else {  
		        System.out.println("Essa letra j� foi digitada.");  
		    }  
		    contador++; 
		}
		
		scanner.close();

	}
}
