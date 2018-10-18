package alunos.luizantonio.Questao4;

public class questao4b {// FIXME: O nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {

		String nome = "Luiz Antonio";

		boolean meunome = true;

		if ((nome != null) && (nome.trim().length() > 10)) {
			System.out.println(meunome);
		} else {
			System.out.println(false);
		}
	}
}
