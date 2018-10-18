package alunos.karina;

import javax.swing.JOptionPane;

/*4.	(2,0) Escreva um algoritmo seguindo as seguintes instruções:



c.	Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
Declare outra variável do tipo boolean de nome ”falso” com valor true. 
Imprima no console o resultado da condição da negação da variável “verdadeiro” e a dupla negação da variável “falso”.
*/

public class questao4 {
	public static void main(String[] args) {//FIXME: Nome da classe deve começar com letra maiuscula.

		/*
		 * a. Declare a variável “umNumero” e a variável “outroNumero”, ambas do
		 * tipo int. Efetue a soma das duas variáveis e verifique se o resultado
		 * da soma divido por 10 é igual ao resto variável “umNumero” por 5.
		 * Caso sim imprima “True”, caso contrário imprima “False”.
		 */

		int umNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int outroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));

		int soma = umNumero + outroNumero;
		int div = soma / 10;
		int resto = umNumero % 5;

		if (div == resto) {
			System.out.println("True");
		} else if (div != resto) {
			System.out.println("False");
		}

		/*
		 * b. Declare uma variável do tipo String e outra do tipo boolean.
		 * Coloque seu nome como valor da variável String. Verifique se o
		 * tamanho do valor da variável String é maior que 10. Coloque o
		 * resultado desta verificação na variável boolean. Imprima o valor da
		 * variável boolean.
		 */

		String nome = "Karina";
		int nom = 6;//FIXME: Deveria obter o tamanho do nome com o método length.

		boolean nomeMaior = nom > 10;
		
		//FIXME: Poderia imprimir direto a variavel, não precisaria fazer um if else
		if (nomeMaior) {
			System.out.println(nomeMaior);
		} else {
			System.out.println("False");
		}

		/*
		 * c. Declare uma variável do tipo boolean de nome “verdadeiro” com
		 * valor false. Declare outra variável do tipo boolean de nome ”falso”
		 * com valor true. Imprima no console o resultado da condição da negação
		 * da variável “verdadeiro” e a dupla negação da variável “falso”.
		 */

		boolean verdadeiro = false;
		boolean falso = true;

		//Deveria imprimir somente um resultado com a comparação das condições
		System.out.println(!verdadeiro + " " + !!falso);
	}
}
