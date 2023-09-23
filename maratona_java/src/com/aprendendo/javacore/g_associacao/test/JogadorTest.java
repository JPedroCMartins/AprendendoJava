package com.aprendendo.javacore.g_associacao.test;

import com.aprendendo.javacore.g_associacao.dominio.Jogador;

public class JogadorTest {
	public static void main(String[] args) {
		Jogador jgd1 = new Jogador("Pele");
		Jogador jgd2 = new Jogador("Romario");
		Jogador jgd3 = new Jogador("Cafu");
		
		Jogador[] jogadores = new Jogador[] {jgd1, jgd2, jgd3};
		
		for (Jogador jgd: jogadores) {
			jgd.imprime();
		}
		
	}
}
