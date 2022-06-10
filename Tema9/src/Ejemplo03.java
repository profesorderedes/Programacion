import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Ejemplo03 {

	public static void main(String[] args) {

		try {
			// Abrimos el archivo para escritura.
			FileOutputStream archivo = new FileOutputStream("ficheros/numeros.txt");

			// Creamos un buffer para acceder al archivo.
			BufferedOutputStream buffer = new BufferedOutputStream(archivo);

			// Escribimos en el archivo los números del 50 al 100.
			for (int i = 50; i <= 100; i++) {
				buffer.write(i);
			}

			// Cerramos el buffer.
			buffer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
