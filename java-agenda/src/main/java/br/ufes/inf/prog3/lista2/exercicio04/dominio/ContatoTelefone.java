package br.ufes.inf.prog3.lista2.exercicio04.dominio;

import br.ufes.inf.prog3.lista2.exercicio04.enums.TipoContatoEnum;

public abstract class ContatoTelefone implements IContato {

	private String nome;
	private String contato;
	private TipoContatoEnum tipo;

	public ContatoTelefone(TipoContatoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return contato;
	}

	@Override
	public TipoContatoEnum getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setTipo(TipoContatoEnum tipo) {
		this.tipo = tipo;
	}

}
