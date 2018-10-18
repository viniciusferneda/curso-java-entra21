package alunos.lucasheinz;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		int erros = 0;
		String senha = "estudar", palavra = "", nao = "";
		String tentativa[] = new String[14];

		System.out.println("Vamos jogar um jogo, se você perder, é enforcado, a famosa forca.");
		
		for (int i = 0; i < 14; i++) {
			System.out.println("Não estão na palavra as levras :" + nao);
			System.out.println("Informe uma letra");
			tentativa[i] = k.next();
			
			if(senha.contains(tentativa[i])) {
				System.out.println("essa letra está na palavra");
				palavra += tentativa[i];
			} else {
				System.out.println("essa letra não está na palavra");
				erros++;
				nao += tentativa[i];
			}
			
			if(erros >= 7) {
				i = 13;
			}
			
			if(palavra.contains(senha)) {
				i = 13;
			}
		}
		
		if(erros >= 7) {
			System.out.println("Perdeu");
		} else {
			System.out.println("Ganhou");
		}
		
		if(palavra.contains(senha)) {
			System.out.println("Ficou vivo");
		} else {
			System.out.println("Foi enforcado");
		}
		
		k.close();
		
	}
}
