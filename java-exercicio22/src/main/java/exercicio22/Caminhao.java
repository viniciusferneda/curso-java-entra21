package exercicio22;

public abstract class Caminhao extends Automovel {

	private Double toneladas;

	public Caminhao(Cor cor, Integer quantidadePassageiros, Double valor, TipoCombustivel tipoCombustivel,
			Double toneladas) {
		super(cor, quantidadePassageiros, valor, tipoCombustivel);
		this.toneladas = toneladas;
	}

	public Double getToneladas() {
		return toneladas;
	}

	public void setToneladas(Double toneladas) {
		this.toneladas = toneladas;
	}
}
