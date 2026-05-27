package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Credenciales de acceso a la base de datos.
		String usuario = "librero";
		String password = "Ageofempires2";
		String url = "jdbc:mysql://localhost/Libreria";

		System.out.println("Escribe el id de un libro: ");
		int id = entrada.nextInt();

		System.out.println("¿Cuántos ejemplares acaban de llegar?");
		int cantidad = entrada.nextInt();

		actualizar(usuario, password, url, id, cantidad);

	}

	private static void actualizar(String usuario, String password, String url, int id, int cantidad) {

		String sql = "update libros set cantidad = cantidad + ? where id = ?";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, cantidad);
			stmt.setInt(2, id);

			int numFilas = stmt.executeUpdate();

			System.out.println("Se han actualizado " + numFilas + " filas.");

		} catch (SQLException e) {
			System.out.println("Error accediendo a la base de datos.");
		}

	}

}
