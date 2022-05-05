import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo05 {
	
	public static void main(String[] args) {
		
		try {
			
			// Abrimos el archivo para lectura.
			FileReader archivo = new FileReader(
					"src/Ejemplo05.java");
			BufferedReader buffer = new BufferedReader(archivo);
			
			// Vamos leyendo el archivo línea a línea.
			String linea = buffer.readLine();
			
			// Sabremos que hemos llegado al final del archivo
			// cuando linea valga null.
			while(linea != null) {
				
				System.out.println(linea);
				linea = buffer.readLine();
				
			}
			
			// Cerramos el archivo.
			buffer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
