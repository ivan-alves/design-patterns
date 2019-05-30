package br.com.ivan.design.patterns.models.respostas;

import br.com.ivan.design.patterns.enums.FormatoDeResposta;
import br.com.ivan.design.patterns.interfaces.Resposta;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;

public class RespostaEmCsv implements Resposta {
	//recebe dependencia pelo setter
	private Resposta outraResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		
		if(requisicao.getFormatoDeResposta() == FormatoDeResposta.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}

}
