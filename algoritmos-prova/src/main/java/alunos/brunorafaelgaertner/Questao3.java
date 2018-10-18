package alunos.brunorafaelgaertner;

import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {
		// 3. (1,0) Solicitar ao usuário para que informe 10 números. Estes
		// números devem ser armazenados em um array do tipo int. Utilizando um
		// for some os valores de todos os números dentro do array e imprima no
		// console o total da soma dos números.

		// Criando array
		int[] array10 = new int[10];

		// Solicitando os 10 números
		JOptionPane.showMessageDialog(null, "Digite 10 números e lhe mostraremos a soma:");

		// Inserindo os 10 números com o for
		for (int num = 0; num <= 9; num++) {
			String numeros = JOptionPane.showInputDialog("Digite o " + (num + 1) + "° número:");
			int numero = Integer.parseInt(numeros);
			array10[num] = numero;
		}
		// Somando os números e armazenando em uma variável
		int somaNumeros = 0;
		for (int num = 0; num <= 9; num++) {
			somaNumeros += array10[num];
		}
		
		// Imprimindo a soma dos números
		JOptionPane.showMessageDialog(null, "A soma dos números digitados é: "+somaNumeros);
	}
}
