package com.aprendendo.javacore.n_polimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio {
	@Override
	public void salvar() {
		System.out.println("Salvando na memoria");
	}
}
