package br.com.ivan.design.patterns.models.descontos;

import br.com.ivan.design.patterns.interfaces.Desconto;
import br.com.ivan.design.patterns.models.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {

		if (aconteceuVendaCasada(orcamento)) {
			System.out.println("venda casada");
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean aconteceuVendaCasada(Orcamento orcamento) {

		return orcamento.contemItemDeNome("Caneta") && orcamento.contemItemDeNome("Lapis");
	}

}
