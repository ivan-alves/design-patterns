package br.com.ivan.design.patterns.teste;

import br.com.ivan.design.patterns.controllers.CalculadorDeDescontos;
import br.com.ivan.design.patterns.models.Item;
import br.com.ivan.design.patterns.models.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(400.0);
		orcamento.adicionaitem(new Item("Caneta", 15.0));
		orcamento.adicionaitem(new Item("Lapis", 15.0));
		orcamento.adicionaitem(new Item("borracha", 15.0));
		
		double descontofinal = descontos.calcula(orcamento);
		System.out.println(descontofinal);
	}

}
 