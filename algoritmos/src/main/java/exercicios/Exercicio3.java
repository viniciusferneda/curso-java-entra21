package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		String[] cardapio = new String[15];
		cardapio[0] = "1 - Calabresa";
		cardapio[1] = "2 - 4 Queijos";
		cardapio[2] = "3 - Frango";
		cardapio[3] = "4 - Lombinho";
		cardapio[4] = "5 - Coração";
		cardapio[5] = "6 - Carne";
		cardapio[6] = "7 - Strogonoff de Frango";
		cardapio[7] = "8 - Strogonoff de Carne";
		cardapio[8] = "9 - 5 Queijos";
		cardapio[9] = "10 - Banana Split";
		cardapio[10] = "11 - Sonho de Valsa";
		cardapio[11] = "12 - Prestígio";
		cardapio[12] = "13 - Chocolate Preto";
		cardapio[13] = "14 - Chocolate Branco";
		cardapio[14] = "15 - Coco";

		double[] valores = new double[15];
		for (int i = 0; i < cardapio.length; i++) {
			String pizza = cardapio[i].substring(cardapio[i].lastIndexOf("-") + 2);
			System.out.println("Informe o valor da pizza de " + pizza + ":");
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		System.out.println("----------------------------------------");

		System.out.println("O cardápio da pizzaria é:");
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i] + " - R$" + df.format(valores[i]));
		}

		System.out.println("----------------------------------------");

		System.out.println("Qual a pizza o senhor deseja?");
		int pedido = Integer.parseInt(scanner.nextLine()) - 1;
		int[] pedidos = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		pedidos[0] = pedido;
		int aux = 1;
		while (pedido > 0) {
			System.out.println("Deseja mais alguma pizza (digite 0 para sair)?");
			pedido = Integer.parseInt(scanner.nextLine()) - 1;
			if (pedido > 0) {
				pedidos[aux] = pedido;
				aux++;
			}
		}

		double valorTotalPedido = 0d;
		System.out.println("Foram pedidas as seguintes pizzas: ");
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] >= 0) {
				valorTotalPedido += valores[pedidos[i]];
				String pizza = cardapio[pedidos[i]].substring(cardapio[pedidos[i]].lastIndexOf("-") + 2);
				System.out.println(pizza + " (R$" + df.format(valores[pedidos[i]])+")");
			}
		}
		System.out.println("O valor total do pedido é R$" + df.format(valorTotalPedido));

		scanner.close();

	}
}
