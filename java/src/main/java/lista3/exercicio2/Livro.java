package lista3.exercicio2;

public class Livro extends Produto {

	private String autor;

	public Livro(String nome, double preco, String autor, String codigoBarras) {
		super(nome, preco, codigoBarras);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Autor: "+this.autor;
	}

}
