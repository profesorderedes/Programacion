package ejemplo05Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

// Resuelve el error de este código de manera que si no
// se encuentra el archivo que se está intentando abrir,
// se muestre un mensaje "Archivo no encontrado".

public class Ejercicio {

	public static void main(String[] args) {

		try {
			FileReader archivo = new FileReader("unarchivo.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");
		} catch (Exception e) {
			System.out.println("Error al intentar abrir el archivo.");
		}
	}

}
