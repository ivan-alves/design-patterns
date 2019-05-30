package br.com.ivan.design.patterns.teste;

import br.com.ivan.design.patterns.controllers.RecebedorDeRespostas;
import br.com.ivan.design.patterns.enums.FormatoDeResposta;
import br.com.ivan.design.patterns.models.Conta;

public class TesteDeResposta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.deposita("Ivan", 1500.0);
		
		RecebedorDeRespostas recebedorDeRespostas = new RecebedorDeRespostas();
		
		recebedorDeRespostas.efetuaRequisicao(FormatoDeResposta.XML, conta);
	}

}
