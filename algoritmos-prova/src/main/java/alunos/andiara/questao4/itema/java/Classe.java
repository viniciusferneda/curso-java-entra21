/*
 * Escreva um algoritmo seguindo as seguintes instruções:
a.Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo int. 
  Efetue a soma das duas variáveis e verifique se o resultado da soma divido por 10 é igual
  ao resto variável “umNumero” por 5. Caso sim imprima “True”, caso contrário imprima “False”.
 */
package alunos.andiara.questao4.itema.java;

public class Classe {
	public static void main(String[] args) {

		int umNumero = 10;
		int outroNumero = 20;
		int soma = umNumero + outroNumero;

		if (soma / 10 == (umNumero / 5)) {//FIXME: Deveria comparar com o resto da divisão por 5 (umNumero % 5)
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
