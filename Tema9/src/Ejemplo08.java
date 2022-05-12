import java.io.File;

public class Ejemplo08 {
	
	public static void main(String[] args) {
		
		// Creamos una carpeta "configuración" en la carpeta
		// del proyecto.
		
		File carpeta = new File("configuracion");
		boolean creada = carpeta.mkdir();
		
		if(creada) {
			System.out.println("La carpeta se ha creado.");
		}else {
			System.out.println("La carpeta no se ha creado.");
		}
		
		// Creamos una ruta con varias carpetas.
		
		File ruta = new File("diogenes/datos/carlos");
		
		if(ruta.mkdirs()) {
			System.out.println("La ruta se ha creado.");
		}else {
			System.out.println("La ruta no se ha creado.");
		}
		
		// Creamos una carpeta llamada "ejemplo08" en nuestra 
		// carpeta personal.
		
		String rutaEjemplo = System.getProperty("user.home") 
				+ "/ejemplo08";
		
		File ejemplo = new File(rutaEjemplo);
		creada = ejemplo.mkdir();
		
		if(creada) {
			System.out.println("Carpeta ejemplo08 creada.");
		}else {
			System.out.println("Carpeta ejemplo08 creada.");
		}
				
				
				
	}

}
