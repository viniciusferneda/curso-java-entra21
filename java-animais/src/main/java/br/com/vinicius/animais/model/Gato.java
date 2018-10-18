package br.com.vinicius.animais.model;

public class Gato extends Animal {

	public Gato(Integer codigo, String nome, String cor, Integer qtdPatas, String som) {
		super(codigo, nome, cor, qtdPatas, som);
	}
	
	public Gato(String nome, String cor, Integer qtdPatas) {
		super(nome, cor, qtdPatas, "Miau");
	}

}
