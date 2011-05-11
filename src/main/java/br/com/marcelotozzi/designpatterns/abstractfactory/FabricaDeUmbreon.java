package br.com.marcelotozzi.designpatterns.abstractfactory;

public class FabricaDeUmbreon extends FabricaDeEvolucoesDoEevee {
	@Override
	public Umbreon criarEvolucao() {
		return new Umbreon();
	}
}