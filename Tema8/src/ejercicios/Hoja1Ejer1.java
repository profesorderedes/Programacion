package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Hoja1Ejer1 {

	public static void main(String[] args) {

		List<String> estaciones = new ArrayList<String>();

		estaciones.add("Invierno");
		estaciones.add("Primavera");
		estaciones.add("Verano");
		estaciones.add("Otoño");

		System.out.println("Estaciones:");
		for (String estacion : estaciones) {

			System.out.println(estacion);

		}

		System.out.println("\nEstaciones:");
		for (int i = 0; i < estaciones.size(); i++) {

			System.out.println(estaciones.get(i));

		}

	}

}