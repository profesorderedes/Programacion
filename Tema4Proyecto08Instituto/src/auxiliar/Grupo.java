package auxiliar;

import java.util.Scanner;

public class Grupo {

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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getCurso() {
		return this.curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getClase() {
		return this.clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return curso + "º " + nivel + " " + clase;
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el id de su curso: ");
		id = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Introduzca su nivel (ESO, BACHILLERATO, ...): ");
		nivel = entrada.nextLine();

		System.out.println("Introduzca el grado (1, 2, ...): ");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Introduzca la clase (A, B, ...): ");
		clase = entrada.nextLine();
	}

}