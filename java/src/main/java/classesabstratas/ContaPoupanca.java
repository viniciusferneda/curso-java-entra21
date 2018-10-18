package classesabstratas;

import java.text.DecimalFormat;

public class ContaPoupanca extends Conta {
	
	private static DecimalFormat df = new DecimalFormat("#0.00");

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

	@Override
	public String imprimirExtratoDetalhado() {
		String extrato = "";
		extrato += "Cliente: " + getCliente().getCodigo() + " - " + getCliente().getNome();
		extrato += "\nNúmero da Conta: " + getNumero();
		extrato += "\nSaldo da Conta: " + df.format(getSaldo());
		extrato += "\nNúmero da Agência: " + getAgencia().getNumero();
		extrato += "\nTaxa de Juros: "+ getTaxaJurosRendimento();
		return extrato;
	}

}
