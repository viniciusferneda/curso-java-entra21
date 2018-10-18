package exercicio21;

public class Chefe extends Empregado {
	
	private double salarioMensal;

	public Chefe(String primeiroNome, String ultimoNome, double salarioMensal) {
		super(primeiroNome, ultimoNome);
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularGanho() {
		return this.salarioMensal;
	}

}
