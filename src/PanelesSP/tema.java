package PanelesSP;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class tema extends javax.swing.JPanel {

    private String user = null;
public void sonidosp(String cadena) {
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
public void sonido1(JLabel label, String archivoSonido) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                try {
                    clip = AudioSystem.getClip();
                    URL url = getClass().getResource(archivoSonido);
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                    clip.open(audioIn);
                    clip.start();
                   
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (clip != null) {
                    clip.stop();
                }
            }
        });
    }
public void sonido2(JButton boton, String archivoSonido) {
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (boton==easyboton2 || boton==medium2 || boton==hardok2){
                    boton.setBackground(new Color(255,102,102));
                    //[255,102,102]
                    //255,153,255
                }
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
                    sonidosp("/Sonidos/seleccion.wav");
                    

                }
            });
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (boton==easyboton2 || boton==medium2 || boton==hardok2){
                    boton.setBackground(new Color(255,153,255));
                }
                super.mouseExited(e);
                if (clip != null) {
                    clip.stop();
                    clip.close();
                }
            }
        });
    }
    public tema(String name) {
        initComponents();
        this.user = name;
        sonido2(easyboton,"/Sonidos/nivel1.wav");
        sonido2(medium,"/Sonidos/nivel2.wav");
        sonido2(hardok,"/Sonidos/espacial.wav");
        
        sonido2(easyboton1,"/Sonidos/naruto.wav");
        sonido2(medium1,"/Sonidos/boku.wav");
        sonido2(hardok1,"/Sonidos/dazai.wav");
        
        sonido2(easyboton2,"/Sonidos/harry.wav");
        sonido2(medium2,"/Sonidos/memories.wav");
        sonido2(hardok2,"/Sonidos/charmer.wav");

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
        labelm = new javax.swing.JLabel();
        tituloanime = new javax.swing.JLabel();
        medium1 = new javax.swing.JButton();
        hardok1 = new javax.swing.JButton();
        easyboton1 = new javax.swing.JButton();
        labelanime = new javax.swing.JLabel();
        labelplanetas1 = new javax.swing.JLabel();
        medium = new javax.swing.JButton();
        hardok = new javax.swing.JButton();
        easyboton = new javax.swing.JButton();
        labeltotal1 = new javax.swing.JLabel();
        medium2 = new javax.swing.JButton();
        hardok2 = new javax.swing.JButton();
        easyboton2 = new javax.swing.JButton();
        labelmusica = new javax.swing.JLabel();

        contenido2.setBackground(new java.awt.Color(102, 102, 255));
        contenido2.setOpaque(false);
        contenido2.setPreferredSize(new java.awt.Dimension(800, 496));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("SELECCIONE LA TEMÁTICA DE JUEGO");

        labelm.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelm.setForeground(new java.awt.Color(204, 204, 204));
        labelm.setText("MUSICA");

        tituloanime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tituloanime.setForeground(new java.awt.Color(204, 204, 204));
        tituloanime.setText("ANIME");

        medium1.setBackground(new java.awt.Color(255, 153, 255));
        medium1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        medium1.setForeground(new java.awt.Color(0, 0, 51));
        medium1.setText("Medium");
        medium1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medium1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medium1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medium1MouseExited(evt);
            }
        });
        medium1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medium1ActionPerformed(evt);
            }
        });

        hardok1.setBackground(new java.awt.Color(255, 153, 255));
        hardok1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardok1.setForeground(new java.awt.Color(0, 0, 51));
        hardok1.setText("Hard");
        hardok1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hardok1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hardok1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hardok1MouseExited(evt);
            }
        });
        hardok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardok1ActionPerformed(evt);
            }
        });

        easyboton1.setBackground(new java.awt.Color(255, 153, 255));
        easyboton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        easyboton1.setForeground(new java.awt.Color(0, 0, 51));
        easyboton1.setText("Easy");
        easyboton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        easyboton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                easyboton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                easyboton1MouseExited(evt);
            }
        });
        easyboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyboton1ActionPerformed(evt);
            }
        });

        labelanime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/narutogiftransparente1.gif"))); // NOI18N
        labelanime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelanimeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelanimeMouseExited(evt);
            }
        });

        labelplanetas1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelplanetas1.setForeground(new java.awt.Color(204, 204, 204));
        labelplanetas1.setText("PLANETAS");

        medium.setBackground(new java.awt.Color(255, 153, 255));
        medium.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        medium.setForeground(new java.awt.Color(0, 0, 51));
        medium.setText("Medium");
        medium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mediumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mediumMouseExited(evt);
            }
        });
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        hardok.setBackground(new java.awt.Color(255, 153, 255));
        hardok.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardok.setForeground(new java.awt.Color(0, 0, 51));
        hardok.setText("Hard");
        hardok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hardok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hardokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hardokMouseExited(evt);
            }
        });
        hardok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardokActionPerformed(evt);
            }
        });

        easyboton.setBackground(new java.awt.Color(255, 153, 255));
        easyboton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        easyboton.setForeground(new java.awt.Color(0, 0, 51));
        easyboton.setText("Easy");
        easyboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        easyboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                easybotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                easybotonMouseExited(evt);
            }
        });
        easyboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easybotonActionPerformed(evt);
            }
        });

        labeltotal1.setBackground(new java.awt.Color(255, 255, 255));
        labeltotal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/solar.gif"))); // NOI18N
        labeltotal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeltotal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeltotal1MouseExited(evt);
            }
        });

        medium2.setBackground(new java.awt.Color(255, 153, 255));
        medium2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        medium2.setForeground(new java.awt.Color(0, 0, 51));
        medium2.setText("Medium");
        medium2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medium2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medium2ActionPerformed(evt);
            }
        });

        hardok2.setBackground(new java.awt.Color(255, 153, 255));
        hardok2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardok2.setForeground(new java.awt.Color(0, 0, 51));
        hardok2.setText("Hard");
        hardok2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hardok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardok2ActionPerformed(evt);
            }
        });

        easyboton2.setBackground(new java.awt.Color(255, 153, 255));
        easyboton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        easyboton2.setForeground(new java.awt.Color(0, 0, 51));
        easyboton2.setText("Easy");
        easyboton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        easyboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyboton2ActionPerformed(evt);
            }
        });

        labelmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/musica1.gif"))); // NOI18N
        labelmusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelmusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelmusicaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido2Layout = new javax.swing.GroupLayout(contenido2);
        contenido2.setLayout(contenido2Layout);
        contenido2Layout.setHorizontalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1))
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(medium))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(hardok))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(easyboton))
                    .addComponent(labeltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(labelplanetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(tituloanime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(medium1)
                        .addGap(2, 2, 2)
                        .addComponent(hardok1))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(easyboton1))
                    .addComponent(labelanime))
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(medium2))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(hardok2))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(labelm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(easyboton2))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contenido2Layout.setVerticalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(medium))
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(hardok))
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(easyboton))
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labeltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelplanetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addComponent(tituloanime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medium1)
                            .addComponent(hardok1)))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(easyboton1))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(medium2))
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(hardok2))
                            .addComponent(labelm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenido2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(easyboton2))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
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
         labelplanetas1.setForeground(new Color(102,255,204));

    }//GEN-LAST:event_labeltotal1MouseEntered

    private void labeltotal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeltotal1MouseExited
        labelplanetas1.setForeground(new Color(204,204,204));

    }//GEN-LAST:event_labeltotal1MouseExited

    private void hardokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardokActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
        contenido2.removeAll();
        instruccioneshp i = new instruccioneshp(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();    }//GEN-LAST:event_hardokActionPerformed
 
    private void easybotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easybotonActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
        contenido2.removeAll();
        instruccionesep i = new instruccionesep(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_easybotonActionPerformed

    private void easybotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easybotonMouseEntered
        easyboton.setBackground(new Color(102,255,204));
        
        //255,153,255
    }//GEN-LAST:event_easybotonMouseEntered

    private void mediumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseEntered
