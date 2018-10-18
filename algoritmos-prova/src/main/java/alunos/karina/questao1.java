package alunos.karina;

/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
	10 - Par
	9 - Ímpar
	8 - Par
	7 – Ímpar
*/

public class questao1 {//FIXME: Nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		int lista;
		for (lista = 10; lista >= 1; lista--) {
			if (lista % 2 == 0) {
				System.out.println(lista + "- Par");
			} else if (lista % 2 == 1) {
				System.out.println(lista + "- Ímpar");
			}
		}
	}
}
