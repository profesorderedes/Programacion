package ejercicios3;
public class Ejer4Error {

    public static void main(String[] args) {
       
        float temperaturas[] = {3.2F, 3.5F, 7.2F, 0.1F, 1, 2.3F,
                -5, 3.4F, 4, 4 ,4, 1.4F, 2.5F, -0.4F, 3.6F    };
       
        boolean esPositivo = true;
       
        for(int i = 0; i < temperaturas.length; i++) {
           
            if(temperaturas[i] < 0) {
                System.out.println(temperaturas[i]);
                esPositivo = false;
                continue;
            }
            if(temperaturas[i] >= 0) {
                esPositivo = true;
                System.out.println("-1");
                break;
               
            }
           
           
        }
        
        

    }

}