package inventario2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccesoDiscoTexto {

	// Lee el archivo inventario.txt y devuelve el ArrayList con esos datos.
	public static List<Articulo> leerInventario(final File ARCHIVO) throws IOException {

		BufferedReader buffer = new BufferedReader(new FileReader(ARCHIVO));

		String linea = buffer.readLine();
		String nombre = "";
		double precio = 0;
		List<Articulo> articulos = new ArrayList<>();

		while (linea != null) {

			String[] lineaSeparada = linea.split(" = ");

			if (lineaSeparada[0].equals("NOMBRE")) {

				nombre = lineaSeparada[1];

			} else if (lineaSeparada[0].equals("PRECIO")) {

				precio = Double.parseDouble(lineaSeparada[1]);
				articulos.add(new Articulo(nombre, precio));

			}

			linea = buffer.readLine();

		}

		buffer.close();

		return articulos;

	}

	// Guarda el inventario en el archivo inventario.txt
	public static void guardarInventario(List<Articulo> articulos, final File ARCHIVO) {

	}

}
