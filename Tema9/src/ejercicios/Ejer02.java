package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("========== AGENDA ==========");

		for (int i = 1; i <= 3; i++) {
			System.out.print("Apellidos: ");
			String apellidos = entrada.nextLine();
			System.out.print("Nombre: ");
			String nombre = entrada.nextLine();
			System.out.print("Telefono: ");
			String telefono = entrada.nextLine();

			String datosPersonales = apellidos + "," + nombre + "," + telefono;

			try {

				FileWriter contactos = new FileWriter("ficheros/contactos.txt", true);
				BufferedWriter bufferContactos = new BufferedWriter(contactos);

				bufferContactos.write(datosPersonales + "\n");

				bufferContactos.close();

				System.out.println("REGISTRADO !!");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
