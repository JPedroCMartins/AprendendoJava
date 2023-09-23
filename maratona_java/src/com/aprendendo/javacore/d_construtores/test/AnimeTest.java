package com.aprendendo.javacore.d_construtores.test;

import com.aprendendo.javacore.d_construtores.dominio.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime("Naruto", "TV", 500, "SEX", "PN");
	
		anime.imprime();
		
	}
}
