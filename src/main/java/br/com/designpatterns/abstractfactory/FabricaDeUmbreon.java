package br.com.designpatterns.abstractfactory;

public class FabricaDeUmbreon extends FabricaDeEvolucoesDoEevee {
	@Override
	public Pokemon criarEvolucao() {
		Pokemon umbreon = new Pokemon();
		umbreon.setNome("Umbreon");
		return umbreon;
	}
}