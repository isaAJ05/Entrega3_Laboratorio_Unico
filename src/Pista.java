
import PanelesCarreraNave.SeleccionNavePanel;
import PanelesCarreraNave.PanelInfo;
import PanelesCarreraNave.CarreraPANELcarros;
import PanelesCarreraNave.CarreraPANELcarrosConArduino;
import PanelesCarreraNave.NaveJugador;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pista extends javax.swing.JFrame {

    public static int nave;
//    FondoPanel fondo=new FondoPanel();
    private String user;

    public Pista(String name) {
        this.user = name;

        initComponents();

        this.setLocationRelativeTo(null);//centrar ventana
        this.setTitle(" Carrera de Autos Espaciales"); //Titulo 

        SeleccionNavePanel NavePanel = new SeleccionNavePanel(user, nave);
        ShowPanel(NavePanel);

        CarreraPANELcarros Cpanel = new CarreraPANELcarros(user);
        add(Cpanel);

        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        SelectNAVEbtn.setEnabled(false);
        SelectNAVEbtn.setVisible(false);
        atras.setEnabled(false);
        atras.setVisible(false);

    }

    private void ShowPanel(JPanel p) { //Cambio de paneles metodo
        p.setSize(780, 370);
        p.setLocation(0, 0);
        visible2.removeAll();
        visible2.add(p, BorderLayout.CENTER);
        visible2.revalidate();
        visible2.repaint();
    }

    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos
    public static int espaciopista[][];
    public static int limiteF = 20, limiteC = 14, F;
    int Auto = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Visible = new javax.swing.JPanel();
        SelectNAVEbtn = new javax.swing.JButton();
        val = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        ArduinoPista = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        InfoBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        visible2 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera");
        setResizable(false);

        Visible.setBackground(new java.awt.Color(0, 0, 51));
        Visible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectNAVEbtn.setBackground(new java.awt.Color(153, 153, 255));
        SelectNAVEbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        SelectNAVEbtn.setForeground(new java.awt.Color(51, 51, 51));
        SelectNAVEbtn.setText("Naves");
        SelectNAVEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectNAVEbtnActionPerformed(evt);
            }
        });
        Visible.add(SelectNAVEbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 90, -1));

        val.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        val.setForeground(new java.awt.Color(255, 0, 0));
        Visible.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 360, 20));

        atras.setBackground(new java.awt.Color(153, 153, 255));
        atras.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        atras.setForeground(new java.awt.Color(51, 51, 51));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        Visible.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        ArduinoPista.setBackground(new java.awt.Color(153, 153, 255));
        ArduinoPista.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        ArduinoPista.setForeground(new java.awt.Color(51, 51, 51));
        ArduinoPista.setText("Remoto");
        ArduinoPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArduinoPistaActionPerformed(evt);
            }
        });
        Visible.add(ArduinoPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

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
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        Visible.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        Visible.add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 10));

        InfoBTN.setBackground(new java.awt.Color(153, 153, 255));
        InfoBTN.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InfoBTN.setForeground(new java.awt.Color(51, 51, 51));
        InfoBTN.setText("Info");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });
        Visible.add(InfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("CARRERA DE AUTOS ESPACIALES");
        Visible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 563, 60));

        btnStart.setBackground(new java.awt.Color(153, 153, 255));
        btnStart.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(51, 51, 51));
        btnStart.setText("Carrera");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        Visible.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        visible2.setBackground(new java.awt.Color(0, 0, 51));
        visible2.setEnabled(false);
        visible2.setOpaque(false);

        javax.swing.GroupLayout visible2Layout = new javax.swing.GroupLayout(visible2);
        visible2.setLayout(visible2Layout);
        visible2Layout.setHorizontalGroup(
            visible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        visible2Layout.setVerticalGroup(
            visible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        Visible.add(visible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 370));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoespacio(3) (1).png"))); // NOI18N
        Visible.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if (PanelesCarreraNave.NaveJugador.nave != 0) {
            CarreraPANELcarros Cpanel = new CarreraPANELcarros(user);
            ShowPanel(Cpanel); //Llamar el metodo para mostrar el panel 
            val.setText(null);
            btnStart.setEnabled(false);
            btnStart.setVisible(false);
            InfoBTN.setEnabled(false);
            InfoBTN.setVisible(false);
            atras.setEnabled(true);
            atras.setVisible(true);
            SelectNAVEbtn.setEnabled(false);
            SelectNAVEbtn.setVisible(false);
        } else {
            val.setText("(!) Debe escoger una nave antes de jugar.");
        }

    }//GEN-LAST:event_btnStartActionPerformed

    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
        PanelInfo InfoPANEL = new PanelInfo();
        ShowPanel(InfoPANEL);//Llamar el metodo para mostrar el panel 
        SelectNAVEbtn.setEnabled(true);
        SelectNAVEbtn.setVisible(true);
        btnStart.setEnabled(true);
        btnStart.setVisible(true);
    }//GEN-LAST:event_InfoBTNActionPerformed

    private void SelectNAVEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectNAVEbtnActionPerformed
        SeleccionNavePanel NavePanel = new SeleccionNavePanel(user, nave);
        ShowPanel(NavePanel);//Llamar el metodo para mostrar el panel 
        SelectNAVEbtn.setEnabled(false);
        SelectNAVEbtn.setVisible(false);
    }//GEN-LAST:event_SelectNAVEbtnActionPerformed

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
        labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver1MouseExited

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.setVisible(false);
        NaveJugador.nave = 0;
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void ArduinoPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArduinoPistaActionPerformed
        CarreraPANELcarrosConArduino NavePanel = new CarreraPANELcarrosConArduino(user);
        ShowPanel(NavePanel);//Llamar el metodo para mostrar el panel 
    }//GEN-LAST:event_ArduinoPistaActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        PanelInfo InfoPANEL = new PanelInfo();
        ShowPanel(InfoPANEL);//Llamar el metodo para mostrar el panel 
         atras.setEnabled(false);
        atras.setVisible(false);
        SelectNAVEbtn.setEnabled(true);
        SelectNAVEbtn.setVisible(true);
        btnStart.setEnabled(true);
        btnStart.setVisible(true);
        PanelesCarreraNave.NaveJugador.nave = 0;
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
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pista(null).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArduinoPista;
    private javax.swing.JButton InfoBTN;
    private javax.swing.JButton SelectNAVEbtn;
    private javax.swing.JPanel Visible;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel val;
    private javax.swing.JPanel visible2;
    // End of variables declaration//GEN-END:variables

//    class FondoPanel extends JPanel{
//        private Image imagen;
//        
//        @Override
//        public void paint(Graphics g){
//            imagen=new ImageIcon(getClass().getResource("\\IMGcars\\fondoespacio(3)(1).png")).getImage();
//            
//            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
//            setOpaque(false);
//            
//            super.paint(g);
//        }
//    }
}
