package alunos.brunohenriqueboni;

/*3.	(1,0) Solicitar ao usu�rio para que informe 10 n�meros. Estes n�meros devem ser 
 * armazenados em um array do tipo int. Utilizando um for some os valores de todos os 
 * n�meros dentro do array e imprima no console o total da soma dos n�meros. */
import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {

		int lista[] = new int[10];
		int soma = 0;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
			soma = soma + lista[i];

		}
		System.out.println(soma);
	}

}
