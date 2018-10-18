package exemplos.laco;

import javax.swing.JOptionPane;

public class LacoJOptionPane {

	public static void main(String[] args) {
		int _qtdMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de meses"));
		int _valorMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor Mensal:"));
		int aux = 0;
		double soma = 0;
		while (aux < _qtdMeses) {
			soma += _valorMensal;
			aux++;
		}
		JOptionPane.showMessageDialog(null, "O valor da soma é " + soma);
	}
	
}
