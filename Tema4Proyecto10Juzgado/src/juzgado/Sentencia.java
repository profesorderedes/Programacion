package juzgado;

public class Sentencia {

	private int numSentencia;
	private String titulo;
	private String texto;
	private Juez juez;

	public Sentencia(int numSentencia, String titulo, String texto, Juez juez) {
		this.numSentencia = numSentencia;
		this.titulo = titulo;
		this.texto = texto;
		this.juez = juez;
	}

	public String toString() {
		return numSentencia + "\t" + titulo + "\t" + juez.getApellidos() + ", " + juez.getNombre();
	}

	public int getNumSentencia() {
		return numSentencia;
	}

	public void setNumSentencia(int numSentencia) {
		this.numSentencia = numSentencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Juez getJuez() {
		return juez;
	}

	public void setJuez(Juez juez) {
		this.juez = juez;
	}

}
