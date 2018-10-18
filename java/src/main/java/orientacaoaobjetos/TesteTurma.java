package orientacaoaobjetos;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma();
		turma.periodo = "Matutino";
		turma.serie = 1;
		turma.sigla = "JAV";
		turma.tipoEnsino = "Presencial";
		
		Turma turma2 = new Turma();
		turma2.periodo = "Noturno";
		turma2.serie = 3;
		turma2.sigla = "BD";
		turma2.tipoEnsino = "Semi-Presencial";
		
		System.out.println("Turma 1: "+turma.sigla+
				" da serie "+turma.serie + 
				" do perído "+turma.periodo + 
				" com o tipo de ensino " +turma.tipoEnsino);
		
		System.out.println("Turma 2: "+turma2.sigla+
				" da serie "+turma2.serie + 
				" do perído "+turma2.periodo + 
				" com o tipo de ensino " +turma2.tipoEnsino);
	}
}
