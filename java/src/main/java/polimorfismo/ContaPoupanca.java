package polimorfismo;

public class ContaPoupanca extends Conta {

	private double taxaJurosRendimento;

	public ContaPoupanca(Agencia agencia) {
		super(agencia);
	}

	public double getTaxaJurosRendimento() {
		return taxaJurosRendimento;
	}

	public void setTaxaJurosRendimento(double taxaJurosRendimento) {
		this.taxaJurosRendimento = taxaJurosRendimento;
	}

}
