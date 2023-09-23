package com.aprendendo.javacore.m_interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Removendo dados de um arquivo");
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Carregando dados de um arquivo");
	}
	
}
