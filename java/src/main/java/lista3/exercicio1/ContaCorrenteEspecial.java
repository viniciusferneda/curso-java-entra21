package lista3.exercicio1;

public class ContaCorrenteEspecial extends ContaCorrente{

	public ContaCorrenteEspecial(double saldo) {
		super(saldo);
	}

	public void sacar(double valor){
		setSaldo(getSaldo()-(valor + (valor * 0.01d))); 
	}
	
}
