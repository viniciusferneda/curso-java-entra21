package lista2.exercicio1;

public class MegaSenaArray {

	public static void main(String[] args) {
		int[] aposta1 = new int[] {2, 9, 10, 11, 25, 59};
		int[] aposta2 = new int[] {2, 9, 10, 5, 14, 59};
		int[] aposta3 = new int[] {12, 15, 30, 38, 39, 40};
		int[] aposta4 = new int[] {3, 5, 6, 10, 11, 12};
		int[] aposta5 = new int[] {2, 4, 8, 26, 35, 38};

		//O resultado da mega sena é o seguinte:
		int[] resultado = new int[] {59, 25, 11, 9, 10, 2};

		compararAposta(aposta1, resultado);
		compararAposta(aposta2, resultado);
		compararAposta(aposta3, resultado);
		compararAposta(aposta4, resultado);
		compararAposta(aposta5, resultado);
	}

	private static void compararAposta(int[] aposta, int[] resultado) {
		int qtdAcertos = 0;
		String apostaGanhadora = "";
		for (Integer apo : aposta) {
			for (Integer res : resultado) {
				if (res == apo) {
					if (qtdAcertos == 0) {
						apostaGanhadora += apo;
					} else {
						apostaGanhadora += ", " + apo;
					}
					qtdAcertos++;
					break;
				}
			}
		}
		if (qtdAcertos == resultado.length) {
			System.out.println("Aposta ganhadora: " + apostaGanhadora);
		}
	}
}
