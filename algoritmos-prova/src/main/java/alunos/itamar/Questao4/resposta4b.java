package alunos.itamar.Questao4;
/*b.	Declare uma variável do tipo String e outra do tipo boolean. 
Coloque seu nome como valor da variável String. Verifique se o tamanho do valor da variável 
String é maior que 10. Coloque o resultado desta verificação na variável boolean. 
Imprima o valor da variável boolean.*/

public class resposta4b {//FIXME: Nome da classe deve começar com letra maiuscula.
	
	public static void main(String[] args) {
		System.out.println("Valor da variavel maior que 10");
		String nome = "Itamar";
		boolean valor = false;
		if (nome.length() > 10) {
			//FIXME: Deve ser atribuido o valor da comparação do tamanho da variavel
			valor = nome != null;
		}
		System.out.println(valor);
	}
}
