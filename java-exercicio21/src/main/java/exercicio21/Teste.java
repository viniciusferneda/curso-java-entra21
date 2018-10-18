package exercicio21;

public class Teste {

	public static void main(String[] args) {
		Chefe chefe = new Chefe("João", "da Silva", 10000d);
		TrabalhadorComissionado trabalhadorComissionado = new TrabalhadorComissionado("José", "Guimarães", 1000d, 10d, 3000d);
		TrabalhadorPecaProduzida trabalhadorPecaProduzida = new TrabalhadorPecaProduzida("Mario", "Conceição", 1000d, 1000d);
		TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Felisberto", "Alves", 30d, 200d);
		
		System.out.println("Chefe: "+chefe.getPrimeiroNome() + ", ganhou R$ "+chefe.calcularGanho());
		System.out.println("Trabalhador Comissionado: "+trabalhadorComissionado.getPrimeiroNome() + ", ganhou R$ "+trabalhadorComissionado.calcularGanho());
		System.out.println("Trabalhador Peça Produzida: "+trabalhadorPecaProduzida.getPrimeiroNome() + ", ganhou R$ "+trabalhadorPecaProduzida.calcularGanho());
		System.out.println("Trabalhador Hora: "+trabalhadorHora.getPrimeiroNome() + ", ganhou R$ "+trabalhadorHora.calcularGanho());
	}

}
