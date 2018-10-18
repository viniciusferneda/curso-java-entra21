package exercicio21;

public class TrabalhadorHora extends Empregado {

	private double salarioHora;
	private double horas;
	
	public TrabalhadorHora(String primeiroNome, String ultimoNome, double salarioHora, double horas) {
		super(primeiroNome, ultimoNome);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}

	@Override
	public double calcularGanho() {
		return this.salarioHora * this.horas;
	}

}