medium.setBackground(new Color(102,255,204));medium.setBackground(new Color(102,255,204));    }//GEN-LAST:event_mediumMouseEntered

    private void hardokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardokMouseEntered
        hardok.setBackground(new Color(102,255,204));
    }//GEN-LAST:event_hardokMouseEntered

    private void easyboton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyboton1MouseEntered
        easyboton1.setBackground(new Color(255,153,51));
        //255,153,255
    }//GEN-LAST:event_easyboton1MouseEntered

    private void easyboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyboton1ActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
        contenido2.removeAll();
        instruccionesea i = new instruccionesea(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_easyboton1ActionPerformed

    private void medium1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medium1MouseEntered
        medium1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_medium1MouseEntered

    private void medium1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medium1ActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
        contenido2.removeAll();
        instruccionesma i = new instruccionesma(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_medium1ActionPerformed

    private void hardok1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardok1MouseEntered
        hardok1.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_hardok1MouseEntered

    private void hardok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardok1ActionPerformed
        sonidosp("/Sonidos/seleccion.wav");
        contenido2.removeAll();
        instruccionesha i = new instruccionesha(user);
        i.setSize(800, 496);
        i.setLocation(0, 0);
        i.setOpaque(false);
        contenido2.add(i);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_hardok1ActionPerformed

    private void easybotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easybotonMouseExited
        easyboton.setBackground(new Color(255,153,255));
       
    }//GEN-LAST:event_easybotonMouseExited

    private void mediumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseExited
        medium.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_mediumMouseExited

    private void hardokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardokMouseExited
        hardok.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_hardokMouseExited

    private void easyboton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyboton1MouseExited
        easyboton1.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_easyboton1MouseExited

    private void medium1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medium1MouseExited
        medium1.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_medium1MouseExited

    private void hardok1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardok1MouseExited
       hardok1.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_hardok1MouseExited

    private void easyboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyboton2ActionPerformed
        contenido2.removeAll();
        instruccionesem e = new instruccionesem(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido2.add(e);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_easyboton2ActionPerformed

    private void medium2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medium2ActionPerformed
        contenido2.removeAll();
        instruccionesmm e = new instruccionesmm(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido2.add(e);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_medium2ActionPerformed

    private void hardok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardok2ActionPerformed
        contenido2.removeAll();
        instruccioneshm e = new instruccioneshm(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido2.add(e);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_hardok2ActionPerformed

    private void labelanimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelanimeMouseEntered
        tituloanime.setForeground(new Color(255,153,51));
    }//GEN-LAST:event_labelanimeMouseEntered

    private void labelanimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelanimeMouseExited
        tituloanime.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_labelanimeMouseExited

    private void labelmusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelmusicaMouseEntered
        labelm.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_labelmusicaMouseEntered

    private void labelmusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelmusicaMouseExited
        labelm.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_labelmusicaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido2;
    private javax.swing.JButton easyboton;
    private javax.swing.JButton easyboton1;
    private javax.swing.JButton easyboton2;
    private javax.swing.JButton hardok;
    private javax.swing.JButton hardok1;
    private javax.swing.JButton hardok2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelanime;
    private javax.swing.JLabel labelm;
    private javax.swing.JLabel labelmusica;
    private javax.swing.JLabel labelplanetas1;
    private javax.swing.JLabel labeltotal1;
    private javax.swing.JButton medium;
    private javax.swing.JButton medium1;
    private javax.swing.JButton medium2;
    private javax.swing.JLabel tituloanime;
    // End of variables declaration//GEN-END:variables
}
