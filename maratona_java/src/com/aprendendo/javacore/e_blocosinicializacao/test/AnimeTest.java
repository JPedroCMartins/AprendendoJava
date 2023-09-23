package com.aprendendo.javacore.e_blocosinicializacao.test;

import com.aprendendo.javacore.e_blocosinicializacao.dominio.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime("Naruto");
		
		System.out.println(anime.getEp());
	}
}
