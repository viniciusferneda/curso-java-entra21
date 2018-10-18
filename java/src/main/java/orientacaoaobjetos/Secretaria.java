package orientacaoaobjetos;

public class Secretaria extends Funcionario {

	private int numeroRamal;

	public int getNumeroRamal() {
		return numeroRamal;
	}

	public void setNumeroRamal(int numeroRamal) {
		this.numeroRamal = numeroRamal;
	}

	@Override
	public String consultarDados() {
		return super.consultarDados() + "\nNúmero do Ramal: " + this.numeroRamal;
	}

}
