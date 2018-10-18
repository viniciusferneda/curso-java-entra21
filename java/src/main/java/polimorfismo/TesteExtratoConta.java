package polimorfismo;

public class TesteExtratoConta {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("12345");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("José");
		
		ContaCorrente contaCorrente = new ContaCorrente(agencia);
		contaCorrente.setCliente(cliente);
		contaCorrente.setNumero("123456");
		contaCorrente.setSaldo(500d);
		contaCorrente.setLimite(1000d);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(agencia);
		contaPoupanca.setCliente(cliente);
		contaPoupanca.setNumero("123456");
		contaPoupanca.setSaldo(500d);
		contaPoupanca.setTaxaJurosRendimento(8d);
		
		System.out.println("Conta Corrente");
		System.out.println(GeradorExtrato.gerarExtrato(contaCorrente));
		
		System.out.println();
		
		System.out.println("Conta Poupança");
		System.out.println(GeradorExtrato.gerarExtrato(contaPoupanca));
	}
}
