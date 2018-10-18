package alunos.guilherme;

public class Questao1 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int x = 10;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = x;
			x--;
			if(numeros[i] % 2 == 0){
				System.out.println(numeros[i] + " - Par");
			} else {
				System.out.println(numeros[i] + " - Impar");
			}
		}
	}

}
