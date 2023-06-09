

import Resultado.chao;
import Resultado.usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Principal2 extends javax.swing.JFrame {

    String name = usuario.name;
    FondoPanel fondo = new FondoPanel();

    //SUBRUTINA PARA APLICAR SONIDO
    private void sonido(String cadena) {
        try {
            Clip clip = AudioSystem.getClip();
            URL url = getClass().getResource(cadena);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip.open(audioIn);
            clip.start();

        } catch (Exception e) {
            //System.err.println(e.getMessage());
        }
    }

    public Principal2() {
        setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
         this.setTitle("Star Games");
        //para cuando se le de enter al label continue al siguiente
        nombre.setFocusable(true); // Hacer que el label sea "focusable"
        nombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String user;
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (nombre.getText().equals("")) {
                        sonido("/Sonidos/error.wav");
                        labeluser.setText("[!]Debe ingresar un nombre o apodo.");
                        user = nombre.getText();
                        name = user;
                    } else {
                        sonido("/Sonidos/boop.wav");
                        user = nombre.getText();
                        name = user;
                        Principal3 a = new Principal3(user);
                        a.setVisible(true);
                        dispose();
                    }
                }
            }

        });
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);

        this.setResizable(false);
        //cierre
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        Principal2 thisFrame = this;
// Agregar un WindowListener al frame principal
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrar el nuevo frame cuando se cierra el frame principal
               
                chao c = new chao(); // Crea una instancia de chao
                c.setVisible(true);
                thisFrame.dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new FondoPanel();
        nombre = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        labeluser = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 51));
        panel.setPreferredSize(new java.awt.Dimension(800, 500));
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setBackground(new java.awt.Color(204, 153, 255));
        nombre.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        nombre.setText("Player");
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        panel.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 210, 40));

        OK.setBackground(new java.awt.Color(153, 51, 255));
        OK.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        panel.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 40));

        labeluser.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        labeluser.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 443, -1, -1));

        volver.setBackground(new java.awt.Color(153, 51, 255));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver ←");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        panel.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/stella (2).png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 380, 286));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STAR GAMES");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 230, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hola, mi nombre es Stella y");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 300, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("seré tu guía el día de hoy");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 290, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Cuál es su nombre?");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed

        String user;
        if (nombre.getText().equals("")) {
            sonido("/Sonidos/error.wav");
            labeluser.setText("[!]Debe ingresar un nombre o apodo.");
            user = nombre.getText();
            name = user;
        } else {
            user = nombre.getText();
            name = user;
            Principal3 a = new Principal3(user);
            a.setVisible(true);
            sonido("/Sonidos/boop.wav");
            this.dispose();
        }
    }//GEN-LAST:event_OKActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        int press = evt.getKeyChar();

        boolean mayusculas = press >= 65 && press <= 90;
        boolean minusculas = press >= 97 && press <= 122;
        boolean espacio = press == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed

    }//GEN-LAST:event_panelKeyPressed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        sonido("/Sonidos/boop.wav");
        Principal a = new Principal();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        nombre.setText(null);
    }//GEN-LAST:event_nombreMouseClicked
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gr = panel.getGraphics();

//        gr.setColor(Color.yellow);
//        int[] vx = {60, 123, 150, 177, 240, 190, 200, 150, 100, 110};
//        int[] vy = {160, 160, 100, 160, 160, 200, 260, 220, 260, 200};
//        gr.fillPolygon(vx, vy, 10);
//
//        gr.setColor(Color.red);
//        int[] xt1 = {150, 123, 177};
//        int[] yt1 = {100, 160, 160};
//        gr.fillPolygon(xt1, yt1, 3);
//
//        gr.setColor(Color.green);
//        int[] xt2 = {123, 60, 110};
//        int[] yt2 = {160, 160, 200};
//        gr.fillPolygon(xt2, yt2, 3);
//
//        gr.setColor(Color.magenta);
//        int[] xt3 = {177, 240, 190};
//        int[] yt3 = {160, 160, 200};
//        gr.fillPolygon(xt3, yt3, 3);
//
//        gr.setColor(Color.blue);
//        int[] xt4 = {110, 150, 100};
//        int[] yt4 = {200, 220, 260};
//        gr.fillPolygon(xt4, yt4, 3);
//
//        gr.setColor(Color.cyan);
//        int[] xt5 = {190, 150, 200};
//        int[] yt5 = {200, 220, 260};
//        gr.fillPolygon(xt5, yt5, 3);
//        gr.setColor(Color.orange);
//        Font f3 = new Font("Engravers MT", Font.BOLD, 25);
//        gr.setFont(f3);
//        gr.drawString("STAR Games" + "", 310, 100);
//        g.fillOval(141, 200, 8, 13);
//        g.fillOval(167, 200, 8, 13);
//
//        gr.setColor(Color.white);
//        gr.fillOval(136, 170, 3, 3);
//        gr.fillOval(162, 170, 3, 3);
//
//        gr.setColor(Color.black);
//        g.fillOval(141, 217, 35, 20);
//        gr.setColor(Color.yellow);
//        gr.fillRect(133, 185, 35, 9);
//        gr.setColor(Color.white);
//        Font f2 = new Font("Monospaced", Font.PLAIN, 18);
//        gr.setFont(f2);
//        gr.drawString("Hola, mi nombre es Stella y", 300, 160);
//        gr.drawString("seré tu guía el día de hoy", 300, 180);
//        gr.drawString("¿Cuál es su nombre?", 350, 230);
    }

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
            java.util.logging.Logger.getLogger(Principal2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labeluser;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panel;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("\\imagenes\\fondoespacio (1).png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
