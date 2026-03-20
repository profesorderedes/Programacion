package ejemplos;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return nombre + "\t" + apellidos + "\t" + fechaNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		} else if (obj == this) {
			return true;
		} else if (getClass() != obj.getClass()) {
			return false;
		}

		Cliente otroCliente = (Cliente) obj;

		if (nombre.equals(otroCliente.getNombre()) && apellidos.equals(otroCliente.getApellidos())
				&& fechaNacimiento.isEqual(otroCliente.getFechaNacimiento())) {
			return true;
		} else {
			return false;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
