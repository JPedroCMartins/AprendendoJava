package com.aprendendo.javacore.n_polimorfismo.test;

import com.aprendendo.javacore.n_polimorfismo.domain.Computador;
import com.aprendendo.javacore.n_polimorfismo.domain.Produto;
import com.aprendendo.javacore.n_polimorfismo.domain.Tomate;
import com.aprendendo.javacore.n_polimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		
		Tomate tomate = new Tomate("Americano", 20);
		tomate.setDataValidade("11/12/2023");
		
		CalculadoraImposto.calcularImposto(tomate);
	}
}
