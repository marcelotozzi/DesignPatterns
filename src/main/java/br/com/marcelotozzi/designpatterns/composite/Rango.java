package br.com.marcelotozzi.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.marcelotozzi.designpatterns.composite.ingredientes.Alimento;

public class Rango implements Alimento {

	private List<Alimento> ingredientes = new ArrayList<Alimento>();

	@Override
	public void mostrar() {
		for (Alimento alimento : this.ingredientes) {
			alimento.mostrar();
		}
	}

	public void adiciona(Alimento alimento) {
		this.ingredientes.add(alimento);
	}

	@Override
	public int retornaCalorias() {
		int calorias = 0;
		for (Alimento alimento : this.ingredientes) {
			calorias += alimento.retornaCalorias();
		}
		return calorias;
	}
}