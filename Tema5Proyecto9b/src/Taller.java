
public class Taller {

	private int MAX_LAVADORAS = 4;
	private Lavadora[] lavadoras;

	// Variable que indica la posición donde se insertará la
	// próxima lavadora en el array.
	private int limite;

	public Taller() {
		lavadoras = new Lavadora[MAX_LAVADORAS];
		limite = 0;
	}

	public boolean addLavadora(Lavadora lav) {

		if (limite == lavadoras.length) {
			System.out.println("Lista llena");
			return false;
		}

		lavadoras[limite] = lav;
		limite++;

		return true;

	}

	// Inserta una nueva lavadora en la posición pos del array. El elemento que
	// estaba en esta posición y los siguientes se moverán una posición hacia 
	// abajo para dejar sitio.
	boolean addLavadora(int pos, Lavadora lav) {

		// Comprobamos que hay sitio en el array.

		// Movemos las posiciones pos y siguientes un sitio hacia abajo.

		// Insertamos la lavadora en su posición nueva.

	}

	public void listaLavadoras() {

		System.out.println("\n--- LISTADO DE LAVADORAS EN STOCK ---");
		for (int i = 0; i < limite; i++) {
			System.out.println(lavadoras[i].toString());
		}

	}

	public int buscaLavadora(int id) {

		for (int i = 0; i < limite; i++) {
			if (lavadoras[i].getId() == id) {
				return i;
			}
		}

		return -1;

	}

	public boolean delLavadora(int id) {

		// Averiguamos la posición en el array donde se encuentra la
		// lavadora.
		int pos = buscaLavadora(id);
		if (pos == -1) {
			System.out.println("Lavadora con id " + id + " no encontrada.");
			return false;
		}

		// Subimos cada lavadora una posición en el array, desde
		// la posición siguiente a la que ocupaba la lavadora.
		for (int i = pos; i < limite - 1; i++) {
			lavadoras[i] = lavadoras[i + 1];
		}

		// Actualizamos la variable limite.
		limite--;

		return true;

	}

	// Devuelve la suma de precios de todas las lavadoras del taller.
	public float totalLavadoras() {

		float total = 0;

		for (int i = 0; i < limite; i++) {
			total = total + lavadoras[i].getPrecio();
		}

		return total;

	}

	// Aplica un porcentaje de descuento a todas las lavadoras de cierta marca.
	public void descuentoLavadoras(String marca, float descuento) {

		float rebaja = 0;
		float precioConDescuento = 0;
		boolean hayLavadoras = false;

		for (int i = 0; i < limite; i++) {
			if (marca.equalsIgnoreCase(lavadoras[i].getMarca())) {
				rebaja = lavadoras[i].getPrecio() * descuento / 100;
				precioConDescuento = lavadoras[i].getPrecio() - rebaja;
				lavadoras[i].setPrecio(precioConDescuento);
				hayLavadoras = true;
			}
		}

		if (!hayLavadoras) {
			System.out.println("No hay lavadoras de " + marca + ".");
		}

	}

	// Devuelve el precio indicado sumándole el IVA indicado.
	public static double precioConIva(float precio, int iva) {

		if (iva < 0) {
			System.out.println("EL IVA no puede ser negativo.");
			return precio;
		}

		return precio + precio * iva / 100;

	}

	// Devuelve el número de espacios que quedan en el array lavadoras.
	public int lavadorasRestantes() {

		return lavadoras.length - limite;

	}

	// Muestra una lista con las lavadoras de cierta marca.
	public void marcaLavadora(String marca) {

		for (int i = 0; i < limite; i++) {

			if (marca.equals(lavadoras[i].getMarca())) {
				System.out.println(lavadoras[i].toString());
			}

		}

	}

