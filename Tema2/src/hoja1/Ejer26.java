package hoja1;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

//        26.- Crea un programa que calcule la hora de cierre de una tienda. Esta hora depende del valor de
//        una variable de tipo String llamada dia. Si su valor es "entre semana", la hora de cierre de la tienda
//        será "20:00". En otro caso, la hora de cierre será "14:00".

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué día es?");
		String dia = entrada.nextLine();

		String horaCierre;

//		if (dia.equals("entre semana")) {
//			horaCierre = "20:00";
//		} else {
//			horaCierre = "14:00";
//		}

		// Sintaxis del operador ternario:
		// variable = condición ? valor si true : valor si false;
		horaCierre = dia.equals("entre semana") ? "20:00" : "14:00";

		System.out.println("Hora de cierre: " + horaCierre);

	}

}