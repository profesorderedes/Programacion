package ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Ejemplo16XML {

	private static final File ARCHIVO = new File("ubicaciones.xml");
	private static List<Ubicacion> ubicaciones;

	public static void main(String[] args) {

		ubicaciones = new ArrayList<>();

		try {
			leerUbicaciones();
			guardarUbicaciones();
		} catch (ParserConfigurationException | SAXException | IOException | TransformerFactoryConfigurationError
				| TransformerException e) {
			e.printStackTrace();
		}

		for (Ubicacion ubicacion : ubicaciones) {
			System.out.println("Localidad: " + ubicacion.getLocalidad());
			System.out.println("Diferencia horaria: " + ubicacion.getDiferenciaHoraria());
			System.out.println("Horario de verano: " + ubicacion.isHorarioVerano());
			System.out.println("---");
		}

	}

	private static void leerUbicaciones() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(ARCHIVO);

		NodeList listaUbicaciones = doc.getElementsByTagName("ubicacion");

		System.out.println("Encontradas " + listaUbicaciones.getLength() + " ubicaciones.");

		for (int i = 0; i < listaUbicaciones.getLength(); i++) {

			Node nodoUbicacion = listaUbicaciones.item(i);
			Element elementoUbicacion = (Element) nodoUbicacion;

			String localidad = elementoUbicacion.getElementsByTagName("localidad").item(0).getTextContent();
			String diferenciaHoraria = elementoUbicacion.getElementsByTagName("diferenciaHoraria").item(0)
					.getTextContent();
			String horarioVerano = elementoUbicacion.getAttribute("horarioVerano");

			Ubicacion ubicacion = new Ubicacion(localidad, Double.parseDouble(diferenciaHoraria),
					Boolean.parseBoolean(horarioVerano));

			ubicaciones.add(ubicacion);

			System.out.println(ubicacion.toString());

		}

	}

	private static void guardarUbicaciones()
			throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation domImplementation = builder.getDOMImplementation();

		Document doc = domImplementation.createDocument(null, "ubicaciones", null);

		for (Ubicacion ubicacion : ubicaciones) {

			// Elemento ubicacion
			Element elementoUbicacion = doc.createElement("ubicacion");

			// Elemento localidad
			Element localidad = doc.createElement("localidad");
			Text textoLocalidad = doc.createTextNode(ubicacion.getLocalidad());
			localidad.appendChild(textoLocalidad);
			elementoUbicacion.appendChild(localidad);

			// Elemento diferenciaHoraria
			Element diferenciaHoraria = doc.createElement("diferenciaHoraria");
			Text textoDiferenciaHoraria = doc.createTextNode("" + ubicacion.getDiferenciaHoraria());
			diferenciaHoraria.appendChild(textoDiferenciaHoraria);
			elementoUbicacion.appendChild(diferenciaHoraria);

			// Atributo horarioVerano
			elementoUbicacion.setAttribute("horarioVerano", "" + ubicacion.isHorarioVerano());

			// Elemento ubicaciones.
			doc.getDocumentElement().appendChild(elementoUbicacion);

		}

		// Guardamos el documento doc en disco.

		Source source = new DOMSource(doc);
		Result result = new StreamResult(ARCHIVO);

		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		transformer.transform(source, result);

	}

}

//@formatter:off

















//@formatter:on
