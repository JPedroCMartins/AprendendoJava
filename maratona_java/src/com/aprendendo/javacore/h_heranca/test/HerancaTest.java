package com.aprendendo.javacore.h_heranca.test;

import com.aprendendo.javacore.h_heranca.dominio.Endereco;
import com.aprendendo.javacore.h_heranca.dominio.Funcionario;
import com.aprendendo.javacore.h_heranca.dominio.Pessoa;

public class HerancaTest {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 03");
		endereco.setCep("012345-209");
		
		Pessoa pessoa = new Pessoa("");
		pessoa.setNome("Naruto");
		pessoa.setCpg("123.456.789-99");
		
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		Funcionario func = new Funcionario("");
		func.setNome("josé");
		func.setCpg("123.456.789-99");
		func.setEndereco(endereco);
		func.setSalario(0);
		func.imprime();
		
	}
}
