package alunos.lucasbraz;

/*3.	(1,0) Solicitar ao usu�rio para que informe 10 n�meros. Estes n�meros devem ser armazenados em um array do tipo int. 
 * Utilizando um for some os valores de todos os n�meros dentro do array e imprima no console o total da soma dos n�meros.
 */
import javax.swing.JOptionPane;

public class Questao3 {
	private static final JOptionPane JOPtionPane = null;

	public static void main(String[] args) {
		int[] valores = new int[10];
		valores[0] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 1� N�mero"));
		valores[1] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 2� N�mero"));
		valores[2] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 3� N�mero"));
		valores[3] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 4� N�mero"));
		valores[4] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 5� N�mero"));
		valores[5] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 6� N�mero"));
		valores[6] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 7� N�mero"));
		valores[7] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 8� N�mero"));
		valores[8] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 9� N�mero"));
		valores[9] = Integer.parseInt(JOPtionPane.showInputDialog("Insira 10� N�mero"));
		int valorTotalPedido = 0;
		for (int i = 0; i < valores.length; i++) {

			valorTotalPedido += valores[i];
		}
		JOptionPane.showMessageDialog(null, "O valor da soma � " + valorTotalPedido);
	}

}
