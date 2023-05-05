package PanelesEscaletaYSerpiente;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AvataresPanel extends javax.swing.JPanel implements ActionListener {

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
            selm.setText("Seleccionado");
            selr.setText("");
            selv.setText("");
        } else if (e.getSource() == ArojoBTN) {
            AvatarJugador.avatar = 2;
            selr.setText("Seleccionado");
            selm.setText("");
            selv.setText("");
        } else if (e.getSource() == AverdeBTN) {
            AvatarJugador.avatar = 3;
            selv.setText("Seleccionado");
            selr.setText("");
            selm.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArojoBTN = new javax.swing.JButton();
        AmoradoBTN = new javax.swing.JButton();
        AverdeBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selr = new javax.swing.JLabel();
        selv = new javax.swing.JLabel();
        selm = new javax.swing.JLabel();

        setOpaque(false);

        ArojoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojo.png"))); // NOI18N
        ArojoBTN.setBorderPainted(false);
        ArojoBTN.setContentAreaFilled(false);
        ArojoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ArojoBTN.setFocusPainted(false);
        ArojoBTN.setFocusable(false);

        AmoradoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienMorado (1).png"))); // NOI18N
        AmoradoBTN.setBorderPainted(false);
        AmoradoBTN.setContentAreaFilled(false);
        AmoradoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmoradoBTN.setFocusPainted(false);
        AmoradoBTN.setFocusable(false);
        AmoradoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmoradoBTNActionPerformed(evt);
            }
        });

        AverdeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerde.png"))); // NOI18N
        AverdeBTN.setBorderPainted(false);
        AverdeBTN.setContentAreaFilled(false);
        AverdeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AverdeBTN.setFocusPainted(false);
        AverdeBTN.setFocusable(false);
        AverdeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverdeBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Escoja el alien con el que desea jugar");

        selr.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        selr.setForeground(new java.awt.Color(204, 0, 0));

        selv.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        selv.setForeground(new java.awt.Color(0, 102, 0));

        selm.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        selm.setForeground(new java.awt.Color(98, 24, 123));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ArojoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AverdeBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmoradoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selr, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AverdeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArojoBTN)
                    .addComponent(AmoradoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AmoradoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmoradoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmoradoBTNActionPerformed

    private void AverdeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverdeBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AverdeBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmoradoBTN;
    private javax.swing.JButton ArojoBTN;
    private javax.swing.JButton AverdeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel selm;
    private javax.swing.JLabel selr;
    private javax.swing.JLabel selv;
    // End of variables declaration//GEN-END:variables
}
