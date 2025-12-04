package hoja3;

public class Ejer04 {

    public static void main(String[] args) {
        /*
         * Diseña un programa que a partir de la siguiente tabla de temperaturas,
         * proveniente del registro de un termostato, indique la posición de la primera
         * medida menor que cero. En caso de que no hubiera ninguna temperatura
         * negativa, se indicaría un valor de -1.
         */

        double[] termostato = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };
        int posNegativo = -1;

        for (int i = 0; i < termostato.length; i++) {

            if (termostato[i] < 0) {
                posNegativo = i;
                break;
            }

        }
        
        System.out.println("Posición de la primera temperatura negativa: " + posNegativo);
    }
}