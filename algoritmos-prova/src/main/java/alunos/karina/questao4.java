package alunos.karina;

import javax.swing.JOptionPane;

/*4.	(2,0) Escreva um algoritmo seguindo as seguintes instru��es:



c.	Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false. 
Declare outra vari�vel do tipo boolean de nome �falso� com valor true. 
Imprima no console o resultado da condi��o da nega��o da vari�vel �verdadeiro� e a dupla nega��o da vari�vel �falso�.
*/

public class questao4 {
	public static void main(String[] args) {//FIXME: Nome da classe deve come�ar com letra maiuscula.

		/*
		 * a. Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do
		 * tipo int. Efetue a soma das duas vari�veis e verifique se o resultado
		 * da soma divido por 10 � igual ao resto vari�vel �umNumero� por 5.
		 * Caso sim imprima �True�, caso contr�rio imprima �False�.
		 */

		int umNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		int outroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));

		int soma = umNumero + outroNumero;
		int div = soma / 10;
		int resto = umNumero % 5;

		if (div == resto) {
			System.out.println("True");
		} else if (div != resto) {
			System.out.println("False");
		}

		/*
		 * b. Declare uma vari�vel do tipo String e outra do tipo boolean.
		 * Coloque seu nome como valor da vari�vel String. Verifique se o
		 * tamanho do valor da vari�vel String � maior que 10. Coloque o
		 * resultado desta verifica��o na vari�vel boolean. Imprima o valor da
		 * vari�vel boolean.
		 */

		String nome = "Karina";
		int nom = 6;//FIXME: Deveria obter o tamanho do nome com o m�todo length.

		boolean nomeMaior = nom > 10;
		
		//FIXME: Poderia imprimir direto a variavel, n�o precisaria fazer um if else
		if (nomeMaior) {
			System.out.println(nomeMaior);
		} else {
			System.out.println("False");
		}

		/*
		 * c. Declare uma vari�vel do tipo boolean de nome �verdadeiro� com
		 * valor false. Declare outra vari�vel do tipo boolean de nome �falso�
		 * com valor true. Imprima no console o resultado da condi��o da nega��o
		 * da vari�vel �verdadeiro� e a dupla nega��o da vari�vel �falso�.
		 */

		boolean verdadeiro = false;
		boolean falso = true;

		//Deveria imprimir somente um resultado com a compara��o das condi��es
		System.out.println(!verdadeiro + " " + !!falso);
	}
}
