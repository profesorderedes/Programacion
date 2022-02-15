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
}
