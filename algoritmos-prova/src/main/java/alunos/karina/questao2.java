package alunos.karina;

/*2.	(1,0) Imprimir uma lista de números de 100 a 300, mostrando no console apenas múltiplos de 5 e 10.*/

public class questao2 {//FIXME: Nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		int lista;
		for (lista = 100; lista <= 300; lista++) {
			if (lista % 5 == 0 || lista % 10 == 0) {//FIXME: o exercicio pede múltiplos de 5 "E" 10.
				System.out.println(lista);
			}
		}
	}
}
