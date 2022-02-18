package instituto;

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

}







