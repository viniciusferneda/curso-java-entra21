package orientacaoaobjetos;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Agencia agencia = new Agencia("12345");
		
		Conta conta = new Conta(agencia);
		conta.setNumero("123456");
		//conta.limite = 500d;
		conta.setSaldo(1000d);
		
		Conta conta2 = new Conta(agencia);
		conta.setNumero("654321");
		conta2.setLimite(400d);
		conta2.setSaldo(1200d);
		
		System.out.println("Conta 1: "+conta.getNumero() + 
				" com limite de "+df.format(conta.getLimite()) + 
				" com saldo de "+df.format(conta.getSaldo()));
		
		System.out.println("Conta 2: "+conta2.getNumero() + 
				" com limite de "+df.format(conta2.getLimite()) + 
				" com saldo de "+df.format(conta2.getSaldo()));
		
	}
}
