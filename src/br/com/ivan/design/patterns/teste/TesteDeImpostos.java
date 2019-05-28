package br.com.ivan.design.patterns.teste;
import br.com.ivan.design.patterns.controllers.CalculadorDeImpostos;
import br.com.ivan.design.patterns.interfaces.Imposto;
import br.com.ivan.design.patterns.models.ICCC;
import br.com.ivan.design.patterns.models.ICMS;
import br.com.ivan.design.patterns.models.ISS;
import br.com.ivan.design.patterns.models.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(5000.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
	}

}
