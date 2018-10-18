package orientacaoaobjetos;

import java.text.DecimalFormat;

public class Conta {

	private DecimalFormat df = new DecimalFormat("#0.00");

	private String numero;
	private double saldo;
	private double limite = 100d;
	private Agencia agencia;

	// Construtor
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	// Construtor
	public Conta(Agencia agencia, String numero, double limite) {
		this(agencia);
		this.numero = numero;
		this.limite = limite;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public String imprimirExtrato() {
		String extrato = "";
		extrato += "Número da Conta: " + this.numero;
		extrato += "\nSaldo da Conta: " + df.format(this.saldo);
		extrato += "\nLimite da Conta: " + df.format(this.limite);
		extrato += "\nNúmero da Agência: " + this.agencia.getNumero();
		return extrato;
	}

	public double consultarSaldoDisponivel() {
		return this.saldo + this.limite;
	}

	public void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
