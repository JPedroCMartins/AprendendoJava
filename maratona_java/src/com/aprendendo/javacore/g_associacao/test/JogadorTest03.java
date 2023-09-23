package com.aprendendo.javacore.g_associacao.test;

import com.aprendendo.javacore.g_associacao.dominio.Jogador;
import com.aprendendo.javacore.g_associacao.dominio.Time;

public class JogadorTest03 {
	public static void main(String[] args) {
		Jogador jgdr1 = new Jogador("jogador 1");
		Jogador jgdr2 = new Jogador("jogador 2");
		Jogador jgdr3 = new Jogador("jogador 3");
		
		Time time1 = new Time("Brasil");
		Time time2 = new Time("Alemanha");
		
		Jogador[] jogadores1 = {jgdr1};
		Jogador[] jogadores2 = {jgdr2, jgdr3};
		jgdr1.setTime(time1);
		jgdr2.setTime(time2);
		jgdr3.setTime(time2);
		
		time1.setJogadores(jogadores1);
		time2.setJogadores(jogadores2);
		
		
		time1.imprime();
		System.out.println("--------");
		time2.imprime();
		
		
	}
}
