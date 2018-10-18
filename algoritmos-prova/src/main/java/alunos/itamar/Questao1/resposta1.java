package alunos.itamar.Questao1;

/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, 
 * no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
	10 - Par
	9 - Ímpar
	8 - Par
	7 – Ímpar
*/
public class resposta1 {//FIXME: Nome da classe deve começar com letra maiuscula.
	
	public static void main(String[] args) {
		String parimp = "Par";
		String parimp1 = "Ímpar";
		for (int aux = 10; aux >= 1; aux--) {
			if (aux % 2 == 0) {
				System.out.println(aux + "-" + parimp);
			} else {
				System.out.println(aux + "-" + parimp1);
			}
		}
	}
}
