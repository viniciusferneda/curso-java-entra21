package alunos.lucasdraeger;

/*1.(1,0) Imprimir uma lista ordenada de 10 a 1,
no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.*/

public class Questão1 {// FIXME: Nome da classe não pode conter acentuação
	
	public static void main(String[] args) {
		int n1 = 11;
		while (n1 >= 1) {
			n1--;
			if (n1 % 2 == 0) {
				System.out.println(n1 + " Numero par");
			} else {
				System.out.println(n1 + " Numero impar");
			}
		}
		//FIXME: Somente deve exibir a lista de 10 a 1.
	}
	
}
