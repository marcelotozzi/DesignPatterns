package br.com.marcelotozzi.designpatterns.decorator;

import junit.framework.Assert;

import org.junit.Test;

public class DecoratorTest {
	@Test
	public void deveRetornarIngredientesECusto() {
		MistoQuente mistoQuente = new MistoQuente("Misto Quente");
		mistoQuente.add(new QueijoPrato());
		mistoQuente.add(new Presunto());
		
		Assert.assertEquals("Misto Quente, Queijo Prato, Presunto", mistoQuente.getDescricao());
		Assert.assertEquals(0.50, mistoQuente.getCusto());
	}
}