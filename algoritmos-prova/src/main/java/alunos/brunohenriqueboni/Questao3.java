package alunos.brunohenriqueboni;

/*3.	(1,0) Solicitar ao usuário para que informe 10 números. Estes números devem ser 
 * armazenados em um array do tipo int. Utilizando um for some os valores de todos os 
 * números dentro do array e imprima no console o total da soma dos números. */
import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {

		int lista[] = new int[10];
		int soma = 0;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			soma = soma + lista[i];

		}
		System.out.println(soma);
	}

}
