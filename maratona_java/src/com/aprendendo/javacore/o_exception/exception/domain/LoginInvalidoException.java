package com.aprendendo.javacore.o_exception.exception.domain;

public class LoginInvalidoException extends Exception{
	public LoginInvalidoException() {
		super("Login invalido");
	}
	public LoginInvalidoException(String message) {
		super(message);
	}
}
