package br.com.vinicius.animais.model;

public class PorquinhoDaIndia extends Animal {

	public PorquinhoDaIndia(String nome, String cor, Integer qtdPatas) {
		super(nome, cor, qtdPatas, "Nh�i");
	}
	
	public PorquinhoDaIndia(Integer codigo, String nome, String cor, Integer qtdPatas, String som) {
		super(codigo, nome, cor, qtdPatas, som);
	}

}
