package ejemplosArchivosBinarios;

import java.io.FileInputStream;
import java.io.IOException;

public class LectorBytes {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream archivo = new FileInputStream("ficheros/miarchivo.txt");
			int contador = 0;
			
			int byteLeido = archivo.read();
			while (byteLeido != -1) {
				System.out.print(byteLeido + " ");
				contador++;
				byteLeido = archivo.read();
			}
			
			System.out.println("\nTotal bytes: " + contador);
			archivo.close();
			
		} catch (IOException e) {
			System.out.println("Errorcillo: " + e.toString());
		}
	}
}