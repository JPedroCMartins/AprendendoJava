package com.aprendendo.javacore.l_classesabstratas.dominio;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void calculaBonus() {
		this.salario = salario + salario * 0.15;
	}
}
