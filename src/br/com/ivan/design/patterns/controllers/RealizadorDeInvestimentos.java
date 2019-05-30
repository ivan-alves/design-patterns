package br.com.ivan.design.patterns.controllers;
import br.com.ivan.design.patterns.interfaces.Investimento;
import br.com.ivan.design.patterns.models.Conta;

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento investimento) {
		
		double resultado = investimento.calcula(conta);
		
		conta.deposita("Ivan", resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
