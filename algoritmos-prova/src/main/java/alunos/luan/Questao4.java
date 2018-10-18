package alunos.luan;

public class Questao4 {
	public static void main(String[] args) {
		System.out.println("A");
		
		int umNumero = 13;

		int outroNumero = 20;

		int soma = umNumero + outroNumero;

		double div = soma / 10;

		double res = umNumero % 5;

		boolean verd = true;
		if (div == res) {
			System.out.println(verd);
		} else {
			System.out.println("false");
		}
		
		System.out.println("B");
		
		String a = "Luan";

		boolean c = (a.length() > 10);
		{
			System.out.println(c);
		}
		
		System.out.println("C");
		
		boolean verdadeiro = false;
		boolean falso = true;
		
		//FIXME: Deveria imprimir somente um resultado com a comparação das condições.
		System.out.println(!verdadeiro);
		System.out.println(!!falso);

	}

}

// b. Declare uma variável do tipo String e outra do tipo boolean.
// Coloque seu nome como valor da variável String.
// Verifique se o tamanho do valor da variável String é maior que 10.
// Coloque o resultado desta verificação na variável boolean.
// Imprima o valor da variável boolean.