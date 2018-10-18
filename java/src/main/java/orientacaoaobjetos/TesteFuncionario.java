package orientacaoaobjetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joaquim");
		//funcionario.salario = 1500d;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Maria");
		//funcionario2.salario = 1800d;
		
		funcionario.aumentarSalario(100d);
		
		System.out.println(funcionario.consultarDados());
		System.out.println(funcionario2.consultarDados());
	}
}
