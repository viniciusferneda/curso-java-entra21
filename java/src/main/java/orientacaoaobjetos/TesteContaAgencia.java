package orientacaoaobjetos;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("1234");
		
		Conta conta = new Conta(agencia);
		conta.setNumero("123456");
		conta.setSaldo(1500d);
		
		Conta conta2 = new Conta(agencia, "123456", 500d);
		conta2.setSaldo(1500d);
		
		/*conta.depositar(150);
		conta.sacar(50);
		System.out.println(conta.consultarSaldoDisponivel());
		System.out.println(conta.imprimirExtrato());*/
		
		System.out.println("Conta 1 = " +conta.getSaldo());
		System.out.println("Conta 2 = " +conta2.getSaldo());
		
		conta.transfere(conta2, 100d);
		
		System.out.println("Conta 1 = " +conta.getSaldo());
		System.out.println("Conta 2 = " +conta2.getSaldo());
	}
	
}
