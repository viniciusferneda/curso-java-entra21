/*
 * Escreva um algoritmo seguindo as seguintes instru��es:
a.Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do tipo int. 
  Efetue a soma das duas vari�veis e verifique se o resultado da soma divido por 10 � igual
  ao resto vari�vel �umNumero� por 5. Caso sim imprima �True�, caso contr�rio imprima �False�.
 */
package alunos.andiara.questao4.itema.java;

public class Classe {
	public static void main(String[] args) {

		int umNumero = 10;
		int outroNumero = 20;
		int soma = umNumero + outroNumero;

		if (soma / 10 == (umNumero / 5)) {//FIXME: Deveria comparar com o resto da divis�o por 5 (umNumero % 5)
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
