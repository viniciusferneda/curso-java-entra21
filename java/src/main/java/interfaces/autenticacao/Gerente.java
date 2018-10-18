package interfaces.autenticacao;

public class Gerente extends Funcionario {

	public Gerente() {
	}
	
	public Gerente(String nome, double salario, String usuario, String senha) {
		super(nome, salario);
		setUsuario(usuario);
		setSenha(senha);
	}

	@Override
	public void bonificacao() {
		setBonificacao(getSalario() * (15d / 100));
		setSalario(getSalario() * ((15d / 100) + 1));
	}
	
	@Override
	public String consultarDados() {
		return super.consultarDados() + 
				"\n Usário: "+getUsuario()+
				"\n Senha: "+getSenha();
	}

}
