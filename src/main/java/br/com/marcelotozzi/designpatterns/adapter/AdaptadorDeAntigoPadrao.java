package br.com.marcelotozzi.designpatterns.adapter;


public class AdaptadorDeAntigoPadrao implements NovoPadrao {
	AntigoPadrao antigoPadrao;

	public AdaptadorDeAntigoPadrao(AntigoPadrao antigoPadrao) {
		this.antigoPadrao = antigoPadrao;
	}

	public int retornaQtdPinosNovoPadrao() {
		return antigoPadrao.retornaQtdPinosAntigoPadrao();
	}
}