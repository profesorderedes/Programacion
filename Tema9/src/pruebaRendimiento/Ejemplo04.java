package pruebaRendimiento;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejemplo04 {
	
	public static void main(String[] args) {
		
		long tiempoInicial = System.currentTimeMillis();
		
		try {
			// Abrimos el archivo para lectura.
			FileInputStream archivo = 
					new FileInputStream("ficheros/cometa.jpg");
			
			// Creamos un buffer de lectura.
			BufferedInputStream buffer = 
					new BufferedInputStream(archivo);
			
			// Leemos el primer byte del archivo.
			int byteLeido = buffer.read();
			
			// Vamos leyendo consecutivamente todos los bytes,
			// hasta llegar al final del archivo.
			while(byteLeido != -1) {
				
				System.out.println(byteLeido);
				byteLeido = buffer.read();
				
			}
			
			// Cerramos el archivo.
			buffer.close();
			
			System.out.println("\nTiempo transcurrido: " 
			+ (System.currentTimeMillis() - tiempoInicial)
			+ " ms.");
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
