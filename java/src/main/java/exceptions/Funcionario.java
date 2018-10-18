package exceptions;

import java.text.DecimalFormat;

public abstract class Funcionario {

	private DecimalFormat df = new DecimalFormat("#0.00");

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

	public abstract void calcularBonificacao();
	
	public String consultarDados() {
		return "Nome: " + this.nome + 
				"\nSalário: R$" + df.format(this.salario) + 
				"\nBonificação: R$"+df.format(this.bonificacao);
	}
	
	public void aumentarSalario(double taxa) {
		if(taxa <= 0){
			throw new IllegalArgumentException("O valor da taxa deve ser maior que zero");
		}
		this.salario = this.salario * ((taxa / 100) + 1);
	}

	public void aumentarSalario() {
		this.aumentarSalario(10);
	}
	
}
