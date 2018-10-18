package orientacaoaobjetos;

public class Gerente extends Funcionario {

	private String usuario;
	private String senha;

	public Gerente() {
	}
	
	public Gerente(String nome, double salario, String usuario, String senha) {
		super(nome, salario);
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public void bonificacao() {
		setBonificacao(getSalario() * (15d / 100));
		setSalario(getSalario() * ((15d / 100) + 1));
	}
	
	@Override
	public String consultarDados() {
		return super.consultarDados() + 
				"\n Usário: "+this.usuario+
				"\n Senha: "+this.senha;
	}

}
