package taller;

public class Taller {

	private final int MAX_LAVADORAS = 5;
	private Lavadora[] lavadoras;
	private int fin;

	public Taller() {

		lavadoras = new Lavadora[MAX_LAVADORAS];
		fin = 0;

	}

	public void listaLavadoras() {

		System.out.println("--- LISTADO DE LAVADORAS EN STOCK ---");

		for (int i = 0; i < fin; i++) {
			System.out.println(lavadoras[i].toString());
		}

	}

	public void addLavadora(Lavadora lav) {

		if (fin < MAX_LAVADORAS) {

			lavadoras[fin] = lav;
			fin++;

		} else {

			System.out.println("No hay espacio para más lavadoras");

		}

	}

	public int buscaLavadora(int id) {

		for (int i = 0; i < fin; i++) {

			if (lavadoras[i].getId() == id) {
				return i;
			}

		}

		return -1;

	}

	public void borraLavadora(int id) {

		int pos = buscaLavadora(id);

		if (pos == -1) {

			System.out.println("No existe una lavadora con el id: " + id);
			return;

		}

		for (int i = pos; i < fin - 1; i++) {
			lavadoras[i] = lavadoras[i + 1];
		}

		fin--;

	}

}