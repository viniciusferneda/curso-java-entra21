package alunos.luizantonio.Questao4;

public class questao4a {// FIXME: O nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		int unNumero = 25400;
		int outroNumero = 100;

		int soma = outroNumero + unNumero;
		soma = soma / 10;

		if (soma == unNumero % 5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}