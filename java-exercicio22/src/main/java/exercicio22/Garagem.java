package exercicio22;

import java.util.ArrayList;

public class Garagem {

	private ArrayList<Automovel> automoveis;

	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(ArrayList<Automovel> arrayAutomovel) {
		this.automoveis = arrayAutomovel;
	}

	protected int getQuantidadeAutomoveis() {
		return automoveis.size();
	}

	protected int getQuantidadeAutomoveisMaisDeDoisPassageiros() {
		int contador = 0;
		
		for (Automovel automovel : automoveis) {
			if (automovel != null) {
				if (automovel.getQuantidadePassageiros() > 2) {
					contador++;
				}
			}
		}
		return contador;
	}

	protected int getQuantidadeCaminhoes() {
		int contador = 0;
		for (Automovel automovel : automoveis) {
			if (automovel != null && automovel instanceof Caminhao) {
				contador++;
			}
		}
		return contador;
	}

	protected String getCarros() {
		String aux = "Lista com todos os carros";

		for (Automovel automovel : automoveis) {
			if (automovel != null) {
				aux += "\n" + automovel.getInfo() + "\n";
			}
		}
		return aux;
	}

	protected Double getValorTotal() {
		Double valor = 0.0;
		for (Automovel automovel : automoveis) {
			if (automovel != null) {
				valor += automovel.getValor();
			}
		}
		return valor;
	}
	
	@Override
	public String toString() {
		return "lálá";
	}
}
