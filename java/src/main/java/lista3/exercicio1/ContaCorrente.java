package lista3.exercicio1;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= (valor + (valor * 0.05d));
	}

	
}
