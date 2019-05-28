package br.com.ivan.design.patterns.interfaces;

import br.com.ivan.design.patterns.models.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
