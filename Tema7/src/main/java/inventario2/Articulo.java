package inventario2;

public class Articulo {

	private String nombre;
	private double precio;

	public Articulo(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return nombre + " (" + precio + "€)";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}else if(obj == this) {
			return true;
		}else if(!obj.getClass().equals(this.getClass())) {
			return false;
		}
		
		Articulo otroArticulo = (Articulo) obj;
		if(nombre.equals(otroArticulo.getNombre()) && precio == otroArticulo.getPrecio()) {
			return true;
		}
		
		return false;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
