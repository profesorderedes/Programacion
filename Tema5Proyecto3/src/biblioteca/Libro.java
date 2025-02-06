package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private String autor;
	private static int anyoActual = 2025;

	public Libro() {
	}

	public Libro(String titulo) {

		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, String autor) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;

	}

	// Pasamos a string
	public String toString() {

		if (autor == null) {
			autor = "Unknown";
		}

		return "Titulo: " + titulo + "\nISBN: " + isbn + "\nAño actual: " + anyoActual + "\nAutor: " + autor;

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
