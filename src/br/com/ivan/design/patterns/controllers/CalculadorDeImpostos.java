package br.com.ivan.design.patterns.controllers;
import br.com.ivan.design.patterns.interfaces.Imposto;
import br.com.ivan.design.patterns.models.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}
}
 