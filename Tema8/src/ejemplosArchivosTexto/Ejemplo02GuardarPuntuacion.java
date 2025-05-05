package ejemplosArchivosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo02GuardarPuntuacion {
	
	public static void main(String[] args) {
		
		final String NOMBRE_ARCHIVO = "ficheros/puntuaciones.txt";
		
		escribir(NOMBRE_ARCHIVO);
		
	}
	
	private static void escribir(String nombreArchivo) {
		
		try {
			FileWriter archivo = new FileWriter(nombreArchivo, true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write("Juan -> 900 puntos\n");
			
			buffer.close();
			
			
		} catch (IOException e) {
			System.out.println("Error al abrir el archivo.");
			e.printStackTrace();
		}
		
	}

}





