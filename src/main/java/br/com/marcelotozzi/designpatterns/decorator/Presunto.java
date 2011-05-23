package br.com.marcelotozzi.designpatterns.decorator;

public class Presunto extends IngredienteDecorator {

	@Override
	public double getCusto() {
		return 0.10;
	}

	@Override
	public String getDescricaoDoIngrediente() {
		return "Presunto";
	}
}