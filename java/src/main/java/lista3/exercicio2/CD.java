package lista3.exercicio2;

public class CD extends Produto {

	private int numeroFaixas;

	public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
		super(nome, preco, codigoBarras);
		this.numeroFaixas = numeroFaixas;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Número de faixas: "+this.numeroFaixas;
	}

}
