package alunos.brunorafaelgaertner;

public class Questao4 {
	public static void main(String[] args) {
		// 4. (2,0) Escreva um algoritmo seguindo as seguintes instruções:
		// a. Declare a variável “umNumero” e a variável “outroNumero”, ambas do
		// tipo int. Efetue a soma das duas variáveis e verifique se o resultado
		// da soma divido por 10 é igual ao resto variável “umNumero” por 5.
		// Caso sim imprima “True”, caso contrário imprima “False”.

		// Variáveis
		int umNumero = 0;
		int outroNumero = 0;

		// Soma
		int soma = umNumero + outroNumero;

		// Resultado da Soma
		int resultadoSoma = soma / 10;

		// Resto da variável
		int restoVariavel = umNumero % 5;

		// Comparação
		if (resultadoSoma == restoVariavel) {
			System.out.println("True");
		} else
			System.out.println("False");

		// b. Declare uma variável do tipo String e outra do tipo boolean.
		// Coloque seu nome como valor da variável String. Verifique se o
		// tamanho do valor da variável String é maior que 10. Coloque o
		// resultado desta verificação na variável boolean. Imprima o valor da
		// variável boolean.

		// Variáveis
		String nome = "Bruno";
		boolean verificacao;

		// Verificação
		if (nome.length() > 10) {
			verificacao = true;
		} else {
			verificacao = false;
		}
		// Imprimindo a verificação
		System.out.println(verificacao);

		// c. Declare uma variável do tipo boolean de nome “verdadeiro” com
		// valor false. Declare outra variável do tipo boolean de nome ”falso”
		// com valor true. Imprima no console o resultado da condição da negação
		// da variável “verdadeiro” e a dupla negação da variável “falso”.
		
		//Variáveis
		boolean verdadeiro = false;
		boolean falso = true;
		
		//Condição da negação da variável “verdadeiro”
		if(verdadeiro == false){
			verdadeiro = true;
		}else{
			verdadeiro = false;
		}
		
		//FIXME: Deveria ser comparada as duas variáveis, após a negação da primeira e a dupla negação da segunda.
		
		//Imprimindo condição da negação da variável “verdadeiro”
		System.out.println(verdadeiro);
		
		//Dupla negação da variável “falso”
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
		
		//Imprimindo dupla negação da variável “falso”
		System.out.println(falso);
	}
}
