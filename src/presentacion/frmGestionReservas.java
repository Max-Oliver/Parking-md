package presentacion;
import java.util.Set;
import presentacion.Paneles;
import presentacion.InputBox;
import presentacion.EventosFrmGestionReservas;

import negocios.*;

public class frmGestionReservas extends javax.swing.JFrame {
    private EventosFrmGestionReservas EventsFrame = new EventosFrmGestionReservas();
    private negocios.NegocioCliente BussinessClient = new NegocioCliente();
    private Paneles Panels = new Paneles();
    
    private InputBox[] onlyWashed;
    private InputBox[] reservationHour;
    private InputBox[] reservationMonth;
    
    public frmGestionReservas() {
        initComponents();
        
        InputBox carTypeBI = new InputBox(carTypeCb, carTypeErrorLBL, true);
        
        InputBox documentBI1 = new InputBox(documentTf1, documentErrorLBL1, true);
        InputBox carRegistrationBI1 = new InputBox(carRegistrationTb1, carRegistrationErrorLBL1, true);
        InputBox carTypeBI1 = new InputBox(carTypeCb1, carTypeErrorLBL1, true);
        InputBox paymentMarkBI1 = new InputBox(paymentMarkRb1, paymentMarkErrorLBL1, false);
        
        InputBox documentBI2 = new InputBox(documentTf2, documentErrorLBL2, true);
        InputBox carRegistrationBI2 = new InputBox(carRegistrationTb2, carRegistrationErrorLBL2, true);
        InputBox carTypeBI2 = new InputBox(carTypeCb2, carTypeErrorLBL2, true);
        InputBox reservationTurnBI = new InputBox(reservationTurnRb, reservationTurnErrorLBL, true);
        InputBox paymentMarkBI2 = new InputBox(paymentMarkRb2, paymentMarkErrorLBL2, false);
        
        carTypeBI.setValue(new String[]{"auto", "camioneta", "moto"});
        carTypeBI1.setValue(new String[]{"auto", "camioneta", "moto"});
        carTypeBI2.setValue(new String[]{"auto", "camioneta", "moto"});
        
        reservationHour = new InputBox[]{carRegistrationBI1, carTypeBI1, documentBI1, paymentMarkBI1};
        reservationMonth = new InputBox[]{carRegistrationBI2, carTypeBI2, documentBI2, reservationTurnBI,paymentMarkBI2};
        onlyWashed = new InputBox[]{carTypeBI};
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        reservationDataPNL = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        documentErrorLBL2 = new javax.swing.JLabel();
        documentTf2 = new javax.swing.JTextField();
        documentLBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        carRegistrationErrorLBL2 = new javax.swing.JLabel();
        carRegistrationTb2 = new javax.swing.JTextField();
        carRegistrationLBL = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        carTypeErrorLBL2 = new javax.swing.JLabel();
        carTypeLBL = new javax.swing.JLabel();
        carTypeCb2 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        reservationTurnErrorLBL = new javax.swing.JLabel();
        reservationTurnLBL = new javax.swing.JLabel();
        reservationTurnRb = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        paymentMarkErrorLBL2 = new javax.swing.JLabel();
        paymentMarkLBL2 = new javax.swing.JLabel();
        paymentMarkRb2 = new javax.swing.JRadioButton();
        reservationMounthBTN = new javax.swing.JButton();
        reservationDataPNL1 = new javax.swing.JPanel();
        justWashedBTN = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        carTypeErrorLBL = new javax.swing.JLabel();
        carTypeLBL1 = new javax.swing.JLabel();
        carTypeCb = new javax.swing.JComboBox<>();
        reservationDataPNL2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        documentErrorLBL1 = new javax.swing.JLabel();
        documentTf1 = new javax.swing.JTextField();
        documentLBL1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        carRegistrationErrorLBL1 = new javax.swing.JLabel();
        carRegistrationTb1 = new javax.swing.JTextField();
        carRegistrationLBL1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        carTypeErrorLBL1 = new javax.swing.JLabel();
        carTypeLBL2 = new javax.swing.JLabel();
        carTypeCb1 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        paymentMarkErrorLBL1 = new javax.swing.JLabel();
        reservationTurnLBL1 = new javax.swing.JLabel();
        paymentMarkRb1 = new javax.swing.JRadioButton();
        reservationHourBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        documentErrorLBL2.setBackground(new java.awt.Color(253, 115, 108));
        documentErrorLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentErrorLBL2.setText(" campo requerido");
        documentErrorLBL2.setOpaque(true);

        documentTf2.setBackground(new java.awt.Color(255, 255, 255));
        documentTf2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentTf2.setForeground(new java.awt.Color(0, 0, 0));

        documentLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentLBL.setText("documento");
        documentLBL.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documentTf2)
                    .addComponent(documentErrorLBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(documentLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(documentLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentErrorLBL2))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        carRegistrationErrorLBL2.setBackground(new java.awt.Color(253, 115, 108));
        carRegistrationErrorLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationErrorLBL2.setText(" campo requerido");
        carRegistrationErrorLBL2.setOpaque(true);

        carRegistrationTb2.setBackground(new java.awt.Color(255, 255, 255));
        carRegistrationTb2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationTb2.setForeground(new java.awt.Color(0, 0, 0));

        carRegistrationLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationLBL.setText("matricula");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carRegistrationTb2)
                    .addComponent(carRegistrationErrorLBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carRegistrationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(carRegistrationLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationTb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationErrorLBL2))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        carTypeErrorLBL2.setBackground(new java.awt.Color(253, 115, 108));
        carTypeErrorLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeErrorLBL2.setText(" campo requerido");
        carTypeErrorLBL2.setOpaque(true);

        carTypeLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeLBL.setText("tipo de vehiculo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carTypeLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(carTypeCb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carTypeErrorLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(carTypeLBL)
                .addGap(2, 2, 2)
                .addComponent(carTypeCb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carTypeErrorLBL2))
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
                    .addComponent(reservationTurnLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationTurnRb)
                    .addComponent(reservationTurnErrorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        paymentMarkErrorLBL2.setBackground(new java.awt.Color(253, 115, 108));
        paymentMarkErrorLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        paymentMarkErrorLBL2.setText(" campo requerido");
        paymentMarkErrorLBL2.setOpaque(true);

        paymentMarkLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        paymentMarkLBL2.setText("marca de pago");

        paymentMarkRb2.setText("pago");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentMarkLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(paymentMarkRb2)
            .addComponent(paymentMarkErrorLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(paymentMarkLBL2)
                .addGap(2, 2, 2)
                .addComponent(paymentMarkRb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentMarkErrorLBL2))
        );

        reservationMounthBTN.setBackground(new java.awt.Color(255, 255, 255));
        reservationMounthBTN.setForeground(new java.awt.Color(1, 1, 1));
        reservationMounthBTN.setText("reservar");
        reservationMounthBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reservationMounthBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationMounthBTNMouseClicked(evt);
            }
        });
        reservationMounthBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationMounthBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reservationDataPNLLayout = new javax.swing.GroupLayout(reservationDataPNL);
        reservationDataPNL.setLayout(reservationDataPNLLayout);
        reservationDataPNLLayout.setHorizontalGroup(
            reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationDataPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reservationMounthBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reservationDataPNLLayout.setVerticalGroup(
            reservationDataPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDataPNLLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(reservationMounthBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        reservationDataPNL1.setBackground(new java.awt.Color(254, 254, 254));
        reservationDataPNL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        justWashedBTN.setBackground(new java.awt.Color(255, 255, 255));
        justWashedBTN.setForeground(new java.awt.Color(1, 1, 1));
        justWashedBTN.setText("lavado");
        justWashedBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        justWashedBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                justWashedBTNMouseClicked(evt);
            }
        });
        justWashedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justWashedBTNActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        carTypeErrorLBL.setBackground(new java.awt.Color(253, 115, 108));
        carTypeErrorLBL.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeErrorLBL.setText(" campo requerido");
        carTypeErrorLBL.setOpaque(true);

        carTypeLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeLBL1.setText("tipo de vehiculo");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carTypeLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carTypeCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carTypeErrorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(carTypeLBL1)
                .addGap(2, 2, 2)
                .addComponent(carTypeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carTypeErrorLBL))
        );

        javax.swing.GroupLayout reservationDataPNL1Layout = new javax.swing.GroupLayout(reservationDataPNL1);
        reservationDataPNL1.setLayout(reservationDataPNL1Layout);
        reservationDataPNL1Layout.setHorizontalGroup(
            reservationDataPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationDataPNL1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reservationDataPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(justWashedBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        reservationDataPNL1Layout.setVerticalGroup(
            reservationDataPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDataPNL1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(justWashedBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        reservationDataPNL2.setBackground(new java.awt.Color(254, 254, 254));
        reservationDataPNL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        documentErrorLBL1.setBackground(new java.awt.Color(253, 115, 108));
        documentErrorLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentErrorLBL1.setText(" campo requerido");
        documentErrorLBL1.setOpaque(true);

        documentTf1.setBackground(new java.awt.Color(255, 255, 255));
        documentTf1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentTf1.setForeground(new java.awt.Color(0, 0, 0));

        documentLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        documentLBL1.setText("documento");
        documentLBL1.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documentTf1)
                    .addComponent(documentErrorLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(documentLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(documentLBL1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentErrorLBL1))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        carRegistrationErrorLBL1.setBackground(new java.awt.Color(253, 115, 108));
        carRegistrationErrorLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationErrorLBL1.setText(" campo requerido");
        carRegistrationErrorLBL1.setOpaque(true);

        carRegistrationTb1.setBackground(new java.awt.Color(255, 255, 255));
        carRegistrationTb1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationTb1.setForeground(new java.awt.Color(0, 0, 0));

        carRegistrationLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carRegistrationLBL1.setText("matricula");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carRegistrationTb1)
                    .addComponent(carRegistrationErrorLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carRegistrationLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(carRegistrationLBL1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carRegistrationErrorLBL1))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        carTypeErrorLBL1.setBackground(new java.awt.Color(253, 115, 108));
        carTypeErrorLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeErrorLBL1.setText(" campo requerido");
        carTypeErrorLBL1.setOpaque(true);

        carTypeLBL2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        carTypeLBL2.setText("tipo de vehiculo");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carTypeLBL2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(carTypeCb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carTypeErrorLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(carTypeLBL2)
                .addGap(2, 2, 2)
                .addComponent(carTypeCb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carTypeErrorLBL1))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        paymentMarkErrorLBL1.setBackground(new java.awt.Color(253, 115, 108));
        paymentMarkErrorLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        paymentMarkErrorLBL1.setText(" campo requerido");
        paymentMarkErrorLBL1.setOpaque(true);

        reservationTurnLBL1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        reservationTurnLBL1.setText("marca de pago");

        paymentMarkRb1.setText("pago");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationTurnLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentMarkRb1)
                    .addComponent(paymentMarkErrorLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(reservationTurnLBL1)
                .addGap(2, 2, 2)
                .addComponent(paymentMarkRb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentMarkErrorLBL1))
        );

        reservationHourBTN.setBackground(new java.awt.Color(255, 255, 255));
        reservationHourBTN.setForeground(new java.awt.Color(1, 1, 1));
        reservationHourBTN.setText("reservar");
        reservationHourBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reservationHourBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationHourBTNMouseClicked(evt);
            }
        });
        reservationHourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationHourBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reservationDataPNL2Layout = new javax.swing.GroupLayout(reservationDataPNL2);
        reservationDataPNL2.setLayout(reservationDataPNL2Layout);
        reservationDataPNL2Layout.setHorizontalGroup(
            reservationDataPNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationDataPNL2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reservationDataPNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservationDataPNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reservationHourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        reservationDataPNL2Layout.setVerticalGroup(
            reservationDataPNL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDataPNL2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(reservationHourBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel1.setText("solo lavado");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel2.setText("reserva por hora");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel3.setText("reserva por mes");

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(reservationDataPNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationDataPNL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(reservationDataPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(513, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationDataPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationDataPNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationDataPNL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("cliente", pnCliente);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
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
       
    private void reservationHourBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationHourBTNMouseClicked
        EventsFrame.NewReservationHour(this.reservationHour);
    }//GEN-LAST:event_reservationHourBTNMouseClicked

    private void reservationHourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationHourBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationHourBTNActionPerformed

    private void justWashedBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_justWashedBTNMouseClicked
       EventsFrame.NewWashed(this.onlyWashed);
    }//GEN-LAST:event_justWashedBTNMouseClicked

    private void justWashedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justWashedBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_justWashedBTNActionPerformed

    private void reservationMounthBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMounthBTNMouseClicked
         EventsFrame.NewReservationMounth(this.reservationMonth);
    }//GEN-LAST:event_reservationMounthBTNMouseClicked

    private void reservationMounthBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationMounthBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationMounthBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGestionReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carRegistrationErrorLBL1;
    private javax.swing.JLabel carRegistrationErrorLBL2;
    private javax.swing.JLabel carRegistrationErrorLBL4;
    private javax.swing.JLabel carRegistrationLBL;
    private javax.swing.JLabel carRegistrationLBL1;
    private javax.swing.JLabel carRegistrationLBL3;
    private javax.swing.JTextField carRegistrationTb1;
    private javax.swing.JTextField carRegistrationTb2;
    private javax.swing.JTextField carRegistrationTb4;
    private javax.swing.JComboBox<String> carTypeCb;
    private javax.swing.JComboBox<String> carTypeCb1;
    private javax.swing.JComboBox<String> carTypeCb2;
    private javax.swing.JLabel carTypeErrorLBL;
    private javax.swing.JLabel carTypeErrorLBL1;
    private javax.swing.JLabel carTypeErrorLBL2;
    private javax.swing.JLabel carTypeLBL;
    private javax.swing.JLabel carTypeLBL1;
    private javax.swing.JLabel carTypeLBL2;
    private javax.swing.JLabel documentErrorLBL1;
    private javax.swing.JLabel documentErrorLBL2;
    private javax.swing.JLabel documentLBL;
    private javax.swing.JLabel documentLBL1;
    private javax.swing.JTextField documentTf1;
    private javax.swing.JTextField documentTf2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton justWashedBTN;
    private javax.swing.JLabel paymentMarkErrorLBL1;
    private javax.swing.JLabel paymentMarkErrorLBL2;
    private javax.swing.JLabel paymentMarkLBL2;
    private javax.swing.JRadioButton paymentMarkRb1;
    private javax.swing.JRadioButton paymentMarkRb2;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel reservationDataPNL;
    private javax.swing.JPanel reservationDataPNL1;
    private javax.swing.JPanel reservationDataPNL2;
    private javax.swing.JButton reservationHourBTN;
    private javax.swing.JButton reservationMounthBTN;
    private javax.swing.JLabel reservationTurnErrorLBL;
    private javax.swing.JLabel reservationTurnLBL;
    private javax.swing.JLabel reservationTurnLBL1;
    private javax.swing.JRadioButton reservationTurnRb;
    // End of variables declaration//GEN-END:variables
}
