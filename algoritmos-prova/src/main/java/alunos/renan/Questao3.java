package alunos.renan;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// a. Declare a variável “umNumero” e a variável “outroNumero”, ambas do
		// tipo int.
		// Efetue a soma das duas variáveis e verifique se o resultado da soma
		// divido por 10 é igual ao resto variável “umNumero” por 5.
		// Caso sim imprima “True”, caso contrário imprima “False”.

		System.out.println("Questão A da 3");
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
		// b.b. Declare uma variável do tipo String e outra do tipo boolean.
		// Coloque seu nome como valor da variável String. Verifique se o
		// tamanho do valor da variável String é maior que 10.
		// Coloque o resultado desta verificação na variável boolean. Imprima o
		// valor da variável boolean.

		System.out.println("Questão B da 3");
		String nome = "Renan";
		boolean resultado;
		if (nome.length() > 10) {
			resultado = true;
		} else {
			resultado = false;
			System.out.println(resultado);
		}
		System.out.println("");
		// c.Declare uma variável do tipo boolean de nome “verdadeiro” com valor
		// false.
		// Declare outra variável do tipo boolean de nome ”falso” com valor
		// true.
		// Imprima no console o resultado da condição da negação da variável
		// “verdadeiro” e a dupla negação da variável “falso”.
		System.out.println("Questão C da 3");

		boolean verdadeiro = false;
		boolean falso = true;
		System.out.println("- V = FALSO");
		System.out.println("--F = FALSO");
		//FIXME: Faltou mostrar o resultado pedido pelo exercicio

		// FIXME: No final do algoritmo deve ser finalizado o scanner

	}
}
