//GEN-FIRST:event_magentaActionPerformed
import Resultado.chao;
import java.awt.Color;//GEN-LAST:event_magentaActionPerformed
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Principal3 extends javax.swing.JFrame {
//SUBRUTINAS PARA APLICAR SONIDO

    private void sonido(String cadena) {
        try {
            Clip clip = AudioSystem.getClip();
            URL url = getClass().getResource(cadena);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip.open(audioIn);
            clip.start();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    private Clip clip;

    public void sonido2(JButton boton, String archivoSonido) {
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                try {
                    clip = AudioSystem.getClip();
                    URL url = getClass().getResource(archivoSonido);
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                    clip.open(audioIn);
                    clip.start();
                    boton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            clip.stop();

                        }
                    });
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (clip != null) {
                    clip.stop();
                    clip.close();
                }
            }
        });
    }
    private String name = null;

    public Principal3(String user) {
        setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        this.name = user;
        this.setTitle("Star Games");
        volver.setBackground(new Color(153, 51, 255));
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        //APLIOAR SONIDOS
        sonido2(cyan, "/Sonidos/cascabel.wav");
        sonido2(magenta, "/Sonidos/carrera.wav");
        sonido2(red, "/Sonidos/cartas.wav");
        sonido2(green, "/Sonidos/fichas.wav");
        sonido2(blue, "/Sonidos/burbujas.wav");
        //cierre
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        Principal3 thisFrame = this;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel = new javax.swing.JPanel();
        LabelCarta = new javax.swing.JLabel();
        LabelCarrera = new javax.swing.JLabel();
        LabelSerpEscl = new javax.swing.JLabel();
        LabelSopaLetras = new javax.swing.JLabel();
        LabelRompecabezas = new javax.swing.JLabel();
        red = new javax.swing.JButton();
        magenta = new javax.swing.JButton();
        green = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        cyan = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        stella = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 0, 51));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCarta.setBackground(new java.awt.Color(0, 0, 51));
        LabelCarta.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        LabelCarta.setForeground(new java.awt.Color(204, 204, 255));
        panel.add(LabelCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 120, 40));

        LabelCarrera.setBackground(new java.awt.Color(0, 0, 51));
        LabelCarrera.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        LabelCarrera.setForeground(new java.awt.Color(204, 204, 255));
        panel.add(LabelCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 200, 40));

        LabelSerpEscl.setBackground(new java.awt.Color(0, 0, 51));
        LabelSerpEscl.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        LabelSerpEscl.setForeground(new java.awt.Color(204, 204, 255));
        panel.add(LabelSerpEscl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 200, 40));

        LabelSopaLetras.setBackground(new java.awt.Color(0, 0, 51));
        LabelSopaLetras.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        LabelSopaLetras.setForeground(new java.awt.Color(204, 204, 255));
        LabelSopaLetras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panel.add(LabelSopaLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 150, 50));

        LabelRompecabezas.setBackground(new java.awt.Color(0, 0, 51));
        LabelRompecabezas.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        LabelRompecabezas.setForeground(new java.awt.Color(204, 204, 255));
        LabelRompecabezas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panel.add(LabelRompecabezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 40));

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        red.setForeground(new java.awt.Color(0, 0, 0));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CartaBTN.png"))); // NOI18N
        red.setBorderPainted(false);
        red.setContentAreaFilled(false);
        red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        red.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CartasBtn80.png"))); // NOI18N
        red.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/cartaBTN95.png"))); // NOI18N
        red.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                redMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                redMouseExited(evt);
            }
        });
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        panel.add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, 140));

        magenta.setBackground(new java.awt.Color(255, 51, 255));
        magenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/carreraBTN.png"))); // NOI18N
        magenta.setBorderPainted(false);
        magenta.setContentAreaFilled(false);
        magenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        magenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CarretaBTN80.png"))); // NOI18N
        magenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CarreraBTN95.png"))); // NOI18N
        magenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        magenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                magentaMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                magentaMouseExited(evt);
            }
        });
        magenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magentaActionPerformed(evt);
            }
        });
        panel.add(magenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 160, 130));

        green.setBackground(new java.awt.Color(0, 255, 51));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/RompeCabezaBTN.png"))); // NOI18N
        green.setBorderPainted(false);
        green.setContentAreaFilled(false);
        green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        green.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        green.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/Rompecabezasbtn80.png"))); // NOI18N
        green.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/RompecabezaBTN95.png"))); // NOI18N
        green.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                greenMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                greenMouseExited(evt);
            }
        });
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        panel.add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 110));

        blue.setBackground(new java.awt.Color(0, 0, 255));
        blue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeLetrasBTN.png"))); // NOI18N
        blue.setBorderPainted(false);
        blue.setContentAreaFilled(false);
        blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blue.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeletrasBTn80.png"))); // NOI18N
        blue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeletrasBTN95.png"))); // NOI18N
        blue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blueMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                blueMouseExited(evt);
            }
        });
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        panel.add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, 140));

        cyan.setBackground(new java.awt.Color(0, 255, 255));
        cyan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SerpienteEscaleraBTN.png"))); // NOI18N
        cyan.setBorderPainted(false);
        cyan.setContentAreaFilled(false);
        cyan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cyan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/sepientesecaleraBTN80.png"))); // NOI18N
        cyan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/EscaleraSerpienteBTN95.png"))); // NOI18N
        cyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cyan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cyanMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cyanMouseExited(evt);
            }
        });
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });
        panel.add(cyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 160, 130));

        volver.setBackground(new java.awt.Color(0, 0, 102));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver ←");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        panel.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        stella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/stella (5).png"))); // NOI18N
        panel.add(stella, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/fondoespacio (1) (1).png"))); // NOI18N
        panel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void redActionPerformed(java.awt.event.ActionEvent evt) {
        // BLACKJACK
        Mesa1 a = new Mesa1(name);
        a.setVisible(true);
        this.dispose();
    }

    private void magentaActionPerformed(java.awt.event.ActionEvent evt) {
        // CARRERAS
        Pista a = new Pista(name);
        a.setVisible(true);
        this.dispose();
    }

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {
        // ROMPECABEZAS
        rompecabezas a = new rompecabezas(name);
        a.setVisible(true);
        this.dispose();

    }

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {
        // SOPA DE LETRAS
        ASOPAstar a = new ASOPAstar(name);
        a.setVisible(true);
        this.dispose();
    }

    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {
        // SERPIENTES Y ESCALERAS
        //sonido("/Sonidos/aliens.wav");
        SerpienteGAME a = new SerpienteGAME(name);
        a.setVisible(true);
        this.dispose();
    }

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {
        sonido("/Sonidos/boop.wav");
        Principal2 a = new Principal2();
        a.setVisible(true);
        this.dispose();
    }

    private void redMouseEntered(java.awt.event.MouseEvent evt) {
        // red.setText("Black Jack");// cuando entra al boton se ve el texto (nombre del botón)
        LabelCarta.setText("Black Jack");
    }

    private void redMouseExited(java.awt.event.MouseEvent evt) {
        LabelCarta.setText(""); // Si no esta el mouse, no se ve el texto
    }
    // Lo mismo para el resto de los botones

    private void magentaMouseEntered(java.awt.event.MouseEvent evt) {
        LabelCarrera.setText("Carrera de Naves");
    }

    private void magentaMouseExited(java.awt.event.MouseEvent evt) {
        LabelCarrera.setText("");
    }

    private void cyanMouseEntered(java.awt.event.MouseEvent evt) {

        LabelSerpEscl.setText("Escaleras y Serpientes");
    }

    private void cyanMouseExited(java.awt.event.MouseEvent evt) {

        LabelSerpEscl.setText("");
    }

    private void blueMouseEntered(java.awt.event.MouseEvent evt) {
        LabelSopaLetras.setText("Sopa de letras");
    }

    private void blueMouseExited(java.awt.event.MouseEvent evt) {
        LabelSopaLetras.setText("");
    }

    private void greenMouseEntered(java.awt.event.MouseEvent evt) {
        LabelRompecabezas.setText("Rompecabezas");
    }

    private void greenMouseExited(java.awt.event.MouseEvent evt) {
        LabelRompecabezas.setText("");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gr = panel.getGraphics();
//
//        gr.setColor(Color.yellow);
//        int[] vx = {60, 123, 150, 177, 240, 190, 200, 150, 100, 110};
//        int[] vy = {160, 160, 100, 160, 160, 200, 260, 220, 260, 200};
//        gr.fillPolygon(vx, vy, 10);
//
//        gr.setColor(Color.red);
//        int[] xt1 = {150, 123, 177};
//        int[] yt1 = {100, 160, 160};
//        gr.fillPolygon(xt1, yt1, 3);
//        gr.fillOval(320, 180, 10, 10);
//
//        gr.setColor(Color.green);
//        int[] xt2 = {123, 60, 110};
//        int[] yt2 = {160, 160, 200};
//        gr.fillPolygon(xt2, yt2, 3);
//        gr.fillOval(320, 260, 10, 10);
//
//        gr.setColor(Color.magenta);
//        int[] xt3 = {177, 240, 190};
//        int[] yt3 = {160, 160, 200};
//        gr.fillPolygon(xt3, yt3, 3);
//        gr.fillOval(320, 200, 10, 10);
//
//        gr.setColor(Color.blue);
//        int[] xt4 = {110, 150, 100};
//        int[] yt4 = {200, 220, 260};
//        gr.fillPolygon(xt4, yt4, 3);
//        gr.fillOval(320, 240, 10, 10);
//
//        gr.setColor(Color.cyan);
//        int[] xt5 = {190, 150, 200};
//        int[] yt5 = {200, 220, 260};
//        gr.fillPolygon(xt5, yt5, 3);
//        gr.fillOval(320, 220, 10, 10);
//
//        gr.setColor(Color.orange);
//        Font f3 = new Font("Engravers MT", Font.BOLD, 25);
//        gr.setFont(f3);
//        gr.drawString("STAR Games" + "", 310, 100);
//
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

        gr.setColor(Color.white);
        Font f2 = new Font("Monospaced", Font.PLAIN, 18);
        gr.setFont(f2);
//        gr.drawString("En STAR GAMES puedes disfrutar", 280, 140);
//        gr.drawString("de 5 juegos distintos:", 280, 160);
//
//        gr.drawString("  ROJO: Cartas", 320, 190);
//        gr.drawString("  MAGENTA: Carreras", 320, 210);
//        gr.drawString("  CYAN: Serpientes y escaleras", 320, 230);
//        gr.drawString("  AZUL: Sopa de letras", 320, 250);
//        gr.drawString("  VERDE: Rompecabezas", 320, 270);
//
        gr.drawString("Hola " + name + " !", 500, 65);
        gr.drawString("¿Que deseas Jugar?", 500, 80);

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
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal3(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel LabelCarrera;
    private javax.swing.JLabel LabelCarta;
    private javax.swing.JLabel LabelRompecabezas;
    private javax.swing.JLabel LabelSerpEscl;
    private javax.swing.JLabel LabelSopaLetras;
    private javax.swing.JButton blue;
    private javax.swing.JButton cyan;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton green;
    private javax.swing.JButton magenta;
    private javax.swing.JPanel panel;
    private javax.swing.JButton red;
    private javax.swing.JLabel stella;
    private javax.swing.JButton volver;
    // End of variables declaration                   

}
