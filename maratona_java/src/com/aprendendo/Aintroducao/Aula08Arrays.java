package com.aprendendo.Aintroducao;

public class Aula08Arrays {
	public static void main(String[] args) {
		int [] idades = new int[3];
		
		idades[0] = 5;
		idades[1] = 65;
		idades[2] = 78;

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}
