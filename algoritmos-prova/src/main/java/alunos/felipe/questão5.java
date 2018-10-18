package alunos.felipe;

import javax.swing.JOptionPane;

public class questão5 {//FIXME: Nome da classe deve começar com letra Maiscula e não pode conter acentuação
	
	public static void main(String[] args) {

		String usrEntrada = "";
		String txt[] = new String[7];
		txt[0] = "_";
		txt[1] = "_";
		txt[2] = "_";
		txt[3] = "_";
		txt[4] = "_";
		txt[5] = "_";
		txt[6] = "_";
		int i = 0;
		int tentativas = 7;
		boolean acerto = false;
		int palavra = 0;
		boolean validate = false;

		while (tentativas > 0) {
			i = 0;
			boolean limiteLetra = false;

			while (limiteLetra == false) {
				validate = false;

				while (validate == false) {
					validate = true;
					usrEntrada = JOptionPane.showInputDialog(txt[0] + " " + txt[1] + " " + txt[2] + " " + txt[3] + " "
							+ txt[4] + " " + txt[5] + " " + txt[6] + "\n" + "Você possui " + tentativas
							+ " tentativas ainda digite uma letra: ");
					int posicao = usrEntrada.lastIndexOf("");

					for (int x = 0; x < txt.length; x++)

						if (txt[x].contains(usrEntrada.toUpperCase())) {

							JOptionPane.showMessageDialog(null, "Você já acertou essa letra, digite outra");

							validate = false;

						} else {

						}

					if (posicao == 1) {
						limiteLetra = true;

					} else {

						JOptionPane.showMessageDialog(null, "Digite apenas uma letra");

					}

				}

			}

			if (usrEntrada.equalsIgnoreCase("E")) {

				txt[i] = "E";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;
			}

			if (usrEntrada.equalsIgnoreCase("S")) {

				txt[i] = "S";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}

			if (usrEntrada.equalsIgnoreCase("T")) {

				txt[i] = "T";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}

			if (usrEntrada.equalsIgnoreCase("U")) {

				txt[i] = "U";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}
			if (usrEntrada.equalsIgnoreCase("D")) {

				txt[i] = "D";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}
			if (usrEntrada.equalsIgnoreCase("A")) {

				txt[i] = "A";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}

			if (usrEntrada.equalsIgnoreCase("R")) {

				txt[i] = "R";
				acerto = true;
				i++;
				palavra++;

			} else {

				i++;

			}

			if (acerto == true) {

				limiteLetra = false;
				acerto = false;
			} else {

				limiteLetra = false;
				tentativas--;
			}

			if (palavra == 7) {

				tentativas = -1;
			}

		}
		if (tentativas == -1) {
			JOptionPane.showMessageDialog(null, "Parabéns você acertou a palavra ESTUDAR!!");

		} else {
			JOptionPane.showMessageDialog(null, "Acabou suas tentativas!!");

		}
	}
}
