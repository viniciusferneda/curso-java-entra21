package lista3.classesinterna;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o tipo de lampada que deseja cria? (1-Incandescente, 2-Fluorescente)");
		int tpLampada = Integer.valueOf(scanner.nextLine());
		
		FabricaLampada lampada = new FabricaLampada();
		lampada.construir(tpLampada);
		lampada.ligar();
		lampada.desligar();
		
		scanner.close();
	}

}
