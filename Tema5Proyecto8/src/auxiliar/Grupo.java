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

	public String toString() {

		return "ID: " + id + "\nNivel: " + nivel + "\nCurso: " + curso + "\nClase: " + clase;

	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("ID: ");
		id = entrada.nextInt();

		entrada.nextLine();
		System.out.println("Nivel: ");
		nivel = entrada.nextLine();

		System.out.println("Curso: ");
		curso = entrada.nextInt();

		entrada.nextLine();
		System.out.println("Clase: ");
		clase = entrada.nextLine();

	}

}