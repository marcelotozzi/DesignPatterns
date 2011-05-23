package br.com.marcelotozzi.designpatterns.decorator;

public class QueijoPrato extends IngredienteDecorator {

	@Override
	public double getCusto() {
		return 0.40;
	}

	@Override
	public String getDescricaoDoIngrediente() {
		return "Queijo Prato";
	}


}
