/*c.Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
  Declare outra variável do tipo boolean de nome ”falso” com valor true. 
  Imprima no console o resultado da condição da negação da variável “verdadeiro” e a dupla negação 
  da variável “falso”.
 */

package alunos.andiara.questao4.itemc.java;

public class Classe {
	public static void main(String[] args) {

		boolean verdadeiro = false;
		boolean falso = true;

		//FIXME: Somente deveria ser impresso um resultado comparando as duas condições
		System.out.println(verdadeiro + " -> " + !verdadeiro + " ");
		System.out.println(falso + " -> " + !!falso);
	}
}
