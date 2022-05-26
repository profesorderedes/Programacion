package ejercicios;

public class Articulo {
	
	private String nombreProducto;
	private double precioProducto;

	public Articulo(String nombreProducto, double precioProducto) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}
}