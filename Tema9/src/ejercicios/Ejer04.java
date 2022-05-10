package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Título de la página: ");
		String titulo = entrada.nextLine();

		System.out.print("Encabezado de la página: ");
		String encabezado = entrada.nextLine();

		System.out.print("Contenido de la página: ");
		String contenido = entrada.nextLine();

		try {
			BufferedWriter buffer = 
					new BufferedWriter(
							new FileWriter("ficheros/index.html"));

			buffer.write("<!DOCTYPE html>\n");
			buffer.write("<html>\n<head>\n" + "<title>" + titulo + "</title>\n</head>\n");
			buffer.write("<body>\n<h1>" + encabezado + "</h1>\n");
			buffer.write("<p>" + contenido + "</p>\n");
			buffer.write("</body>\n</html>");

			buffer.close();

			System.out.println("Se ha creado la página en tu carpeta personal. De nada");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}