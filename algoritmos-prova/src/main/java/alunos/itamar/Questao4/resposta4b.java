package alunos.itamar.Questao4;
/*b.	Declare uma vari�vel do tipo String e outra do tipo boolean. 
Coloque seu nome como valor da vari�vel String. Verifique se o tamanho do valor da vari�vel 
String � maior que 10. Coloque o resultado desta verifica��o na vari�vel boolean. 
Imprima o valor da vari�vel boolean.*/

public class resposta4b {//FIXME: Nome da classe deve come�ar com letra maiuscula.
	
	public static void main(String[] args) {
		System.out.println("Valor da variavel maior que 10");
		String nome = "Itamar";
		boolean valor = false;
		if (nome.length() > 10) {
			//FIXME: Deve ser atribuido o valor da compara��o do tamanho da variavel
			valor = nome != null;
		}
		System.out.println(valor);
	}
}
