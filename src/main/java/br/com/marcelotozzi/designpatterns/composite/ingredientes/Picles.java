package br.com.marcelotozzi.designpatterns.composite.ingredientes;

public class Picles implements Alimento {
	@Override
	public void mostrar() {
		System.out.println("Picles");
	}

	@Override
	public int retornaCalorias() {
		return 50;
	}
}