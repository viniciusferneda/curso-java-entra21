package br.com.vinicius.animais.model;

public class Cachorro extends Animal {

	public Cachorro(Integer codigo, String nome, String cor, Integer qtdPatas, String som) {
		super(codigo, nome, cor, qtdPatas, som);
	}
	
	public Cachorro(String nome, String cor, Integer qtdPatas) {
		super(nome, cor, qtdPatas, "AuAu");
	}

}
