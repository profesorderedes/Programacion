package repaso;

public class Ejer16 {

    public static void main(String[] args) {

        String alumnos [][] = {
                {"Jose Luis Martínez", "7"},
                {"Antonia Ruiz", "9"},
                {"Marcos Ramírez", "10"},
                {"Juanan Herranz", "4"},
                {"Alberto López", "7"},
        };
        float total=0;
       
        System.out.println("Alumnos y sus notas\n");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i][0]+":"
            		+alumnos[i][1]);
            total += Float.parseFloat(alumnos[i][1]);
        }
       
       
        System.out.println("\nLa nota media del curso es un "
        		+(total/alumnos.length));
       
    }

}