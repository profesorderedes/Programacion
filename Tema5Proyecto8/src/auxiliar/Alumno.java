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

		return "Numero expediente: " + numExpediente + "\nApellidos: " + apellidos + "\nNombre: " + nombre + "\nGrupo: "
				+ grupo.toString();

	}
	
	public void leeDatos() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nº de expediente: ");
		numExpediente = entrada.nextInt();
		
		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();
		
		System.out.print("Nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Grupo:");
		Grupo grupo = new Grupo();
		grupo.leeDatos();
		
	}

}









