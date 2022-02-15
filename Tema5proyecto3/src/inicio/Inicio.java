package inicio;

import biblioteca.Autor;

public class Inicio {
	
	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Raúl", "raul@gmail.com",2003);
		
		System.out.println(autor1.toString());
		
		Autor autor2 = new Autor("Carlos");
		
		System.out.println(autor2.toString());
		
	}

}
