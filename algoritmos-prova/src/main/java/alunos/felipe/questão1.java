package alunos.felipe;

public class quest�o1 {//FIXME: Nome da classe deve come�ar com letra Maiscula e n�o pode conter acentua��o
	
	public static void main(String[] args) {

		int lista[] = new int[10];
		int soma = 10;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = soma;

			soma--;

			if (lista[i] % 2 == 0) {

				System.out.println(lista[i] + " - Par");

			} else {

				System.out.println(lista[i] + " - �mpar");

			}

		}
	}
}
