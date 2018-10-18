package alunos.lucasheinz;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int nums[] = new int[10];
		int soma = 0, numeral = 1;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Informe o " +  numeral + "º número (são 10 números)");
			numeral++;
			nums[i] = k.nextInt();
			soma += nums[i];
		}
		System.out.println(soma);
		
		k.close();
	}
}
