package alunos.lucasbraz;

/*Escreva um algoritmo seguindo as seguintes instru��es:
a.	Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do tipo int. 
Efetue a soma das duas vari�veis e verifique se o resultado da soma divido por 10 � igual ao resto vari�vel �umNumero� por 5. 
Caso sim imprima �True�, caso contr�rio imprima �False�.
*/
import java.util.Scanner;

public class Questao4letraA {
	public static void main(String[] args) {
		/* A */Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int umNumero = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int outroNumero = scanner.nextInt();
		double resultado = (umNumero + outroNumero) / 10;
		double resto = umNumero % 5;
		
		//FIXME: Faltou colocar "{" e "}" no if
		if (resto == resultado)
			System.out.println("True");
		else {
			System.out.println("False");

			//FIXME: o fechamento do scanner deve estar no final do m�todo main
			scanner.close();
		}
	}
}
