package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01ArrayList {
	
	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<>();
		
		nombres.add("Lucas");
		nombres.add("José Luis");
		nombres.add("Óscar");
		nombres.add(1,"Jordi");
		
		// Lucas, Jordi, José Luis, Óscar
		
		
	}

}
