package alunos.renan;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 5. Desenvolver um algoritmo do jogo da forca,
		// onde a palavra pr�-definida seja ESTUDAR.
		// O usu�rio ir� possuir 7 tentativas para acertar a palavra.

		String[] pChave = new String[7];
		pChave[0] = "E";
		pChave[1] = "S";
		pChave[2] = "T";
		pChave[3] = "U";
		pChave[4] = "D";
		pChave[5] = "A";
		pChave[6] = "R";

		System.out.println("Voc� tem" + " " + pChave.length + " " + "tentativas");
		System.out.println("--------------------------------------------");

		System.out.println("Qual � a pirmeira letra?");
		String letra1 = scanner.nextLine();
		String[] letras = new String[7];

		for (int aux = 0; aux < letras.length; aux++) {
			System.out.println("Qual � a pr�xima letra?");

			// if (pChave[0] == letra1){
			// System.out.println("Letra Correta! " + letras[0])
			// letras[0] = letra1;
			// } else {
			// System.out.println("Letra n�o existe");
		}
		// FIXME: No final do algoritmo deve ser finalizado o scanner
	}
}
// if(letra1 == pChave[0]){

// System.out.println(letras[0]);

/*
 * 
 * 
 * System.out.println("Qual � a segunda letra?"); String letra2 =
 * scanner.nextLine(); letras[1] = letra2;
 * 
 * 
 * System.out.println("Qual � a terceira letra?"); String letra3 =
 * scanner.nextLine(); letras[2] = letra3;
 * 
 * System.out.println("Qual � a quarta letra?"); String letra4 =
 * scanner.nextLine(); letras[3] = letra4;
 * 
 * System.out.println("Qual � a quinta letra?"); String letra5 =
 * scanner.nextLine(); letras[4] = letra5;
 * 
 * System.out.println("Qual � a sexta letra?"); String letra6 =
 * scanner.nextLine(); letras[5] = letra6;
 * 
 * 
 * System.out.println("Qual � a �ltima letra?"); String letra7 =
 * scanner.nextLine(); letras[6] = letra7;
 * 
 */

// while (letra != pChave.length){
// System.out.println(" Letra n�o existe! Qual � a pr�xima letra?");
// if()
