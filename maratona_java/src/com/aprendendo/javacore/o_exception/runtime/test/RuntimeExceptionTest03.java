package com.aprendendo.javacore.o_exception.runtime.test;

public class RuntimeExceptionTest03 {
	public static void main(String[] args) {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Fchando recurso liberado pelo SO");
		}
	}
}
