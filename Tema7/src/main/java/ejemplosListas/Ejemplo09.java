package ejemplosListas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Ejemplo09 {

	public static void main(String[] args) {

		Map<String, Cliente> clientes = new HashMap<>();

		clientes.put("10000000R", new Cliente("Pedro", "López", LocalDate.parse("2000-02-23")));
		clientes.put("20000000R", new Cliente("Ana", "Martínez", LocalDate.parse("1990-01-01")));
		clientes.put("30000000R", new Cliente("Marisa", "Rodríguez", LocalDate.parse("1995-02-10")));

		// Mostramos el contenido del mapa.

		for (String clave : clientes.keySet()) {

			System.out.println("Clave = " + clave + "\nCliente: " + clientes.get(clave).toString());

		}

		// Ver si cierto cliente está en el hashmap.

		Cliente cli1 = new Cliente("Pedro", "López", LocalDate.parse("2000-02-23"));

		System.out.println(clientes.containsValue(cli1));

		// Ver si cierto DNI está en el hashmap.

		String dni1 = "1000023000R";

		System.out.println(clientes.containsKey(dni1));

	}

}
