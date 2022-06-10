package v0_9;

/**
 * La clase Biblioteca almacena la información de una colección de libros.
 * <p>
 * Incluye métodos para añadir, eliminar, modificar, etc., libros.
 * 
 * @see Libro
 * @author Carlos Sogorb
 * @version 0.8, 19 May 2022
 *
 */
public class Biblioteca {

	private Libro[] libros;
	private int numLibros;
	private int idNuevoLibro;

	public Biblioteca(int maxLibros) {

		libros = new Libro[maxLibros];
		numLibros = 0;
		idNuevoLibro = 1;

	}

	// Añade un libro a la biblioteca.
	public boolean addLibro(Libro libro) {

		if (numLibros >= libros.length) {
			return false;
		}

		libro.setId(idNuevoLibro);
		libros[numLibros] = libro;

		numLibros++;
		idNuevoLibro++;

		return true;

	}

	public void listarLibros() {

		System.out.println("LISTADO DE LIBROS");
		System.out.println("============================================");

		System.out.printf("%5s %-40s %-30s %-20s %-4s\n", "Id", "Título", "Autor", "Editorial", "Año");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < numLibros; i++) {

			int id = libros[i].getId();
			String titulo = libros[i].getTitulo();
			String autor = libros[i].obtenerCadenaAutores();
			String editorial = libros[i].getEditorial();
			int anyo = libros[i].getAnyoPublicacion();

			System.out.printf("%5d %-40s %-30s %-20s %-4d\n", id, titulo, autor, editorial, anyo);

		}

	}

	public void delLibro(int idLibro) {

		int pos = buscarLibro(idLibro);

		if (pos == -1) {
			return;
		}

		for (int i = pos; i < numLibros - 1; i++) {

			libros[i] = libros[i + 1];

		}

		libros[numLibros - 1] = null;

		numLibros--;

	}

	public int buscarLibro(int idLibro) {

		for (int i = 0; i < numLibros; i++) {

			if (idLibro == libros[i].getId()) {
				return i;
			}

		}

		return -1;

	}

	public void modificaLibro(Libro libro) {

		int pos = buscarLibro(libro.getId());
		if (pos != -1) {
			libros[pos] = libro;
		}

	}

	public Libro obtenerLibro(int idLibro) {

		int pos = buscarLibro(idLibro);
		if (pos != -1) {
			return libros[pos];
		}

		return null;

	}

	public int numLibros() {
		return numLibros;
	}

}
