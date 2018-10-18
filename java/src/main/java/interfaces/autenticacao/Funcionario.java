package interfaces.autenticacao;

import java.text.DecimalFormat;

public abstract class Funcionario implements Usuario {

	private DecimalFormat df = new DecimalFormat("#0.00");

	private String usuario;
	private String senha;

	private String nome;
	private double salario;
	private double bonificacao;

	public static double valeRefeicaoDiario = 30;

	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String consultarDados() {
		return "Nome: " + this.nome + "\nSalário: R$" + df.format(this.salario) + "\nBonificação: R$"
				+ df.format(this.bonificacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void aumentarSalario(double taxa) {
		this.salario = this.salario * ((taxa / 100) + 1);
	}

	public void aumentarSalario() {
		this.aumentarSalario(10);
	}

	public void bonificacao() {
		this.bonificacao = this.salario * (10d / 100);
		this.salario = this.salario * ((10d / 100) + 1);
	}

	@Override
	public String getUsuario() {
		return usuario;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
