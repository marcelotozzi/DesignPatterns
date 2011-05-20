package br.com.marcelotozzi.designpatterns.adapter;

public class AdaptadorDeNovoPadrao implements AntigoPadrao {
	NovoPadrao novoPadrao;

	public AdaptadorDeNovoPadrao(NovoPadrao novoPadrao) {
		this.novoPadrao = novoPadrao;
	}

	public int retornaQtdPinosAntigoPadrao() {
		return novoPadrao.retornaQtdPinosNovoPadrao();
	}
}