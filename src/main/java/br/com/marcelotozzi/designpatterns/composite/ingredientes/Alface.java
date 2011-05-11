package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Alface implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Alface");
	}

	@Override
	public int retornaCalorias() {
		return 25;
	}
}