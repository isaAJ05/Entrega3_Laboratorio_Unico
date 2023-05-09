
package PanelesSP;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class inicio extends javax.swing.JPanel {
//SUBRUTINA PARA APLICAR SONIDO
    public static Clip clips;
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
    private String user = null;
        public static class Utilidades2 {

        public static void detenerMusica2() {
            if (clips != null) {
                clips.stop();
                clips.close();
            }
        }
    }
    public inicio(String name) {
        initComponents();
        this.user = name;
        try {
            clips = AudioSystem.getClip();
            URL url = getClass().getResource("/Sonidos/galaxia.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clips.open(audioIn);
            clips.start();
            botoncomenzar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    clips.stop();

                }
            });
        } catch (Exception e) {
            //System.err.println(e.getMessage());
        }
        
    }

    public inicio() { //Constructor
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botoncomenzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STAR GAMES");

        botoncomenzar.setBackground(new java.awt.Color(255, 153, 255));
        botoncomenzar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botoncomenzar.setForeground(new java.awt.Color(0, 0, 51));
        botoncomenzar.setText("¡COMENCEMOS!");
        botoncomenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botoncomenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncomenzarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("!BIENVENIDX AL JUEGO DE SOPA DE LETRAS MÁS GENIAL DE LA GALAXIA!");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Estás listx para poner a prueba tus habilidades para encontrar palabras?");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("mundo lleno de diversión y aventura mientras buscas las palabras ocultas");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La sopa de letras STAR ofrece una amplia variedad de temas y dificultad, que hará sumergirte en un");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addComponent(botoncomenzar)
                        .addGap(333, 333, 333))))
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenidoLayout.createSequentialGroup()
                    .addGap(12, 86, Short.MAX_VALUE)
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(0, 86, Short.MAX_VALUE)))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(botoncomenzar)
                .addGap(34, 34, 34))
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenidoLayout.createSequentialGroup()
                    .addGap(0, 219, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(131, 131, 131)
                    .addComponent(jLabel3)
                    .addGap(0, 113, Short.MAX_VALUE)))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void botoncomenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncomenzarActionPerformed
        //Anthony Zabs helped :)
        sonido("/Sonidos/boop.wav");
        tema t = new tema(user);
        t.setSize(800, 496);
        t.setLocation(0, 0);
        t.setOpaque(false);
        contenido.removeAll();
        contenido.add(t);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botoncomenzarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncomenzar;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
