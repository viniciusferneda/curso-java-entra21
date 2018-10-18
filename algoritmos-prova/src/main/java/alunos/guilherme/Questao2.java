package alunos.guilherme;

public class Questao2 {
	public static void main(String[] args) {
		int numeros[] = new int[201];
		int x = 100;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = x;
			x++;
			if(numeros[i] % 5 == 0 && numeros[i] % 10 == 0){
				System.out.println(numeros[i]);
			} 
		}
	}

}
