package lista2.exercicio1;

import java.util.Arrays;
import java.util.List;

public class MegaSenaList {

	public static void main(String[] args) {
		List<Integer> aposta1 = Arrays.asList(2, 9, 10, 11, 25, 59);
		List<Integer> aposta2 = Arrays.asList(2, 9, 10, 5, 14, 59);
		List<Integer> aposta3 = Arrays.asList(12, 15, 30, 38, 39, 40);
		List<Integer> aposta4 = Arrays.asList(3, 5, 6, 10, 11, 12);
		List<Integer> aposta5 = Arrays.asList(2, 4, 8, 26, 35, 38);

		// O resultado da mega sena é o seguinte:
		List<Integer> resultado = Arrays.asList(59, 25, 11, 9, 10, 2);

		compararAposta(aposta1, resultado);
		compararAposta(aposta2, resultado);
		compararAposta(aposta3, resultado);
		compararAposta(aposta4, resultado);
		compararAposta(aposta5, resultado);
	}

	private static void compararAposta(List<Integer> aposta, List<Integer> resultado) {
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
		if (qtdAcertos == resultado.size()) {
			System.out.println("Aposta ganhadora: " + apostaGanhadora);
		}
	}
}
