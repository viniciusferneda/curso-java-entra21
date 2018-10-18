package alunos.brunorafaelgaertner;

import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {
		// 3. (1,0) Solicitar ao usu�rio para que informe 10 n�meros. Estes
		// n�meros devem ser armazenados em um array do tipo int. Utilizando um
		// for some os valores de todos os n�meros dentro do array e imprima no
		// console o total da soma dos n�meros.

		// Criando array
		int[] array10 = new int[10];

		// Solicitando os 10 n�meros
		JOptionPane.showMessageDialog(null, "Digite 10 n�meros e lhe mostraremos a soma:");

		// Inserindo os 10 n�meros com o for
		for (int num = 0; num <= 9; num++) {
			String numeros = JOptionPane.showInputDialog("Digite o " + (num + 1) + "� n�mero:");
			int numero = Integer.parseInt(numeros);
			array10[num] = numero;
		}
		// Somando os n�meros e armazenando em uma vari�vel
		int somaNumeros = 0;
		for (int num = 0; num <= 9; num++) {
			somaNumeros += array10[num];
		}
		
		// Imprimindo a soma dos n�meros
		JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados �: "+somaNumeros);
	}
}
