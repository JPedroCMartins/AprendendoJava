package com.aprendendo.javacore.f_modificadorestatico.domain;

public class Anime {
	private String nome;
	private static int[] ep;
	
	static {
		ep = new int[100];
		
		for (int i = 0; i < ep.length; i++) {
			ep[i] = i + 1;
		}
	}
	static {
		System.out.println("Hello");
	}
	
	public Anime(String nome) {
		this.nome = nome;
	}
	public Anime() {
		for (int epi: Anime.ep) {
			System.out.print(epi);
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getEp() {
		return ep;
	}
}
