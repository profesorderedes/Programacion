package gestionGastos;

import java.time.LocalDate;

/**
 * Clase que representa un asiento contable (ingreso o gasto).
 */
public class Asiento {

	private int id;
	private LocalDate dia;	
	private String concepto;
	private double cantidad;

	/**
	 * Constructor de la clase. Inicializa todos los parámetros excepto id.
	 * 
	 * @param dia      Día en que se ha hecho el ingreso o gasto.
	 * @param concepto Concepto del asiento
	 * @param cantidad Cantidad ingresada (positivo) o gastada (negativo)
	 */
	public Asiento(LocalDate dia, String concepto, double cantidad) {
		this.dia = dia;
		this.concepto = concepto;
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve una cadena de texto con el día, concepto y cantidad de un asiento.
	 * 
	 * @return Cadena de texto describiendo el asiento.
	 */
	@Override
	public String toString() {

		// Mostramos la información recortando el concepto para que no pase de 30
		// caracteres.
		if (concepto.length() <= 30) {
			return String.format("%-10s  %-30s  %12.2f", convertirFecha(dia), concepto, cantidad);
		} else {
			String conceptoRecortado = concepto.substring(0, 27) + "...";
			return String.format("%-10s  %-30s  %12.2f", convertirFecha(dia), conceptoRecortado, cantidad);
		}

	}

	/**
	 * Devuelve una cadena de texto con el id, día, concepto y cantidad de un
	 * asiento.
	 * 
	 * @return Cadena de texto describiendo el asiento.
	 */
	public String toStringConId() {

		// Mostramos la información recortando el concepto para que no pase de 30
		// caracteres.
		if (concepto.length() <= 30) {
			return String.format("%5s  %-10s  %-30s  %12.2f", id, convertirFecha(dia), concepto, cantidad);
		} else {
			String conceptoRecortado = concepto.substring(0, 27) + "...";
			return String.format("%5s  %-10s  %-30s  %12.2f", id, convertirFecha(dia), conceptoRecortado, cantidad);
		}

	}

	/**
	 * Convierte una fecha con formato aaaa-mm-dd a dd-mm-aaaa.
	 * 
	 * @param fecha Fecha en forma de objeto LocalDate
	 * @return Cadena de texto con la fecha en formato dd-mm-aaaa
	 */
	private String convertirFecha(LocalDate fecha) {

		int dia = fecha.getDayOfMonth();
		int mes = fecha.getMonthValue();
		int anyo = fecha.getYear();

		String cadenaFecha = "" + (dia < 10 ? "0" + dia : "" + dia) + "-";
		cadenaFecha = cadenaFecha + (mes < 10 ? "0" + mes : "" + mes) + "-";
		cadenaFecha = cadenaFecha + anyo;

		return cadenaFecha;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

}