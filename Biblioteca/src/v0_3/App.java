package v0_3;

public class App {

	public static void main(String[] args) {

//		String[] autores1 = { "Raoul-Gabriel Urma", "Mario Fusco", "Alan Mycroft" };
//
//		Libro libro1 = new Libro("Modern Java in Action: Lambdas, streams, functional and reactive programming",
//				autores1, "Manning", 2018);
//
//		System.out.println(libro1.obtenerCadenaAutores());
//		System.out.println("\n" + libro1.toString());

		Libro libro1 = new Libro("Grandes esperanzas", new String[] { "Charles Dickens" }, "Alfaguara", 2000);
		Libro libro2 = new Libro("Canción de Navidad", new String[] { "Charles Dickens" }, "Alfaguara", 1995);
		Libro libro3 = new Libro("Casa negra", new String[] { "Stephen King", "Peter Straub" }, "Pocket", 2018);
		Libro libro4 = new Libro("Mar cruel", new String[] { "Nicholas Montsarrat" }, "Alianza", 1997);

		Biblioteca biblioteca = new Biblioteca(100);

		biblioteca.addLibro(libro1);
		biblioteca.addLibro(libro2);
		biblioteca.addLibro(libro3);
		biblioteca.addLibro(libro4);

		biblioteca.listarLibros();

		System.out.println("\nBorrando el elemento con id 2...");
		biblioteca.delLibro(2);
		biblioteca.listarLibros();

		System.out.println("\nAñadimos un nuevo libro...");
		Libro libro5 = new Libro("Head first Java", new String[] { "Kathy Sierra", "Bert Bates" }, "O'Reilly", 2005);
		biblioteca.addLibro(libro5);
		biblioteca.listarLibros();
		
		// Probamos el método buscarLibro().
		System.out.println("\nEl libro con id 5 está en la "
				+ "posición " + biblioteca.buscarLibro(5));
		System.out.println("El libro con id 100 está en la "
				+ "posición " + biblioteca.buscarLibro(100));
		
	}

}
