package com.aprendendo.javacore.l_classesabstratas.test;

//import com.aprendendo.javacore.l_classesabstratas.dominio.Funcionario;
import com.aprendendo.javacore.l_classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
	public static void main(String[] args) {
		//Funcionario funcionario = new Funcionario("José", 2000);
		Gerente gerente = new Gerente("Pedro", 4000);
		
		//System.out.println(funcionario);
		System.out.println(gerente);
	}
}
