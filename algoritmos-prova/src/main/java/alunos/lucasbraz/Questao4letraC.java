package alunos.lucasbraz;

/*c.	Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
Declare outra variável do tipo boolean de nome ”falso” com valor true. 
Imprima no console o resultado da condição da negação da variável “verdadeiro” e a dupla negação da variável “falso”.
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
		//FIXME: Deveria imprimir somente um resultado comparando as condições
		//FIXME: No final do algoritmo deve ser finalizado o scanner.
	}
}
