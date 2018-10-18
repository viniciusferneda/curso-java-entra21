package lista3.exercicio2;

public class DVD extends Produto {

	private long duracao;

	public DVD(String nome, double preco, long duracao, String codigoBarras) {
		super(nome, preco, codigoBarras);
		this.duracao = duracao;
	}

	public long getDuracao() {
		return duracao;
	}

	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Duração: "+this.duracao;
	}

}
