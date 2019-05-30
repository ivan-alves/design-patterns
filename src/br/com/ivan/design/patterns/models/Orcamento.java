package br.com.ivan.design.patterns.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaitem(Item item) {
		itens.add(item);
	}
	
	public boolean contemItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if(item.getNome().equals(nomeDoItem)) {
				return true;
			} 
		}
		return false;
	}
	
}