	// Muestra las lavadoras ordenadas por precio.
	public void ordenarPorPrecio() {

		int posMin = 0;
		Lavadora aux;

		for (int i = 0; i < limite - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < limite; j++) {

				if (lavadoras[j].getPrecio() < lavadoras[posMin].getPrecio()) {
					posMin = j;
				}

			}

			aux = lavadoras[i];
			lavadoras[i] = lavadoras[posMin];
			lavadoras[posMin] = aux;

		}

		System.out.println("\nLavadoras ordenadas por precio de menor a mayor:");
		listaLavadoras();

	}

	public int contMarcas(String marca) {

		int marcas = 0;

		for (int i = 0; i < limite; i++) {

			if (lavadoras[i].getMarca().equalsIgnoreCase(marca)) {
				marcas++;
			}

		}

		return marcas;

	}

	// Muestra las lavadoras ordenadas por marca.
	public void ordernarPorMarca() {

		int posMin;
		Lavadora aux;

		for (int i = 0; i < limite - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < limite; j++) {
				if (lavadoras[j].getMarca().compareTo(lavadoras[posMin].getMarca()) < 0) {
					posMin = j;
				}
			}

			aux = lavadoras[i];
			lavadoras[i] = lavadoras[posMin];
			lavadoras[posMin] = aux;

		}

		System.out.println("\nLavadoras ordenadas alfabéticamente por marca:");
		listaLavadoras();

	}

	// Muestra las lavadoras ordenadas por el fabricante del motor.
	public void ordenarPorFabricanteMotor() {

		int posMin;
		Lavadora aux;

		for (int i = 0; i < limite - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < limite; j++) {

				if (lavadoras[j].getMotor().getFabricante()
						.compareTo(lavadoras[posMin].getMotor().getFabricante()) < 0) {
					posMin = j;
				}

			}

			aux = lavadoras[i];
			lavadoras[i] = lavadoras[posMin];
			lavadoras[posMin] = aux;

		}

		System.out.println("\nLavadoras ordenadas alfabéticamente por " + "fabricante del motor:");
		listaLavadoras();

	}

	// Devuelve la media de los precios de todas las lavadoras registradas.
	public float mediaPrecio() {

		return totalLavadoras() / limite;

	}

	// Ordena las lavadoras por id.
	public void ordenarPorId() {

		int posMin = 0;
		Lavadora aux;

		for (int i = 0; i < limite - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < limite; j++) {

				if (lavadoras[j].getId() < lavadoras[posMin].getId()) {
					posMin = j;
				}

			}

			aux = lavadoras[i];
			lavadoras[i] = lavadoras[posMin];
			lavadoras[posMin] = aux;

		}

		System.out.println("\nLavadoras ordenadas por id");

		listaLavadoras();

	}

	// Cuenta todas las marcas de motor diferentes sin que se repitan
	// y devuelve este número.

	public int contarMarcas() {
		return 0;
	}

	// Lista las lavadoras entre un rango de precios, incluyendo esos precios.
	public void lavadorasPorRangoDePrecio(double precioMin, double precioMax) {

		System.out.println("\nLavadoras en el rango de precios: " + precioMin + " - " + precioMax);

		boolean hayLavadoras = false;

		for (int i = 0; i < limite; i++) {

			double precio = lavadoras[i].getPrecio();

			if (precio >= precioMin && precio <= precioMax) {

				System.out.println(lavadoras[i].toString());
				hayLavadoras = true;

			}

		}

		if (!hayLavadoras) {
			System.out.println("No hay lavadoras en este rango de precios.");
		}

	}

	// Ordena las lavadoras por el id del motor.
	public void ordenarPorIdMotor() {

		int posMin = 0;
		Lavadora aux;

		for (int i = 0; i < limite - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < limite; j++) {

				if (lavadoras[j].getMotor().getId() < lavadoras[posMin].getMotor().getId()) {
					posMin = j;
				}

			}

			aux = lavadoras[i];
			lavadoras[i] = lavadoras[posMin];
			lavadoras[posMin] = aux;

		}

		System.out.println("\nLavadoras ordenadas por id del motor:");

		listaLavadoras();

	}
}
