package heranca;

import orientacaoaobjetos.Cliente;
import orientacaoaobjetos.Funcionario;

public class Emprestimo extends Servico{

	private double valor;
	private double taxa;
	
	public Emprestimo() {
	}
	
	public Emprestimo(double valor, Cliente cliente, Funcionario funcionario){
		super(cliente, funcionario);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public double calculaTaxa() {
		return super.calculaTaxa() + this.valor * 0.1;
	}

}
