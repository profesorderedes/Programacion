import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Pruebas {

	public static void main(String[] args) {

		Map<String, Integer> carac1 = new HashMap<>();

		carac1.put("fuerza", 6);
		carac1.put("salud", 8);
		carac1.put("armadura", 6);
		carac1.put("magia", 6);

		Personaje perso1 = new Personaje("Asuka", LocalDate.parse("2026-04-03"), "Guerrera", "guerrera.png", carac1);

		Map<String, Integer> carac2 = new HashMap<>();

		carac2.put("fuerza", 4);
		carac2.put("salud", 7);
		carac2.put("armadura", 2);
		carac2.put("magia", 2);

		Personaje perso2 = new Personaje("Finnian", LocalDate.parse("2026-04-02"), "Monje", "monje.png", carac2);

//		System.out.println(perso1.toString());
//		System.out.println("\n" + perso2.toString());
		
		List<Personaje> personajes = null;
		try {
			personajes = AccesoPersonajes.leer();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < personajes.size(); i++) {
			System.out.println(personajes.get(i).toString());
		}
		

	}

}




