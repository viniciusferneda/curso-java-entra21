/*
 * Imprimir uma lista de n�meros de 100 a 300, mostrando no console apenas m�ltiplos de 5 e 10.
 */
package alunos.andiara.questao2;

public class Classe {
	public static void main(String[] args) {

		int quantidade = 300;

		for (int aux = 100; aux <= quantidade; aux++) {
			if (aux % 5 == 0 && aux % 10 == 0) {
				System.out.println(aux);
			}
		}

	}
}