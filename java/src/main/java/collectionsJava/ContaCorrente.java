package collectionsJava;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta {

	private static DecimalFormat df = new DecimalFormat("#0.00");
	
	private double limite = 100d;

	public ContaCorrente(Agencia agencia) {
		super(agencia);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String imprimirExtratoDetalhado() {
		String extrato = "";
		extrato += "Cliente: " + getCliente().getCodigo() + " - " + getCliente().getNome();
		extrato += "\nNúmero da Conta: " + getNumero();
		extrato += "\nSaldo da Conta: " + df.format(getSaldo());
		extrato += "\nNúmero da Agência: " + getAgencia().getNumero();
		extrato += "\nLimite: "+ getLimite();
		return extrato;
	}

}
