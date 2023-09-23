package com.aprendendo.javacore.f_modificadorestatico.test;

import com.aprendendo.javacore.f_modificadorestatico.domain.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro.velocidadeLimite = 180;
		
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("MERCEDES", 275);
		Carro c3 = new Carro("AUDI", 290);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
