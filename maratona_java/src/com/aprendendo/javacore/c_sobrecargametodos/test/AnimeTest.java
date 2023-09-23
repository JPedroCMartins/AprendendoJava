package com.aprendendo.javacore.c_sobrecargametodos.test;

import com.aprendendo.javacore.c_sobrecargametodos.dominio.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		Anime anime = new Anime();
		
		anime.init("Naruto", "TV", 500);
		anime.init("Naruto", "TV", 500, "SEX");
		anime.imprime();
		
	}
}
