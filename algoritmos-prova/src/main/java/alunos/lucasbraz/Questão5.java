package alunos.lucasbraz;
/*
5.	(5,0) Desenvolver um algoritmo do jogo da forca, onde a palavra pré-definida seja ESTUDAR. 
O usuário irá possuir 7 tentativas para acertar a palavra.
*/

import javax.swing.JOptionPane;

public class Questão5 {//FIXME: Nome da classe não pode possuir acentuação
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"*Tente desvendar a palavra secreta \n*Dica ela possuí 7 letras \n*Você tem 7 tentativas ");
		String palavra = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 6 tentativas");
		String palavra1 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra1.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 5 tentativas");
		String palavra2 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra2.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 4 tentativas");
		String palavra3 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra3.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 3 tentativas");
		String palavra4 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra4.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 2 tentativas");
		String palavra5 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra5.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "Você Tem + 1 tentativas");
		String palavra6 = JOptionPane.showInputDialog("Digite à palavra secreta");
		if (palavra6.equals("estudar"))
			JOptionPane.showMessageDialog(null, "Acertou");
		else
			JOptionPane.showMessageDialog(null, "GAME OVER");

	}
}
