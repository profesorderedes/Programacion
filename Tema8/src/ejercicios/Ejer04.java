package ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		File web = new File(System.getProperty("user.home") + "/web");
		web.mkdir();

		final String NOMBRE_ARCHIVO = web + "/index.html";

		datosHtml(NOMBRE_ARCHIVO);

	}

	private static void datosHtml(String nombreArchivo) {

		Scanner teclado = new Scanner(System.in);

		try {

			FileWriter archivo = new FileWriter(nombreArchivo);
			BufferedWriter buffer = new BufferedWriter(archivo);

			System.out.println("Título de la página: ");

			String title = teclado.nextLine();

			buffer.write("<html>" + "<head><title>" + title + "</title></head>");

			System.out.println("Encabezado de la página: ");
			String h1 = teclado.nextLine();

			buffer.write("<body><h1>" + h1 + "</h1>");

			System.out.println("Contenido de la página: ");
			String parrafo = teclado.nextLine();

			buffer.write("<p>" + parrafo + "</p>" + "</body>" + "</html>");

			System.out.println("\nSe ha creado la página en tu carpeta personal. De nada.");

			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al abrir el archivo");
			e.printStackTrace();
		}

	}

}