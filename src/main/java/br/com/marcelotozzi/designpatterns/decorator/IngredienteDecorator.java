package br.com.marcelotozzi.designpatterns.decorator;

public abstract class IngredienteDecorator implements ProdutoAlimenticio {
	public abstract String getDescricaoDoIngrediente();

	public String getDescricao() {
		return ", " + getDescricaoDoIngrediente();
	}
}