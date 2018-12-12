package presentacion;

import java.sql.PreparedStatement;
import java.util.Hashtable;
import java.util.Set;
import presentacion.Paneles;
import presentacion.InputBox;

import negocios.*;

public class frmGestionReservas extends javax.swing.JFrame {
    public Hashtable<String, InputBox> ReservationMonthAssoc = new Hashtable<String, InputBox>();
    public InputBox[] ReservationMonth;
    
    private negocios.NegocioCliente negociosCliente = new NegocioCliente();
    private Paneles paneles = new Paneles();

    public frmGestionReservas() {
        initComponents();
        //cargo los campos y elementos del swing
        //this.paneles.ComponentesDatosCliente(reservationDataPNL);
        InputBox documentBI = new InputBox(documentTf, documentErrorLBL, true);
        InputBox carRegistrationBI = new InputBox(carRegistrationTb, carRegistrationErrorLBL, true);
        InputBox carTypeBI = new InputBox(carTypeCb, carTypeErrorLBL, true);
        InputBox reservationTurnBI = new InputBox(reservationTurnRb, reservationTurnErrorLBL, true);
        InputBox clientNameBI = new InputBox(clientNameTb, clientNameErrorLBL, false);
        
        carTypeBI.setValue(new String[]{"auto", "camioneta", "moto"});
        
        ReservationMonth = new InputBox[]{documentBI, carRegistrationBI, carTypeBI, reservationTurnBI, clientNameBI};
        ReservationMonthAssoc.put("document", documentBI);
        ReservationMonthAssoc.put("carType", carTypeBI);
        ReservationMonthAssoc.put("reservationTurn", reservationTurnBI);
        ReservationMonthAssoc.put("carRegistration", carRegistrationBI);
        ReservationMonthAssoc.put("clientName", clientNameBI);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        reservationDataPNL = new javax.swing.JPanel();
        reservationHighBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        documentErrorLBL = new javax.swing.JLabel();
        documentTf = new javax.swing.JTextField();
        documentLBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        carRegistrationErrorLBL = new javax.swing.JLabel();
        carRegistrationTb = new javax.swing.JTextField();
        carRegistrationLBL = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clientNameErrorLBL = new javax.swing.JLabel();
        clientNameTb = new javax.swing.JTextField();
        clientNameLBL = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        carTypeErrorLBL = new javax.swing.JLabel();
        carTypeLBL = new javax.swing.JLabel();
        carTypeCb = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        reservationTurnErrorLBL = new javax.swing.JLabel();
        reservationTurnLBL = new javax.swing.JLabel();
        reservationTurnRb = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Reservas");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(null);

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));

        reservationDataPNL.setBackground(new java.awt.Color(254, 254, 254));
        reservationDataPNL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reservationHighBTN.setBackground(new java.awt.Color(255, 255, 255));
        reservationHighBTN.setForeground(new java.awt.Color(1, 1, 1));
        reservationHighBTN.setText("reservar");
        reservationHighBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reservationHighBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationHighBTNMouseClicked(evt);
            }
        });
        reservationHighBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationHighBTNActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        documentErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        documentErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentErrorLBL.setText(" campo requerido");
        documentErrorLBL.setOpaque(true);

        documentTf.setBackground(new java.awt.Color(255, 255, 255));
        documentTf.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentTf.setForeground(new java.awt.Color(0, 0, 0));

        documentLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentLBL.setText("documento");
        documentLBL.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documentTf)
                    .addComponent(documentErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(documentLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(documentLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentErrorLBL))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        carRegistrationErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        carRegistrationErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationErrorLBL.setText(" campo requerido");
        carRegistrationErrorLBL.setOpaque(true);

        carRegistrationTb.setBackground(new java.awt.Color(255, 255, 255));
        carRegistrationTb.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationTb.setForeground(new java.awt.Color(0, 0, 0));

        carRegistrationLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationLBL.setText("matricula");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carRegistrationTb)
                    .addComponent(carRegistrationErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carRegistrationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(carRegistrationLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationErrorLBL))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        clientNameErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        clientNameErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        clientNameErrorLBL.setText(" campo requerido");
        clientNameErrorLBL.setOpaque(true);

        clientNameTb.setBackground(new java.awt.Color(255, 255, 255));
        clientNameTb.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        clientNameTb.setForeground(new java.awt.Color(0, 0, 0));

        clientNameLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        clientNameLBL.setText("nombre (opcional)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientNameTb)
                    .addComponent(clientNameErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientNameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(clientNameLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientNameErrorLBL))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        carTypeErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        carTypeErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeErrorLBL.setText(" campo requerido");
        carTypeErrorLBL.setOpaque(true);

        carTypeLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeLBL.setText("tipo de vehiculo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carTypeErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(carTypeLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carTypeCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(carTypeLBL)
                .addGap(2, 2, 2)
                .addComponent(carTypeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carTypeErrorLBL))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        reservationTurnErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        reservationTurnErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        reservationTurnErrorLBL.setText(" campo requerido");
        reservationTurnErrorLBL.setOpaque(true);

        reservationTurnLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        reservationTurnLBL.setText("horario de reserva");

        reservationTurnRb.setText("nocturno");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(reservationTurnErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(reservationTurnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reservationTurnRb))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(reservationTurnLBL)
                .addGap(2, 2, 2)
                .addComponent(reservationTurnRb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationTurnErrorLBL))
        );

        javax.swing.GroupLayout reservationDataPNLLayout = new javax.swing.GroupLayout(reservationDataPNL);
        reservationDataPNL.setLayout(reservationDataPNLLayout);
        reservationDataPNLLayout.setHorizontalGroup(
            reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationDataPNLLayout.createSequentialGroup()
                .addGroup(reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(reservationDataPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(reservationDataPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(reservationDataPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDataPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(reservationDataPNLLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(reservationHighBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reservationDataPNLLayout.setVerticalGroup(
            reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDataPNLLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(reservationHighBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(reservationDataPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(773, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(reservationDataPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("cliente", pnCliente);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
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
       
    private void reservationHighBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationHighBTNMouseClicked
        paneles.hideErrors(this.ReservationMonth);
        if (paneles.ValidarCampos(this.ReservationMonth)) 
        {
            this.negociosCliente.NewReservationMounth(this.ReservationMonthAssoc);
        }  
    }//GEN-LAST:event_reservationHighBTNMouseClicked

    private void reservationHighBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationHighBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationHighBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGestionReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carRegistrationErrorLBL;
    private javax.swing.JLabel carRegistrationLBL;
    private javax.swing.JTextField carRegistrationTb;
    private javax.swing.JComboBox<String> carTypeCb;
    private javax.swing.JLabel carTypeErrorLBL;
    private javax.swing.JLabel carTypeLBL;
    private javax.swing.JLabel clientNameErrorLBL;
    private javax.swing.JLabel clientNameLBL;
    private javax.swing.JTextField clientNameTb;
    private javax.swing.JLabel documentErrorLBL;
    private javax.swing.JLabel documentLBL;
    private javax.swing.JTextField documentTf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel reservationDataPNL;
    private javax.swing.JButton reservationHighBTN;
    private javax.swing.JLabel reservationTurnErrorLBL;
    private javax.swing.JLabel reservationTurnLBL;
    private javax.swing.JRadioButton reservationTurnRb;
    // End of variables declaration//GEN-END:variables
}
