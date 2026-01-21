package auxiliar;

public class Grupo {

	private int id;
	private String nivel; // ESO, BACHILLERATO, ...
	private int curso; // 1, 2, ...
	private String clase; // A, B, ...

	public Grupo() {

	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// Por ejemplo 1º ESO D
	public String toString() {
		return curso + "º " + nivel + " " + clase;
	}

}




