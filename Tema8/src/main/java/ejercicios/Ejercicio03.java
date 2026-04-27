package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {

	public static void main(String[] args) {

		String ruta = "ficheros/agenda.txt";

		System.out.println(" AGENDA DE CONTACTOS");
		System.out.println(" - LISTA CONTACTOS - ");
		System.out.println("=====================\n");

		List<String> contactos = leerPersonas(ruta);

		for (int i = 0; i < contactos.size(); i++) {

			System.out.println(contactos.get(i));
			System.out.println("------");

		}

	}

	private static List<String> leerPersonas(String ruta) {

		List<String> listaContactos = new ArrayList<>();

		try {

			BufferedReader buffer = new BufferedReader(new FileReader(ruta));

			String contacto = buffer.readLine();

			while (contacto != null) {

				String[] arrayContacto = contacto.split(",");

				listaContactos.add("Apellidos: " + arrayContacto[0] + "\nNombre: " + arrayContacto[1] + "\nTeléfono: "
						+ arrayContacto[2]);

				contacto = buffer.readLine();

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Agenda no encontrada");
		} catch (IOException e) {
			System.out.println("Error al leer la agenda.");
		}

		return listaContactos;

	}

}