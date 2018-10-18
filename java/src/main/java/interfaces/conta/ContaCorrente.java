package interfaces.conta;

public class ContaCorrente extends Conta{

	private double taxaPorOperacao = 0.45;
	
	public ContaCorrente(Agencia agencia) {
		super(agencia);
	}

	public void deposita(double valor) throws Exception {
		if(valor <= 0){
			throw new Exception("Valor de deposito deve ser maior que 0.");
		}
		setSaldo(getSaldo() + (valor - this.taxaPorOperacao));
	}

	public void saca(double valor) {
		setSaldo(getSaldo() - (valor - this.taxaPorOperacao));
	}

	public double getSaldo() {
		return super.getSaldo();
	}
	
}
