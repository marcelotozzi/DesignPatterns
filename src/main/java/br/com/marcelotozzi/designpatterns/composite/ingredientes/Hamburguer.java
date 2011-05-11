package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Hamburguer implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Hamburguer");
	}

	@Override
	public int retornaCalorias() {
		return 300;
	}
}