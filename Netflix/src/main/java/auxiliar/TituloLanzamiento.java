package auxiliar;

public class TituloLanzamiento {

	private String titulo;
	private int lanzamiento;
	private String descripcion;

	public TituloLanzamiento(String titulo, int lanzamiento, String descripcion) {

		this.titulo = titulo;
		this.lanzamiento = lanzamiento;
		this.descripcion = descripcion;

	}

	public String getTitulo() {
		return titulo;
	}

	public int getLanzamiento() {
		return lanzamiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

}