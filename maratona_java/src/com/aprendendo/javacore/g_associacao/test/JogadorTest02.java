package com.aprendendo.javacore.g_associacao.test;

import com.aprendendo.javacore.g_associacao.dominio.Jogador;
import com.aprendendo.javacore.g_associacao.dominio.Time;

public class JogadorTest02 {
	public static void main(String[] args) {
		Jogador jgd = new Jogador("Pelé");
		Time time = new Time("Brasil");
		
		jgd.setTime(time);
		jgd.imprime();
		
	}
}
