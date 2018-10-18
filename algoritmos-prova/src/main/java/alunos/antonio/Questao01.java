package alunos.antonio;

public class Questao01 {

	public static void main(String[] args) {

		//FIXME: Deveria ser mostrado uma lista de 10 a 1 e mostrar se cadas número é par ou ímpar.
		for (int nun1 = 10; nun1 >= 7; nun1--) {

			if (nun1 == 10 || nun1 == 8) {
				System.out.println(nun1 + " - Par");
			} else {
				System.out.println(nun1 + " - Ímpar");

			}

		}
	}
}