package com.aprendendo.javacore.k_enumeracao.test;

import com.aprendendo.javacore.k_enumeracao.domain.Cliente;
import com.aprendendo.javacore.k_enumeracao.domain.TipoCliente;
import com.aprendendo.javacore.k_enumeracao.domain.TipoPagamento;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Mario", TipoCliente.PESSOA_FISICA);
		
		Cliente cliente3 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
		Cliente cliente4 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		System.out.println(cliente4);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
	}
}
