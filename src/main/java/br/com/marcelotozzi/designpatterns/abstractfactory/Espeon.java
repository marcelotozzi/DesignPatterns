package br.com.marcelotozzi.designpatterns.abstractfactory;

public class Espeon extends Pokemon {
	private String nome = "Espeon";

	@Override
	String getNome() {
		return this.nome;
	}
}