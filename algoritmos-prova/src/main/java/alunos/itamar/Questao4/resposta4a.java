package alunos.itamar.Questao4;

/*4.	(2,0) Escreva um algoritmo seguindo as seguintes instruções:
a.	Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo int.
 Efetue a soma das duas variáveis e verifique se o resultado da soma divido por 10
  é igual ao resto variável “umNumero” por 5. Caso sim imprima “True”,
   caso contrário imprima “False”.*/
import java.util.Scanner;

public class resposta4a {//FIXME: Nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int umNumero = scanner.nextInt();
		System.out.println("Digite outro numero");
		int outroNumero = scanner.nextInt();
		//FIXME: o primeiro deveria somar as duas variaveis e dividir por 10.
		if (((umNumero + outroNumero) % 10) == (umNumero % 5)) {
			System.out.println("A) true");
		} else {
			System.out.println("A) false");
		}

		scanner.close();
	}

}
