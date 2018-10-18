package exercicio22;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Bitrem bitrem = new Bitrem(Cor.AZUL, 1, 2500.00, TipoCombustivel.DIESEL, 5.0);
		Graneleiro graneleiro = new Graneleiro(Cor.VERMELHO, 10, 10000.00, TipoCombustivel.DIESEL, 10.0);
		Truck truck = new Truck(Cor.PRETO, 5, 5000.50, TipoCombustivel.DIESEL, 2.0);

		Carro carro = new Carro(Cor.AZUL, 4, 50000.00, TipoCombustivel.GASOLINA, 4);
		Caminhonete caminhonete = new Caminhonete(Cor.VERMELHO, 6, 100000.98, TipoCombustivel.DIESEL, 4);

		Motocicleta moto = new Motocicleta(Cor.VERMELHO, 2, 15000.00, TipoCombustivel.GASNATURAL);
		Quadriciculo quadriciculo = new Quadriciculo(Cor.PRETO, 2, 50000.00, TipoCombustivel.DIESEL);
		Triciclo triciclo = new Triciclo(Cor.PRETO, 2, 10000.00, TipoCombustivel.GASOLINA);

		ArrayList<Automovel> arrayAutomoveis = new ArrayList<Automovel>();
		arrayAutomoveis.add(bitrem);
		arrayAutomoveis.add(quadriciculo);
		arrayAutomoveis.add(graneleiro);
		arrayAutomoveis.add(truck);
		arrayAutomoveis.add(carro);
		arrayAutomoveis.add(caminhonete);
		arrayAutomoveis.add(moto);
		arrayAutomoveis.add(triciclo);

		Garagem garagem = new Garagem();
		garagem.setAutomoveis(arrayAutomoveis);

		System.out.println("Quantidade de automoveis:  " + garagem.getQuantidadeAutomoveis());
		System.out.println("Quantidade de automoveis com mais de dois passageiros: "
				+ garagem.getQuantidadeAutomoveisMaisDeDoisPassageiros());
		System.out.println("Quantidade de caminhoes na garagem: " + garagem.getQuantidadeCaminhoes());
		System.out.println(garagem.getCarros());
		
		System.out.println("Valor total da garagem " + FormadorValores.formatarReais(garagem.getValorTotal()));
	}

}
