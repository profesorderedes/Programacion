

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer04 extends JFrame {

	int rojo, verde, azul = 0;
	
	public Ejer04() {
		super("Colres");
		setSize(255,255);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		JLabel lblColor = new JLabel("COLOR");
		Font negrita = new Font("Arial", Font.BOLD, 16);
		lblColor.setFont(negrita);
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblColor.setForeground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {

				lblColor.setForeground(Color.red);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				verde = e.getX();
				azul = e.getY();
				
				lblColor.setForeground(new Color(rojo,verde,azul));
				
			}
		});
		
		
		add(lblColor);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Ejer04();
		
	}
	
}