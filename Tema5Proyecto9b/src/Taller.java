
public class Taller {

	private int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras;

	// Variable que indica la posición donde se insertará la
	// próxima lavadora en el array.
	private int limite;

	public Taller() {
		lavadoras = new Lavadora[MAX_LAVADORAS];
		limite = 0;
	}

	public void addLavadora(Lavadora lav) {

		if (limite == lavadoras.length) {
			System.out.println("Lista llena");
			return;
		}

		lavadoras[limite] = lav;

		limite++;

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

	public void delLavadora(int id) {

		// Averiguamos la posición en el array donde se encuentra la
		// lavadora.
		int pos = buscaLavadora(id);
		if (pos == -1) {
			System.out.println("Lavadora con id " + id + " no encontrada.");
			return;
		}

		// Subimos cada lavadora una posición en el array, desde
		// la posición siguiente a la que ocupaba la lavadora.
		for (int i = pos; i < limite - 1; i++) {
			lavadoras[i] = lavadoras[i + 1];
		}

		// Actualizamos la variable limite.
		limite--;

	}

	// Devuelve la suma de precios de todas las lavadoras del taller.
	public float totalLavadoras() {
		return 0;
	}

	// Aplica un porcentaje de descuento a todas las lavadoras de cierta marca.
	public void descuentoLavadora(String marca, float descuento) {
		
	}

	// Devuelve el precio indicado sumándole el IVA indicado.
	double precioConIva(float precio, int iva) {
		return 0;
	}

	// Devuelve el número de espacios que quedan en el array lavadoras.
	public int lavadorasRestantes() {
		return 0;
	}

	// Muestra una lista con las lavadoras de cierta marca.
	public void marcaLavadora(String marca) {

	}

	// Muestra las lavadoras ordenadas por precio.
	public void ordenarLavadoras() {

	}

}
