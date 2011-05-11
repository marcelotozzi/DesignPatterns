package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Pao implements Alimento {
	@Override
	public int retornaCalorias() {
		return 150;
	}

	@Override
	public void mostrar() {
		System.out.println("Pao");
	}
}