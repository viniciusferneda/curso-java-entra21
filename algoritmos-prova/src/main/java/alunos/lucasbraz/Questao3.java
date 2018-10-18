package alunos.lucasbraz;

/*3.	(1,0) Solicitar ao usuário para que informe 10 números. Estes números devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os números dentro do array e imprima no console o total da soma dos números.
 */
import javax.swing.JOptionPane;

public class Questao3 {
	private static final JOptionPane JOPtionPane = null;

	public static void main(String[] args) {
		int[] valores = new int[10];
		valores[0] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 1º Número"));
		valores[1] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 2º Número"));
		valores[2] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 3º Número"));
		valores[3] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 4º Número"));
		valores[4] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 5º Número"));
		valores[5] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 6º Número"));
		valores[6] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 7º Número"));
		valores[7] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 8º Número"));
		valores[8] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 9º Número"));
		valores[9] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 10º Número"));
		int valorTotalPedido = 0;
		for (int i = 0; i < valores.length; i++) {

			valorTotalPedido += valores[i];
		}
		JOptionPane.showMessageDialog(null, "O valor da soma é " + valorTotalPedido);
	}

}
