/*
 *Imprimir uma lista ordenada de 10 a 1, no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
	 10 - Par
	 9 - Ímpar
	 8 - Par
	 7 – Ímpar

 */
package alunos.andiara.questao1;

public class Classe {
	public static void main(String[] args) {

		int numero = 10;

		for (int aux = numero; aux >= 1; aux--) {
			if (aux % 2 == 0) {
				System.out.println(aux + " - Par");
			} else {
				System.out.println(aux + " - Impar");
			}
		}
	}
}
