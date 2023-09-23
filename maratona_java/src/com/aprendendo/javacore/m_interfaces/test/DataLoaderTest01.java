package com.aprendendo.javacore.m_interfaces.test;

import com.aprendendo.javacore.m_interfaces.dominio.DatabaseLoader;
import com.aprendendo.javacore.m_interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		databaseLoader.load();
		fileLoader.load();
		fileLoader.remove();
		databaseLoader.remove();
		
		databaseLoader.checkPermission();
		fileLoader.checkPermission();
	}
}
