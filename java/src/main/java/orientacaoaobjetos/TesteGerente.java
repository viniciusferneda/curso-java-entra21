package orientacaoaobjetos;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Joaquim");
		gerente.setSalario(1500d);
		
		Gerente gerente2 = new Gerente();
		gerente2.setNome("Maria");
		gerente2.setSalario(1500d);
		
		gerente.aumentarSalario(15);
		gerente2.aumentarSalario();
		
		System.out.println(gerente.getSalario());
		System.out.println(gerente2.getSalario());
	}
}
