package instituto;

import auxiliar.Alumno;

public class Instituto {
	
	private final int MAX_ALUMNOS = 100;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
	private int numAlumnos = 0;
	
	public void addAlumno(Alumno alu) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] == null) {
				alumnos[i] = alu;
				numAlumnos++;
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
				numAlumnos--;
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
		
		return numAlumnos;
		
	}
	
	public int buscaAlumno(int numExpediente) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] != null 
					&& alumnos[i].getNumExpediente() 
						== numExpediente) {
				return i;
			}
			
		}
		
		return -1;
		
	}

}










