package correcao;

public class Questao4 {

	public static void main(String[] args) {
		System.out.println("******Item A********");
		System.out.println();
		
		int umNumero = 5;
		int outroNumero = 10;
		int soma = umNumero + outroNumero;
		
		if((soma / 10) == (umNumero % 5)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
		System.out.println();
		System.out.println("******Item B********");
		System.out.println();
		
		String nome = "Vinícius";
		boolean nomeMaior10;
		if(nome.length() > 10){
			nomeMaior10 = true;
		}else{
			nomeMaior10 = false;
		}
		System.out.println("Nome possui mais de 10 letras? " +nomeMaior10);
		
		System.out.println();
		System.out.println("******Item C********");
		System.out.println();
		
		boolean verdadeiro = false;
		boolean falso = true;
		System.out.println(!verdadeiro && !!falso);
		
	}
}
