package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hoja1Ejer6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double cadaPrecio;

		List<Double> precios = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			System.out.print("Precio del producto número " 
					+ (i + 1) + ": ");
			cadaPrecio = entrada.nextDouble();
			precios.add(cadaPrecio);

		}

		System.out.println("Lista de precios\n================");

		for (Double precio : precios) {

			System.out.println(precio);

		}

	}

}
