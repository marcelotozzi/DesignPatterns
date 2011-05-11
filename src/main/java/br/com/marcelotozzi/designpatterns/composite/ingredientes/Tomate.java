package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Tomate implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Tomate");
	}

	@Override
	public int retornaCalorias() {
		return 100;
	}
}