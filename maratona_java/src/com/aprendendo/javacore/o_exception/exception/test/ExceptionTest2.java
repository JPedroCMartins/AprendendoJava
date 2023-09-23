package com.aprendendo.javacore.o_exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
	public static void main(String[] args) throws IOException {
		criarNovoArquivo();
	}
	private static void criarNovoArquivo() throws IOException{
		File file = new File("arquivo/test.txt");
		try{
			boolean isCriado = file.createNewFile(); 
			System.out.println("Arquivo criado ["+ isCriado + "]");
		}catch(IOException e) {
			e.printStackTrace();
			throw e;
		}
		
	}
}
