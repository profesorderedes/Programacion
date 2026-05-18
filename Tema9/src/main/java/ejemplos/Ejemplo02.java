package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Credenciales de acceso a la base de datos.
		String usuario = "librero";
		String password = "Ageofempires2";
		String url = "jdbc:mysql://localhost/Libreria";

		System.out.println("Escribe un autor: ");
		String autor = entrada.nextLine();

		listar(usuario, password, url, autor);

	}

	private static void listar(String usuario, String password, String url, String autor) {

		// Usamos un try-with-resources para no tener que cerrar manualmente los objetos
		// con y stmt.
		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			// Consulta SQL que queremos ejecutar.
			String sql = "select * from libros where autor='" + autor + "'";

			// Ejecutamos la consulta.
			ResultSet resultado = stmt.executeQuery(sql);

			while (resultado.next()) {

				System.out.println("Título: " + resultado.getString("titulo"));
				System.out.println("Autor: " + resultado.getString("autor"));
				System.out.println("Precio: " + resultado.getDouble("precio") + " euros.");
				System.out.println("Cantidad: " + resultado.getInt("cantidad") + " unidades.");
				System.out.println("       ***");
			}

			// No hace falta cerrar con ni stmt porque estamos usando un try-with-resources.
			// Todo lo que se ha creado al lado del try, entre paréntesis, se cierra
			// automáticamente al finalizar el bloque try.

		} catch (SQLException e) {
			System.out.println("Error al acceder a la base de datos.");
		}

	}

}
