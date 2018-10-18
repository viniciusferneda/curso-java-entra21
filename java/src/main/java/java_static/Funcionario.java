package java_static;

import java.text.DecimalFormat;

public class Funcionario {

	private DecimalFormat df = new DecimalFormat("#0.00");

	private String nome;
	private double salario;

	public static double valeRefeicaoDiario = 15;

	public Funcionario() {
		this.salario = 1000d;
	}

	public void aumentarSalario(double valor) {
		this.salario += valor;
	}

	public String consultarDados() {
		return "Nome: " + this.nome + "\nSalário: R$" + df.format(this.salario);
	}

	public static void ajustarValorValeRefeicao(double taxa) {
		Funcionario.valeRefeicaoDiario = Funcionario.valeRefeicaoDiario * ((taxa / 100) + 1);
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

}
