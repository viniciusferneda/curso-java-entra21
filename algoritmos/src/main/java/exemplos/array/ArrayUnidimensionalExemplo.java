package exemplos.array;

public class ArrayUnidimensionalExemplo {

	public static void main(String[] args) {
		//Declaração de um array com 4 posições
		double[] notas = new double[4];
		
		//Inserindo os valores no array
		notas[0] = 8;
		notas[1] = 7;
		notas[2] = 10;
		notas[3] = 5;
		
		//Somando as notas em uma variavel
		double somaNotas = 0;
		for(int aux = 0; aux < notas.length; aux++){
			somaNotas += notas[aux];
		}
		
		//Calculando a média das somas
		double media = somaNotas / notas.length;
		
		//Impressão da média
		System.out.println("A média é "+ media);
	}
}
