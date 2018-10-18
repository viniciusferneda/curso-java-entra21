package correcao;

public class Questao2 {

	public static void main(String[] args) {
		for (int i = 100; i < 301; i++) {
			if(i % 5 == 0 && i % 10 == 0){
				System.out.println(i);
			}
		}
	}
}
