package com.aprendendo.javacore.o_exception.runtime.test;

public class RutimeExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println(divisao(1, 0));
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Codigo finalizado");
		
	}
	private static int divisao(int a, int b) {
		if (b == 0) {
			throw new RuntimeException("Argumento ilegal!");
		}
		return a/b;
	}
}
