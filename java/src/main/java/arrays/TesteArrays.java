package arrays;

import java.util.Arrays;

public class TesteArrays {

	public static void main(String[] args) {
		int[] numeros = {5,10,2,3,1,8,9,20,15,16,12,11};
		
		Arrays.sort(numeros);
		
		double soma = 0;
		int maiorNum = numeros[0];
		for (int num : numeros) {
			soma += num;
			if(num > maiorNum){
				maiorNum = num;
			}
			//System.out.println(num);
		}
		
		System.out.println("Média = "+ (soma/numeros.length));
		System.out.println("Maior número = "+maiorNum);
		
	}
	
}
