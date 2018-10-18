package polimorfismo;

public class ContaCorrente extends Conta {

	private double limite = 100d;

	public ContaCorrente(Agencia agencia) {
		super(agencia);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
