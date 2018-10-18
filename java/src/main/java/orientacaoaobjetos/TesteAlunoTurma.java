package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAlunoTurma {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		//Criação do objeto Turma com suas informações
		Turma turma = new Turma();
		turma.periodo = "Matutino";
		turma.serie = 1;
		turma.sigla = "JAV";
		turma.tipoEnsino = "Presencial";
		
		//Criação do objeto Aluno com suas informações
		Aluno aluno = new Aluno();
		aluno.setNome("José");
		aluno.setRg("123456");
		aluno.setDtNascimento(sdf.parse("01/01/1995"));
		
		//Criação do vínculo entre turma e aluno
		aluno.setTurma(turma);
		
		System.out.println("O aluno "+aluno.getNome()+
				" com RG "+aluno.getRg()+
				" que nasceu no dia "+sdf.format(aluno.getDtNascimento())+
				" pertence a turma "+aluno.getTurma().sigla+
				" do período "+ aluno.getTurma().periodo+
				" da serie "+ aluno.getTurma().serie+
				" do tipo de ensino "+aluno.getTurma().tipoEnsino);
	}
}
