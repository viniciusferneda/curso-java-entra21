package orientacaoaobjetos;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("12345");
		Agencia agencia2 = new Agencia("54321");
		
		System.out.println("Ag�ncia 1: "+agencia.getNumero());
		System.out.println("Ag�ncia 2: "+agencia2.getNumero());
	}
}
