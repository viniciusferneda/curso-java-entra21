package alunos.itamar.Questao4;

/*4.	(2,0) Escreva um algoritmo seguindo as seguintes instru��es:
a.	Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do tipo int.
 Efetue a soma das duas vari�veis e verifique se o resultado da soma divido por 10
  � igual ao resto vari�vel �umNumero� por 5. Caso sim imprima �True�,
   caso contr�rio imprima �False�.*/
import java.util.Scanner;

public class resposta4a {//FIXME: Nome da classe deve come�ar com letra maiuscula.
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
