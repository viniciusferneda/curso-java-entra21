package exceptions;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("José da Silva");
		gerente.setSalario(1500d);
		gerente.setUsuario("jose");
		gerente.setSenha("123456");
		
		try {
			gerente.aumentarSalario(-1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bonificação: "+gerente.consultarDados());
	}
	
}
