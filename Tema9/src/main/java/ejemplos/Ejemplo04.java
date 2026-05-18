package ejemplos;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Credenciales de acceso a la base de datos.
		String usuario = "librero";
		String password = "Ageofempires2";
		String url = "jdbc:mysql://localhost/Libreria";

		System.out.println("Escribe un autor: ");
		String autor = entrada.nextLine();
		
		borrar(usuario, password, url, autor);

	}

	private static void borrar(String usuario, String password, String url, String autor) {
		
		
		
	}
	

}
