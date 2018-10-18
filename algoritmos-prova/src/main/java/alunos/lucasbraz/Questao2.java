package alunos.lucasbraz;
/*2.	(1,0) Imprimir uma lista de números de 100 a 300, mostrando no console apenas múltiplos de 5 e 10.*/

public class Questao2 {
	public static void main(String[] args) {
		for (int a = 100; a <= 300; a++) {
			if (a % 5 == 0 && a % 10 == 0)
				System.out.println(a);

		}
	}
}
