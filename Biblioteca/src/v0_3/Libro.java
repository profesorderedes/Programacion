package v0_3;

public class Libro {

	private int id;
	private String titulo;
	private String[] autores;
	private String editorial;
	private int anyoPublicacion;

	public Libro(String titulo, String[] autores, String editorial, int anyoPublicacion) {
		this.titulo = titulo;
		this.autores = autores;
		this.editorial = editorial;
		this.anyoPublicacion = anyoPublicacion;
	}

	public String obtenerCadenaAutores() {

		String cadenaAutores = "";

		for (int i = 0; i < autores.length; i++) {
			cadenaAutores = cadenaAutores + autores[i];

			if (i != autores.length - 1) {
				cadenaAutores = cadenaAutores + "; ";
			}

		}

		return cadenaAutores;

	}

	@Override
	public String toString() {

		return "Id: " + id + "\nTítulo: " + titulo + "\nAutores: " + obtenerCadenaAutores() + "\nEditorial: "
				+ editorial + "\nAño de publicación: " + anyoPublicacion;

	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setId(int id) {
		this.id = id;
	}

}
