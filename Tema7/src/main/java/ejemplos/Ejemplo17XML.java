package ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejemplo17XML {

	private static final File ARCHIVO = new File("coches.xml");

	private static List<Coche> coches = new ArrayList<>();

	public static void main(String[] args) {

		coches = new ArrayList<>();

		try {

			leerCoche();

		} catch (ParserConfigurationException | SAXException | IOException e) {

			e.printStackTrace();

		}

	}

	private static void leerCoche() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(ARCHIVO);

		NodeList listaCoches = doc.getElementsByTagName("coche");

		for (int i = 0; i < listaCoches.getLength(); i++) {

			Node nodoCoche = listaCoches.item(i);
			Element elementoCoche = (Element) nodoCoche;

			String marca = elementoCoche.getElementsByTagName("marca").item(0).getTextContent();
			String color = elementoCoche.getElementsByTagName("color").item(0).getTextContent();
			String matricula = elementoCoche.getElementsByTagName("matricula").item(0).getTextContent();

			String potencia = elementoCoche.getAttribute("potencia");
			String puertas = elementoCoche.getAttribute("puertas");

			// Suponemos que el atributo puertas en el xml no es obligatorio y puede no aparecer.
			Coche coche;
			if (puertas.equals("")) {
				coche = new Coche(Integer.parseInt(potencia), 5, marca, color, matricula);
			} else {
				coche = new Coche(Integer.parseInt(potencia), Integer.parseInt(puertas), marca, color, matricula);
			}

			coches.add(coche);

			System.out.println(coche.toString());

		}

	}

}