package classesabstratas;

public class TestaConta {

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
		
		System.out.println(contaPoupanca.imprimirExtratoDetalhado());
		System.out.println();
		System.out.println(contaCorrente.imprimirExtratoDetalhado());
		
	}

}
