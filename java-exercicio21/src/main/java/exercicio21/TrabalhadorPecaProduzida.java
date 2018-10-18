package exercicio21;

public class TrabalhadorPecaProduzida extends Empregado {

	private double salarioMensal;
	private double quantidade;
	
	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, double salarioMensal, double quantidade) {
		super(primeiroNome, ultimoNome);
		this.salarioMensal = salarioMensal;
		this.quantidade = quantidade;
	}

	@Override
	public double calcularGanho() {
		return this.salarioMensal * quantidade;
	}

}
