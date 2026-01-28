package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	public Libro(String titulo) {
		this(titulo, "Unknown", null);
	}

	public String toString() {

		if (autores != null) {
			if (autores.length == 1) {
				return "\nTítulo: " + titulo + "\nISBN: " + isbn + "\nAutor: " + autores[0].getNombre() + " ("
						+ autores[0].getFechaNacimiento() + ")";
			} else {
				return "\nTítulo: " + titulo + "\nISBN: " + isbn + "\nAutor: Varios autores";
			}

		}

		return "\nTítulo: " + titulo + "\nISBN: " + isbn + "\nAutor: Anónimo";
	}

	public void muestraAutores() {

		System.out.println("\nAutores:");
		for (int i = 0; i < autores.length; i++) {
			System.out.println("  - " + autores[i].getNombre());
		}

	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}

}
