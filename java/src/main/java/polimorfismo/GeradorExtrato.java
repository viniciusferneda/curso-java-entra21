package polimorfismo;

import java.text.DecimalFormat;

public class GeradorExtrato {

	private static DecimalFormat df = new DecimalFormat("#0.00");

	public static String gerarExtrato(Conta conta) {
		String extrato = "";
		extrato += "Cliente: " + conta.getCliente().getCodigo() + " - " + conta.getCliente().getNome();
		extrato += "\nN�mero da Conta: " + conta.getNumero();
		extrato += "\nSaldo da Conta: " + df.format(conta.getSaldo());
		extrato += "\nN�mero da Ag�ncia: " + conta.getAgencia().getNumero();
		return extrato;
	}
}
