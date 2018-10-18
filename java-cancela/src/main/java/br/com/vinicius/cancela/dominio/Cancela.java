package br.com.vinicius.cancela.dominio;

public class Cancela {

	private Integer codigo;
	private Boolean posicao;

	public Cancela() {
	}
	
	public Cancela(Integer codigo, Boolean posicao) {
		this.codigo = codigo;
		this.posicao = posicao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Boolean getPosicao() {
		return posicao;
	}

	public void setPosicao(Boolean posicao) {
		this.posicao = posicao;
	}

}
