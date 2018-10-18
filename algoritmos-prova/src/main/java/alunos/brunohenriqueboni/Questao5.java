package alunos.brunohenriqueboni;

/*5.	(5,0) Desenvolver um algoritmo do jogo da forca, onde a palavra pr�-definida seja 
 * ESTUDAR. O usu�rio ir� possuir 7 tentativas para acertar a palavra.*/
import javax.swing.JOptionPane;

public class Questao5 {
	public static void main(String[] args) {

		String jogo[] = new String[7];
		String soma_letras = "";
		String resultado = "ESTUDAR";
		int soma = 0;
		int tentativas = 7;

		for (int i = 0; i < jogo.length; i++) {
			jogo[i] = JOptionPane.showInputDialog("Digite uma letra! Voc� possu�: " + tentativas + " tentativa(s)!");
			tentativas--;

			soma_letras = soma_letras + jogo[i];
			System.out.println("Voc� digitou a letra: " + jogo[i] + ", e a palavra est� formando: " + soma_letras);
			if (jogo[i] == "E" | jogo[i] == "S" | jogo[i] == "T" | jogo[i] == "U" | jogo[i] == "D" | jogo[i] == "A" | jogo[i] == "R") {
				soma++;

			}
		}
		if (soma_letras.equalsIgnoreCase("ESTUDAR")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� errou! A palavra correta �: ESTUDAR.");

		}

	}

}
