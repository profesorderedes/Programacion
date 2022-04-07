import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo24 extends JFrame implements ItemListener{
	
	public Ejemplo24() {
		
		super("Canciones");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel(
					"com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		String canciones[] = {"Te boté Remix", "Purpurina", 
				"Amorfoda", "Suavemente", "Gasolina"};
		JComboBox<String> cmbCanciones = 
				new JComboBox<>(canciones);
		cmbCanciones.setPreferredSize(new Dimension(200,30));
		cmbCanciones.addItemListener(this);
		
		JLabel lblAutor = new JLabel("Flow La Movie");
		
		add(cmbCanciones);
		add(lblAutor);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo24();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		
	}

}
