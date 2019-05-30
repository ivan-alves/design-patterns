package br.com.ivan.design.patterns.models.descontos;

import br.com.ivan.design.patterns.interfaces.Desconto;
import br.com.ivan.design.patterns.models.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// não tem desconto!

	}

}
