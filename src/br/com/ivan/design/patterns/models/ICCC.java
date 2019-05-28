package br.com.ivan.design.patterns.models;
import br.com.ivan.design.patterns.interfaces.Imposto;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		double valorCalculado = 0;
		
		if (valor < 1000.0) {
			valorCalculado = orcamento.getValor() * 0.05;
		}else if (valor > 1000.0 && valor <= 3000.0) {
			valorCalculado = orcamento.getValor() * 0.07;
		}else if (valor > 3000.0) {
			valorCalculado =  orcamento.getValor() * 0.08 + 30.0;
		}
		
		return valorCalculado;
	}

}
