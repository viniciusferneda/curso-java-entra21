package alunos.itamar.Questao1;

/*1.	(1,0) Imprimir uma lista ordenada de 10 a 1, 
 * no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
	10 - Par
	9 - �mpar
	8 - Par
	7 � �mpar
*/
public class resposta1 {//FIXME: Nome da classe deve come�ar com letra maiuscula.
	
	public static void main(String[] args) {
		String parimp = "Par";
		String parimp1 = "�mpar";
		for (int aux = 10; aux >= 1; aux--) {
			if (aux % 2 == 0) {
				System.out.println(aux + "-" + parimp);
			} else {
				System.out.println(aux + "-" + parimp1);
			}
		}
	}
}
