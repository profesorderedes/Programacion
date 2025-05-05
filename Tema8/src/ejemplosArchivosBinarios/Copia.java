package ejemplosArchivosBinarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copia {
	public static void main(String[] args) {
		
		System.out.println("Accediendo al disco ...");
		try {
			FileInputStream entrada = new FileInputStream("ficheros/blackrain.jpg");
			FileOutputStream salida = new FileOutputStream("ficheros/copiablackrain.jpg");
			
			int byteLeido = entrada.read();
			while (byteLeido != -1) {
				System.out.println(" " + byteLeido);
				salida.write(byteLeido);
				byteLeido = entrada.read();
			}
			
			entrada.close();
			salida.close();
			
		} catch (IOException e) {
			System.out.println("Errorcillo: " + e.toString());
		}
	}
}