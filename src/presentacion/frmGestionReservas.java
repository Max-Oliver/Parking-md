package presentacion;

import java.sql.PreparedStatement;
import presentacion.Paneles;

import negocios.*;

public class frmGestionReservas extends javax.swing.JFrame {

    private negocios.NegocioCliente negociosCliente;

    public frmGestionReservas() {
        initComponents();

        Paneles Paneles = new Paneles();
        Paneles.ComponentesDatosCliente(pnDatosCliente);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        pnDatosCliente = new javax.swing.JPanel();
        btnAltaCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Reservas");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(null);

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));

        pnDatosCliente.setBackground(new java.awt.Color(254, 254, 254));
        pnDatosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAltaCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnAltaCliente.setForeground(new java.awt.Color(1, 1, 1));
        btnAltaCliente.setText("alta cliente");
        btnAltaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAltaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnDatosClienteLayout = new javax.swing.GroupLayout(pnDatosCliente);
        pnDatosCliente.setLayout(pnDatosClienteLayout);
        pnDatosClienteLayout.setHorizontalGroup(
            pnDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnDatosClienteLayout.setVerticalGroup(
            pnDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatosClienteLayout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addComponent(btnAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(pnDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("cliente", pnCliente);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("reservas", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaClienteMouseClicked
        this.negociosCliente.AltaCliente();
    }//GEN-LAST:event_btnAltaClienteMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGestionReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnDatosCliente;
    // End of variables declaration//GEN-END:variables
}
