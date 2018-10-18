package br.ufes.inf.prog3.lista2.exercicio04.enums;

public enum TipoContatoEnum {

	TELEFONE_CELULAR("Telefone Celular"), //
	TELEFONE_COMERCIAL("Telefone Comercial"), //
	TELEFONE_RESIDENCIAL("Telefone Residencial"), //
	EMAIL("Email"), //
	ENDERECO("Endereco");

	private String descricao;

	private TipoContatoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
