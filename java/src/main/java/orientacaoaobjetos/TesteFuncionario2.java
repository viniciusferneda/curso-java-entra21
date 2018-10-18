package orientacaoaobjetos;

import java.util.Scanner;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Informe o nome do funcionário:");
		funcionario.setNome(scanner.nextLine());
		
		int funcao = 1;
		while(funcao != 0){
			System.out.println("Qual a operação deseja realizar (1-Alterar nome, 2-Alterar salário, 3-Visualizar os dados, 0-Encerrar");
			funcao = Integer.parseInt(scanner.nextLine());
			switch (funcao) {
			case 0:
				break;
			case 1:
				System.out.println("Qual o nome?");
				funcionario.setNome(scanner.nextLine());
				break;
			case 2:
				System.out.println("Qual o sálario?");
				funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
				break;
			case 3:
				System.out.println(funcionario.consultarDados());
				break;
			default:
				System.out.println("Operação inválida!");
				break;
			}
		}
		
		scanner.close();
	}
}
