package alunos.brunorafaelgaertner;

public class Questao1 {
	public static void main(String[] args) {
		//1.	(1,0) Imprimir uma lista ordenada de 10 a 1, 
		//no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
		//10 - Par
		//9 - �mpar
		//8 - Par
		//7 � �mpar
		
		//For 
		for(int num = 10; num >= 1; num --){
			if(num % 2 == 0){
			System.out.println(num+" - Par");
			}else{
				System.out.println(num+" - �mpar");
			}
		}

	}

}
