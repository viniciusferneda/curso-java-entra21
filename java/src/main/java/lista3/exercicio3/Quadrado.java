package lista3.exercicio3;

public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
	}
	
	@Override
	public double calcularArea() {
		return getLado1()*getLado1();
	}

}
