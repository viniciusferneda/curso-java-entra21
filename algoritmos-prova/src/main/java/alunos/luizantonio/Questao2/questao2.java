package alunos.luizantonio.Questao2;

public class questao2 {// FIXME: O nome da classe deve come�ar com letra maiuscula.

	public static void main(String[] args) {
		for (int i = 100; i <= 300; i++) {
			// FIXME: o Exercicio pede m�ltiplos de 5 "E" 10.
			// Quando utilizado or dever ser utilizado "||"
			if (i % 5 == 0 | i % 10 == 0) {
				System.out.println(i);
			}
		}
	}
}
