package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

		String sql = "delete from libros where autor=?";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, autor);

			int numFilas = stmt.executeUpdate();

			System.out.println("Se han borrado " + numFilas + " filas.");

		} catch (SQLException e) {
			System.out.println("Error accediendo a la base de datos.");
		}

	}

}
