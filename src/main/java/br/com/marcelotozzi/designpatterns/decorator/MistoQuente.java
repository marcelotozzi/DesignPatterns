package br.com.marcelotozzi.designpatterns.decorator;

public class MistoQuente extends Refeicao {

	public MistoQuente(String descricao) {
		super(descricao);
	}

	public double getPrecoDaRefeicao() {
		return 0;
	}
}