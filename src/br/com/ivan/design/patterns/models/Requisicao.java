package br.com.ivan.design.patterns.models;

import br.com.ivan.design.patterns.enums.FormatoDeResposta;

public class Requisicao {

	private FormatoDeResposta formatoDeResposta;

	public Requisicao(FormatoDeResposta formatoDeResposta) {
		this.formatoDeResposta = formatoDeResposta;
	}

	public FormatoDeResposta getFormatoDeResposta() {
		return formatoDeResposta;
	}

}
