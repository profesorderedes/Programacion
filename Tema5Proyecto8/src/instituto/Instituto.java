package instituto;

import java.util.Iterator;

import auxiliar.Alumno;

public class Instituto {
	
	private final int MAX_ALUMNOS = 100;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
	
	public void addAlumno(Alumno alu) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
			
		}
		
	}
	
	public void delAlumno(int numExpediente) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] != null 
					&& alumnos[i].getNumExpediente() 
						== numExpediente) {
				alumnos[i] = null;
				break;
			}
			
		}
		
	}
	
	public void muestraAlumnos() {
		
		System.out.println("\nListado de alumnos");
		System.out.println("================================");
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] != null) {
				System.out.println("- " 
						+ alumnos[i].getApellidos() 
						+ ", " + alumnos[i].getNombre()
						+ " (" 
						+ alumnos[i].getGrupo().getNivel()
						+ ")");
			}
			
		}
		
	}
	
	public int numAlumnos() {
		
		int numAlumnos = 0;
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] != null) {
				numAlumnos++;
			}
			
		}
		
		return numAlumnos;
		
	}

}







