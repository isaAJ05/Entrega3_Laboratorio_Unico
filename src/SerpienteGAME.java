
import PanelesEscaletaYSerpiente.AvatarJugador;
import PanelesEscaletaYSerpiente.AvataresPanel;
import PanelesEscaletaYSerpiente.GamePanel2;
import PanelesEscaletaYSerpiente.InfoPanel;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SerpienteGAME extends javax.swing.JFrame {

    public static int avatar;

    private String user = null;

    public SerpienteGAME(String name) {
        this.user = name;
        initComponents();
        this.setLocationRelativeTo(null); //centrar ventana
        this.setTitle("Escalerita y serpiente"); //Titulo 

        AvataresPanel Avatares = new AvataresPanel(avatar);

        ShowPanel(Avatares);

        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        BTNAvatar.setEnabled(false);
        BTNAvatar.setVisible(false);
        atras.setEnabled(false);
        atras.setVisible(false);

        System.out.println("posj1 = " + PanelesEscaletaYSerpiente.GamePanel2.posj1);
        System.out.println("posj2 = " + PanelesEscaletaYSerpiente.GamePanel2.posj2);

    }

    private void ShowPanel(JPanel p) { //Cambio de paneles metodo
        p.setSize(765, 400);
        p.setLocation(0, 0);
        visible.removeAll();
        visible.add(p);
        visible.revalidate();
        visible.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        val = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        BTNAvatar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        JugarBTN = new javax.swing.JButton();
        visible = new javax.swing.JPanel();
        InfoBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        val.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        val.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 420, 20));

        atras.setBackground(new java.awt.Color(255, 102, 51));
        atras.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        BTNAvatar.setBackground(new java.awt.Color(255, 102, 51));
        BTNAvatar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BTNAvatar.setText("Avatar");
        BTNAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAvatarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        btnVolver1.setBackground(new java.awt.Color(255, 153, 255));
        btnVolver1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(0, 0, 51));
        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar.png"))); // NOI18N
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver1.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver1.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver1.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver1MouseExited(evt);
            }
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 20));

        JugarBTN.setBackground(new java.awt.Color(255, 102, 51));
        JugarBTN.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        JugarBTN.setText("Jugar!");
        JugarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(JugarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 80, -1));

        visible.setOpaque(false);

        javax.swing.GroupLayout visibleLayout = new javax.swing.GroupLayout(visible);
        visible.setLayout(visibleLayout);
        visibleLayout.setHorizontalGroup(
            visibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        visibleLayout.setVerticalGroup(
            visibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        getContentPane().add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        InfoBTN.setBackground(new java.awt.Color(255, 102, 51));
        InfoBTN.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        InfoBTN.setText("Info");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(InfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/fondogen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
        InfoPanel InfoP = new InfoPanel();
        ShowPanel(InfoP);
        JugarBTN.setEnabled(true);
        JugarBTN.setVisible(true);
        BTNAvatar.setEnabled(true);
        BTNAvatar.setVisible(true);
    }//GEN-LAST:event_InfoBTNActionPerformed

    private void JugarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBTNActionPerformed
        if (PanelesEscaletaYSerpiente.AvatarJugador.avatar != 0) {
            GamePanel2 Game = new GamePanel2(avatar);
            ShowPanel(Game);
            val.setText(null);
            JugarBTN.setEnabled(false);
            JugarBTN.setVisible(false);
            InfoBTN.setEnabled(false);
            InfoBTN.setVisible(false);
            atras.setEnabled(true);
            atras.setVisible(true);
        } else {
            val.setText("(!) Debe escoger un avatar antes de jugar.");
        }
        BTNAvatar.setEnabled(false);
        BTNAvatar.setVisible(false);


    }//GEN-LAST:event_JugarBTNActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.dispose();

        AvatarJugador.avatar = 0;
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
        labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver1MouseExited

    private void BTNAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAvatarActionPerformed
        AvataresPanel AvatarP = new AvataresPanel(avatar);
        ShowPanel(AvatarP);
        BTNAvatar.setEnabled(false);
        BTNAvatar.setVisible(false);
    }//GEN-LAST:event_BTNAvatarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        AvataresPanel AvatarP = new AvataresPanel(avatar);
        ShowPanel(AvatarP);
        atras.setEnabled(false);
        atras.setVisible(false);
        InfoBTN.setEnabled(true);
        InfoBTN.setVisible(true);
        JugarBTN.setEnabled(true);
        JugarBTN.setVisible(true);
         AvatarJugador.avatar = 0;
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerpienteGAME(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAvatar;
    private javax.swing.JButton InfoBTN;
    private javax.swing.JButton JugarBTN;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel val;
    private javax.swing.JPanel visible;
    // End of variables declaration//GEN-END:variables
}
