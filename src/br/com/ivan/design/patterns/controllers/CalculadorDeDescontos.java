package br.com.ivan.design.patterns.controllers;

import br.com.ivan.design.patterns.interfaces.Desconto;
import br.com.ivan.design.patterns.models.Orcamento;
import br.com.ivan.design.patterns.models.descontos.DescontoPorCincoItens;
import br.com.ivan.design.patterns.models.descontos.DescontoPorMaisDeQuinhetosReais;
import br.com.ivan.design.patterns.models.descontos.Semdesconto;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d3 = new Semdesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconto(orcamento);
		
	}
}
