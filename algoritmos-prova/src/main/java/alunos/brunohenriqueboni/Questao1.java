package alunos.brunohenriqueboni;

/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual ir� imprimir o n�mero e ao lado 
 * exibir� a mensagem se � par ou �mpar.
 * exibir� a mensagem se � par ou �mpar.
 * 	10 - Par
 * 	9 - �mpar
 * 	8 - Par
 * 	7 � �mpar*/

public class Questao1 {
	public static void main(String[] args) {

		int lista[] = new int[10];
		int soma = 10;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = lista[i] + soma;
			if (lista[i] % 2 == 0) {
				System.out.println(lista[i] + " - Par");
				soma--;
			} else {
				System.out.println(lista[i] + " - �mpar");
				soma--;
			}

		}

	}

}
