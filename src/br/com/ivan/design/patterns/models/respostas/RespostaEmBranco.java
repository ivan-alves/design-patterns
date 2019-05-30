package br.com.ivan.design.patterns.models.respostas;

import br.com.ivan.design.patterns.interfaces.Resposta;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;

public class RespostaEmBranco implements Resposta {

	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		System.out.println("Requisição sem o formato da resposta");
	}

	@Override
	public void setProxima(Resposta resposta) {
		//Sem proxima 
	}

}
