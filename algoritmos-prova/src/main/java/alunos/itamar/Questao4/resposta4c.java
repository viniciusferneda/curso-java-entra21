package alunos.itamar.Questao4;

/*c.	Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false.
 Declare outra vari�vel do tipo boolean de nome �falso� com valor true. Imprima no
  console o resultado da condi��o da nega��o da vari�vel �verdadeiro� e
   a dupla nega��o da vari�vel �falso�.*/

public class resposta4c {//FIXME: Nome da classe deve come�ar com letra maiuscula.
	
	public static void main(String[] args) {
		boolean verdadeiro = false;
		boolean falso = true;
		
		//FIXME: O resultado deveria ser somente um com a compara��o das duas condi��es
		System.out.println("Variavel falso= " + (!!falso) + "\nVariavel verdadeiro= " + (!verdadeiro));
	}
}
