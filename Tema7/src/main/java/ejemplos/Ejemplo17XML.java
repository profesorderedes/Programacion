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

public class Ejemplo17XML {

	private static final File ARCHIVO = new File("coches.xml");
	private static final File ARCHIVO2 = new File("coches2.xml");

	private static List<Coche> coches = new ArrayList<>();

	public static void main(String[] args) {

		coches = new ArrayList<>();

		try {

			leerCoches();
			guardarCoches();

		} catch (ParserConfigurationException | SAXException | IOException | TransformerFactoryConfigurationError
				| TransformerException e) {

			e.printStackTrace();

		}

	}

	private static void leerCoches() throws ParserConfigurationException, SAXException, IOException {

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

			// Suponemos que el atributo puertas en el xml no es obligatorio y puede no
			// aparecer.
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

	private static void guardarCoches()
			throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation domImplementation = builder.getDOMImplementation();
		Document doc = domImplementation.createDocument(null, "coches", null);

		for (Coche coche : coches) {

			// Elemento coche
			Element elementoCoche = doc.createElement("coche");

			// Elemento marca
			Element marca = doc.createElement("marca");
			Text txtMarca = doc.createTextNode(coche.getMarca());
			marca.appendChild(txtMarca);

			elementoCoche.appendChild(marca);

			// Elemento color
			Element color = doc.createElement("color");
			Text txtColor = doc.createTextNode(coche.getColor());
			color.appendChild(txtColor);

			elementoCoche.appendChild(color);

			// Elemento matricula
			Element matricula = doc.createElement("matricula");
			Text txtMatricula = doc.createTextNode(coche.getMatricula());
			matricula.appendChild(txtMatricula);

			elementoCoche.appendChild(matricula);

			// Atributo potencia
			elementoCoche.setAttribute("potencia", "" + coche.getPotencia());

			// Atributo puertas
			elementoCoche.setAttribute("puertas", "" + coche.getPuertas());

			doc.getDocumentElement().appendChild(elementoCoche);

		}

		Source source = new DOMSource(doc);
		Result result = new StreamResult(ARCHIVO2);

		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		transformer.transform(source, result);

	}

}