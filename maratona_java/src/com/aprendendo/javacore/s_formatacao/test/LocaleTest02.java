package com.aprendendo.javacore.s_formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();
		for (String string : isoLanguages) {
			System.out.print(string + " ");
		}
		System.out.println("");
		for (String string : isoCountries) {
			System.out.print(string + " ");
		}
	}
}
