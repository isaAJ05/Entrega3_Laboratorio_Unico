package PanelesCarreraNave;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SeleccionNavePanel extends javax.swing.JPanel implements ActionListener {

    private String name = null;
    ClassLoader CL = getClass().getClassLoader();
    ImageIcon cb = new ImageIcon(CL.getResource("IMGcars/Check.png"));
    ImageIcon azul = new ImageIcon(CL.getResource("IMGcars/axullcarro.png"));
    ImageIcon naranja = new ImageIcon(CL.getResource("IMGcars/naranjacarro.png"));
    ImageIcon verde = new ImageIcon(CL.getResource("IMGcars/verdecarro (2)_1.png"));
    public SeleccionNavePanel(String user, int nave) {
        initComponents();
        this.name = user;
        this.NaranjacBTN.addActionListener(this);
        this.AzulcBTN.addActionListener(this);
        this.VerdecBTN.addActionListener(this);
    }
    JButton btn;
    
    

    public void actionPerformed(ActionEvent e) {
        btn = (JButton) e.getSource();
        if (e.getSource() == NaranjacBTN) {
            NaveJugador.nave = 1;
            cb1.setDisabledIcon(cb);
            cb2.setDisabledIcon(null);
            cb3.setDisabledIcon(null);
            NaranjacBTN.setEnabled(false);
            AzulcBTN.setEnabled(true);
            VerdecBTN.setEnabled(true);
            AzulcBTN.setIcon(azul);
            VerdecBTN.setIcon(verde);
        } else  if (e.getSource() == AzulcBTN) {
            NaveJugador.nave = 2;
            cb2.setDisabledIcon(cb);
            cb1.setDisabledIcon(null);
            cb3.setDisabledIcon(null);
            NaranjacBTN.setEnabled(true);
            AzulcBTN.setEnabled(false);
            VerdecBTN.setEnabled(true);
            NaranjacBTN.setIcon(naranja);
            VerdecBTN.setIcon(verde);
        } else if (e.getSource() == VerdecBTN) {
            NaveJugador.nave = 3;
            cb3.setDisabledIcon(cb);
            cb1.setDisabledIcon(null);
            cb2.setDisabledIcon(null);
            NaranjacBTN.setEnabled(true);
            AzulcBTN.setEnabled(true);
            VerdecBTN.setEnabled(false);
            AzulcBTN.setIcon(azul);
            NaranjacBTN.setIcon(naranja);
        }
    }

    boolean OP, OPA = false, OPV = false, OPN = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AzulcBTN = new javax.swing.JButton();
        NaranjacBTN = new javax.swing.JButton();
        VerdecBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb3 = new javax.swing.JButton();
        cb1 = new javax.swing.JButton();
        cb2 = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AzulcBTN.setBackground(new java.awt.Color(52, 52, 121));
        AzulcBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro.png"))); // NOI18N
        AzulcBTN.setBorder(null);
        AzulcBTN.setBorderPainted(false);
        AzulcBTN.setContentAreaFilled(false);
        AzulcBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AzulcBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro25menos.png"))); // NOI18N
        AzulcBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AzulcBTNFocusGained(evt);
            }
        });
        AzulcBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulcBTNActionPerformed(evt);
            }
        });
        add(AzulcBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 230, 160));

        NaranjacBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro.png"))); // NOI18N
        NaranjacBTN.setBorderPainted(false);
        NaranjacBTN.setContentAreaFilled(false);
        NaranjacBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NaranjacBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/narajaselected.png"))); // NOI18N
        NaranjacBTN.setFocusPainted(false);
        NaranjacBTN.setFocusable(false);
        NaranjacBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro25menos.png"))); // NOI18N
        NaranjacBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/narajaselected.png"))); // NOI18N
        NaranjacBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjacBTNActionPerformed(evt);
            }
        });
        add(NaranjacBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 150));

        VerdecBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2)_1.png"))); // NOI18N
        VerdecBTN.setBorderPainted(false);
        VerdecBTN.setContentAreaFilled(false);
        VerdecBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VerdecBTN.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdeselectes.png"))); // NOI18N
        VerdecBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro25menos).png"))); // NOI18N
        VerdecBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdeselectes.png"))); // NOI18N
        VerdecBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdecBTNActionPerformed(evt);
            }
        });
        add(VerdecBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 150));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escoja el carro espacial con el que desea jugar");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 550, -1));

        cb3.setBorder(null);
        cb3.setContentAreaFilled(false);
        cb3.setEnabled(false);
        cb3.setPreferredSize(new java.awt.Dimension(30, 30));
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        cb1.setBorder(null);
        cb1.setContentAreaFilled(false);
        cb1.setEnabled(false);
        cb1.setPreferredSize(new java.awt.Dimension(30, 30));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        cb2.setBorder(null);
        cb2.setContentAreaFilled(false);
        cb2.setEnabled(false);
        cb2.setPreferredSize(new java.awt.Dimension(30, 30));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private Image imagen;

    private void Eleccion(boolean OP) {
        if (NaranjacBTN.isSelected()) {
            OPN = true;
            OPA = false;
            OPV = false;
        } else if (AzulcBTN.isSelected()) {
            OPA = true;
            OPN = false;
            OPV = false;
        } else if (VerdecBTN.isSelected()) {
            OPV = true;
            OPA = false;
            OPN = false;

        }
    }


    private void NaranjacBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjacBTNActionPerformed
        Eleccion(OP);

    }//GEN-LAST:event_NaranjacBTNActionPerformed

    private void AzulcBTNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AzulcBTNFocusGained

    }//GEN-LAST:event_AzulcBTNFocusGained

    private void AzulcBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulcBTNActionPerformed
        Eleccion(OP);
    }//GEN-LAST:event_AzulcBTNActionPerformed

    private void VerdecBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdecBTNActionPerformed
        Eleccion(OP);
    }//GEN-LAST:event_VerdecBTNActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AzulcBTN;
    private javax.swing.JButton NaranjacBTN;
    private javax.swing.JButton VerdecBTN;
    private javax.swing.JButton cb1;
    private javax.swing.JButton cb2;
    private javax.swing.JButton cb3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
