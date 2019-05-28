package br.com.ivan.design.patterns.models.investidor;
import br.com.ivan.design.patterns.interfaces.Investimento;
import br.com.ivan.design.patterns.models.Conta;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {

		return conta.getSaldo() * 0.8;
	}

}
