package alunos.lucasdraeger;

/*1.(1,0) Imprimir uma lista ordenada de 10 a 1,
no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.*/

public class Quest�o1 {// FIXME: Nome da classe n�o pode conter acentua��o
	
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
