package alunos.brunorafaelgaertner;

public class Questao4 {
	public static void main(String[] args) {
		// 4. (2,0) Escreva um algoritmo seguindo as seguintes instru��es:
		// a. Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do
		// tipo int. Efetue a soma das duas vari�veis e verifique se o resultado
		// da soma divido por 10 � igual ao resto vari�vel �umNumero� por 5.
		// Caso sim imprima �True�, caso contr�rio imprima �False�.

		// Vari�veis
		int umNumero = 0;
		int outroNumero = 0;

		// Soma
		int soma = umNumero + outroNumero;

		// Resultado da Soma
		int resultadoSoma = soma / 10;

		// Resto da vari�vel
		int restoVariavel = umNumero % 5;

		// Compara��o
		if (resultadoSoma == restoVariavel) {
			System.out.println("True");
		} else
			System.out.println("False");

		// b. Declare uma vari�vel do tipo String e outra do tipo boolean.
		// Coloque seu nome como valor da vari�vel String. Verifique se o
		// tamanho do valor da vari�vel String � maior que 10. Coloque o
		// resultado desta verifica��o na vari�vel boolean. Imprima o valor da
		// vari�vel boolean.

		// Vari�veis
		String nome = "Bruno";
		boolean verificacao;

		// Verifica��o
		if (nome.length() > 10) {
			verificacao = true;
		} else {
			verificacao = false;
		}
		// Imprimindo a verifica��o
		System.out.println(verificacao);

		// c. Declare uma vari�vel do tipo boolean de nome �verdadeiro� com
		// valor false. Declare outra vari�vel do tipo boolean de nome �falso�
		// com valor true. Imprima no console o resultado da condi��o da nega��o
		// da vari�vel �verdadeiro� e a dupla nega��o da vari�vel �falso�.
		
		//Vari�veis
		boolean verdadeiro = false;
		boolean falso = true;
		
		//Condi��o da nega��o da vari�vel �verdadeiro�
		if(verdadeiro == false){
			verdadeiro = true;
		}else{
			verdadeiro = false;
		}
		
		//FIXME: Deveria ser comparada as duas vari�veis, ap�s a nega��o da primeira e a dupla nega��o da segunda.
		
		//Imprimindo condi��o da nega��o da vari�vel �verdadeiro�
		System.out.println(verdadeiro);
		
		//Dupla nega��o da vari�vel �falso�
		if(falso == false){
			falso = true;
		}else{
			falso = false;
		}
			
		if(falso == false){
			falso = true;
		}else{
			falso = false;
		}
		
		//Imprimindo dupla nega��o da vari�vel �falso�
		System.out.println(falso);
	}
}
