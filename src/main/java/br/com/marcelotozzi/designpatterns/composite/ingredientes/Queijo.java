package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Queijo implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Queijo");
	}

	@Override
	public int retornaCalorias() {
		return 125;
	}
}