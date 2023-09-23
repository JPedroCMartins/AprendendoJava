package com.aprendendo.javacore.o_exception.exception.test;

import java.io.IOException;

import com.aprendendo.javacore.o_exception.exception.domain.Leitor1;
import com.aprendendo.javacore.o_exception.exception.domain.Leitor2;

public class TryWithResourcesTest {
	public static void main(String[] args) {
		lerArquivo();
	}
	public static void lerArquivo() {
		try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){
			
		} catch (IOException e) {
			
		}
	}
}
