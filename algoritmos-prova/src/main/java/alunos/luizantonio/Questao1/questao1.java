package alunos.luizantonio.Questao1;

public class questao1 {//FIXME: O nome da classe deve começar com letra maiuscula.
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.println(i + " - Ímpar");
			}else{
				if (i % 2 != 1) {
						System.out.println(i + " - Par");
					}
				}
			}
		}
	}