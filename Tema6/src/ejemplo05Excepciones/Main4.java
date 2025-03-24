package ejemplo05Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main4 {

	public static void main(String[] args) {
		try {
			abrirArchivo();
		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");
		}
	}

	// Una alternativa a usar try-catch en abrirArchivo es
	// pasarle la responsabilidad de gestionar la excepción
	// al método que ha llamado a abrirArchivo().
	// Esto se hace con "throws".
	public static void abrirArchivo() throws FileNotFoundException {

		FileReader archivo = new FileReader("unarchivo.txt");

	}

}
