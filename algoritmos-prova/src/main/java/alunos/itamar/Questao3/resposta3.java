package alunos.itamar.Questao3;

/*3.	(1,0) Solicitar ao usuário para que informe 10 números. 
 * Estes números devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os números dentro do array e 
 * imprima no console o total da soma dos números.*/
import java.util.Scanner;

public class resposta3 {//FIXME: Nome da classe deve começar com letra maiuscula.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int a = 0; a < numeros.length; a++)
			if (numeros[a] < 8) {
				System.out.println("Digite um numero");
				numeros[a] = scanner.nextInt();
			}
		int soma = 0;
		for (int aux = 0; aux < numeros.length; aux++) {
			soma += numeros[aux];
		}
		System.out.println("Soma total " + soma);
		scanner.close();
	}
}
