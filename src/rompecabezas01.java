
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

// Créditos gif ganador: https://tenor.com/view/cute-panda-happy-love-yay-gif-16763329
// Créditos gif perdedor: https://images.app.goo.gl/FLzFLSCFVXRhy6NX8
public class rompecabezas01 extends javax.swing.JFrame implements ActionListener {

    boolean gana;
    public static String user;
    private int retryc = 0;
    public static String[] puntaje = new String[100];
    public static String punt;
    public static int p = 0;
    JLabel[][] status;
    JButton[][] piezas;
    ImageIcon[][] imagenes;
    ClassLoader CL = getClass().getClassLoader();
    ImageIcon pp1 = new ImageIcon(CL.getResource("imagenes/r1.png"));
    ImageIcon pp2 = new ImageIcon(CL.getResource("imagenes/r2.png"));
    ImageIcon pp3 = new ImageIcon(CL.getResource("imagenes/r3.png"));
    ImageIcon pp4 = new ImageIcon(CL.getResource("imagenes/r4.png"));
    ImageIcon pp5 = new ImageIcon(CL.getResource("imagenes/r5.png"));
    ImageIcon pp6 = new ImageIcon(CL.getResource("imagenes/r6.png"));
    ImageIcon pp7 = new ImageIcon(CL.getResource("imagenes/r7.png"));
    ImageIcon pp8 = new ImageIcon(CL.getResource("imagenes/r8.png"));
    ImageIcon pp9 = new ImageIcon(CL.getResource("imagenes/r9.png"));
    ImageIcon stella = new ImageIcon(CL.getResource("imagenes/stellap.png"));
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

    public rompecabezas01(String name) {

        setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        this.user = name;
        initComponents();
        this.setSize(800, 500);
        this.setVisible(true);
        this.setResizable(false);

        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);

        imagenes = new ImageIcon[][]{{pp1, pp2, pp3}, {pp4, pp5, pp6}, {pp7, pp8, pp9}};
        status = new JLabel[][]{{pieza1, pieza2, pieza3}, {pieza4, pieza5, pieza6}, {pieza7, pieza8, pieza9}};
        piezas = new JButton[][]{{p1, p2, p3}, {p4, p5, p6}, {p7, p8, p9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piezas[i][j].addActionListener(this);
            }
        }
        p1.setIcon(pp5);
        p2.setIcon(pp8);
        p3.setIcon(pp4);
        p4.setIcon(pp9);
        p5.setIcon(pp2);
        p6.setIcon(pp1);
        p7.setIcon(pp3);
        p8.setIcon(pp6);
        p9.setIcon(pp7);
        this.setTitle("Rompecabezas - Stella");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    int contador, f, c;
    JButton btn;

    public void actionPerformed(ActionEvent e) {

        btn = (JButton) e.getSource();

        vbtn.setText(null);
        int[] filas = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] columnas = {0, 1, 2, 0, 1, 2, 0, 1, 2};

