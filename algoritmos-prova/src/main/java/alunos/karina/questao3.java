package alunos.karina;

import javax.swing.JOptionPane;

/*3.	(1,0) Solicitar ao usu�rio para que informe 10 n�meros. 
 * Estes n�meros devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os n�meros dentro do array e imprima no console o total da soma dos n�meros.*/

public class questao3 {
	public static void main(String[] args) {//FIXME: Nome da classe deve come�ar com letra maiuscula.

		int[] num = new int[10];

		num[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));

		double soma = 0;
		int auxiliar;
		for (auxiliar = 0; auxiliar < num.length; auxiliar++) {
			soma += num[auxiliar];
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}
