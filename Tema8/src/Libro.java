
public class Libro {

	private String titulo;
	private String autor;

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	// libro1.equals(libro2)
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			// Si obj es null, entonces no es igual a nuestro
			// objeto.
			return false;
		} else if (obj == this) {
			// Si obj ocupa la misma posición de memoria que
			// nuestro objeto, entonces son el mismo.
			return true;
		} else if (obj instanceof Libro) {
			// Si obj es de tipo Libro, podemos hacer un cast
			// y verificar si tiene el mismo título y autor
			// que nuestro objeto.
			Libro libro = (Libro) obj;

			if (titulo.equals(libro.getTitulo()) && autor.equals(libro.getAutor())) {
				// Si el título y el autor coinciden, se
				// considerará que son iguales.
				return true;
			}
		}

		return false;

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

}
