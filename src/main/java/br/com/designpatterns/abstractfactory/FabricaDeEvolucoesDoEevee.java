package br.com.designpatterns.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

abstract class FabricaDeEvolucoesDoEevee {
	private static Calendar manha;
	private static Calendar tarde;

	static {
		manha = new GregorianCalendar(0, 0, 0, 6, 0, 0);
		tarde = new GregorianCalendar(0, 0, 0, 18, 0, 0);
	}

	public static FabricaDeEvolucoesDoEevee obterFabrica() {
		Calendar dataDaEvolucao = new GregorianCalendar();

		if (dataDaEvolucao.after(manha) && dataDaEvolucao.before(tarde)) {
			return new FabricaDeEspeon();
		}
		return new FabricaDeUmbreon();
	}

	public abstract Pokemon criarEvolucao();
}