package java_static;

public class TesteFuncionario {

	public static void main(String[] args) {
		System.out.println("Valor do Vale Refeição = "+Funcionario.valeRefeicaoDiario);
		Funcionario.ajustarValorValeRefeicao(10);
		System.out.println("Valor do Vale Refeição = "+Funcionario.valeRefeicaoDiario);
	}
}
