package alunos.lucasbraz;

/*c.	Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false. 
Declare outra vari�vel do tipo boolean de nome �falso� com valor true. 
Imprima no console o resultado da condi��o da nega��o da vari�vel �verdadeiro� e a dupla nega��o da vari�vel �falso�.
*/
import java.util.Scanner;

public class Questao4letraC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean verdadeiro = false;
		boolean falso = true;
		verdadeiro = !verdadeiro;
		falso = !!falso;
		System.out.println(verdadeiro + " " + falso);
		//FIXME: Deveria imprimir somente um resultado comparando as condi��es
		//FIXME: No final do algoritmo deve ser finalizado o scanner.
	}
}
