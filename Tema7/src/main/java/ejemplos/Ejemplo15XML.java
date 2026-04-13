package ejemplos;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejemplo15XML {

	private static final File ARCHIVO = new File("ubicaciones.xml");

	public static void main(String[] args) {

		try {
			leerUbicaciones();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}

	private static void leerUbicaciones() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(ARCHIVO);

		NodeList listaUbicaciones = doc.getElementsByTagName("ubicacion");

		System.out.println("Encontradas " + listaUbicaciones.getLength() + " ubicaciones.");

		for (int i = 0; i < listaUbicaciones.getLength(); i++) {

			Node ubicacion = listaUbicaciones.item(i);
			Element elementoUbicacion = (Element) ubicacion;

			String localidad = elementoUbicacion.getElementsByTagName("localidad").item(0).getTextContent();
			String diferenciaHoraria = elementoUbicacion.getElementsByTagName("diferenciaHoraria").item(0)
					.getTextContent();
			String horarioVerano = elementoUbicacion.getAttribute("horarioVerano");

			System.out.println(localidad + " - " + diferenciaHoraria + " - " + horarioVerano);

		}

	}

}
