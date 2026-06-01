package auxiliar;

public class TituloEstreno {

	private int id;
	private String titulo;
	private int lanzamiento;

	public TituloEstreno(int id, String titulo, int lanzamiento) {
		this.id = id;
		this.titulo = titulo;
		this.lanzamiento = lanzamiento;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getLanzamiento() {
		return lanzamiento;
	}

}
