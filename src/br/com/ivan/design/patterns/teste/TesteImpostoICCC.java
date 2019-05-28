package br.com.ivan.design.patterns.teste;
import br.com.ivan.design.patterns.controllers.CalculadorDeImpostos;
import br.com.ivan.design.patterns.interfaces.Imposto;
import br.com.ivan.design.patterns.models.ICCC;
import br.com.ivan.design.patterns.models.Orcamento;

public class TesteImpostoICCC {

	public static void main(String[] args) {

		Imposto iccc = new ICCC();
		Orcamento orcamento1 = new Orcamento(900.0);
		Orcamento orcamento2 = new Orcamento(3000.0);
		Orcamento orcamento3 = new Orcamento(3100.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento1, iccc);
		calculador.realizaCalculo(orcamento2, iccc);
		calculador.realizaCalculo(orcamento3, iccc);
	}

}
