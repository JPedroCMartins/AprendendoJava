package com.aprendendo.javacore.g_associacao.test;

import com.aprendendo.javacore.g_associacao.dominio.Escola;
import com.aprendendo.javacore.g_associacao.dominio.Professor;

public class EscolaTest {
	public static void main(String[] args) {
		Professor prof1 = new Professor("Iruka");
		Professor prof2 = new Professor("Kakashi");
		Professor[] profs = {prof1, prof2};
		
		
		Escola escola = new Escola("Konoha", profs);
		
		escola.imprime();
	}
}
