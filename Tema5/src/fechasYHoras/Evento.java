package fechasYHoras;

import java.time.LocalDate;

public class Evento {

	private LocalDate fecha;
	private String descripcion;

	public Evento(LocalDate fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public String toString() {
		return fecha + " - " + descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
