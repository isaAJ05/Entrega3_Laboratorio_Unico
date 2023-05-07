package PanelesSP;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class tema extends javax.swing.JPanel {

    private String user = null;

    public tema(String name) {
        initComponents();
        this.user = name;
        medium.setVisible(false);
        medium.setVisible(false);
        easyboton.setVisible(false);
        hardok.setVisible(false);
        labelplanetas.setVisible(false);
        medium.setEnabled(false);
        medium.setEnabled(false);
        hardok.setEnabled(false);

        //ICONOS : 
        //PLANETAS
//    Image icono = new ImageIcon(getClass().getResource("\\IMGSP\\solar.gif")).getImage();
//       
//        ImageIcon iconoespacio = new ImageIcon(icono.getScaledInstance(200, 184, Image.SCALE_DEFAULT));
//        labelplanetas.setIcon(iconoespacio);
//        //ANIME
//        ImageIcon icono2 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\narutogiftransparente.gif");
//        ImageIcon icononaruto = new ImageIcon(icono2.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT));
//        labelanime.setIcon(icononaruto);
//        //MUSICA
//        ImageIcon icono3 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\musica.gif");
//        ImageIcon iconomusica = new ImageIcon(icono3.getImage().getScaledInstance(161, 200, Image.SCALE_DEFAULT));
//        labelmusica.setIcon(iconomusica);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonanime = new javax.swing.JButton();
        botonmusica = new javax.swing.JButton();
        labelmusica = new javax.swing.JLabel();
        labelanime = new javax.swing.JLabel();
        labelplanetas = new javax.swing.JLabel();
        medium = new javax.swing.JButton();
        easyboton = new javax.swing.JButton();
        hardok = new javax.swing.JButton();
        labeltotal1 = new javax.swing.JLabel();
        labelimagen1 = new javax.swing.JLabel();

        contenido2.setBackground(new java.awt.Color(102, 102, 255));
        contenido2.setOpaque(false);
        contenido2.setPreferredSize(new java.awt.Dimension(800, 496));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("SELECCIONE LA TEMÁTICA DE JUEGO");

        botonanime.setBackground(new java.awt.Color(255, 153, 255));
        botonanime.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonanime.setForeground(new java.awt.Color(0, 0, 51));
        botonanime.setText("ANIME");
        botonanime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonanime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanimeActionPerformed(evt);
            }
        });

        botonmusica.setBackground(new java.awt.Color(255, 153, 255));
        botonmusica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonmusica.setForeground(new java.awt.Color(0, 0, 51));
        botonmusica.setText("MÚSICA");
        botonmusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonmusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmusicaActionPerformed(evt);
            }
        });

        labelmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/musica1.gif"))); // NOI18N

        labelanime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/narutogiftransparente1.gif"))); // NOI18N

        labelplanetas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelplanetas.setForeground(new java.awt.Color(204, 204, 204));
        labelplanetas.setText("PLANETAS");

        medium.setBackground(new java.awt.Color(255, 153, 255));
        medium.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        medium.setForeground(new java.awt.Color(0, 0, 51));
        medium.setText("Medium");
        medium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        easyboton.setBackground(new java.awt.Color(255, 153, 255));
        easyboton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        easyboton.setForeground(new java.awt.Color(0, 0, 51));
        easyboton.setText("Easy");
        easyboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        easyboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easybotonActionPerformed(evt);
            }
        });

        hardok.setBackground(new java.awt.Color(255, 153, 255));
        hardok.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardok.setForeground(new java.awt.Color(0, 0, 51));
        hardok.setText("Hard");
        hardok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hardok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardokActionPerformed(evt);
            }
        });

        labeltotal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeltotal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeltotal1MouseExited(evt);
            }
        });

        labelimagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/solar.gif"))); // NOI18N

        javax.swing.GroupLayout contenido2Layout = new javax.swing.GroupLayout(contenido2);
        contenido2.setLayout(contenido2Layout);
        contenido2Layout.setHorizontalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1))
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(hardok))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(easyboton))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(medium))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labeltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(botonanime, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(botonmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido2Layout.setVerticalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(hardok))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(easyboton))
                    .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(medium))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labeltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonanime)
                    .addComponent(botonmusica)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonanimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanimeActionPerformed
        //Anthony Zabs helped :)
        nivelanime n = new nivelanime(user);
        n.setSize(800, 496);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_botonanimeActionPerformed

    private void botonmusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmusicaActionPerformed
        nivelmusica n = new nivelmusica(user);
        n.setSize(800, 500);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_botonmusicaActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        entre++;
        contenido2.removeAll();
        instruccionesmp i = new instruccionesmp(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_mediumActionPerformed

    private void labeltotal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeltotal1MouseEntered
        
        labelplanetas.setVisible(true);
        
        easyboton.setVisible(true);
        medium.setVisible(true);
        hardok.setVisible(true);
        medium.setEnabled(true);
        easyboton.setEnabled(true);
        hardok.setEnabled(true);
    }//GEN-LAST:event_labeltotal1MouseEntered

    private void labeltotal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeltotal1MouseExited
       
        /**
        labelplanetas.setVisible(false);
        easyboton.setVisible(false);
        MEDIUM.setVisible(false);
        hardplanetas.setVisible(false);
        **/
    }//GEN-LAST:event_labeltotal1MouseExited

    private void hardokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardokActionPerformed
entre++;
        contenido2.removeAll();
        instruccioneshp i = new instruccioneshp(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();    }//GEN-LAST:event_hardokActionPerformed
int entre=0;
    private void easybotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easybotonActionPerformed
       entre++;
        contenido2.removeAll();
        instruccionesep i = new instruccionesep(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_easybotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonanime;
    private javax.swing.JButton botonmusica;
    private javax.swing.JPanel contenido2;
    private javax.swing.JButton easyboton;
    private javax.swing.JButton hardok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelanime;
    private javax.swing.JLabel labelimagen1;
    private javax.swing.JLabel labelmusica;
    private javax.swing.JLabel labelplanetas;
    private javax.swing.JLabel labeltotal1;
    private javax.swing.JButton medium;
    // End of variables declaration//GEN-END:variables
}
