package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class TestaConta {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("12345");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("José");
		
		ContaCorrente contaCorrente1 = new ContaCorrente(agencia);
		contaCorrente1.setCliente(cliente);
		contaCorrente1.setNumero("123456");
		contaCorrente1.setSaldo(500d);
		contaCorrente1.setLimite(1000d);
		
		ContaCorrente contaCorrente2 = new ContaCorrente(agencia);
		contaCorrente2.setCliente(cliente);
		contaCorrente2.setNumero("654321");
		contaCorrente2.setSaldo(1000d);
		contaCorrente2.setLimite(500d);
		
		//Aqui foram adicionadas as contas na lista.
		List<ContaCorrente> lContasCorrente = new ArrayList<>();
		lContasCorrente.add(contaCorrente1);
		lContasCorrente.add(contaCorrente2);
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(agencia);
		contaPoupanca1.setCliente(cliente);
		contaPoupanca1.setNumero("123456");
		contaPoupanca1.setSaldo(500d);
		contaPoupanca1.setTaxaJurosRendimento(8d);
		
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(agencia);
		contaPoupanca2.setCliente(cliente);
		contaPoupanca2.setNumero("654321");
		contaPoupanca2.setSaldo(1500d);
		contaPoupanca2.setTaxaJurosRendimento(5d);
		
		//Aqui foram adicionadas as contas na lista.
		List<ContaPoupanca> lContasPoupanca = new ArrayList<>();
		lContasPoupanca.add(contaPoupanca1);
		lContasPoupanca.add(contaPoupanca2);
		
		//Imprimir os valores
		System.out.println("Tamanho da lista da Conta Corrente: "+lContasCorrente.size());
		System.out.println("Tamanho da lista da Conta Poupança: "+lContasPoupanca.size());
		
		lContasCorrente.remove(contaCorrente1);
		lContasCorrente.remove(0);
		
		lContasPoupanca.remove(contaPoupanca1);
		lContasPoupanca.remove(0);
		
		for (ContaCorrente contaCorrente : lContasCorrente) {
			System.out.println(contaCorrente.imprimirExtratoDetalhado());
		}
		
		for (ContaPoupanca contaPoupanca : lContasPoupanca) {
			System.out.println(contaPoupanca.imprimirExtratoDetalhado());
		}
		
		lContasCorrente.clear();
		lContasPoupanca.clear();
		
		System.out.println("Tamanho da lista da Conta Corrente: "+lContasCorrente.size());
		System.out.println("Tamanho da lista da Conta Poupança: "+lContasPoupanca.size());
		
	}

}
