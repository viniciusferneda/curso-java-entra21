package alunos.felipe;

import javax.swing.JOptionPane;

public class quest�o3 {//FIXME: Nome da classe deve come�ar com letra Maiscula e n�o pode conter acentua��o
	
	public static void main(String[] args) {

		int num[] = new int[10];
		for (int z = 0; z < num.length; z++) {

			num[z] = Integer
					.parseInt(JOptionPane.showInputDialog("Digite um numero a ser armazenado no array " + z + " : "));

		}

		int soma = 0;

		for (int i = 0; i < num.length; i++) {

			soma += num[i];

		}

		System.out.println("O total da soma dos numeros do array fica em : " + soma);

	}
}
