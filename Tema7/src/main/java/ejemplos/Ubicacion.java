package ejemplos;

public class Ubicacion {

	private String localidad;
	private double diferenciaHoraria;
	private boolean horarioVerano;

	public Ubicacion(String localidad, double diferenciaHoraria, boolean horarioVerano) {
		this.localidad = localidad;
		this.diferenciaHoraria = diferenciaHoraria;
		this.horarioVerano = horarioVerano;
	}

	@Override
	public String toString() {

		return localidad + " - " + diferenciaHoraria + " - " + horarioVerano;

	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public double getDiferenciaHoraria() {
		return diferenciaHoraria;
	}

	public void setDiferenciaHoraria(double diferenciaHoraria) {
		this.diferenciaHoraria = diferenciaHoraria;
	}

	public boolean isHorarioVerano() {
		return horarioVerano;
	}

	public void setHorarioVerano(boolean horarioVerano) {
		this.horarioVerano = horarioVerano;
	}

}
