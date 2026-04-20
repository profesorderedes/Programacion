import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AccesoPersonajes {

	private static final File ARCHIVO = new File("personajes.xml");

	public static List<Personaje> leer() throws ParserConfigurationException, SAXException, IOException {

		Personaje personaje;

		List<Personaje> personajes = new ArrayList<>();

		Map<String, Integer> carac;

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(ARCHIVO);

		NodeList lstPersonajes = doc.getElementsByTagName("personaje");

		for (int i = 0; i < lstPersonajes.getLength(); i++) {

			Node nodoPers = lstPersonajes.item(i);
			Element elmPers = (Element) nodoPers;

			String inicio = elmPers.getAttribute("inicio");
			String nick = elmPers.getAttribute("nick");

			String rol = elmPers.getElementsByTagName("rol").item(0).getTextContent();
			String avatar = elmPers.getElementsByTagName("avatar").item(0).getTextContent();

			Node nodeCarac = elmPers.getElementsByTagName("caracteristicas").item(0);
			Element elmCarac = (Element) nodeCarac;

			String fuerza = elmCarac.getElementsByTagName("fuerza").item(0).getTextContent();
			String salud = elmCarac.getElementsByTagName("salud").item(0).getTextContent();
			String armadura = elmCarac.getElementsByTagName("armadura").item(0).getTextContent();
			String magia = elmCarac.getElementsByTagName("magia").item(0).getTextContent();

			carac = new HashMap<>();
			carac.put("fuerza", Integer.parseInt(fuerza));
			carac.put("salud", Integer.parseInt(salud));
			carac.put("armadura", Integer.parseInt(armadura));
			carac.put("magia", Integer.parseInt(magia));

			personaje = new Personaje(nick, LocalDate.parse(inicio), rol, avatar, carac);

			personajes.add(personaje);

		}

		return personajes;

	}

}