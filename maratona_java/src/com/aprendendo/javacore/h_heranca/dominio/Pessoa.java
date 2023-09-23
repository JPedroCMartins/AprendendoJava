package com.aprendendo.javacore.h_heranca.dominio;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	static{
		System.out.println("BLOCO ESTATICO PAI");
	}
	{
		System.out.println("BLOCO PAI");
	}
	
	public Pessoa(String nome) {
		System.out.println("INICIALIZADOR PAI");
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}
	
	public void imprime() {
		System.out.println("----------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: "+ this.cpf);
		System.out.println("Endereço " + this.endereco.getRua() +" CEP["+ this.endereco.getCep() + "]");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpg() {
		return cpf;
	}

	public void setCpg(String cpg) {
		this.cpf = cpg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
