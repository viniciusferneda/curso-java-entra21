package orientacaoaobjetos;

import java.util.Date;

public class Aluno {

	private String nome;
	private String rg;
	private Date dtNascimento;
	private Turma turma;

	public Aluno() {
	}

	public Aluno(String nome, String rg, Date dtNascimento, Turma turma) {
		this.nome = nome;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
