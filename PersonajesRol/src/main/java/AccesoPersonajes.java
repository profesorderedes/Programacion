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

	public static void guardar(List<Personaje> personajes)
			throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation domImplementation = builder.getDOMImplementation();
		Document doc = domImplementation.createDocument(null, "personajes", null);

		for (Personaje personaje : personajes) {

			// Elemento personaje
			Element elmPer = doc.createElement("personaje");

			// Atributo inicio
			elmPer.setAttribute("inicio", "" + personaje.getInicio());

			// Atributo nick
			elmPer.setAttribute("nick", personaje.getNick());

			// Elemento rol
			Element elmRol = doc.createElement("rol");
			Text txtRol = doc.createTextNode(personaje.getRol());
			elmRol.appendChild(txtRol);

			elmPer.appendChild(elmRol);

			// Elemento avatar
			Element elmAvatar = doc.createElement("avatar");
			Text txtAvatar = doc.createTextNode(personaje.getAvatar());
			elmAvatar.appendChild(txtAvatar);
			elmPer.appendChild(elmAvatar);

			// Elemento caracteristicas
			Element elmCarac = doc.createElement("caracteristicas");

			// Elemento fuerza
			Element elmFuerza = doc.createElement("fuerza");
			Text txtFuerza = doc.createTextNode("" + personaje.getCaracteristicas().get("fuerza"));
			elmFuerza.appendChild(txtFuerza);

			elmCarac.appendChild(elmFuerza);

			// Elemento salud
			Element elmSalud = doc.createElement("salud");
			Text txtSalud = doc.createTextNode("" + personaje.getCaracteristicas().get("salud"));
			elmSalud.appendChild(txtSalud);

			elmCarac.appendChild(elmSalud);

			// Elemento armadura
			Element elmArmadura = doc.createElement("armadura");
			Text txtArmadura = doc.createTextNode("" + personaje.getCaracteristicas().get("armadura"));
			elmArmadura.appendChild(txtArmadura);

			elmCarac.appendChild(elmArmadura);

			// Elemento magia
			Element elmMagia = doc.createElement("magia");
			Text txtMagia = doc.createTextNode("" + personaje.getCaracteristicas().get("magia"));
			elmMagia.appendChild(txtMagia);

			elmCarac.appendChild(elmMagia);

			elmPer.appendChild(elmCarac);

			doc.getDocumentElement().appendChild(elmPer);

		}

		Source source = new DOMSource(doc);
		Result result = new StreamResult(ARCHIVO);

		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		transformer.transform(source, result);

	}

}