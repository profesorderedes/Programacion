package electrodomesticos;

/*
 * Hemos hecho una variación respecto al enunciado de la 
 * práctica para que el tamaño del array de lavadoras 
 * venga suministrador por el constructor.
 */
public class Taller {

	private final int MAX_LAVADORAS;
	private Lavadora[] lavadoras;

	private int numLavadoras = 0;
	
	// En la práctica no está así.
	public Taller(int capacidad) {
		
		MAX_LAVADORAS = capacidad;
		lavadoras = new Lavadora[MAX_LAVADORAS];
		
	}
	
	public void listaLavadoras() {

		System.out.println("\nLista de lavadoras");
		System.out.println("=====================");
		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null) {

				System.out.println(lavadoras[i].toString());

			}

		}

	}

	public void addLavadora(Lavadora lav) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] == null) {

				lavadoras[i] = lav;
				numLavadoras++;
				break;

			}

		}

	}

	public void borraLavadora(int id) {

		int pos = buscaLavadora(id);
		
		if(pos!=-1) {
			lavadoras[pos] = null;
			numLavadoras--;
		}

	}

	public int buscaLavadora(int id) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null 
					&& lavadoras[i].getId() == id) {

				return i;

			}

		}
		
		return -1;

	}
	
	public int numLavadoras() {
		
		return numLavadoras;
		
	}

}
