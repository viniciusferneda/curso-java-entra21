package orientacaoaobjetos;

public class TesteTiposFuncionarios {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("José da Silva");
		gerente.setSalario(1500d);
		gerente.setUsuario("jose");
		gerente.setSenha("123456");
		
		Gerente gerente2 = new Gerente("Mario da Silva", 1500d, "mario", "123456");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Maria das Flores");
		telefonista.setSalario(500d);
		telefonista.setCodigoEstacaoTrabalho(10);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Joaquina dos Santos");
		secretaria.setSalario(800d);
		secretaria.setNumeroRamal(25);
		
		gerente.bonificacao();
		telefonista.bonificacao();
		
		System.out.println(gerente.consultarDados());
		System.out.println(gerente2.consultarDados());
		System.out.println(telefonista.consultarDados());
		System.out.println(secretaria.consultarDados());
	}
}
