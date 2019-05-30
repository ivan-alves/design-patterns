package br.com.ivan.design.patterns.controllers;

import br.com.ivan.design.patterns.enums.FormatoDeResposta;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;
import br.com.ivan.design.patterns.models.respostas.RespostaEmCsv;
import br.com.ivan.design.patterns.models.respostas.RespostaEmPorcento;
import br.com.ivan.design.patterns.models.respostas.RespostaEmXml;

public class RecebedorDeRespostas {

	public void efetuaRequisicao(FormatoDeResposta formatoDeResposta, Conta conta) {

//		RespostaEmBranco emBranco = new RespostaEmBranco();
		RespostaEmPorcento emPorcento = new RespostaEmPorcento();
		RespostaEmCsv emCsv = new RespostaEmCsv();
		RespostaEmXml emXml = new RespostaEmXml(emCsv);
		
//		emXml.setProxima(emCsv);
		emCsv.setProxima(emPorcento);

		//emBranco fica sempre por ultimo
//		emPorcento.setProxima(emBranco);
		
		Requisicao requisicao = new Requisicao(formatoDeResposta);
		
		emXml.responde(requisicao, conta);
	}

}
