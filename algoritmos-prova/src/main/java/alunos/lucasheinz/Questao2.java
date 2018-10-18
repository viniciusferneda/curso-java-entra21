package alunos.lucasheinz;

public class Questao2 {

	public static void main(String[] args) {

		for (int i = 100; i < 301; i++) {
			if(i % 5 == 0 || i % 10 == 0) {//FIXME: O Exercicio pede múltiplos de 5 "E" 10
				System.out.println(i);
			}
		}
	}
}
