package classesabstratas;

public abstract class Conta {

	private Cliente cliente;
	private Agencia agencia;
	private String numero;
	private double saldo;

	// Construtor
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	// Construtor
	public Conta(Agencia agencia, String numero) {
		this(agencia);
		this.numero = numero;
	}
	
	public abstract String imprimirExtratoDetalhado();

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public double consultarSaldoDisponivel() {
		return this.saldo;
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

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
