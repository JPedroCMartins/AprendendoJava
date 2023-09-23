package com.aprendendo.javacore.b_introducaometodos.test;

import com.aprendendo.javacore.b_introducaometodos.dominio.Estudantes;

public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudantes estudante01 = new Estudantes();
		Estudantes estudante02 = new Estudantes();
		
		estudante01.nome = "Joãozinho";
		estudante01.idade = 17;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Mariazinha";
		estudante02.idade = 12;
		estudante02.sexo = 'F';
		
		estudante01.imprime();
		System.out.println("-------------");
		estudante02.imprime();
	}
}
