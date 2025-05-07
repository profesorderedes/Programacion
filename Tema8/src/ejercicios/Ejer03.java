package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer03 {

	public static void main(String[] args) {

		try {

			BufferedReader bufer = new BufferedReader(new FileReader("ficheros/contactos.txt"));

			String linea = bufer.readLine();

			while (linea != null) {

				String[] datosContacto = linea.split(",");

				System.out.println("Apellidos: " + datosContacto[0]);
				System.out.println("Nombre: " + datosContacto[1]);
				System.out.println("Teléfono: " + datosContacto[2]);
				System.out.println("----");

				linea = bufer.readLine();

			}

			bufer.close();

		} catch (IOException e) {
			System.out.println("Error leyendo el archivo.");
			e.printStackTrace();

		}

	}

}