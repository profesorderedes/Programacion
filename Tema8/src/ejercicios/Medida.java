package ejercicios;

public class Medida {

	private double temperatura;
	private int presion;
	private int humedad;

	public Medida(double temperatura, int presion, int humedad) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad = humedad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public int getPresion() {
		return presion;
	}

	public int getHumedad() {
		return humedad;
	}

}
