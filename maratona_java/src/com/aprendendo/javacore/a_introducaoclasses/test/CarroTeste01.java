package com.aprendendo.javacore.a_introducaoclasses.test;

import com.aprendendo.javacore.a_introducaoclasses.dominio.Carro;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		
		car1.nome = "Carro modelo 1";
		car1.modelo = "111";
		car1.ano = 2010;
		
		car2.nome = "Carro modelo 2";
		car2.modelo = "222";
		car2.ano = 2023;
		
		System.out.println(car1.nome + " " + car1.modelo + " " + car1.ano);
		System.out.println(car2.nome + " " + car2.modelo + " " + car2.ano);
	}
}
