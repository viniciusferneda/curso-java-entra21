package alunos.lucasdraeger;

public class Quest�o4 {// FIXME: Nome da classe n�o pode conter acentua��o
	/*
	 * a.Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do tipo
	 * int. Efetue a soma das duas vari�veis e verifique se o resultado da soma
	 * divido por 10 � igual ao resto da vari�vel �umNumero� por 5. Caso sim
	 * imprima �True�, caso contr�rio imprima �False�.
	 */
	public static void main(String[] args) {
		int umNumero = 10;
		int outroNumero = 5;

		System.out.println("Letra A");
		int soma = umNumero + outroNumero;
		// FIXME: Deveria comparar com o resto da divis�o por 5 (umNumero % 5)
		if ((soma / 10) == (umNumero / 5)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		/*
		 * b.Declare uma vari�vel do tipo String e outra do tipo boolean.
		 * Coloque seu nome como valor da vari�vel String. Verifique se o
		 * tamanho do valor da vari�vel String � maior que 10. Coloque o
		 * resultado desta verifica��o na vari�vel boolean. Imprima o valor da
		 * vari�vel boolean.
		 */
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Letra B");
		String nome = "tamanho";
		boolean tamanho;

		if (nome.length() > 10) {
			tamanho = true;
			System.out.println(tamanho);
		} else {
			tamanho = false;
			System.out.println(tamanho);
		}
		System.out.println(" ");
		System.out.println("Letra C");

		/*
		 * c.Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor
		 * false. Declare outra vari�vel do tipo boolean de nome �falso� com
		 * valor true. Imprima no console o resultado da condi��o da nega��o da
		 * vari�vel �verdadeiro� e a dupla nega��o da vari�vel �falso�.
		 */
		boolean verdadeiro = false;
		boolean falso = true;

		//FIXME: Resultado n�o pedido pelo exercicio.
		if (verdadeiro = false) {
			verdadeiro = true;
			System.out.println(verdadeiro);
		}

		if (falso = true) {
			falso = false;
			System.out.println(falso);
		}

	}
}
