package ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Título de la página: ");
		String title = entrada.nextLine();

		System.out.print("Encabezado de la página: ");
		String h1 = entrada.nextLine();

		System.out.print("Contenido de la página: ");
		String p = entrada.nextLine();

		if (crearArchivoHTML(title, h1, p)) {
			System.out.println("Se ha creado la página en tu carpeta personal. De nada.");
		}
	}

	private static boolean crearArchivoHTML(String title, String h1, String p) {

		try {

			File carpeta = new File(System.getProperty("user.home") + "/ejercicio4");
			carpeta.mkdir();

			BufferedWriter html = new BufferedWriter(
					new FileWriter(System.getProperty("user.home") + "/ejercicio4/index.html"));

			html.write(
					"<!DOCTYPE html>\n<html lang=\"es\">\n\n<head>\n\t<meta charset=\"UTF-8\">\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\t<title>"
							+ title + "</title>\n</head>\n\n<body>\n\t<h1>" + h1 + "</h1>\n\t<p>" + "\n\t\t" + p
							+ "\n\t</p>\n</body>\n\n</html>");

			html.close();
			return true;

		} catch (IOException e) {
			System.out.println("Error al crear el archivo HTML");
			return false;
		}

	}

}