package br.com.ivan.design.patterns.models.investidor;
import java.util.Random;

import br.com.ivan.design.patterns.interfaces.Investimento;
import br.com.ivan.design.patterns.models.Conta;

public class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public double calcula(Conta conta) {

		int chute = random.nextInt(10);

		if (chute >= 0 && chute <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (chute >= 2 && chute <= 4) {
			return conta.getSaldo() * 0.03;
		} else {
			return conta.getSaldo() * 0.6;
		}

	}

}
