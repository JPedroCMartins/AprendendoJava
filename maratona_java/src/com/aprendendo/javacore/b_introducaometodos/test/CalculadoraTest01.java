package com.aprendendo.javacore.b_introducaometodos.test;

import com.aprendendo.javacore.b_introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		
		
		calculadora.somaArray(numeros);
		calculadora.somaVarArgs(1,2,3,4,5,6);
	}
}
