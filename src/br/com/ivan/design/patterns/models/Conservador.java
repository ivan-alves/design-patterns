package br.com.ivan.design.patterns.models;
import br.com.ivan.design.patterns.interfaces.Investimento;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {

		return conta.getSaldo() * 0.8;
	}

}
