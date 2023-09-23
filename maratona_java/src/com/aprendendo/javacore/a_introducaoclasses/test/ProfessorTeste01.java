package com.aprendendo.javacore.a_introducaoclasses.test;

import com.aprendendo.javacore.a_introducaoclasses.dominio.Professor;
public class ProfessorTeste01 {
	public static void main(String[] args) {
		Professor prof = new Professor();
		
		prof.nome = "Julio";
		prof.sexo = 'M';
		prof.idade = 26;
		
		System.out.println(prof.nome + " " + prof.idade + " " + prof.sexo);
	}
	
}
