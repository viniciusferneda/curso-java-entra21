package alunos.brunohenriqueboni;

/*4.	(2,0) Escreva um algoritmo seguindo as seguintes instruções:
 * a.	Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo 
 * int. Efetue a soma das duas variáveis e verifique se o resultado da soma 
 * divido por 10 é igual ao resto variável “umNumero” por 5. Caso sim imprima 
 * “True”, caso contrário imprima “False”.
 * b.	Declare uma variável do tipo String e outra do tipo boolean. Coloque seu 
 * nome como valor da variável String. Verifique se o tamanho do valor da 
 * variável String é maior que 10. Coloque o resultado desta verificação na 
 * variável boolean. Imprima o valor da variável boolean.
 * c.	Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
 * Declare outra variável do tipo boolean de nome ”falso” com valor true. 
 * Imprima no console o resultado da condição da negação da variável 
 * “verdadeiro” e a dupla negação da variável “falso”.*/
public class Questao4 {
	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------------------------------------
		 * Algoritmo da letra A: 
		 --------------------------------------------------------------------------------------------------------------*/

		int umNumero = 50;
		int outroNumero = 30;
		int soma;

		soma = umNumero + outroNumero;

		if ((soma / 10) == (umNumero % 5)) {
			System.out.println("A: True");
		} else {
			System.out.println("A: False");
		}

		/*----------------------------------------------------------------------------------------------------------------
		 * Algoritmo da letra B:
		 ----------------------------------------------------------------------------------------------------------------*/

		String nome_aluno = "Bruno";
		boolean SN; // FIXME: Nome de variável deve começar com letras minusculas
		int tam_nome_aluno;

		tam_nome_aluno = nome_aluno.length();
		if (tam_nome_aluno > 10) {
			SN = true;
		} else {
			SN = false;

		}

		System.out.println("B: " + SN);

		/*----------------------------------------------------------------------------------------------------------------
		 * Algoritmo da letra C:
		-----------------------------------------------------------------------------------------------------------------*/

		boolean verdadeiro = false;
		boolean falso = true;
		boolean resultado;

		resultado = (!verdadeiro & !!falso); //FIXME: A verificação deve ser realizada com dois &&

		System.out.println("C: " + resultado);

	}

}
