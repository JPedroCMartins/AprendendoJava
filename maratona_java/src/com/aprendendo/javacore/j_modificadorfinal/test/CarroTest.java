package com.aprendendo.javacore.j_modificadorfinal.test;

import com.aprendendo.javacore.j_modificadorfinal.dominio.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Martins");
		System.out.println(carro.COMPRADOR);
	}
}
