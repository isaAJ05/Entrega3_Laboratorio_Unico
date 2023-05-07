package PanelesEscaletaYSerpiente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AvataresPanel extends javax.swing.JPanel implements ActionListener {

    ClassLoader CL = getClass().getClassLoader();
    ImageIcon morado = new ImageIcon(CL.getResource("IMGescaleraSerp/morado150.png"));
    ImageIcon rojo = new ImageIcon(CL.getResource("IMGescaleraSerp/rojo150.png"));
    ImageIcon verde = new ImageIcon(CL.getResource("IMGescaleraSerp/verde150.png"));
    ImageIcon cb = new ImageIcon(CL.getResource("IMGcars/Check.png"));

    public AvataresPanel(int avatar) {
        initComponents();
        this.AmoradoBTN.addActionListener(this);
        this.ArojoBTN.addActionListener(this);
        this.AverdeBTN.addActionListener(this);
    }
    JButton btn;

    public void actionPerformed(ActionEvent e) {
        btn = (JButton) e.getSource();
        if (e.getSource() == AmoradoBTN) {
            AvatarJugador.avatar = 1;
            cb1.setDisabledIcon(null);
            cb2.setDisabledIcon(null);
            cb3.setDisabledIcon(cb);
            AmoradoBTN.setEnabled(false);
            ArojoBTN.setEnabled(true);
             AverdeBTN.setEnabled(true);
            ArojoBTN.setIcon(rojo);
            AverdeBTN.setIcon(verde);
            
        } else if (e.getSource() == ArojoBTN) {
            AvatarJugador.avatar = 2;
             cb2.setDisabledIcon(null);
            cb1.setDisabledIcon(cb);
            cb3.setDisabledIcon(null);
             ArojoBTN.setEnabled(false);
             AmoradoBTN.setEnabled(true);
             AverdeBTN.setEnabled(true);
            AmoradoBTN.setIcon(morado);
            AverdeBTN.setIcon(verde);
        } else if (e.getSource() == AverdeBTN) {
            AvatarJugador.avatar = 3;
            cb3.setDisabledIcon(null);
            cb1.setDisabledIcon(null);
            cb2.setDisabledIcon(cb);
           // AverdeBTN.setIcon(sverde);
            AverdeBTN.setEnabled(false);
            AmoradoBTN.setEnabled(true);
             ArojoBTN.setEnabled(true);
           ArojoBTN.setIcon(rojo);
            AmoradoBTN.setIcon(morado);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb3 = new javax.swing.JButton();
        cb1 = new javax.swing.JButton();
        cb2 = new javax.swing.JButton();
        ArojoBTN = new javax.swing.JButton();
        AmoradoBTN = new javax.swing.JButton();
        AverdeBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        cb3.setBorder(null);
        cb3.setContentAreaFilled(false);
        cb3.setEnabled(false);
        cb3.setPreferredSize(new java.awt.Dimension(30, 30));
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb1.setBorder(null);
        cb1.setContentAreaFilled(false);
        cb1.setEnabled(false);
        cb1.setPreferredSize(new java.awt.Dimension(30, 30));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setBorder(null);
        cb2.setContentAreaFilled(false);
        cb2.setEnabled(false);
        cb2.setPreferredSize(new java.awt.Dimension(30, 30));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        ArojoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/rojo150.png"))); // NOI18N
        ArojoBTN.setBorderPainted(false);
        ArojoBTN.setContentAreaFilled(false);
        ArojoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ArojoBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/srojo.png"))); // NOI18N
        ArojoBTN.setFocusPainted(false);
        ArojoBTN.setFocusable(false);
        ArojoBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojo.png"))); // NOI18N
        ArojoBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojo.png"))); // NOI18N
        ArojoBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojo.png"))); // NOI18N

        AmoradoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/morado150.png"))); // NOI18N
        AmoradoBTN.setBorderPainted(false);
        AmoradoBTN.setContentAreaFilled(false);
        AmoradoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmoradoBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/smorado.png"))); // NOI18N
        AmoradoBTN.setFocusPainted(false);
        AmoradoBTN.setFocusable(false);
        AmoradoBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienMorado (1).png"))); // NOI18N
        AmoradoBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienMorado (1).png"))); // NOI18N
        AmoradoBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienMorado (1).png"))); // NOI18N
        AmoradoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmoradoBTNActionPerformed(evt);
            }
        });

        AverdeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/verde150.png"))); // NOI18N
        AverdeBTN.setBorderPainted(false);
        AverdeBTN.setContentAreaFilled(false);
        AverdeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AverdeBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/sverde.png"))); // NOI18N
        AverdeBTN.setFocusPainted(false);
        AverdeBTN.setFocusable(false);
        AverdeBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerde.png"))); // NOI18N
        AverdeBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerde.png"))); // NOI18N
        AverdeBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerde.png"))); // NOI18N
        AverdeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverdeBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escoja el alien con el que desea jugar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(ArojoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(AverdeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(AmoradoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ArojoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmoradoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AverdeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AmoradoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmoradoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmoradoBTNActionPerformed

    private void AverdeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverdeBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AverdeBTNActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmoradoBTN;
    private javax.swing.JButton ArojoBTN;
    private javax.swing.JButton AverdeBTN;
    private javax.swing.JButton cb1;
    private javax.swing.JButton cb2;
    private javax.swing.JButton cb3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
