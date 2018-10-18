package alunos.lucasbraz;
/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
	10 - Par
	9 - Ímpar
	8 - Par
	7 – Ímpar
*/

public class Questao1 {
	public static void main(String[] args) {
		String par = "Par";
		String impar = "Ímpar";
		for(int a = 10; a >= 1; a--){
			if (a % 2 == 1){
				System.out.println(a+" "+impar);}
				else{
					System.out.println(a+" "+par);
				}
			}
		}
		    
	}



	  