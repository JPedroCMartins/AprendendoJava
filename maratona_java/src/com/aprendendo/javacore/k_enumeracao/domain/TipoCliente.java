package com.aprendendo.javacore.k_enumeracao.domain;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	public  int valor;
	public  String nome;
	
	TipoCliente(int valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}
	
	public int getValor() {
		return valor;
	}
	public String getNome() {
		return nome;
	}
}
