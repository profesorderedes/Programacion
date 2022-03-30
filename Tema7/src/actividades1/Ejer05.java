package actividades1;
import javax.swing.*;
import java.awt.*;

public class Ejer05 extends JFrame{
    
    public Ejer05() {
       
        String[] servidores = {"Apache", "IIS", "Nginx", 
        		"Node.JS"};
       
        JOptionPane.showOptionDialog(null, 
        		"¿Qué servidor web desea para su hosting?", 
        		"Elección de servidor web", 0, 
        		JOptionPane.INFORMATION_MESSAGE, null, 
        		servidores, servidores[1]);
       
    }
    
    public static void main(String[] args) {
       
        new Ejer05();
       
    }

}