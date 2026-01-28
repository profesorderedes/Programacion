package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public Libro(String titulo) {
		this(titulo, "Unknown", null);
	}

	public String toString() {

		if (autor != null) {
			return "\nTítulo: " + titulo + "\nISBN: " + isbn + "\nAutor: " + autor.getNombre() + " ("
					+ autor.getFechaNacimiento() + ")";
		}
		
		return "\nTítulo: " + titulo + "\nISBN: " + isbn + "\nAutor: Anónimo";
	}
	
	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}

}
