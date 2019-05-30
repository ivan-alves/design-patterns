package br.com.ivan.design.patterns.interfaces;

import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;

public interface Resposta {

	void responde(Requisicao requisicao, Conta conta);
	void setProxima(Resposta resposta);
}
