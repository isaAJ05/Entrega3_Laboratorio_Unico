
import Resultado.chao;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author nunez, Arrieta, Carpintero
 */
public class Principal extends javax.swing.JFrame {

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
            // System.err.println(e.getMessage());
        }

    }
     //sonido mientras juega
    public static Clip clip;
    private void sonido2(String cadena) {
        try {
            URL url = getClass().getResource(cadena);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            continuar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    clip.stop();
                }
            });
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public Principal() {
        setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        this.setTitle("Star Games");
        sonido2("/Sonidos/satellite.wav");
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        Principal thisFrame = this;
// Agregar un WindowListener al frame principal
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrar el nuevo frame cuando se cierra el frame principal
                clip.stop();
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
        continuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 51));

        continuar.setBackground(new java.awt.Color(153, 51, 255));
        continuar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/stella (1).png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(160, 160, 160))
        );

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

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        Principal2 a = new Principal2();
        a.setVisible(true);
        sonido("/Sonidos/boop.wav");

        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

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
//        
        gr.setColor(Color.white);
        Font f1 = new Font("Elephant", Font.BOLD, 20);
        gr.setFont(f1);
        gr.drawString("BIENVENIDX  A" + "", 442, 160);
        Font f2 = new Font("Monospaced", Font.PLAIN, 17);
        gr.setFont(f2);
        gr.drawString("by NIP creations" + "", 465, 230);

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
        gr.setColor(Color.orange);
        Font f3 = new Font("Engravers MT", Font.BOLD, 25);
        gr.setFont(f3);
        gr.drawString("STAR Games" + "", 428, 200);

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
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
