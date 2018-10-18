package interfaces.conta;

public abstract class Conta implements IConta {

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
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

}
