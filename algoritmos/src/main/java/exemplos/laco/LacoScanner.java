package exemplos.laco;

import java.util.Scanner;

public class LacoScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int _qtdMeses;
		System.out.println("Digite a quantidade de meses:");
		_qtdMeses = scanner.nextInt();
		
		int _valorMensal;
		System.out.println("Digite o valor Mensal:");
		_valorMensal = scanner.nextInt();
		
		int aux = 0;
		double soma = 0;
		while (aux < _qtdMeses) {
			soma += _valorMensal;
			aux++;
		}
		
		System.out.println("O valor da soma é " + soma);
		
		scanner.close();
	}
}
