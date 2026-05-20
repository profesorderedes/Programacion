package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Credenciales de acceso a la base de datos.
		String usuario = "librero";
		String password = "Ageofempires2";
		String url = "jdbc:mysql://localhost/Libreria";

		System.out.println("*** ALTA DE LIBRO ***");

		System.out.print("Título: ");
		String titulo = entrada.nextLine();

		System.out.print("Autor: ");
		String autor = entrada.nextLine();

		System.out.print("Precio: ");
		double precio = entrada.nextDouble();

		System.out.print("Número de ejemplares: ");
		int cantidad = entrada.nextInt();

		crearLibro(usuario, password, url, new Libro(titulo, autor, precio, cantidad));

	}

	private static void crearLibro(String usuario, String password, String url, Libro libroNuevo) {

		String sql = "insert into libros(titulo, autor, precio, cantidad) values (?, ?, ?, ?)";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, libroNuevo.getTitulo());
			stmt.setString(2, libroNuevo.getAutor());
			stmt.setDouble(3, libroNuevo.getPrecio());
			stmt.setInt(4, libroNuevo.getCantidad());

			int numFilas = stmt.executeUpdate();

			System.out.println("Se han actualizado " + numFilas + " filas.");

		} catch (SQLException e) {
			System.out.println("Error accediendo a la base de datos.");
		}

	}

}

//@formatter:off


































//@formatter:on
