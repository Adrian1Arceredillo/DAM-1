/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameak;
import static frameak.JFrameAsmatuta.jEmaitzaZenba;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import model.Zatikia;

/**
 *
 * @author AdriAlex
 */
public class FrameJolasa extends javax.swing.JDialog {

    /**
     * Creates new form FrameJolasa
     */
    public FrameJolasa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jVerDatos = new javax.swing.JButton();
        jBaJokalaria = new javax.swing.JLabel();
        jBaJaurtiketaKopurua = new javax.swing.JLabel();
        jBaNumLanzamientos = new javax.swing.JTextField();
        jBaBoloKopurua = new javax.swing.JLabel();
        jBaNumBolos = new javax.swing.JTextField();
        jBiJokalaria = new javax.swing.JLabel();
        jBiJaurtiketaKopurua = new javax.swing.JLabel();
        jBiNumLanzamientos = new javax.swing.JTextField();
        jBiBoloKopurua = new javax.swing.JLabel();
        jBiNumBolos = new javax.swing.JTextField();
        jBaAverage = new javax.swing.JLabel();
        jBaMedia = new javax.swing.JTextField();
        jBaExplicaionMedia = new javax.swing.JLabel();
        jBiAverage = new javax.swing.JLabel();
        jBiMedia = new javax.swing.JTextField();
        jBiExplicaionMedia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jExplicacionJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jVerDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jVerDatos.setText("Datuak Ikusi");
        jVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerDatosActionPerformed(evt);
            }
        });

        jBaJokalaria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBaJokalaria.setText("LEHENENGO JOKALARIA:");

        jBaJaurtiketaKopurua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBaJaurtiketaKopurua.setText("Botatzeko zain dituen bolo kopurua:");

        jBaNumLanzamientos.setText(" ");
        jBaNumLanzamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaNumLanzamientosActionPerformed(evt);
            }
        });

        jBaBoloKopurua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBaBoloKopurua.setText("Jaurtiketa kopurua:");

        jBaNumBolos.setText(" ");
        jBaNumBolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaNumBolosActionPerformed(evt);
            }
        });

        jBiJokalaria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBiJokalaria.setText("BIGARREN JOKALARIA:");

        jBiJaurtiketaKopurua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBiJaurtiketaKopurua.setText("Botatzeko zain dituen bolo kopurua:");

        jBiNumLanzamientos.setText(" ");
        jBiNumLanzamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiNumLanzamientosActionPerformed(evt);
            }
        });

        jBiBoloKopurua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBiBoloKopurua.setText("Jaurtiketa kopurua:");

        jBiNumBolos.setText(" ");
        jBiNumBolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiNumBolosActionPerformed(evt);
            }
        });

        jBaAverage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBaAverage.setText("Average:");

        jBaMedia.setText(" ");
        jBaMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaMediaActionPerformed(evt);
            }
        });

        jBaExplicaionMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBaExplicaionMedia.setText("bolo, jaurtiketa bakoitzeko.");

        jBiAverage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBiAverage.setText("Average:");

        jBiMedia.setText(" ");

        jBiExplicaionMedia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBiExplicaionMedia.setText("bolo, jaurtiketa bakoitzeko.");

        jExplicacionJuego.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jExplicacionJuego.setText("Azalpena");
        jExplicacionJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExplicacionJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVerDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExplicacionJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBaJokalaria)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBaNumLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBaAverage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBaExplicaionMedia))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBaJaurtiketaKopurua, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBaBoloKopurua))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBiJaurtiketaKopurua)
                                .addGap(18, 18, 18)
                                .addComponent(jBiNumLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jBiBoloKopurua))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBiJokalaria)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBiAverage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBiMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBiExplicaionMedia)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBaNumBolos)
                            .addComponent(jBiNumBolos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBaJokalaria)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBaNumBolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBaBoloKopurua)
                    .addComponent(jBaNumLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBaJaurtiketaKopurua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBaAverage)
                    .addComponent(jBaExplicaionMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jBiJokalaria)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBiNumBolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBiBoloKopurua)
                            .addComponent(jBiNumLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBiJaurtiketaKopurua)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBiAverage)
                    .addComponent(jBiMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBiExplicaionMedia))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExplicacionJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerDatosActionPerformed
        
        //obtener y mostrar los datos del primer jugador (zatiki bakoitia)
        jBaNumLanzamientos.setText(JFrameAsmatuta.jBaZenbakitzailea.getText());
        jBaNumBolos.setText(JFrameAsmatuta.jBaIzendatzailea.getText());
        
        Zatikia za1 = new Zatikia(Integer.valueOf(jBaNumLanzamientos.getText()), Integer.valueOf(jBaNumBolos.getText()));
        jBaMedia.setText(String.format("%.2f", za1.hamartarBaliokidea()));
        
        //obtener y mostrar los datos del segundo jugador (zatiki bikoitia)
        jBiNumLanzamientos.setText(JFrameAsmatuta.jBiZenbakitzailea.getText());
        jBiNumBolos.setText(JFrameAsmatuta.jBiIzendatzailea.getText());
        
        Zatikia za2 = new Zatikia(Integer.valueOf(jBiNumLanzamientos.getText()), Integer.valueOf(jBiNumBolos.getText()));
        jBiMedia.setText(String.format("%.2f", za2.hamartarBaliokidea()));
        
    }//GEN-LAST:event_jVerDatosActionPerformed

    private void jBiNumBolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiNumBolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBiNumBolosActionPerformed

    private void jBaNumBolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaNumBolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBaNumBolosActionPerformed

    private void jBaNumLanzamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaNumLanzamientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBaNumLanzamientosActionPerformed

    private void jBiNumLanzamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiNumLanzamientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBiNumLanzamientosActionPerformed

    private void jBaMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBaMediaActionPerformed

    private void jExplicacionJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExplicacionJuegoActionPerformed
        JOptionPane.showMessageDialog(null,"Kaixo!\n"
                + "Jolasaren leihoa irekita, eta \"datuak ikusi\" erabiltzean, datu hauek agertuko dira: \n"
                + "Lehenengo jokalariaren jaurtiketa kopurua, dagokion zatikiaren zenbakitzailearen balioa da. Bestalde, zatikiaren izendatzaileak, jokalariak bota behar zituen bolo kopurua adierazten du. \n"
                + "Bigarren jokalariarekin berdina gertatzen da. \nGero, jokalari  bakoitzak duen batazbestekoa agertzen da. Hau da, zenbat bolo botatzen ditu jaurtiketa bakoitzeko \n"
                + "(izendatzailea / zenbakitzailea)\n");
    }//GEN-LAST:event_jExplicacionJuegoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameJolasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJolasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJolasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJolasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameJolasa dialog = new FrameJolasa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jBaAverage;
    public static javax.swing.JLabel jBaBoloKopurua;
    public static javax.swing.JLabel jBaExplicaionMedia;
    public static javax.swing.JLabel jBaJaurtiketaKopurua;
    public static javax.swing.JLabel jBaJokalaria;
    public static javax.swing.JTextField jBaMedia;
    public static javax.swing.JTextField jBaNumBolos;
    public static javax.swing.JTextField jBaNumLanzamientos;
    public static javax.swing.JLabel jBiAverage;
    public static javax.swing.JLabel jBiBoloKopurua;
    public static javax.swing.JLabel jBiExplicaionMedia;
    public static javax.swing.JLabel jBiJaurtiketaKopurua;
    public static javax.swing.JLabel jBiJokalaria;
    public static javax.swing.JTextField jBiMedia;
    public static javax.swing.JTextField jBiNumBolos;
    public static javax.swing.JTextField jBiNumLanzamientos;
    public static javax.swing.JButton jExplicacionJuego;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JButton jVerDatos;
    // End of variables declaration//GEN-END:variables
}