        for (int i = 0; i < 9; i++) {
            f = filas[i];
            c = columnas[i];
            if (status[f][c].getIcon() == null) {
                status[f][c].setIcon(btn.getIcon());
                sonido("/Sonidos/ficha.wav");
                btn.setEnabled(false);
                if (contador == 9) {
                    break;
                }
                contador++;
                break;

            }

        }
        rompecabezas(contador, status, imagenes, piezas, user, punt, p);
        if (contador == 9) {
            contador = 0;
            btn = null;
        }

    }

    public void rompecabezas(int c, JLabel[][] labels, ImageIcon[][] images, JButton[][] buttons, String user, String punt, int p) {
        boolean k = true;
        int i, j;
        if (c == 9) {
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (labels[i][j].getIcon() != images[i][j]) {
                        k = false;
                    }
                }
            }
            if (k) {
                gana = true;
                if (puntaje[0] == null && puntaje[1] == null && puntaje[2] == null) {
                    puntaje[0] = user;
                    puntaje[1] = "Perfecto";
                    puntaje[2] = "0";
                }
                System.out.println(puntaje[0] + "\t" + puntaje[1] + "\t" + puntaje[2]);

                Resultado.Ganador g = new Resultado.Ganador(user);
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        buttons[i][j].setEnabled(true);
                        labels[i][j].setIcon(null);
                    }
                }
                retryc = 0;
                c = 0;

                File archivo;
                FileWriter escribir;
                PrintWriter linea;
                String nombre = "", nivel = "", clicks = "", pt = "";
                archivo = new File("puntuacion.txt");
                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile();
                        nombre = rompecabezas01.puntaje[0];
                        nivel = rompecabezas01.puntaje[1];
                        clicks = rompecabezas01.puntaje[2];
                        escribir = new FileWriter(archivo, true); // escribir en una linea de texto
                        linea = new PrintWriter(escribir); // escribir en varias lineas de texto

                        //escribir en el archivo
                        linea.println("");
                        linea.print(nombre + "\t" + nivel + "\t\t" + clicks);
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        nombre = rompecabezas01.puntaje[0];
                        nivel = rompecabezas01.puntaje[1];
                        clicks = rompecabezas01.puntaje[2];
                        escribir = new FileWriter(archivo, true); // escribir en una linea de texto
                        linea = new PrintWriter(escribir); // escribir en varias lineas de texto

                        //escribir en el archivo
                        linea.println("");
                        linea.print(nombre + "  |\t" + nivel + "  |\t" + clicks);
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                    try {
//                        FileReader leer = new FileReader("puntuacion.txt");
//                        BufferedReader buffer = new BufferedReader(leer);
//                        String lineaArchivo;
//                        while ((lineaArchivo = buffer.readLine()) != null) {
//                            Puntuacion.filearea.append(lineaArchivo + "\n");
//                        }
//                        buffer.close();
//                        leer.close();
//                    } catch (IOException ex) {
//                        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }
            } else {
                Resultado.Perdedor g = new Resultado.Perdedor(user);
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        buttons[i][j].setEnabled(true);
                        labels[i][j].setIcon(null);
                    }
                }
                retryc = 0;
                c = 0;

            }
        }
    }

    //  retryc = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        filearea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        verimg = new javax.swing.JLabel();
        rompecabezas = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PIEZAS = new javax.swing.JPanel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        ROMPECABEZAS = new javax.swing.JPanel();
        pieza1 = new javax.swing.JLabel();
        pieza2 = new javax.swing.JLabel();
        pieza3 = new javax.swing.JLabel();
        pieza4 = new javax.swing.JLabel();
        pieza5 = new javax.swing.JLabel();
        pieza6 = new javax.swing.JLabel();
        pieza7 = new javax.swing.JLabel();
        pieza8 = new javax.swing.JLabel();
        pieza9 = new javax.swing.JLabel();
        vbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        last = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filearea.setColumns(20);
        filearea.setRows(5);
        jScrollPane1.setViewportView(filearea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 310, 120));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 30, -1));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ver.setContentAreaFilled(false);
        ver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo0.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verMouseExited(evt);
            }
        });
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 30));

        verimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verimg.setPreferredSize(new java.awt.Dimension(306, 238));
        getContentPane().add(verimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        rompecabezas.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        rompecabezas.setForeground(new java.awt.Color(51, 51, 255));
        rompecabezas.setText("ROMPECABEZAS");
        getContentPane().add(rompecabezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        label.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        label.setForeground(new java.awt.Color(204, 204, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 150, 20));

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
        getContentPane().add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        volver.setBackground(new java.awt.Color(0, 0, 153));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PIEZAS.setBackground(new java.awt.Color(0, 0, 51));
        PIEZAS.setPreferredSize(new java.awt.Dimension(300, 231));
        PIEZAS.setLayout(new java.awt.GridLayout(3, 3));

        p1.setBackground(new java.awt.Color(204, 204, 255));
        p1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        PIEZAS.add(p1);

        p2.setBackground(new java.awt.Color(204, 204, 255));
        p2.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p2);

        p3.setBackground(new java.awt.Color(204, 204, 255));
        p3.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p3);

        p4.setBackground(new java.awt.Color(204, 204, 255));
        p4.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p4);

        p5.setBackground(new java.awt.Color(204, 204, 255));
        p5.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p5);

        p6.setBackground(new java.awt.Color(204, 204, 255));
        p6.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p6);

        p7.setBackground(new java.awt.Color(204, 204, 255));
        p7.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p7);

        p8.setBackground(new java.awt.Color(204, 204, 255));
        p8.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p8);

        p9.setBackground(new java.awt.Color(204, 204, 255));
        p9.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p9);

        jPanel1.add(PIEZAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 120, -1, -1));

        ROMPECABEZAS.setBackground(new java.awt.Color(0, 0, 51));
        ROMPECABEZAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ROMPECABEZAS.setPreferredSize(new java.awt.Dimension(300, 231));
        ROMPECABEZAS.setLayout(new java.awt.GridLayout(3, 3));
        ROMPECABEZAS.add(pieza1);
        ROMPECABEZAS.add(pieza2);
        ROMPECABEZAS.add(pieza3);
        ROMPECABEZAS.add(pieza4);
        ROMPECABEZAS.add(pieza5);
        ROMPECABEZAS.add(pieza6);
        ROMPECABEZAS.add(pieza7);
        ROMPECABEZAS.add(pieza8);
        ROMPECABEZAS.add(pieza9);

        jPanel1.add(ROMPECABEZAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 120, -1, -1));

        vbtn.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        vbtn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(vbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 490, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Haga click en las piezas en el orden que considere correcto.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 385, 490, 30));

        last.setBackground(new java.awt.Color(0, 0, 153));
        last.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lastimg.png"))); // NOI18N
        last.setContentAreaFilled(false);
        last.setPreferredSize(new java.awt.Dimension(32, 32));
        last.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lastimg0.png"))); // NOI18N
        last.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastMouseExited(evt);
            }
        });
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });
        jPanel1.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        limpiar.setBackground(new java.awt.Color(0, 0, 153));
        limpiar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarimg.png"))); // NOI18N
        limpiar.setBorder(null);
        limpiar.setContentAreaFilled(false);
        limpiar.setPreferredSize(new java.awt.Dimension(32, 32));
        limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarimg0.jpg"))); // NOI18N
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarMouseExited(evt);
            }
        });
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoespacio(3) (1).png"))); // NOI18N
        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        sonido("/Sonidos/boop.wav");
        rompecabezas a = new rompecabezas(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        if (contador == 0 || btn == null) {
            sonido("/Sonidos/error.wav");
            vbtn.setText("Debe iniciar para usar esta función.");
            retryc = 0;
        } else {
            retryc = 0;
            sonido("/Sonidos/boop.wav");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    piezas[i][j].setEnabled(true);
                    status[i][j].setIcon(null);
                    contador = 0;
                }
            }
        }

    }//GEN-LAST:event_limpiarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        sonido("/Sonidos/boop.wav");
        Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
        labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver1MouseExited


    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        retryc++;

        int lastf = -1, lastc = -1, f, c, i, j;
        int[] filas = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] columnas = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        JButton lastbtn = null;
        if (contador == 0 || btn == null) {
            sonido("/Sonidos/error.wav");
            vbtn.setText("Debe iniciar para usar esta función.");
            retryc = retryc - 1;
        } else {
            sonido("/Sonidos/boop.wav");
            for (i = 0; i < 9; i++) {
                //for (j = 0; j < 9; j++) {
                f = filas[i];
                c = columnas[i];

                if (status[f][c].getIcon() != null) {
                    lastf = f;
                    lastc = c;

                }

            }
            for (i = 0; i < 9; i++) {
                f = filas[i];
                c = columnas[i];
                if (piezas[f][c].getIcon() != null && piezas[f][c].getIcon() == status[lastf][lastc].getIcon()) {

                    lastbtn = piezas[f][c];
                }
            }
            if (lastbtn != null) {
                status[lastf][lastc].setIcon(null);
                lastbtn.setEnabled(true);
            }
            contador--;
            if (contador < 0) {
                contador = 0;
            }
            // rompecabezas(contador, status, imagenes, piezas, user, punt, p);
        }
        System.out.println("RRRR" + retryc);
        if (retryc == 0) {

            puntaje[0] = user;
            puntaje[1] = "Perfecto";
            puntaje[2] = "0";
        } else if (retryc >= 1 && retryc < 4) {
            puntaje[0] = user;
            puntaje[1] = "Medio";
            puntaje[2] = Integer.toString(retryc);
        } else if (retryc >= 4) {
            puntaje[0] = user;
            puntaje[1] = "Malo";
            puntaje[2] = Integer.toString(retryc);
        }

        rompecabezas(contador, status, imagenes, piezas, user, punt, p);

    }//GEN-LAST:event_lastActionPerformed

    private void lastMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastMouseEntered
        label.setText("Rehacer última pieza");
        label.setHorizontalAlignment(JLabel.CENTER);
    }//GEN-LAST:event_lastMouseEntered

    private void lastMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastMouseExited
        label.setText(null);
    }//GEN-LAST:event_lastMouseExited

    private void limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseEntered
        label.setText("Reintentar todo");
        label.setHorizontalAlignment(JLabel.CENTER);
    }//GEN-LAST:event_limpiarMouseEntered

    private void limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseExited
        label.setText(null);
    }//GEN-LAST:event_limpiarMouseExited

    private void verMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseEntered
        sonido("/Sonidos/pista.wav");
        jLabel1.setForeground(Color.CYAN);
        verimg.setBorder(new LineBorder(Color.WHITE));
        verimg.setIcon(stella);
    }//GEN-LAST:event_verMouseEntered

    private void verMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseExited
        jLabel1.setForeground(Color.WHITE);
        verimg.setBorder(null);
        verimg.setIcon(null);
    }//GEN-LAST:event_verMouseExited

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed

    }//GEN-LAST:event_verActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    public static void main(String args[]) {
        rompecabezas01 a = new rompecabezas01(null);
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas01(null).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PIEZAS;
    private javax.swing.JPanel ROMPECABEZAS;
    private javax.swing.JButton btnVolver1;
    public static javax.swing.JTextArea filearea;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JButton last;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JLabel pieza1;
    private javax.swing.JLabel pieza2;
    private javax.swing.JLabel pieza3;
    private javax.swing.JLabel pieza4;
    private javax.swing.JLabel pieza5;
    private javax.swing.JLabel pieza6;
    private javax.swing.JLabel pieza7;
    private javax.swing.JLabel pieza8;
    private javax.swing.JLabel pieza9;
    private javax.swing.JLabel rompecabezas;
    private javax.swing.JLabel vbtn;
    private final javax.swing.JButton ver = new javax.swing.JButton();
    private javax.swing.JLabel verimg;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
