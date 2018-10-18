package interfaces.autenticacao;

public class Seguranca extends Funcionario {

	private String turno;
	
	public Seguranca() {
	}
	
	public Seguranca(String nome, double salario, String usuario, String senha) {
		super(nome, salario);
		setUsuario(usuario);
		setSenha(senha);
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String consultarDados() {
		return super.consultarDados() + "\nTurno: " + this.turno;
	}

}
