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
		
		//FIXME: Deveria imprimir somente um resultado com a compara��o das condi��es.
		System.out.println(!verdadeiro);
		System.out.println(!!falso);

	}

}

// b. Declare uma vari�vel do tipo String e outra do tipo boolean.
// Coloque seu nome como valor da vari�vel String.
// Verifique se o tamanho do valor da vari�vel String � maior que 10.
// Coloque o resultado desta verifica��o na vari�vel boolean.
// Imprima o valor da vari�vel boolean.