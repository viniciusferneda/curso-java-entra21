package exemplos.array;

import java.text.DecimalFormat;

public class ArrayBidimensionalExemplo {

	public static void main(String[] args) {
		//Declara��o de um array 4x2 posi��es
		double[][] notas = new double[4][2];
		
		//Inserindo os valores no array
		//1�bimestre
		notas[0][0] = 8;
		notas[0][1] = 6;
		
		//2�bimestre
		notas[1][0] = 10;
		notas[1][1] = 5;
		
		//3�bimestre
		notas[2][0] = 10;
		notas[2][1] = 9;
		
		//4�bimestre
		notas[3][0] = 9;
		notas[3][1] = 8;
		
		//Somando as notas em uma variavel
		double somaNotas[] = new double[4];
		double mediaBimestre[] = new double[4];
		for(int aux = 0; aux < notas.length; aux++){
			for(int aux2 = 0; aux2 < notas[aux].length; aux2++){
				somaNotas[aux] += notas[aux][aux2];
			}
			mediaBimestre[aux] = somaNotas[aux] / notas[aux].length;
			System.out.println("M�dia do "+(aux+1)+"� Bimestre � "+ mediaBimestre[aux]);
		}
		
		//Calculando a m�dia dos bimestres
		double somaMediaGeral = 0;
		for(int aux3 = 0; aux3 < mediaBimestre.length; aux3++){
			somaMediaGeral += mediaBimestre[aux3];
		}
		double mediaGeral = somaMediaGeral / mediaBimestre.length;
		
		DecimalFormat df = new DecimalFormat("#0.00");
		//Impress�o da m�dia geral
		System.out.println("A m�dia � "+ df.format(mediaGeral));
	}
}
