package com.aprendendo.javacore.m_interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
	
	
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Removendo do banco de dados");
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Carregando dados do banco de dados");
	}
	
	
	
}
