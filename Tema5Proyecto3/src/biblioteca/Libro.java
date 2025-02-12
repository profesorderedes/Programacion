package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual = 2025;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor autor) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;

	}

	// Pasamos a string
	public String toString() {

		if (isbn != null && autor.getNombre() != null) {
			return "Titulo: " + titulo + "\nISBN: " + isbn + "\nAño actual: " + anyoActual + "\nAutor:"
					+ autor.getNombre();
		}

		return "Título: " + titulo;

	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
