package lista3.exercicio3;

public class Retangulo extends Quadrilatero {

	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
	}
	
	@Override
	public double calcularArea() {
		return getLado1() * getLado2();
	}

}
