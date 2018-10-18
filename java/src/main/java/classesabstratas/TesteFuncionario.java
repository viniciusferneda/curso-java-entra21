package classesabstratas;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("José da Silva");
		gerente.setSalario(1500d);
		gerente.setUsuario("jose");
		gerente.setSenha("123456");
		
		gerente.calcularBonificacao();
		
		System.out.println("Bonificação: "+gerente.getBonificacao());
	}
	
}
