package alunos.lucasbraz;
/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
	10 - Par
	9 - �mpar
	8 - Par
	7 � �mpar
*/

public class Questao1 {
	public static void main(String[] args) {
		String par = "Par";
		String impar = "�mpar";
		for(int a = 10; a >= 1; a--){
			if (a % 2 == 1){
				System.out.println(a+" "+impar);}
				else{
					System.out.println(a+" "+par);
				}
			}
		}
		    
	}



	  