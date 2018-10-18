package alunos.brunohenriqueboni;

/*2.	(1,0) Imprimir uma lista de números de 100 a 300, mostrando no console apenas múltiplos de 5 e 10.*/
public class Questao2 {
	public static void main(String[] args) {

		for (int i = 100; i <= 300; i++) {
			if (i % 5 == 0 || i % 10 == 0) {//FIXME: O exercicio pede para mostrar múltiplos de 5 "E" 10
				System.out.println(i);

			}

		}

	}

}
