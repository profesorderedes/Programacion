package biblioteca;

public class Libro {
	
	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;
	
	public Libro(String titulo) {
		
		this.titulo = titulo;
		
	}
	
	public Libro(String titulo, String isbn, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		
	}

	public String toString() {
		
		return "Título: " + titulo + "\nISBN: " + isbn 
				+ "\nAutor: " + autor.getNombre() 
				+ "\nAño actual: " + anyoActual;
		
	}

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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
	
	
	
}










