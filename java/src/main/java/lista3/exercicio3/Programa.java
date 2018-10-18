package lista3.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas formas voc� criar?");
		int qtdFormas = Integer.parseInt(scanner.nextLine());
		
		List<IForma> lFormas = new ArrayList<>();
		while(qtdFormas > 0){
			System.out.println("Qual a forma que voc� deseja criar? (1-Rentangulo, 2-Quadrado, 3-Circulo)");
			int tpForma = Integer.parseInt(scanner.nextLine());
			switch (tpForma) {
			case 1:
				System.out.println("Informe a base do retangulo");
				double base = Double.parseDouble(scanner.nextLine());
				
				System.out.println("Informe a altura do retangulo");
				double altura = Double.parseDouble(scanner.nextLine());
				
				Retangulo retangulo = new Retangulo(base, altura);
				
				lFormas.add(retangulo);
				
				qtdFormas--;
				
				break;
			case 2:
				System.out.println("Informe o tamanho do lado do quadrado");
				double lado = Double.parseDouble(scanner.nextLine());
				
				Quadrado quadrado = new Quadrado(lado);
				
				lFormas.add(quadrado);
				
				qtdFormas--;
				
				break;
			case 3:
				System.out.println("Informe o raio do circulo");
				double raio = Double.parseDouble(scanner.nextLine());
				
				Circulo circulo = new Circulo(raio);
				
				lFormas.add(circulo);
				
				qtdFormas--;
				
				break;
			default:
				System.out.println("Op��o Inv�lida. Digite uma op��o v�lida a seguir.");
				break;
			}
		}
		
		for (IForma forma : lFormas) {
			String formaStr = "";
			if(forma instanceof Retangulo){
				formaStr = "Ret�ngulo";
			}else if(forma instanceof Quadrado){
				formaStr = "Quadrado";
			}else if(forma instanceof Circulo){
				formaStr = "C�rculo";
			}else{
				System.out.println("Forma geom�trica inv�lida!");
				continue;
			}
			System.out.println("O per�metro do "+formaStr+" � de "+ forma.calcularPerimetro());
			System.out.println("A �rea do "+formaStr+" � de "+ forma.calcularArea());
		}
		
		scanner.close();
	}

}
