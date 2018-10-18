package alunos.luizcarlos;

public class Quarta {
	public static void main(String[] args) {

		//FIXME: O código deveria estar melhor organizado.
		
		int umNumero = 20;
		int outroNumero = 20;
		int soma = (umNumero + outroNumero) / 10;
		String nome = "Luiz";
		boolean verdade = false;
		boolean falso = true;
		@SuppressWarnings("unused")
		int resultadoString;
		
		//FIXME: Deveria ser impresso o resultado da comparação das condições
		if(!verdade){
			System.out.println(verdade);
		}
		if(!!falso){
			System.out.println(falso);
		}
	
		
		System.out.println(nome.length());//FIXME: Deveria ser impresso o resultado da comparação booleana.
		if(nome.length()>10){
			resultadoString=nome.length();
			
		}
	
		if (soma % 5 == umNumero) {//FIXME: o Calculo do resto deveria ser (umNumero % 5)
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}


}
