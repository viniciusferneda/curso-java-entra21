package interfaces.conta;

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

	public void deposita(double valor) {
		setSaldo(getSaldo()+valor);
	}

	public void saca(double valor) {
		setSaldo(getSaldo()-valor);
	}

	public double getSaldo() {
		return super.getSaldo();
	}

}
