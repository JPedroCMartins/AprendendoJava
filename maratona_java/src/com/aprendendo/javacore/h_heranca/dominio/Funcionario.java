package com.aprendendo.javacore.h_heranca.dominio;

public class Funcionario extends Pessoa{
	private double salario;

	static{
		System.out.println("BLOCO ESTATICO FILHO");
	}
	{
		System.out.println("BLOCO FILHO");
	}
	public Funcionario(String nome) {
		super(nome);
		System.out.println("INICIALIZADOR FILHO");
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Salario: " + this.salario);
	}
	
	public void relatorioPagamento() {
		System.out.println("Eu "+ this.nome + " recebi o salario de "+ this.salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
