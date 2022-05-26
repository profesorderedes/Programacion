package ejercicios;

public class Articulo {
	
	private String nombre;
	private double precio;

	public Articulo(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// El método equals permitirá que podamos hacer ciertas 
	// operaciones con el ArrayList de artículos.
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}else if(obj == this) {
			return true;
		}else if(obj instanceof Articulo) {
			
			Articulo articulo = (Articulo) obj;
			
			if(nombre.equals(articulo.getNombre()) 
					&& precio == articulo.getPrecio()) {
				return true;
			}
			
		}
		
		return false;
		
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}