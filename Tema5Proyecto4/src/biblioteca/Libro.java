package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual = 2025;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor[] autores) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;

	}

	// Pasamos a string
	public String toString() {

		// Si falta el isbn o autores, devolvemos una cadena con el título sólo.
		if (isbn == null || autores == null) {
			return "Título: " + titulo;
		}

		// Si sólo hay un autor, en la cadena devuelta mostramos el nombre de ese
		// autor.
		if (autores.length == 1) {
			return "Título: " + titulo + "\nISBN: " + isbn + "\nAño actual: " + anyoActual + "\nAutor: "
					+ autores[0].getNombre();
		}

		// Si hay varios autores, en la cadena vuelta mostramos "Varios autores".
		return "Título: " + titulo + "\nISBN: " + isbn + "\nAño actual: " + anyoActual + "\nVarios autores";

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

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

}
