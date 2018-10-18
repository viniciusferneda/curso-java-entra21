package alunos.lucasdraeger;

public class Questão4 {// FIXME: Nome da classe não pode conter acentuação
	/*
	 * a.Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo
	 * int. Efetue a soma das duas variáveis e verifique se o resultado da soma
	 * divido por 10 é igual ao resto da variável “umNumero” por 5. Caso sim
	 * imprima “True”, caso contrário imprima “False”.
	 */
	public static void main(String[] args) {
		int umNumero = 10;
		int outroNumero = 5;

		System.out.println("Letra A");
		int soma = umNumero + outroNumero;
		// FIXME: Deveria comparar com o resto da divisão por 5 (umNumero % 5)
		if ((soma / 10) == (umNumero / 5)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		/*
		 * b.Declare uma variável do tipo String e outra do tipo boolean.
		 * Coloque seu nome como valor da variável String. Verifique se o
		 * tamanho do valor da variável String é maior que 10. Coloque o
		 * resultado desta verificação na variável boolean. Imprima o valor da
		 * variável boolean.
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
		 * c.Declare uma variável do tipo boolean de nome “verdadeiro” com valor
		 * false. Declare outra variável do tipo boolean de nome ”falso” com
		 * valor true. Imprima no console o resultado da condição da negação da
		 * variável “verdadeiro” e a dupla negação da variável “falso”.
		 */
		boolean verdadeiro = false;
		boolean falso = true;

		//FIXME: Resultado não pedido pelo exercicio.
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
