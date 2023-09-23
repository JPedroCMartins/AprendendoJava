package com.aprendendo.javacore.d_construtores.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private String genero;
	private int episodios;
	private String estudio;
	
	public Anime(String nome, String tipo, int episodios, String genero) {
		this.nome = nome;
		this.episodios = episodios;
		this.tipo = tipo;
		this.genero = genero;
	}
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);
		this.estudio = estudio;
	}

	
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.episodios = episodios;
		this.tipo = tipo;
	}
	
	public void init(String nome, String tipo, int episodios, String genero) {
		init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.episodios);
		System.out.println(this.tipo);
		System.out.println(this.genero);
		System.out.println(this.estudio);
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getNome() {
		return this.tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getEpisodios() {
		return this.episodios;
	}
}
