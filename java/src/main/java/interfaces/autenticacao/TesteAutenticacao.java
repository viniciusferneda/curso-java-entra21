package interfaces.autenticacao;

public class TesteAutenticacao {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("José da Silva");
		gerente.setSalario(1500d);
		gerente.setUsuario("jose");
		gerente.setSenha("123456");
		
		Seguranca seguranca = new Seguranca();
		seguranca.setNome("João Dos Santos");
		seguranca.setSalario(500d);
		seguranca.setTurno("Noturno");
		seguranca.setUsuario("joao");
		seguranca.setSenha("123456");
		
		AutenticadorDeUsuario.autentica(gerente);
		AutenticadorDeUsuario.autentica(seguranca);
		
		Empresa empresa = new Empresa();
		empresa.setCodigo(1);
		empresa.setNome("Blusoft");
		empresa.setCnpj("123456789");
		empresa.setUsuario("blusoft");
		empresa.setSenha("123456");
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCodigo(2);
		pessoaFisica.setNome("Maria das Flores");
		pessoaFisica.setCpf("123456789");
		pessoaFisica.setUsuario("maria");
		pessoaFisica.setSenha("123456");
		
		AutenticadorDeUsuario.autentica(empresa);
		AutenticadorDeUsuario.autentica(pessoaFisica);
	}
}
