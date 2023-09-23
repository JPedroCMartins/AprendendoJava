package com.aprendendo.javacore.k_enumeracao.domain;

public class Cliente {
	private String nome;
	private TipoCliente tipoCliente;
	
	public Cliente(String nome, TipoCliente tipoCliente) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
	}
	
	

	@Override
	public String toString() { 
		return "Cliente [nome= " + nome + ", tipoCliente= " + tipoCliente.nome + ", tipoCLienteINT " + tipoCliente.valor +"]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
