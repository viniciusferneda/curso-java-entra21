package orientacaoaobjetos;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo(1);
		cliente1.setNome("José");
		
		Cliente cliente2 = new Cliente();
		System.out.println(cliente1.getNome() + cliente2.getNome());
	}
	
}
