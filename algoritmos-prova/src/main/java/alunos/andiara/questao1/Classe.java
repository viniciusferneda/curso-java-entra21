/*
 *Imprimir uma lista ordenada de 10 a 1, no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
	 10 - Par
	 9 - �mpar
	 8 - Par
	 7 � �mpar

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
