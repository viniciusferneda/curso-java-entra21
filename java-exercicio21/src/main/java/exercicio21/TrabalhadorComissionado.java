package exercicio21;

public class TrabalhadorComissionado extends Empregado {

	private double salarioMensal;
	private double comissao;
	private double quantidade;
	
	public TrabalhadorComissionado(String primeiroNome, String ultimoNome, double salarioMensal, double comissao, double quantidade) {
		super(primeiroNome, ultimoNome);
		this.salarioMensal = salarioMensal;
		this.comissao = comissao;
		this.quantidade = quantidade;
	}

	@Override
	public double calcularGanho() {
		return this.salarioMensal + (comissao * quantidade);
	}

}
