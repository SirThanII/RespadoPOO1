/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;
import Logic.*;
import javax.swing.JOptionPane;
/**
 *
 * @author retr0
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
        setLocation(400,200);
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

        lblNumCas = new javax.swing.JLabel();
        txfNumCasi = new javax.swing.JTextField();
        btnCrearCounter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de casilleros");
        setResizable(false);

        lblNumCas.setText("Numero de casilleros del counter: ");

        btnCrearCounter.setText("Crear Counter");
        btnCrearCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(lblNumCas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNumCasi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCounter)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCas)
                    .addComponent(txfNumCasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCounter))
                .addContainerGap(533, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCounterActionPerformed
        String numeroCasilleros = txfNumCasi.getText();
        if(isInteger(numeroCasilleros)){
           Counter counter = new Counter(Integer.parseInt(numeroCasilleros));
           MenuFuncionalidades menu = new MenuFuncionalidades(counter);
           menu.setVisible(true);
           dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Ingrese un valor entero", "Error", 1);
        }
    }//GEN-LAST:event_btnCrearCounterActionPerformed

    private boolean isInteger(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCounter;
    private javax.swing.JLabel lblNumCas;
    private javax.swing.JTextField txfNumCasi;
    // End of variables declaration//GEN-END:variables
}
