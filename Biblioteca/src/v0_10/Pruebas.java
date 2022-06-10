package v0_10;

public class Pruebas {

	public static void crearLibros(Biblioteca biblioteca) {

		String[] autores1 = { "Raoul-Gabriel Urma", "Mario Fusco", "Alan Mycroft" };
		String[] autores2 = { "Charles Dickens" };
		String[] autores3 = { "Stephen King", "Peter Straub" };
		String[] autores4 = { "Nicholas Montsarrat" };
		String[] autores5 = { "Kathy Sierra", "Bert Bates" };

		Libro libro1 = new Libro("Grandes esperanzas", autores2, "Alfaguara", 2000);
		Libro libro2 = new Libro("Canción de Navidad", autores2, "Alfaguara", 1995);
		Libro libro3 = new Libro("Casa negra", autores3, "Alianza", 1997);
		Libro libro4 = new Libro("Mar cruel", autores4, "Alianza", 1997);
		Libro libro5 = new Libro("Head first Java", autores5, "O'Reilly", 2005);
		Libro libro6 = new Libro("Modern Java in Action: Lambdas, streams, functional and reactive programming",
				autores1, "Manning", 2018);

	}

}
