package com.aprendendo.javacore.n_polimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um arquivo");
	}
	
}
