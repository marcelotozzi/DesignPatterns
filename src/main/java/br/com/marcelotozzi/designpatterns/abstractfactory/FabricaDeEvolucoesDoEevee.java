package br.com.marcelotozzi.designpatterns.abstractfactory;

import java.util.Calendar;

abstract class FabricaDeEvolucoesDoEevee {
	private static Calendar manha;
	private static Calendar tarde;

	static {
		manha = Calendar.getInstance();
		manha.set(Calendar.HOUR_OF_DAY, 6);
		manha.set(Calendar.MINUTE, 0);
		manha.set(Calendar.SECOND, 0);

		tarde = Calendar.getInstance();
		tarde.set(Calendar.HOUR_OF_DAY, 18);
		tarde.set(Calendar.MINUTE, 0);
		tarde.set(Calendar.SECOND, 0);
	}

	public static FabricaDeEvolucoesDoEevee obterFabrica() {
		Calendar dataDaEvolucao = Calendar.getInstance();
		if (dataDaEvolucao.after(manha) && dataDaEvolucao.before(tarde)) {
			return new FabricaDeEspeon();
		}
		return new FabricaDeUmbreon();
	}

	public abstract Pokemon criarEvolucao();
}