package lista3.exercicio3;

public class Circulo implements IForma {

	private double raio;

	public Circulo() {
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * Math.PI) * this.raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (this.raio * 2);
	}

}
