package alunos.felipe;

public class questão2 {//FIXME: Nome da classe deve começar com letra Maiscula e não pode conter acentuação
	
	public static void main(String[] args) {

		int aux = 100;

		while (aux <= 300) {

			if (aux % 5 == 0 && aux % 10 == 0) {

				System.out.println(aux);

			}

			aux++;

		}

	}
}
