package alunos.itamar.Questao2;

/*2.	(1,0) Imprimir uma lista de números de 100 a 300, 
 * mostrando no console apenas múltiplos de 5 e 10.*/

public class resposta2 {//FIXME: Nome da classe deve começar com letra maiuscula.
	
	public static void main(String[] args) {
		for (int aux = 100; aux <= 300; aux++) {
			if ((aux % 5 == 0) && (aux % 10 == 0)) {
				System.out.println(aux);
			}
		}
	}
}
