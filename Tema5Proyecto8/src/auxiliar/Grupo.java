package auxiliar;

import java.util.Scanner;

public class Grupo {

	// Atributos
	private int id;
	private String nivel;
	private int curso;
	private String clase;

	public Grupo() {

	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	public String toString() {
		return "ID: " + id + "\nNivel: " + nivel + "\nCurso: " + curso + "\nClase: " + clase;
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("ID: ");
		id = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Nivel: ");
		nivel = entrada.nextLine();

		System.out.print("Curso: ");
		curso = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Clase: ");
		clase = entrada.nextLine();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

}
