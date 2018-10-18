package lista2.exercicio2;

import java.util.List;

public class CompanhiaArea {

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;

	public List<Boing> getBoings() {
		return boings;
	}

	public void setBoings(List<Boing> boings) {
		this.boings = boings;
	}

	public List<Monomotor> getMonomotores() {
		return monomotores;
	}

	public void setMonomotores(List<Monomotor> monomotores) {
		this.monomotores = monomotores;
	}

	public List<Bimotor> getBimotores() {
		return bimotores;
	}

	public void setBimotores(List<Bimotor> bimotores) {
		this.bimotores = bimotores;
	}

	public double retornaFaturamentoPassagens(){
		double faturamento = 0d;
		for (Boing boing : getBoings()) {
			faturamento += boing.getValorPassagem() * boing.getLugares();
		}
		for (Monomotor monomotor : getMonomotores()) {
			faturamento += monomotor.getValorPassagem() * monomotor.getLugares();
		}
		for (Bimotor bimotor : getBimotores()) {
			faturamento += bimotor.getValorPassagem() * bimotor.getLugares();
		}
		return faturamento;
	}
}
