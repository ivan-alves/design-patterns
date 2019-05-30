package br.com.ivan.design.patterns.models;

public class Conta {

	private double saldo;
	private String titular;

	public void deposita(String titular, double valor) {
		this.titular = titular;
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
}
