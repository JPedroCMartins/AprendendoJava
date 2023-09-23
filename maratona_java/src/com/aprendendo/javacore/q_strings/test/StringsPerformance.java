package com.aprendendo.javacore.q_strings.test;

public class StringsPerformance {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatStringBuilder(999);
		long fim = System.currentTimeMillis();
		long duracao = fim - inicio;
		System.out.println("TEMPO: " + duracao + " ms");
	}
	private static void concatString(int tamanho) {
		String texto = "";
		for (int i = 0; i < tamanho; i++) {
			texto +=i;
		}
	}
	
	private static void concatStringBuilder(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
}


