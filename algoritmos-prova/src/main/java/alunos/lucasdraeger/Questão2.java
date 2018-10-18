package alunos.lucasdraeger;

/*Imprimir uma lista de números de 100 a 300,
mostrando no console apenas múltiplos de 5 e 10.*/

public class Questão2 {// FIXME: Nome da classe não pode conter acentuação
	
	public static void main(String[] args) {
		for (int n1 = 100; n1 <= 300; n1++) {
			if (n1 % 5 == 0 && n1 % 10 == 0)
				System.out.println(n1);
		}
	}
	
}
