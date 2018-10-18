package alunos.guilherme;

public class Questao4 {
	public static void main(String[] args) {
		int umNumero = 0;
		int outroNumero = 0;
		int soma = umNumero + outroNumero;
		boolean verif;
		System.out.println("Item A:");
		if(soma / 10 == umNumero % 5){//FIXME: As operações devem estar entre parenteses, para evitar erro de cálculo.
			verif = true;
			System.out.println(verif);
		} else {
			verif = false;
			System.out.println(verif);
		}
		System.out.println("\nItem B:");
		String nome = "Guilherme";
		boolean verifNome;
		if (nome.length() > 10) {
			verifNome = true;
			System.out.println(verifNome);
		} else {
			verifNome = false;
			System.out.println(verifNome);
		}
		System.out.println("\nItem C:");
		boolean verdadeiro = false;
		boolean falso = true;
		//FIXME: Somente deveria ser impresso um resultado comparando as duas condições
		System.out.println(!verdadeiro);
		System.out.println(!!falso);
	}

}
