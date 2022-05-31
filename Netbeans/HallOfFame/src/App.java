
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuntuacion = new javax.swing.JList<>();
        lblHall = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstPuntuacion);

        lblHall.setText("*** Hall of Fame ***");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(btnNuevo)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBorrar))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(lblHall)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblHall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNuevo)
                                        .addComponent(btnBorrar))
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        nuevoJugador();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    /**
     * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
     * listener del botón Nuevo.
     */
    private void nuevoJugador() {
        
        // Leemos los datos del jugador.
        Jugador jugador = leerDatosJugador();
        
        // Mostramos los datos en la lista.
        
    }

    /**
     * Pide al usuario los datos de un nuevo jugador y devuelve un objeto
     * Jugador.
     *
     * @return Un objeto Jugador con los datos leídos, o null si los datos no
     * son válidos.
     */
    private Jugador leerDatosJugador() {

        String nombre = JOptionPane.showInputDialog(null, "¿Nombre del jugador?",
                "Nuevo",
                JOptionPane.QUESTION_MESSAGE);

        String puntuacion = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?",
                "Nuevo", JOptionPane.QUESTION_MESSAGE);

        if (nombre == null || nombre.trim().equals("")) {
            return null;
        }

        int puntos;

        try {
            puntos = Integer.parseInt(puntuacion);
        } catch (NumberFormatException e) {
            return null;
        }

        Jugador jugador = new Jugador(nombre, puntos);

        return jugador;

    }

    /**
     * Guarda la información de un jugador en el archivo de disco, en formato
     * csv.
     *
     * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
     */
    public void guardarJugador(Jugador jugador) {
    }

    /**
     * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la
     * lista que se muestra en la ventana.6
     */
    public void cargarJugadores() {
    }

    /**
     * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la
     * lista de jugadores en la ventana. Este método es llamado desde el
     * listener del botón Borrar.
     */
    public void borrarArchivo() {
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHall;
    private javax.swing.JList<String> lstPuntuacion;
    // End of variables declaration//GEN-END:variables
}
