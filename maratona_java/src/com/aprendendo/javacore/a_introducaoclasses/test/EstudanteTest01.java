package com.aprendendo.javacore.a_introducaoclasses.test;

import com.aprendendo.javacore.a_introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Joãozinho";
		estudante.idade = 18;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);	
		System.out.println(estudante.sexo);
	}
}
