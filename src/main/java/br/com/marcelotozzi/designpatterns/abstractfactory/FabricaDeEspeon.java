package br.com.marcelotozzi.designpatterns.abstractfactory;

public class FabricaDeEspeon extends FabricaDeEvolucoesDoEevee {
	@Override
	public Espeon criarEvolucao() {
		return new Espeon();
	}
}