package ejemplosArchivosTexto;

import java.io.File;

public class Ejemplo04File {
	
	public static void main(String[] args) {
		
		File configuracion = new File("ficheros/configuracion");
		
		boolean carpetaCreada = configuracion.mkdir();
		
		if(carpetaCreada) {
			System.out.println("Se ha creado la carpeta.");
		}else {
			System.out.println("No se ha creado la carpeta.");
		}
	}

}
