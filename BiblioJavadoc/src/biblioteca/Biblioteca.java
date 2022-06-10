package biblioteca;

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

	/**
	 * Colección de libros almacenados
	 */
	private Libro[] libros;

	/**
	 * Número de libros que hay en la biblioteca
	 */
	private int numLibros;

	/**
	 * Identificador que recibirá el nuevo libro que se añada a la biblioteca
	 */
	private int idNuevoLibro;

	/**
	 * Inicializa un objeto Biblioteca recién creado.
	 * 
	 * @param maxLibros máximo de libros que caben en la biblioteca
	 */
	public Biblioteca(int maxLibros) {

		libros = new Libro[maxLibros];
		numLibros = 0;
		idNuevoLibro = 1;

	}

	/**
	 * Añade un libro a la biblioteca.
	 * 
	 * @param libro libro que vamos a añadir
	 * @return true si se ha podido añadir el libro y false si no había sitio en la
	 *         biblioteca
	 */
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

	/**
	 * Lista los libros registrados en la biblioteca (id, título, autor, editorial y
	 * año de publicación)
	 */
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

	/**
	 * Elimina todos los datos del libro cuyo id recibe como parámetro.
	 * 
	 * @param idLibro identificador del libro
	 */
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

	/**
	 * Busca la posición del libro cuyo identificador recibe como parametro.
	 * 
	 * @param idLibro identificador del libro
	 * @return la posición del libro o -1 si el libro no se encuentra
	 */
	public int buscarLibro(int idLibro) {

		for (int i = 0; i < numLibros; i++) {

			if (idLibro == libros[i].getId()) {
				return i;
			}

		}

		return -1;

	}

	/**
	 * Actualiza los datos de un libro existente con los de un libro que recibe como
	 * parámetro
	 * 
	 * @param libro libro cuyo id buscaremos en el array libros y cuyos datos
	 *              sustituiremos en la posición que ocupa
	 */
	public void modificaLibro(Libro libro) {

		int pos = buscarLibro(libro.getId());
		if (pos != -1) {
			libros[pos] = libro;
		}

	}

	/**
	 * Devuelve un objeto Libro a partir del identificador proporcionado y, en caso
	 * de no existir, devolverá null.
	 * 
	 * @param idLibro Identificador del libro
	 * @return un objeto Libro almacenado en la biblioteca cuyo identificador se ha
	 *         recibido como parámetro y, en caso de no encontrarse, se devolverá
	 *         null
	 */
	public Libro obtenerLibro(int idLibro) {

		int pos = buscarLibro(idLibro);
		if (pos != -1) {
			return libros[pos];
		}

		return null;

	}

	/**
	 * Devuelve el número de libros registrados en la biblioteca
	 * 
	 * @return el número total de libros
	 */
	public int numLibros() {
		return numLibros;
	}

}
