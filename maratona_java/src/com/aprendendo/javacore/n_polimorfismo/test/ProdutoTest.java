package com.aprendendo.javacore.n_polimorfismo.test;

import com.aprendendo.javacore.n_polimorfismo.domain.Computador;
import com.aprendendo.javacore.n_polimorfismo.domain.Produto;
import com.aprendendo.javacore.n_polimorfismo.domain.Tomate;
import com.aprendendo.javacore.n_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
	public static void main(String[] args) {
		Computador computador = new Computador("NUC10-I7", 11000);
		Tomate tomate1 = new Tomate("MADURO" , 10);
		
		Produto tomate2 = new Tomate("MADURO", 10);
		Produto computador2 = new Computador("NUC10-I7", 11000);
		
		
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("---------------");
		CalculadoraImposto.calcularImposto(tomate1);
		
	}
}
