package exemplos.condicao;

public class CondicaoAguaPronta {

	public static void main(String[] args) {
		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("Água pronta para o café.");
		} else {
			System.out.println("Água não está pronta para o café");
		}
	}
}
