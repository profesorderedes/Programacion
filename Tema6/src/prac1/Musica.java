package prac1;

public class Musica extends Medio {

	private String artista;
	private String estilo;

	public Musica(String nombre, double duracion, String artista, String estilo) {
		super(nombre, duracion);
		this.artista = artista;
		this.estilo = estilo;
	}

	public void reproducir() {
		System.out.println("Reproduciendo...");
	}

}
