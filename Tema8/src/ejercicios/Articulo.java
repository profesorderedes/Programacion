package ejercicios;

public class Articulo {
	
	private String nombre;
	private double precio;

	public Articulo(String nombreProducto, double precioProducto) {
		this.nombre = nombreProducto;
		this.precio = precioProducto;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		
	}

	public String getNombreProducto() {
		return nombre;
	}

	public double getPrecioProducto() {
		return precio;
	}
}