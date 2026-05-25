package rolBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class AccesoPersonajes {

	private static String url = "jdbc:mysql://localhost/rol";
	private static String usuario = "rol";
	private static String password = "Ageofempires2";

	public static List<Personaje> leer() {

		List<Personaje> personajes = new ArrayList<>();
		String sql = "SELECT nick, inicio, rol, avatar, fuerza, salud, armadura, magia FROM personajes";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			ResultSet resultado = stmt.executeQuery(sql);

			while (resultado.next()) {

				String nick = resultado.getString("nick");
				LocalDate inicio = LocalDate.parse(resultado.getString("inicio"));
				String rol = resultado.getString("rol");
				String avatar = resultado.getString("avatar");

				Map<String, Integer> caracteristicas = new HashMap<>();

				caracteristicas.put("fuerza", resultado.getInt("fuerza"));
				caracteristicas.put("salud", resultado.getInt("salud"));
				caracteristicas.put("armadura", resultado.getInt("armadura"));
				caracteristicas.put("magia", resultado.getInt("magia"));

				Personaje personaje = new Personaje(nick, inicio, rol, avatar, caracteristicas);

				personajes.add(personaje);

			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(),
					"Personajes del juego", JOptionPane.ERROR_MESSAGE);
		}

		return personajes;

	}

	public static void guardar(List<Personaje> personajes) {

		String sql = "INSERT INTO personajes (nick, inicio, rol, avatar, fuerza, salud, armadura, magia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		String delete = "DELETE FROM personajes";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement del = con.createStatement();
				PreparedStatement insert = con.prepareStatement(sql)) {

			del.executeUpdate(delete);

			for (Personaje personaje : personajes) {

				insert.setString(1, personaje.getNick());
				insert.setDate(2, Date.valueOf(personaje.getInicio()));
				insert.setString(3, personaje.getRol());
				insert.setString(4, personaje.getAvatar());
				insert.setInt(5, personaje.getCaracteristicas().get("fuerza"));
				insert.setInt(6, personaje.getCaracteristicas().get("salud"));
				insert.setInt(7, personaje.getCaracteristicas().get("armadura"));
				insert.setInt(8, personaje.getCaracteristicas().get("magia"));

				insert.executeUpdate();

			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(),
					"Personajes del juego", JOptionPane.ERROR_MESSAGE);
		}

	}

}