package java_static;

import orientacaoaobjetos.Agencia;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("1234");

		System.out.println("Qtd de Contas = " + Conta.contador);

		Conta conta = new Conta(agencia);
		conta.setNumero("123456");
		conta.setSaldo(1500d);
		System.out.println("Qtd de Contas = " + Conta.contador);
		System.out.println("Id da conta 1 " + conta.getIdConta());

		Conta conta2 = new Conta(agencia, "123456", 500d);
		conta2.setSaldo(1500d);
		System.out.println("Qtd de Contas = " + Conta.contador);
		System.out.println("Id da conta 2 " + conta2.getIdConta());

		Conta.zerarContador();

		System.out.println(Conta.contador);

	}

}
