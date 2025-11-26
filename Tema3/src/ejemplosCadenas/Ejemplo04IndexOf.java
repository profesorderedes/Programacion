package ejemplosCadenas;

public class Ejemplo04IndexOf {

	public static void main(String[] args) {

		String frase = "Si tú crees que puedes, puedes. Si tú crees que no puedes, no puedes. Tanto si piensas una cosa como la otra, estás en locierto (Henry Ford).";

		System.out.println("La palabra crees aparece en la posición " + frase.indexOf("crees"));

		System.out.println("La palabra luz aparece en la posición " + frase.indexOf("luz"));

		System.out.println("La palabra crees aparece por última vez, en la posición " + frase.lastIndexOf("crees"));

		System.out.println("La palabra luz aparece por última vez en la posición " + frase.lastIndexOf("luz"));

	}

}
