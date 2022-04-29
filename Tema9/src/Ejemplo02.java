import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo02 {

	public static void main(String[] args) {

		try {

			// Abrimos el archivo original para lectura.
			FileInputStream original = 
					new FileInputStream("ficheros/cometa.jpg");

			// Abrimos el archivo copia para escritura.
			FileOutputStream copia = 
					new FileOutputStream("ficheros/copia.jpg");

			// Leemos el primer byte del archivo original.
			int byteLeido = original.read();

			// Guardamos cada byte leído y leemos el siguiente.
			while (byteLeido != -1) {

				copia.write(byteLeido);
				byteLeido = original.read();

			}

			// Cerramos los dos archivos.
			original.close();
			copia.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
