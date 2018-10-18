package polimorfismo;

import java.text.DecimalFormat;

public class GeradorExtrato {

	private static DecimalFormat df = new DecimalFormat("#0.00");

	public static String gerarExtrato(Conta conta) {
		String extrato = "";
		extrato += "Cliente: " + conta.getCliente().getCodigo() + " - " + conta.getCliente().getNome();
		extrato += "\nNúmero da Conta: " + conta.getNumero();
		extrato += "\nSaldo da Conta: " + df.format(conta.getSaldo());
		extrato += "\nNúmero da Agência: " + conta.getAgencia().getNumero();
		return extrato;
	}
}
