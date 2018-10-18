package lista3.exercicio2;

public abstract class Produto implements Comparable<Produto> {

	private String nome;
	private double preco;
	private String codigoBarras;

	public Produto(String nome, double preco, String codigoBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Preço: " + this.preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produto produto = (Produto) obj;
		return this.codigoBarras.equals(produto.getCodigoBarras());
	}

	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getNome());
	}

}
