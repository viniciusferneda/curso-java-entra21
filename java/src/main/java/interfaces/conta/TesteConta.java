package interfaces.conta;

public class TesteConta {

	public static void main(String[] args){
		Agencia agencia = new Agencia("12345");

		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Jos�");

		ContaCorrente c1 = new ContaCorrente(agencia);
		ContaPoupanca c2 = new ContaPoupanca(agencia);

		try {
			c1.deposita(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		c2.deposita(500);
		

		//c1.saca(100);
		//c2.saca(100);

		System.out.println("Conta Corrente");
		GeradorDeExtrato.geraExtrato(c1);

		System.out.println();

		System.out.println("Conta Poupan�a");
		GeradorDeExtrato.geraExtrato(c2);

	}

}
