
public class EjemploSplit {

	public static void main(String[] args) {

		// split(" ")
		String cadena = "Esto,es,la,clase,de,Programación";

		String[] palabras = cadena.split(",");

		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

	}

}
