package com.aprendendo.javacore.b_introducaometodos.test;

import com.aprendendo.javacore.b_introducaometodos.dominio.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.n1 = 10;
		calculadora.n2 = 10;
		
		calculadora.soma();
		calculadora.subtracao();
		calculadora.multiplicacao();
		calculadora.divisao();
		
	}
}
