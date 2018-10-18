package lista3.exercicio3;

public abstract class Quadrilatero implements IForma {

	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;

	public Quadrilatero() {
	}

	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	@Override
	public double calcularPerimetro() {
		return this.lado1 + this.lado2 + this.lado3 + this.lado4;
	}
}
