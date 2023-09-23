package com.aprendendo.javacore.e_blocosinicializacao.dominio;

public class Anime {
	private String nome;
	private int[] ep;
	
	{
		ep = new int[100];
		
		for (int i = 0; i < ep.length; i++) {
			ep[i] = i + 1;
		}
	}
	
	public Anime(String nome) {
		this.nome = nome;
	}
	
	public Anime() {
		for (int epi: this.ep) {
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
	public void setEp(int[] ep) {
		this.ep = ep;
	}
}
