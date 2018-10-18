package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno = new Aluno();
		aluno.setNome("José");
		aluno.setRg("123456");
		aluno.setDtNascimento(sdf.parse("01/01/1995"));
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.setRg("654321");
		aluno2.setDtNascimento(sdf.parse("01/03/1995"));
		
		System.out.println("Aluno 1: "+aluno.getNome() + 
				" com RG "+aluno.getRg() + 
				" que nasceu no dia "+sdf.format(aluno.getDtNascimento()));
		System.out.println("Aluno 2: "+aluno2.getNome() + 
				" com RG "+aluno2.getRg() + 
				" que nasceu no dia "+sdf.format(aluno2.getDtNascimento()));
	}
}
