package orientacaoaobjetos;

public class TesteControleDePonto {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("José da Silva");
		gerente.setSalario(1500d);
		gerente.setUsuario("jose");
		gerente.setSenha("123456");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Maria das Flores");
		telefonista.setSalario(500d);
		telefonista.setCodigoEstacaoTrabalho(10);
		
		ControleDePonto controleDePonto = new ControleDePonto();
		controleDePonto.registraEntrada(gerente);
		controleDePonto.registraEntrada(telefonista);
		
	}
}
