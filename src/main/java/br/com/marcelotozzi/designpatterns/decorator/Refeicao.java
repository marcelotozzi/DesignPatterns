package br.com.marcelotozzi.designpatterns.decorator;

public abstract class Refeicao implements ProdutoAlimenticio {
	private String descricao;
	private double custo;

	protected abstract double getPrecoDaRefeicao();

	protected Refeicao(String descricao) {
		this.descricao = descricao;
		this.custo = getPrecoDaRefeicao();
	}

	public double getCusto() {
		return custo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void add(ProdutoAlimenticio complemento) {
		custo += complemento.getCusto();
		descricao += complemento.getDescricao();
	}
}