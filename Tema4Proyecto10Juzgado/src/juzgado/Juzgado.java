package juzgado;

public class Juzgado {

	private final int MAX_SENTENCIAS = 5;
	private String localidad;
	private int numJuzgado;
	private Sentencia[] sentencias;
	private int numSentencias;

	public Juzgado(String localidad, int numJuzgado) {

		this.localidad = localidad;
		this.numJuzgado = numJuzgado;
		sentencias = new Sentencia[MAX_SENTENCIAS];
		numSentencias = 0;

	}

	public void addSentencia(Sentencia sentencia) {
		sentencias[numSentencias] = sentencia;
		numSentencias++;
	}

	public void listaSentencias() {

		System.out.println("\nJuzgado nº " + numJuzgado + " de " + localidad);
		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < numSentencias; i++) {
			System.out.println(sentencias[i].toString());
		}
	}

	public int buscaSentencia(int numSentencia) {

		for (int i = 0; i < numSentencias; i++) {
			if (sentencias[i].getNumSentencia() == numSentencia) {
				return i;
			}
		}

		return -1;

	}

	public void delSentencia(int numSentencia) {

		int pos = buscaSentencia(numSentencia);

		if (pos == -1) {
			return;
		}

		for (int i = pos; i < numSentencias - 1; i++) {
			sentencias[i] = sentencias[i + 1];
		}

		numSentencias--;

	}

	public void listaJuez(String dni) {

		System.out.println("\nSentencias del juez con DNI " + dni);
		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < numSentencias; i++) {
			if (sentencias[i].getJuez().getDni().equals(dni)) {
				System.out.println(sentencias[i].toString());
			}
		}

	}

}
