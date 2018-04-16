/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Logic.*;
/**
 *
 * @author retr0
 */
public class MenuFuncionalidades extends javax.swing.JFrame {

    Counter counter;
    /**
     * Creates new form MenuFuncionalidades
     */
    public MenuFuncionalidades(Counter counter) {
        
        setLocation(400,200);
        this.counter = counter;
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

        pnlAdminisClient = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        pnlRecepcionEntregables = new javax.swing.JPanel();
        pnlRetiroDeEntregables = new javax.swing.JPanel();
        pnlConsultasDeArticulos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdminisClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar Clientes"));

        btnRegistrarCliente.setText("Registrar Cliente");

        btnModificarCliente.setText("Modificar Cliente");

        btnConsultarCliente.setText("Consultar Cliente");

        btnEliminarCliente.setText("Eliminar Cliente");

        javax.swing.GroupLayout pnlAdminisClientLayout = new javax.swing.GroupLayout(pnlAdminisClient);
        pnlAdminisClient.setLayout(pnlAdminisClientLayout);
        pnlAdminisClientLayout.setHorizontalGroup(
            pnlAdminisClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminisClientLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlAdminisClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        pnlAdminisClientLayout.setVerticalGroup(
            pnlAdminisClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminisClientLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pnlRecepcionEntregables.setBorder(javax.swing.BorderFactory.createTitledBorder("Recepción de entregables"));

        javax.swing.GroupLayout pnlRecepcionEntregablesLayout = new javax.swing.GroupLayout(pnlRecepcionEntregables);
        pnlRecepcionEntregables.setLayout(pnlRecepcionEntregablesLayout);
        pnlRecepcionEntregablesLayout.setHorizontalGroup(
            pnlRecepcionEntregablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlRecepcionEntregablesLayout.setVerticalGroup(
            pnlRecepcionEntregablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pnlRetiroDeEntregables.setBorder(javax.swing.BorderFactory.createTitledBorder("Retiro de Entregables"));

        javax.swing.GroupLayout pnlRetiroDeEntregablesLayout = new javax.swing.GroupLayout(pnlRetiroDeEntregables);
        pnlRetiroDeEntregables.setLayout(pnlRetiroDeEntregablesLayout);
        pnlRetiroDeEntregablesLayout.setHorizontalGroup(
            pnlRetiroDeEntregablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        pnlRetiroDeEntregablesLayout.setVerticalGroup(
            pnlRetiroDeEntregablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlConsultasDeArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de artículos"));

        javax.swing.GroupLayout pnlConsultasDeArticulosLayout = new javax.swing.GroupLayout(pnlConsultasDeArticulos);
        pnlConsultasDeArticulos.setLayout(pnlConsultasDeArticulosLayout);
        pnlConsultasDeArticulosLayout.setHorizontalGroup(
            pnlConsultasDeArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlConsultasDeArticulosLayout.setVerticalGroup(
            pnlConsultasDeArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlRecepcionEntregables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdminisClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRetiroDeEntregables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlConsultasDeArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRetiroDeEntregables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdminisClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRecepcionEntregables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlConsultasDeArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JPanel pnlAdminisClient;
    private javax.swing.JPanel pnlConsultasDeArticulos;
    private javax.swing.JPanel pnlRecepcionEntregables;
    private javax.swing.JPanel pnlRetiroDeEntregables;
    // End of variables declaration//GEN-END:variables
}