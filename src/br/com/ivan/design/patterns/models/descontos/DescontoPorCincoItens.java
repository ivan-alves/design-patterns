package br.com.ivan.design.patterns.models.descontos;

import br.com.ivan.design.patterns.interfaces.Desconto;
import br.com.ivan.design.patterns.models.Orcamento;

public class DescontoPorCincoItens implements Desconto{

	private Desconto proximo;

	public double desconto(Orcamento orcamento) {
		
		if(orcamento.getItens().size() >5) {
			System.out.println("Desconto por cinco itens");
			return orcamento.getValor() * 0.1;
		}
		else {
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;

		
	}
}
