package com.aprendendo.javacore.n_polimorfismo.service;

import com.aprendendo.javacore.n_polimorfismo.domain.Produto;
import com.aprendendo.javacore.n_polimorfismo.domain.Tomate;

public class CalculadoraImposto {
	
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatorio Produto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Preço: "+ produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto );
		if (produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getDataValidade());
		}
	}
}
