// Hacer el ejercicio que se copie directamente en el portapapeles cuando hagas click en el botón
package ejemplosParte4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer04 extends JFrame {

    private JSlider sldRojo;
    private JSlider sldVerde;
    private JSlider sldAzul;
    private JButton btnColores;
    private JTextField txtColores;

    public Ejer04() {
        super("Paleta");
        setSize(220, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        setLocationRelativeTo(null);

        JLabel lblRojo = new JLabel("Rojo");
        sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
        sldRojo.setMajorTickSpacing(50);
        sldRojo.setMinorTickSpacing(25);
        sldRojo.setPaintTicks(true);
        sldRojo.setPaintLabels(true);
        sldRojo.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent arg0) {
                int rojo = sldRojo.getValue();
                btnColores.setBackground(new Color(rojo));
                txtColores.setText("#" + aHexadecimal(rojo));

            }
        });

        JLabel lblVerde = new JLabel("Verde");
        sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);
        sldVerde.setMajorTickSpacing(50);
        sldVerde.setMinorTickSpacing(25);
        sldVerde.setPaintTicks(true);
        sldVerde.setPaintLabels(true);
        sldVerde.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                int verde = sldVerde.getValue();
                btnColores.setBackground(new Color(verde));
                txtColores.setText("#" + aHexadecimal(verde));
            }
        });

        JLabel lblAzul = new JLabel("Azul");
        sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 51);
        sldAzul.setMajorTickSpacing(50);
        sldAzul.setMinorTickSpacing(25);
        sldAzul.setPaintTicks(true);
        sldAzul.setPaintLabels(true);
        sldAzul.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                int azul = sldAzul.getValue();
                btnColores.setBackground(new Color(azul));
                txtColores.setText("#" + aHexadecimal(azul));

            }
        });

        btnColores = new JButton();
        btnColores.setPreferredSize(new Dimension(100, 25));
        btnColores.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));

        txtColores = new JTextField("#FFC833", 7);

        add(lblRojo);
        add(sldRojo);
        add(lblVerde);
        add(sldVerde);
        add(lblAzul);
        add(sldAzul);
        add(btnColores);
        add(txtColores);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejer04();
    }

    private String aHexadecimal(int num) {

        String[] caracteresHex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        int division = num / 16;
        int resto = num % 16;

        String divisionCadena = caracteresHex[division];
        String restoCadena = caracteresHex[resto];

        System.out.println(num + " = " + divisionCadena + restoCadena);

        return divisionCadena + restoCadena;

    }
}