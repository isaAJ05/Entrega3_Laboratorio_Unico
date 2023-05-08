

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;



public class rompecabezas extends javax.swing.JFrame {
  private String user;
    public rompecabezas(String name) {
        setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        this.user = name;
        setPreferredSize(new Dimension(800, 500));
        this.setResizable(false);
        this.setTitle("Rompecabezas");
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(),new Point(0,0),"Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelvolver = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        rompecabezas = new javax.swing.JLabel();
        facil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dificil = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        panelpuzzle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 20));

        btnVolver1.setBackground(new java.awt.Color(255, 153, 255));
        btnVolver1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(0, 0, 51));
        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar.png"))); // NOI18N
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolver1MousePressed(evt);
            }
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellap.png"))); // NOI18N
        r1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                r1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                r1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r1MousePressed(evt);
            }
        });
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puzzle2.jpg"))); // NOI18N
        r2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                r2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                r2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r2MousePressed(evt);
            }
        });
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        rompecabezas.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        rompecabezas.setForeground(new java.awt.Color(51, 51, 255));
        rompecabezas.setText("ROMPECABEZAS");
        getContentPane().add(rompecabezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        facil.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        facil.setForeground(new java.awt.Color(255, 255, 255));
        facil.setText("FÁCIL");
        getContentPane().add(facil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoja el rompecabezas que desea realizar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        dificil.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dificil.setForeground(new java.awt.Color(255, 255, 255));
        dificil.setText("DIFÍCIL");
        getContentPane().add(dificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoespacio(3) (1).png"))); // NOI18N
        fondo.setOpaque(true);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        panelpuzzle.setOpaque(false);

        javax.swing.GroupLayout panelpuzzleLayout = new javax.swing.GroupLayout(panelpuzzle);
        panelpuzzle.setLayout(panelpuzzleLayout);
        panelpuzzleLayout.setHorizontalGroup(
            panelpuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panelpuzzleLayout.setVerticalGroup(
            panelpuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(panelpuzzle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        rompecabezas01 a = new rompecabezas01(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        rompecabezas02 a = new rompecabezas02(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_r2ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1MousePressed

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver1MouseExited

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
        labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void r1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseEntered
        r1.setBorder(new LineBorder(Color.CYAN,4));
        facil.setForeground(Color.CYAN);
    }//GEN-LAST:event_r1MouseEntered

    private void r1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MousePressed
        r1.setBorder(new LineBorder(Color.CYAN,5));
        facil.setForeground(Color.CYAN);
    }//GEN-LAST:event_r1MousePressed

    private void r2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseEntered
        r2.setBorder(new LineBorder(Color.CYAN,4));
        dificil.setForeground(Color.CYAN);
    }//GEN-LAST:event_r2MouseEntered

    private void r2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MousePressed
       r2.setBorder(new LineBorder(Color.CYAN,5));
       dificil.setForeground(Color.CYAN);
    }//GEN-LAST:event_r2MousePressed

    private void r1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseExited
        r1.setBorder(new LineBorder(Color.WHITE,2));
        facil.setForeground(Color.WHITE);
    }//GEN-LAST:event_r1MouseExited

    private void r2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseExited
         r2.setBorder(new LineBorder(Color.WHITE,2));
         dificil.setForeground(Color.WHITE);
    }//GEN-LAST:event_r2MouseExited

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
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel dificil;
    private javax.swing.JLabel facil;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JPanel panelpuzzle;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JLabel rompecabezas;
    // End of variables declaration//GEN-END:variables
}
