package exercicio22;

public abstract class Automovel {

	private Cor cor;
	private Integer quantidadePassageiros;
	private Double valor;
	private TipoCombustivel tipoCombustivel;

	public Automovel(Cor cor, Integer quantidadePassageiros, Double valor, TipoCombustivel tipoCombustivel) {
		this.cor = cor;
		this.quantidadePassageiros = quantidadePassageiros;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Integer getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(Integer quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getInfo() {
		return "Valor: " + this.getValor() + "\nSou um " + this.getClass().getSimpleName();
	}

}
