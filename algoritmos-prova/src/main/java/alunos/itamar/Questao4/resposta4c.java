package alunos.itamar.Questao4;

/*c.	Declare uma variável do tipo boolean de nome “verdadeiro” com valor false.
 Declare outra variável do tipo boolean de nome ”falso” com valor true. Imprima no
  console o resultado da condição da negação da variável “verdadeiro” e
   a dupla negação da variável “falso”.*/

public class resposta4c {//FIXME: Nome da classe deve começar com letra maiuscula.
	
	public static void main(String[] args) {
		boolean verdadeiro = false;
		boolean falso = true;
		
		//FIXME: O resultado deveria ser somente um com a comparação das duas condições
		System.out.println("Variavel falso= " + (!!falso) + "\nVariavel verdadeiro= " + (!verdadeiro));
	}
}
