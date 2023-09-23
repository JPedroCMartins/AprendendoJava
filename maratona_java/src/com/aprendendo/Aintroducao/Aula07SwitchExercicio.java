package com.aprendendo.Aintroducao;

public class Aula07SwitchExercicio {
	public static void main(String[] args) {
		byte dia = 5;
		String diaSemana = "";
		String diaUtil = "";
		boolean isUtil = false;
		
		switch (dia) {
		case 1:
			diaSemana = "Domingo";
			isUtil = false;
			break;
		case 2:
			diaSemana = "Segunda";
			isUtil = true;
			break;
		case 3:
			diaSemana = "Terça";
			isUtil = true;
			break;
		case 4:
			diaSemana = "Quarta";
			isUtil = true;
			break;
		case 5:
			diaSemana = "Quinta";
			isUtil = true;
			break;
		case 6:
			diaSemana = "Sexta";
			isUtil = true;
			break;
		case 7:
			diaSemana = "Domingo";
			isUtil = false;
			break;
		}
		
		if (isUtil){
			diaUtil = "útil.";
		}else {
			diaUtil = "de final de semana.";
		}
		System.out.println("Hoje é "+ diaSemana+" sendo um dia "+ diaUtil);
	}
}
