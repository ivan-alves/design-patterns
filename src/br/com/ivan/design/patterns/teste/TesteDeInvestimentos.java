package br.com.ivan.design.patterns.teste;

import br.com.ivan.design.patterns.controllers.RealizadorDeInvestimentos;
import br.com.ivan.design.patterns.interfaces.Investimento;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.investidor.Arrojado;
import br.com.ivan.design.patterns.models.investidor.Conservador;
import br.com.ivan.design.patterns.models.investidor.Moderado;

public class TesteDeInvestimentos {

	public static void main(String[] args) {

		Investimento arrojado = new Arrojado();
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		
		Conta conta = new Conta();
		
		conta.deposita(505.0);
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		
		realizadorDeInvestimentos.realizaInvestimento(conta, conservador);
		realizadorDeInvestimentos.realizaInvestimento(conta, moderado);
		realizadorDeInvestimentos.realizaInvestimento(conta, arrojado);
		

	}

}
