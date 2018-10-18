package exemplos.condicao;

import java.util.Scanner;

public class CondicaoMesada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int _qtdMeses;
		System.out.println("Digite a quantidade de meses:");
		_qtdMeses = scanner.nextInt();
		
		double soma = 100;
		int aux = 12;
		if(_qtdMeses == aux && soma > 99){
			System.out.println("12 meses e Soma maior que 99");
		} else if((_qtdMeses == aux && soma > 99)
		|| (_qtdMeses == 10 && soma < 99)){
			System.out.println("11 meses");
		} else if(_qtdMeses == aux){
			System.out.println("5 meses");
		}else{
			System.out.println("Mês inexistente!");
		}
		
		scanner.close();
	}
}
