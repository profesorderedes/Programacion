package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String ruta = "ficheros/agenda.txt";

		System.out.println(" AGENDA DE CONTACTOS");
		System.out.println(" - GUARDAR PERSONA - ");
		System.out.println("=====================");

		for (int i = 1; i <= 3; i++) {

			System.out.println("\nCONTACTO Nº" + i);
			System.out.println("============\n");

			System.out.print("Introduce el nombre del nuevo contacto: ");
			String nombre = entrada.nextLine();

			System.out.print("Introduce el apellido(s) del nuevo contacto: ");
			String apellidos = entrada.nextLine();

			System.out.print("Introduce el número de teléfono del nuevo contacto: ");
			String numero = entrada.nextLine();

			guardarPersona(ruta, nombre, apellidos, numero);

		}

		System.out.println("Gracias por usar agenda de contactos");

	}

	private static void guardarPersona(String ruta, String nombre, String apellidos, String numero) {

		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(ruta, true));

			String cadenaAGuardar = apellidos + ", " + nombre + ", " + numero + "\n";

			buffer.write(cadenaAGuardar);

			buffer.close();

		} catch (IOException e) {

			System.out.println("Error al guardar los datos de la persona.");

		}

	}

}