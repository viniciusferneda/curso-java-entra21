package alunos.lucasheinz;

public class Questao4 {

	public static void main(String[] args) {

		int umNumero = 400, outroNumero = 150, resultado, resto;

		resultado = (umNumero + outroNumero) / 10;
		resto = umNumero / 5; //FIXME: Deveria ser utilizado (umNumero % 5) para obter o resto da divis�o

		System.out.println("A");
		
		if (resultado == resto) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		System.out.println("B");
		
		String nome = "lucas";
		boolean maior;

		if (nome.length() > 10) {
			maior = true;
		} else {
			maior = false;
		}

		System.out.println(maior);

		System.out.println("C");
		
		boolean verdadeiro = false, falso = true;

		//FIXME: Deveria ser mostrado somente um resultado com a compara��o das condi��es
		//FIXME: N�o foi utilizada a vari�vel "verdadeiro"
		System.out.println("Aplicando um nega��o em verdadeiro, ele fica " + falso);
		System.out.println("Aplicando uma dupla nega��o em falso, ele fica " + falso);
	}
}