package alunos.brunorafaelgaertner;

public class Questao2 {
	public static void main(String[] args) {
		// 2. (1,0) Imprimir uma lista de n�meros de 100 a 300, mostrando no
		// console apenas m�ltiplos de 5 e 10.
		
		//For
		for(int num = 100; num <= 300; num ++){
			//FIXME: Faltou comparar se o n�mero � m�ltiplo de 10
			if(num % 5 == 0){
				System.out.println(num);
			}else if(num % 10 == 0){
				System.out.println(num);
			}
		}
	}

}
