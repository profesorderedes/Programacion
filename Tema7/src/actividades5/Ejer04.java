package actividades5;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ejer04 extends JFrame{
    
    public Ejer04() {
        
        super("Escribir título");
        setSize(255, 255);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        setLocationRelativeTo(null);
        
        addMouseListener(new MouseListener() {
            
            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void mouseExited(MouseEvent arg0) {

                getContentPane().setBackground(Color.white);
            }
            
            @Override
            public void mouseEntered(MouseEvent arg0) {
            	getContentPane().setBackground(Color.white);
                
            }
            
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int x = arg0.getX();
                int y = arg0.getY();
                getContentPane().setBackground(new Color(x,y,0));
                
            }
        });
        
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new Ejer04();
    }

}