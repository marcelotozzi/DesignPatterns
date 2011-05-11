package br.com.marcelotozzi.designpatterns.abstractfactory;

public class Umbreon extends Pokemon {
	private String nome = "Umbreon";

	@Override
	String getNome() {
		return this.nome;
	}
}