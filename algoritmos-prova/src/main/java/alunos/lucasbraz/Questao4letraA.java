package alunos.lucasbraz;

/*Escreva um algoritmo seguindo as seguintes instruções:
a.	Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo int. 
Efetue a soma das duas variáveis e verifique se o resultado da soma divido por 10 é igual ao resto variável “umNumero” por 5. 
Caso sim imprima “True”, caso contrário imprima “False”.
*/
import java.util.Scanner;

public class Questao4letraA {
	public static void main(String[] args) {
		/* A */Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int umNumero = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int outroNumero = scanner.nextInt();
		double resultado = (umNumero + outroNumero) / 10;
		double resto = umNumero % 5;
		
		//FIXME: Faltou colocar "{" e "}" no if
		if (resto == resultado)
			System.out.println("True");
		else {
			System.out.println("False");

			//FIXME: o fechamento do scanner deve estar no final do método main
			scanner.close();
		}
	}
}
