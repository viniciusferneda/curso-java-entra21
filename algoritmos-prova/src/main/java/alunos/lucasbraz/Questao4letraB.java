package alunos.lucasbraz;

import java.util.Scanner;

/*b.	Declare uma vari�vel do tipo String e outra do tipo boolean. Coloque seu nome como valor da vari�vel String. 
Verifique se o tamanho do valor da vari�vel String � maior que 10. Coloque o resultado desta verifica��o na vari�vel boolean. 
Imprima o valor da vari�vel boolean.
*/

public class Questao4letraB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome :");
		String texto = scanner.nextLine();
		int numtext = texto.length();
		if (numtext > 10) {
			//FIXME: Deveria ser criada somente uma variavel e ela deveria estar antes do if.
			// Dentro do if ou else deveria atribuir o valor da variavel
			boolean ved = true;
			boolean fal = false;
			System.out.println(ved);
		} else {
			System.out.println("false");
		}
		//FIXME: O resultado deveria ser mostrado somente depois do if e else
		scanner.close();
	}
}
