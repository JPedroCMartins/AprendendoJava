package com.aprendendo.javacore.b_introducaometodos.test;

import com.aprendendo.javacore.b_introducaometodos.dominio.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Martins");
		pessoa.setIdade(-1);
		pessoa.imprime();
		
	}
}
