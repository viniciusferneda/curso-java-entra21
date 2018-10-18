package alunos.brunohenriqueboni;

/*5.	(5,0) Desenvolver um algoritmo do jogo da forca, onde a palavra pré-definida seja 
 * ESTUDAR. O usuário irá possuir 7 tentativas para acertar a palavra.*/
import javax.swing.JOptionPane;

public class Questao5 {
	public static void main(String[] args) {

		String jogo[] = new String[7];
		String soma_letras = "";
		String resultado = "ESTUDAR";
		int soma = 0;
		int tentativas = 7;

		for (int i = 0; i < jogo.length; i++) {
			jogo[i] = JOptionPane.showInputDialog("Digite uma letra! Você possuí: " + tentativas + " tentativa(s)!");
			tentativas--;

			soma_letras = soma_letras + jogo[i];
			System.out.println("Você digitou a letra: " + jogo[i] + ", e a palavra está formando: " + soma_letras);
			if (jogo[i] == "E" | jogo[i] == "S" | jogo[i] == "T" | jogo[i] == "U" | jogo[i] == "D" | jogo[i] == "A" | jogo[i] == "R") {
				soma++;

			}
		}
		if (soma_letras.equalsIgnoreCase("ESTUDAR")) {
			JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Você errou! A palavra correta é: ESTUDAR.");

		}

	}

}
