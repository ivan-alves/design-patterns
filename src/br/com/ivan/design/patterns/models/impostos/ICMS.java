package br.com.ivan.design.patterns.models.impostos;
import br.com.ivan.design.patterns.interfaces.Imposto;
import br.com.ivan.design.patterns.models.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.5) + 50.0;
	}
}
