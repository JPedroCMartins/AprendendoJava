package com.aprendendo.javacore.n_polimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados");
	}
}
