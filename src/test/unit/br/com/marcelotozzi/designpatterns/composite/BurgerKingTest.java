package br.com.marcelotozzi.designpatterns.composite;

import junit.framework.Assert;

import org.junit.Test;

import br.com.marcelotozzi.designpatterns.composite.ingredientes.*;

public class BurgerKingTest {
	@Test
	public void deveriaMontarUmWhopperComQueijoImprimirNoConsoleERetornar800Kcal() {
		Alimento hamburguer = new Hamburguer();
		Alimento queijo = new Queijo();
		Alimento picles = new Picles();
		Alimento alface = new Alface();
		Alimento tomate = new Tomate();
		Alimento cebola = new Cebola();
		Alimento pao = new Pao();

		Rango whopperComQueijo = new Rango();

		whopperComQueijo.adiciona(hamburguer);
		whopperComQueijo.adiciona(queijo);
		whopperComQueijo.adiciona(picles);
		whopperComQueijo.adiciona(alface);
		whopperComQueijo.adiciona(tomate);
		whopperComQueijo.adiciona(cebola);
		whopperComQueijo.adiciona(pao);

		Rango rango = new Rango();

		rango.adiciona(whopperComQueijo);

		rango.mostrar();

		Assert.assertEquals(800, whopperComQueijo.retornaCalorias());
		Assert.assertEquals(800, rango.retornaCalorias());
	}
}