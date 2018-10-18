package exercicio22;

public class Carro extends Automovel {
	
	private Integer quantidadePortas;

	public Carro(Cor cor, Integer quantidadePassageiros, Double valor, 
			TipoCombustivel tipoCombustivel,
			Integer portas) {
		super(cor, quantidadePassageiros, valor, tipoCombustivel);
		this.quantidadePortas = portas;
	}

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

}
