package alunos.karina;

/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
	10 - Par
	9 - �mpar
	8 - Par
	7 � �mpar
*/

public class questao1 {//FIXME: Nome da classe deve come�ar com letra maiuscula.
	public static void main(String[] args) {

		int lista;
		for (lista = 10; lista >= 1; lista--) {
			if (lista % 2 == 0) {
				System.out.println(lista + "- Par");
			} else if (lista % 2 == 1) {
				System.out.println(lista + "- �mpar");
			}
		}
	}
}
