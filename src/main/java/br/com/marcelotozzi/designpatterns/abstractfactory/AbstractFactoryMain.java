package br.com.marcelotozzi.designpatterns.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		FabricaDeEvolucoesDoEevee fabrica = FabricaDeEvolucoesDoEevee.obterFabrica();
		Pokemon pokemon = fabrica.criarEvolucao();
		System.out.println("Evoluiu para " + pokemon.getNome() + "!");
	}
}