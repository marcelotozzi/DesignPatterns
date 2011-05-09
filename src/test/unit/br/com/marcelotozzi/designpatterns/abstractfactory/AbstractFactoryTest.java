package br.com.marcelotozzi.designpatterns.abstractfactory;

import org.junit.Test;


public class AbstractFactoryTest {

	@Test
	public void deveriaEvoluirPara(){
		FabricaDeEvolucoesDoEevee fabrica = FabricaDeEvolucoesDoEevee.obterFabrica();
		Pokemon pokemon = fabrica.criarEvolucao();
		System.out.println("Evoluiu para " + pokemon.getNome() + "!");
	}
}
