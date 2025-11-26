package ejemplosCadenas;

public class Ejemplo05IndexOf {

	public static void main(String[] args) {

		String frase = "el lenguaje de programación Java fue creado el año 1995, por el programador James Gosling.";
		
		System.out.println("Apariciones de la palabra 'el': ");
		
		System.out.println("Primera: " + frase.indexOf("el"));
		
		// Podemos pedirle a indexOf que busque a partir de la posición 2, por ejemplo:
		System.out.println("Segunda: " + frase.indexOf("el", 2));
		
		// Le pedimos a indexOf que busque a partir de la posición 46.
		System.out.println("Tercera: " + frase.indexOf("el", 46));
		
		// Le pedimos que busque a partir de la posición 63.
		System.out.println("Cuarta: " + frase.indexOf("el", 63));

	}

}
