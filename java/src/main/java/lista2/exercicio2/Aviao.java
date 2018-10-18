package lista2.exercicio2;

public abstract class Aviao {

	private final int lugares;
	private final double valorPassagem;

	public Aviao(int lugares, double valorPassagem) {
		if(lugares <= 0){
			throw new IllegalArgumentException("Quantidade de lugares deve ser maior que zero.");
		}
		this.lugares = lugares;
		this.valorPassagem = valorPassagem;
	}

	public int getLugares() {
		return lugares;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

}
