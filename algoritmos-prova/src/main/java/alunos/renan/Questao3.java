package alunos.renan;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// a. Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do
		// tipo int.
		// Efetue a soma das duas vari�veis e verifique se o resultado da soma
		// divido por 10 � igual ao resto vari�vel �umNumero� por 5.
		// Caso sim imprima �True�, caso contr�rio imprima �False�.

		System.out.println("Quest�o A da 3");
		int umNumero = 2;
		int outroNumero = 2;
		int soma1 = (umNumero += outroNumero) / 10;// FIXME: += somente deve ser
													// utilizado para atribuir o
													// valor da variavel mais
													// outro valor, neste caso
													// somente deveria ser
													// utilizado o +
		// if((umNumero % 5)==0 ){
		int soma2 = (umNumero % 5);
		if (soma1 == soma2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println("");
		// b.b. Declare uma vari�vel do tipo String e outra do tipo boolean.
		// Coloque seu nome como valor da vari�vel String. Verifique se o
		// tamanho do valor da vari�vel String � maior que 10.
		// Coloque o resultado desta verifica��o na vari�vel boolean. Imprima o
		// valor da vari�vel boolean.

		System.out.println("Quest�o B da 3");
		String nome = "Renan";
		boolean resultado;
		if (nome.length() > 10) {
			resultado = true;
		} else {
			resultado = false;
			System.out.println(resultado);
		}
		System.out.println("");
		// c.Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor
		// false.
		// Declare outra vari�vel do tipo boolean de nome �falso� com valor
		// true.
		// Imprima no console o resultado da condi��o da nega��o da vari�vel
		// �verdadeiro� e a dupla nega��o da vari�vel �falso�.
		System.out.println("Quest�o C da 3");

		boolean verdadeiro = false;
		boolean falso = true;
		System.out.println("- V = FALSO");
		System.out.println("--F = FALSO");
		//FIXME: Faltou mostrar o resultado pedido pelo exercicio

		// FIXME: No final do algoritmo deve ser finalizado o scanner

	}
}
