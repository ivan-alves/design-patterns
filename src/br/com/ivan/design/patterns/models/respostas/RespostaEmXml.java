package br.com.ivan.design.patterns.models.respostas;

import br.com.ivan.design.patterns.enums.FormatoDeResposta;
import br.com.ivan.design.patterns.interfaces.Resposta;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;

public class RespostaEmXml implements Resposta {
	//recebe dependencia pelo construtor
	
	private Resposta outraResposta;

	public RespostaEmXml(Resposta resposta) {
		setProxima(resposta);
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if(requisicao.getFormatoDeResposta() == FormatoDeResposta.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular></saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else {
			outraResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}

}
