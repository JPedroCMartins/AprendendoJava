package com.aprendendo.javacore.n_polimorfismo.test;

import com.aprendendo.javacore.n_polimorfismo.repositorio.Repositorio;
import com.aprendendo.javacore.n_polimorfismo.repositorio.RepositorioBancoDeDados;

public class RepositorioTest {
	public static void main(String[] args) {
		Repositorio repo = new RepositorioBancoDeDados();
		
		repo.salvar();
	}
}
