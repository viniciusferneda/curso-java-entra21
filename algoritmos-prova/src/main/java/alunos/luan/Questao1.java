package alunos.luan;

public class Questao1 {
	public static void main(String[] args) {

		String par = "PAR";
		String imp = "�MPAR";

		//FIXME: Deveria imprimir somente os n�meros de 10 a 1.
		for (int aux = 10; aux >= 0; aux--) {
			if (aux % 2 != 1) {
				System.out.println(aux + " - " + par);
			} else {
				System.out.println(aux + " - " + imp);
			}
		}
	}
}