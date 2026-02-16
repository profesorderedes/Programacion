package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {

		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;

	}

	public String toString() {
		return apellidos + ", " + nombre + " (" + grupo.toString() + ")";
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca su número de expediente: ");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Introduzca sus apellidos: ");
		apellidos = entrada.nextLine();

		System.out.println("Introduzca su nombre: ");
		nombre = entrada.nextLine();

		grupo = new Grupo();
		grupo.leeDatos();

	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
