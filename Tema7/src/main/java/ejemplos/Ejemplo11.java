package ejemplos;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {
	
	public static void main(String[] args) {
		
		Set<Rol> roles = new HashSet<>();

		roles.add(new Rol("manager", 1600));
		roles.add(new Rol("junior", 1300));
		roles.add(new Rol("senior", 2100));
		roles.add(new Rol("directivo", 2400));
		roles.add(new Rol("senior", 2100));
		
		for(Rol rol : roles) {
			System.out.println(" - " + rol.getCargo() + " (salario = " + rol.getSueldo() + ")");
		}
		
	}

}
