package alunos.felipe;

public class quest�o4 {//FIXME: Nome da classe deve come�ar com letra Maiscula e n�o pode conter acentua��o
	
	public static void main(String[] args) {

		// A -
		int umNumero = 0;
		int outroNumero = 0;

		int soma = umNumero + outroNumero;

		if ((soma / 10) == (umNumero % 5)) {

			System.out.println("True");

		} else {

			System.out.println("false");
		}

		// B -
		String nome = "Felipe Gomes da Silva";
		boolean condicao;

		int posicao = nome.lastIndexOf("");//FIXME: Para saber o tamanho da vari�vel deve ser usada a fun��o length 

		if (posicao > 10) {

			condicao = true;

		} else {

			condicao = false;
		}

		System.out.println(condicao);

		// C -
		boolean verdadeiro = false;
		boolean falso = true;

		boolean fsl = !verdadeiro && !falso && !falso;

		System.out.println(fsl);

	}
}