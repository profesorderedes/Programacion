package ejemplos;

import java.util.Objects;

public class Rol {

	private String cargo;
	private float sueldo;

	public Rol(String cargo, float sueldo) {

		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, sueldo);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Rol other = (Rol) obj;
		return Objects.equals(cargo, other.cargo) && Float.floatToIntBits(sueldo) == Float.floatToIntBits(other.sueldo);

	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
