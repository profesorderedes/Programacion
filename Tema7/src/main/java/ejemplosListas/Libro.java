package ejemplosListas;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn;

	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		} else if (this == obj) {
			return true;
		} else if (getClass() != obj.getClass()) {
			return false;
		}

		Libro otroLibro = (Libro) obj;

		if (titulo.equals(otroLibro.getTitulo()) && autor.equals(otroLibro.getAutor())) {
			return true;
		} else {
			return false;
		}

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
