package alunos.karina;

import javax.swing.JOptionPane;

/*5.	(5,0) Desenvolver um algoritmo do jogo da forca, onde a palavra pré-definida seja ESTUDAR.
O usuário irá possuir 7 tentativas para acertar a palavra.*/

public class questao5 {//FIXME: Nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		JOptionPane.showConfirmDialog(null, "FORCA __ __ __ __ __ __ __ ");
		JOptionPane.showInputDialog("FORCA __ __ __ __ __ __ __ ");

		
		String forca = null;

		if (forca.equals("e")){
			JOptionPane.showMessageDialog(null, "FORCA E __ __ __ __ __ __ ");
		}
		else if (forca.equals("s")){
			JOptionPane.showConfirmDialog(null, "FORCA E S __ __ __ __ __ ");
		}
		else if (forca.equals("t")){
			JOptionPane.showConfirmDialog(null, "FORCA E S T __ __ __ __ ");
		}
		else if (forca.equals("u")){
			JOptionPane.showConfirmDialog(null, "FORCA E S T U __ __ __ ");
		}
		else if (forca.equals("d")){
			JOptionPane.showConfirmDialog(null, "FORCA E S T U D __ __ ");
		}
		else if (forca.equals("a")){
			JOptionPane.showConfirmDialog(null, "FORCA E S T U D A __ ");
		}
		else if (forca.equals("r")){
			JOptionPane.showConfirmDialog(null, "FORCA E S T U D A R ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Vocêfracassou! :(");
		}
	}
}

