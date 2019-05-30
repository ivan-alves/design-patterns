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
			// n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
            // poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
            throw new RuntimeException("Formato de resposta n�o encontrado");
        }
	}

	@Override
	public void setProxima(Resposta resposta) {
//		this.outraResposta = resposta;
		this.outraResposta = null; //n�o tem proximo!
	}

}
