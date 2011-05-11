package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Cebola implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Cebola");
	}

	@Override
	public int retornaCalorias() {
		return 50;
	}
}