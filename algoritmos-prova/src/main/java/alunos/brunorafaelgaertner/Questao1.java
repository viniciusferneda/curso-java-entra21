package alunos.brunorafaelgaertner;

public class Questao1 {
	public static void main(String[] args) {
		//1.	(1,0) Imprimir uma lista ordenada de 10 a 1, 
		//no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
		//10 - Par
		//9 - Ímpar
		//8 - Par
		//7 – Ímpar
		
		//For 
		for(int num = 10; num >= 1; num --){
			if(num % 2 == 0){
			System.out.println(num+" - Par");
			}else{
				System.out.println(num+" - Ímpar");
			}
		}

	}

}
