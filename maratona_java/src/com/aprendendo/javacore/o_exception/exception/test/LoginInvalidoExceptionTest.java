package com.aprendendo.javacore.o_exception.exception.test;

import java.util.Scanner;

import com.aprendendo.javacore.o_exception.exception.domain.LoginInvalidoException;

public class LoginInvalidoExceptionTest {
	public static void main(String[] args) {
		try {
			logar();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void logar() throws LoginInvalidoException{
		Scanner in = new Scanner(System.in);
		
		String usernameDB = "Goku";
		String senhaDB = "ssj";
		
		System.out.println("Usuario: ");
		String nm = in.nextLine();
		System.out.println("Senha");
		String ps = in.nextLine();
		
		if (!usernameDB.equals(nm) || !senhaDB.equals(ps)) {
			throw new LoginInvalidoException("Usuario ou senha invalidos! ");
		}
		
		System.out.println("Usuario logado com sucesso!");
	}
}
