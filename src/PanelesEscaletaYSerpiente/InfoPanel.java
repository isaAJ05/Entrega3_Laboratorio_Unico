
package PanelesEscaletaYSerpiente;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class InfoPanel extends javax.swing.JPanel {
    //sonido mientras juega
    public static Clip clip;

    private void sonido2(String cadena) {
        try {
            URL url = getClass().getResource(cadena);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public class Utilidades4 {

        public static void detenerMusica4() {
            if (clip != null) {
                clip.stop();
            }
        }
    }
    public InfoPanel() {
        initComponents();
        sonido2("/Sonidos/aliens.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("INSTRUCCIONES DE USO ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(242, 135, 63));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("¡Bienvenido a \"Escaleras y Serpientes versión Espacial\"!\n\nEn este juego, tendrás la oportunidad de escoger tu avatar alien \ny recorrer un tablero espacial donde competirás contra nuestra \nadorada Stella por el primer lugar.\n\nPor favor ten en cuenta las siguientes instrucciones: \n\n1. Antes de comenzar, asegúrate de elegir tu avatar. \n   Recuerda elegir aquel que refleje mejor tu personalidad \n   extraterrestre ;)\n\n2. Selecciona la opción de \"Jugar\" para dirigirte a nuestro tablero.\n\n3. ¿Listo para empezar? Lanza el dado para comenzar tu turno. \n   ¡Que la suerte del universo esté de tu lado!\n\n4. Si caes en una casilla con una escalera, tu avatar despegará \n   hacia arriba. ¡Prepárate para llegar más rápido a la línea final!\n\n5. Pero ten cuidado, si caes en una casilla con una serpiente, tu \n   avatar espacial será atrapado y descenderás de golpe. \n   ¡Intenta evitar esas serpientes espaciales! \n\n6. Recuerda, debes avanzar por 35 casillas para llegar a la \n   línea final y ganar. \n   ¡Mantén tu concentración y no pierdas de vista tu objetivo final!\n\n¡Que la suerte espacial te acompañe!\n");
        jTextArea3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(jTextArea3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/paraescalera.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
