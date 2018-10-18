package interfaces.conta;

public class GeradorDeExtrato {

	public static void geraExtrato(IConta c) {
		System.out.println(" EXTRATO ");
		System.out.println(" SALDO : " + c.getSaldo());
	}

}
