package br.com.ivan.design.patterns.models.respostas;

import br.com.ivan.design.patterns.enums.FormatoDeResposta;
import br.com.ivan.design.patterns.interfaces.Resposta;
import br.com.ivan.design.patterns.models.Conta;
import br.com.ivan.design.patterns.models.Requisicao;

public class RespostaEmPorcento implements Resposta {
	//recebe dependencia pelo setter
	private Resposta outraResposta;
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if(requisicao.getFormatoDeResposta() == FormatoDeResposta.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if(outraResposta != null){
			outraResposta.responde(requisicao, conta);
		} else {
			// não existe próxima na corrente, e ninguém atendeu a requisição!
            // poderíamos não ter feito nada aqui, caso não fosse necessário!
            throw new RuntimeException("Formato de resposta não encontrado");
        }
	}

	@Override
	public void setProxima(Resposta resposta) {
//		this.outraResposta = resposta;
		this.outraResposta = null; //não tem proximo!
	}

}
