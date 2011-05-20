package br.com.marcelotozzi.designpatterns.adapter;

import junit.framework.Assert;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void deveRetornarPadraoAntigo() {
		AntigoPadrao tomadaAntiga = new AntigoPadraoDeTomada();

		Assert.assertEquals(2, tomadaAntiga.retornaQtdPinosAntigoPadrao());
	}

	@Test
	public void deveRetornarPadraoNovo() {
		NovoPadrao tomadaNova = new NovoPadraoDeTomada();

		Assert.assertEquals(3, tomadaNova.retornaQtdPinosNovoPadrao());
	}

	@Test
	public void deveRetornarPadraoAntigoAdaptado() {
		AntigoPadrao antigo = new AntigoPadraoDeTomada();
		NovoPadrao adaptadorDeAntigoPadrao = new AdaptadorDeAntigoPadrao(antigo);

		Assert.assertEquals(2,
				adaptadorDeAntigoPadrao.retornaQtdPinosNovoPadrao());
	}

	@Test
	public void deveRetornarPadraoNovoAdaptado() {
		NovoPadrao novo = new NovoPadraoDeTomada();
		AntigoPadrao adaptadorDeNovoPadrao = new AdaptadorDeNovoPadrao(novo);

		Assert.assertEquals(3,
				adaptadorDeNovoPadrao.retornaQtdPinosAntigoPadrao());
	}
}