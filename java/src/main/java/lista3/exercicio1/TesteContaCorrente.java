package lista3.exercicio1;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(500d);
		contaCorrente.depositar(100d);
		contaCorrente.sacar(100d);
		
		ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(500d);
		contaCorrenteEspecial.depositar(100d);
		contaCorrenteEspecial.sacar(100d);
		
		System.out.println("Conta Corrente "+contaCorrente.getSaldo());
		System.out.println("Conta Corrente Especial "+contaCorrenteEspecial.getSaldo());
	}
}
