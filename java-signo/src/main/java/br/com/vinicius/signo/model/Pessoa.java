package br.com.vinicius.signo.model;

import java.util.Date;

public class Pessoa {

	private Integer codigo;
	private String nome;
	private Date dtNascimento;
	private Signo signo;

	public Pessoa() {
	}

	public Pessoa(String nome, Date dtNascimento, Signo signo) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.signo = signo;
	}

	public Pessoa(Integer codigo, String nome, Date dtNascimento, Signo signo) {
		this.codigo = codigo;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.signo = signo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}

}
