package alunos.karina;

import javax.swing.JOptionPane;

/*3.	(1,0) Solicitar ao usuário para que informe 10 números. 
 * Estes números devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os números dentro do array e imprima no console o total da soma dos números.*/

public class questao3 {
	public static void main(String[] args) {//FIXME: Nome da classe deve começar com letra maiuscula.

		int[] num = new int[10];

		num[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		num[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		double soma = 0;
		int auxiliar;
		for (auxiliar = 0; auxiliar < num.length; auxiliar++) {
			soma += num[auxiliar];
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}
