package alunos.luan;

public class Questao2 {
	public static void main(String[] args) {
		System.out.println("Miltiplos de 5 E 10 (100 a 300)");
		
		for (int i = 100; i <= 300; i++) {
			if (i % 5 == 0 && i % 10 == 0) {
				System.out.println(i);
			}

		}
	}
}