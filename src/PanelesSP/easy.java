/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelesSP;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */
public class easy extends javax.swing.JPanel {

    //SUBRUTINA PARA HACER QUE EL BOTON TENGA UN SOMBREADO
    private void cambiarcolor(JButton boton) {
    boton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent evt) {
            boton.setBackground(new Color(255, 153, 255));
             Timer timer = new Timer(2000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        boton.setBackground(new Color(255,255,255));
                    }
                });
                timer.setRepeats(false); // hacemos que el temporizador se ejecute solo una vez
                timer.start(); // iniciamos el temporizador
        }

        
    });
}
    private String name = null;
    public easy(String user) {
        initComponents();
        this.name = user;
       
        int i, j, auxt = 5, auxt2 = 6;
        //Matriz de botones [7][5]
        JButton botones[][] = {{boton11, boton12, boton13, boton14, boton15},
        {boton21, boton22, boton23, boton24, boton25},
        {boton31, boton32, boton33, boton34, boton35},
        {boton41, boton42, boton43, boton44, boton45},
        {boton51, boton52, boton53, boton54, boton55},
        {boton61, boton62, boton63, boton64, boton65},
        {boton71, boton72, boton73, boton74, boton75},};//matriz de botones

        
        //Vector de planetas [4] pero solo se usan 3 espacios
        String[] planetas = {"TIERRA", "CERES", "VENUS", ""};

        //Asignacion de letras a texto de la matriz de botones
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 5; j++) {
                cambiarcolor(botones[i][j]);//EJECUTAR LA SUBRUTINA
                //Letras aleatorias mayusculas usando Random
                Random random = new Random();
                char letra = (char) (random.nextInt(26) + 'A');
                String letraStr = String.valueOf(letra);
                botones[i][j].setText(letraStr);// se le asigna una letra aleatoria al texto de los botones

                //ORGANIZAR LETRAS DE PALABRAS SEGUN LA POSICIÓN DESEADA
                //De acuerdo a mi matriz planteada:
                //i representará mis filas
                //j representará mis columnas
                // TIERRA 
                if (i >= 1 && i <= 6 && j == 2) { // Posición Horizontal inversa: Fila 1-6, columnas 2
                    String caracter = planetas[0].substring(auxt, auxt2);//extraer caracteres de la palabra TIERRA
                    auxt2 = auxt;// uso de auxiliares para obtener valores deseados para una correcta extracción de caracteres
                    auxt = auxt - 1;
                    botones[i][j].setText(caracter);//se le asignan las letras correspondientes
                    // CERES
                } else if (i >= 1 && i < 6 && j < 5) { //Posición Diagonal: fila de 1-5, columnas 0-4
                    if (i == 1 && j == 0) {
                        String caracter2 = planetas[1].substring(j, i);//extracción de caracter personalizado 
                        botones[i][j].setText(caracter2);//LETRA C
                    } else if (i == 2 && j == 1) {
                        String caracter21 = planetas[1].substring(j, i);
                        botones[i][j].setText(caracter21);//LETRA E
                    } else if (i == 3 && j == 2) {
                        String caracter22 = planetas[1].substring(j, i);
                        botones[i][j].setText(caracter22);//LETRA R
                    } else if (i == 4 && j == 3) {
                        String caracter23 = planetas[1].substring(j, i);
                        botones[i][j].setText(caracter23);//LETRA E
                    } else if (i == 5 && j == 4) {
                        String caracter24 = planetas[1].substring(j, i);
                        botones[i][j].setText(caracter24);//LETRA S 
                    }
                    //VENUS
                } else if (i == 0 && j < 5) { //Posición Horizontal : fila 0, columna 0-4
                    String caracter3 = planetas[2].substring(j, j + 1);
                    botones[i][j].setText(caracter3);

                }
            }
        }
        //Contador para contabilizar palabras halladas y mostrarlas al usuario
        cont = 0;
        //Hacer invisible estrellas al inicio de apertura de la ventana
        chulito1.setVisible(false);
        chulito2.setVisible(false);
        chulito3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido4 = new javax.swing.JPanel();
        boton11 = new javax.swing.JButton();
        boton61 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton51 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton71 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton52 = new javax.swing.JButton();
        boton62 = new javax.swing.JButton();
        boton72 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        boton63 = new javax.swing.JButton();
        boton53 = new javax.swing.JButton();
        boton73 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton44 = new javax.swing.JButton();
        boton34 = new javax.swing.JButton();
        boton54 = new javax.swing.JButton();
        boton64 = new javax.swing.JButton();
        boton74 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton35 = new javax.swing.JButton();
        boton45 = new javax.swing.JButton();
        boton55 = new javax.swing.JButton();
        boton65 = new javax.swing.JButton();
        boton75 = new javax.swing.JButton();
        sopadeletras = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        solucion = new javax.swing.JButton();
        palabrasencontradas = new javax.swing.JLabel();
        instrucciones = new javax.swing.JButton();
        pista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chulito1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chulito2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chulito3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelvolver = new javax.swing.JLabel();
        btnVolver3 = new javax.swing.JButton();

        contenido4.setBackground(new java.awt.Color(0, 0, 204));
        contenido4.setName("STAR GAMES: Sopa de letras Planetas"); // NOI18N
        contenido4.setOpaque(false);
        contenido4.setPreferredSize(new java.awt.Dimension(800, 496));
        contenido4.setVerifyInputWhenFocusTarget(false);
        contenido4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                contenido4MouseMoved(evt);
            }
        });

        boton11.setText("jButton2");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton61.setText("jButton2");
        boton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton61ActionPerformed(evt);
            }
        });

        boton41.setText("jButton2");

        boton51.setText("jButton2");

        boton21.setText("jButton2");
        boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton21ActionPerformed(evt);
            }
        });

        boton31.setText("jButton2");
        boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton31ActionPerformed(evt);
            }
        });

        boton71.setText("jButton2");

        boton12.setText("jButton2");

        boton22.setText("jButton2");

        boton32.setText("jButton2");
        boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton32ActionPerformed(evt);
            }
        });

        boton42.setText("jButton2");

        boton52.setText("jButton2");

        boton62.setText("jButton2");

        boton72.setText("jButton2");
        boton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton72ActionPerformed(evt);
            }
        });

        boton13.setText("jButton2");

        boton23.setText("jButton2");
        boton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton23ActionPerformed(evt);
            }
        });

        boton43.setText("jButton2");

        boton33.setText("jButton2");

        boton63.setText("jButton2");

        boton53.setText("jButton2");
        boton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton53ActionPerformed(evt);
            }
        });

        boton73.setText("jButton2");
        boton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton73ActionPerformed(evt);
            }
        });

        boton14.setText("jButton2");
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setText("jButton2");
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton24.setText("jButton2");
        boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton24ActionPerformed(evt);
            }
        });

        boton44.setText("jButton2");
        boton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton44ActionPerformed(evt);
            }
        });

        boton34.setText("jButton2");
        boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton34ActionPerformed(evt);
            }
        });

        boton54.setText("jButton2");
        boton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton54ActionPerformed(evt);
            }
        });

        boton64.setText("jButton2");
        boton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton64ActionPerformed(evt);
            }
        });

        boton74.setText("jButton2");
        boton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton74ActionPerformed(evt);
            }
        });

        boton25.setText("jButton2");
        boton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton25ActionPerformed(evt);
            }
        });

        boton35.setText("jButton2");
        boton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton35ActionPerformed(evt);
            }
        });

        boton45.setText("jButton2");
        boton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton45ActionPerformed(evt);
            }
        });

        boton55.setText("jButton2");
        boton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton55ActionPerformed(evt);
            }
        });

        boton65.setText("jButton2");
        boton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton65ActionPerformed(evt);
            }
        });

        boton75.setText("jButton2");
        boton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton75ActionPerformed(evt);
            }
        });

        sopadeletras.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        sopadeletras.setForeground(new java.awt.Color(255, 255, 255));
        sopadeletras.setText("SOPA DE LETRAS STAR ");

        siguiente.setBackground(new java.awt.Color(255, 153, 255));
        siguiente.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        siguiente.setForeground(new java.awt.Color(0, 0, 51));
        siguiente.setText("NEXT LEVEL");
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        solucion.setBackground(new java.awt.Color(255, 153, 255));
        solucion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        solucion.setForeground(new java.awt.Color(0, 0, 51));
        solucion.setText("Ver solución");
        solucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionActionPerformed(evt);
            }
        });

        palabrasencontradas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        palabrasencontradas.setForeground(new java.awt.Color(255, 255, 255));
        palabrasencontradas.setText("0/3");

        instrucciones.setBackground(new java.awt.Color(255, 153, 255));
        instrucciones.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        instrucciones.setForeground(new java.awt.Color(0, 0, 51));
        instrucciones.setText("Instrucciones");
        instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });

        pista.setBackground(new java.awt.Color(255, 153, 255));
        pista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        pista.setForeground(new java.awt.Color(0, 0, 51));
        pista.setText("Pista");
        pista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLANETAS");

        chulito1.setForeground(new java.awt.Color(255, 0, 0));
        chulito1.setText("★");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIERRA");

        chulito2.setForeground(new java.awt.Color(255, 0, 0));
        chulito2.setText("★");

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CERES");

        chulito3.setForeground(new java.awt.Color(255, 0, 0));
        chulito3.setText("★");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VENUS");

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver3.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnVolver3.setContentAreaFilled(false);
        btnVolver3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver3.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver3MouseExited(evt);
            }
        });
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenido4Layout = new javax.swing.GroupLayout(contenido4);
        contenido4.setLayout(contenido4Layout);
        contenido4Layout.setHorizontalGroup(
            contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solucion)
                .addGap(78, 78, 78)
                .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(contenido4Layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addComponent(chulito3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addComponent(chulito2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addComponent(chulito1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(contenido4Layout.createSequentialGroup()
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenido4Layout.createSequentialGroup()
                                .addComponent(boton31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenido4Layout.createSequentialGroup()
                                .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(sopadeletras))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido4Layout.createSequentialGroup()
                                .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel2))
                            .addGroup(contenido4Layout.createSequentialGroup()
                                .addComponent(boton41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenido4Layout.createSequentialGroup()
                                .addComponent(boton61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton64, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton65, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenido4Layout.createSequentialGroup()
                                .addComponent(boton71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton73, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton74, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenido4Layout.createSequentialGroup()
                                .addComponent(boton51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton53, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenido4Layout.setVerticalGroup(
            contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido4Layout.createSequentialGroup()
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(solucion)
                                .addComponent(pista)
                                .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contenido4Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(instrucciones)))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sopadeletras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton11)
                            .addComponent(boton12)
                            .addComponent(boton13)
                            .addComponent(boton14)
                            .addComponent(boton15))
                        .addGap(6, 6, 6)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton24)
                            .addComponent(boton23)
                            .addComponent(boton22)
                            .addComponent(boton21)
                            .addComponent(boton25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton32)
                            .addComponent(boton31)
                            .addComponent(boton33)
                            .addComponent(boton34)
                            .addComponent(boton35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton41)
                            .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton43)
                                .addComponent(boton44)
                                .addComponent(boton45)
                                .addComponent(boton42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton51)
                            .addComponent(boton52)
                            .addComponent(boton53)
                            .addComponent(boton54)
                            .addComponent(boton55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton61)
                            .addComponent(boton62)
                            .addComponent(boton63)
                            .addComponent(boton64)
                            .addComponent(boton65))
                        .addGap(10, 10, 10))
                    .addGroup(contenido4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chulito1)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chulito2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chulito3)
                            .addComponent(jLabel12))
                        .addGap(87, 87, 87)))
                .addGroup(contenido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton75)
                    .addComponent(boton74)
                    .addComponent(boton73)
                    .addComponent(boton72)
                    .addComponent(boton71))
                .addGap(18, 18, 18)
                .addComponent(siguiente)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido4, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contenido4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenido4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_contenido4MouseMoved

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        //Para mostrar pistas:
        //tengo en cuenta si ya el contador de la palabra está lleno ademas creo un auxiliar para cerciorarme de no repetir la palabra si ya la encontraron
        //la pista consiste en crear un fondo verde en la inicial de la letra de un planeta que no haya encontrado el usuario
        //psra la palabra urano la pista esta en las dos 2 ultimas letras
        if (tierra != 2 & taux == 1) { //pista letra inicial TIERRA
            boton73.setBackground(new Color(153, 255, 153));
            taux = 0;
        } else if (ceres != 2 & caux == 1) {//pista letra inicial CERES
            boton21.setBackground(new Color(153, 255, 153));
            caux = 0;
        } else if (venus != 2 & vaux == 1) {//pista letra inicial VENUS
            boton11.setBackground(new Color(153, 255, 153));
            vaux = 0;
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
        //Mostrar Joption pane de instrucciones
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 7x5 donde encontrarás 3 palabras ocultas"
            + "\nrelacionadas a nombres de planetas del sistema solar."
            + "\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
            + "\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
            + "\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
            + "\n     o inverso."
            + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
            + "\n      para que el sistema verifique tu elección.\n"
            + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
            + "\n      una estrella al lado de la palabra de la lista.\n"
            + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
            + "\n\n𝐏𝐋𝐔𝐒: Si lo deseas puedes pedir pistas o revelar la solución de la sopa de letras al seleccionar dichas opciones."
            + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_instruccionesActionPerformed

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
        //Al presionar este boton se podra visualizar la solución de la sopa de letras al ver con un fondo verde las letras de las palabras propuestas al usuario
        //TIERRA
        boton73.setBackground(Color.green);//Letra T
        boton63.setBackground(Color.green);//Letra I
        boton53.setBackground(Color.green);//Letra E
        boton43.setBackground(Color.green);//Letra R
        boton33.setBackground(Color.green);//Letra R
        boton23.setBackground(Color.green);//Letra A
        //CERES
        boton21.setBackground(Color.green);//Letra C
        boton32.setBackground(Color.green);//Letra E
        boton43.setBackground(Color.green);//Letra R
        boton54.setBackground(Color.green);//Letra E
        boton65.setBackground(Color.green);//Letra S
        //VENUS
        boton11.setBackground(Color.green);//Letra V
        boton12.setBackground(Color.green);//Letra E
        boton13.setBackground(Color.green);//Letra N
        boton14.setBackground(Color.green);//Letra U
        boton15.setBackground(Color.green);//Letra S

        //MOSTRAR PALABRAS ENCONTRADAS
        palabrasencontradas.setText("3/3");
        //MOSTRAR ESTRELLAS (CHULITOS)
        chulito1.setVisible(true);
        chulito2.setVisible(true);
        chulito3.setVisible(true);
    }//GEN-LAST:event_solucionActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        contenido4.removeAll();
        
        medium m = new medium(name);
        m.setSize(800, 496);
        m.setLocation(0, 0);
        m.setOpaque(false);
        contenido4.add(m);
        contenido4.revalidate();
        contenido4.repaint();
    }//GEN-LAST:event_siguienteActionPerformed

    private void boton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton75ActionPerformed

    private void boton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton65ActionPerformed
        ceres += 1;//Si se presiona este boton que representa la letra final de CERES el contador sumara 1
        if (ceres == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palabra CERES
            boton21.setBackground(Color.green);//Letra C
            boton32.setBackground(Color.green);//Letra E
            boton43.setBackground(Color.green);//Letra R
            boton54.setBackground(Color.green);//Letra E
            boton65.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra CERES en la lista
            chulito2.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton65ActionPerformed

    private void boton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton55ActionPerformed

    }//GEN-LAST:event_boton55ActionPerformed

    private void boton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton45ActionPerformed

    private void boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton35ActionPerformed

    private void boton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton25ActionPerformed

    private void boton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton74ActionPerformed

    private void boton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton64ActionPerformed

    private void boton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton54ActionPerformed

    private void boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton34ActionPerformed

    private void boton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton44ActionPerformed

    private void boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton24ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        venus += 1;//Si se presiona este boton que representa la letra final de VENUS el contador sumara 1
        if (venus == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara VENUS
            boton11.setBackground(Color.green);//Letra V
            boton12.setBackground(Color.green);//Letra E
            boton13.setBackground(Color.green);//Letra N
            boton14.setBackground(Color.green);//Letra U
            boton15.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra VENUS en la lista
            chulito3.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "!Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton73ActionPerformed
        tierra += 1;//Si se presiona este boton que representa la letra inicial de TIERRA el contador sumara 1
        if (tierra == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palabra TIERRA
            boton73.setBackground(Color.green);//Letra T
            boton63.setBackground(Color.green);//Letra I
            boton53.setBackground(Color.green);//Letra E
            boton43.setBackground(Color.green);//Letra R
            boton33.setBackground(Color.green);//Letra R
            boton23.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
            chulito1.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "!Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton73ActionPerformed

    private void boton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton53ActionPerformed

    private void boton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton23ActionPerformed
        tierra += 1;//Si se presiona este boton que representa la letra final de TIERRA el contador sumara 1
        if (tierra == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palabra TIERRA
            boton73.setBackground(Color.green);//Letra T
            boton63.setBackground(Color.green);//Letra I
            boton53.setBackground(Color.green);//Letra E
            boton43.setBackground(Color.green);//Letra R
            boton33.setBackground(Color.green);//Letra R
            boton23.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
            chulito1.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton23ActionPerformed

    private void boton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton72ActionPerformed

    }//GEN-LAST:event_boton72ActionPerformed

    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed

    }//GEN-LAST:event_boton32ActionPerformed

    private void boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton31ActionPerformed

    }//GEN-LAST:event_boton31ActionPerformed

    private void boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton21ActionPerformed
        ceres += 1;//Si se presiona este boton que representa la letra inicial de CERES el contador sumara 1
        if (ceres == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palabra CERES
            boton21.setBackground(Color.green);//Letra C
            boton32.setBackground(Color.green);//Letra E
            boton43.setBackground(Color.green);//Letra R
            boton54.setBackground(Color.green);//Letra E
            boton65.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra CERES en la lista
            chulito2.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton21ActionPerformed

    private void boton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton61ActionPerformed

    }//GEN-LAST:event_boton61ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        venus += 1;//Si se presiona este boton que representa la letra inicial de VENUS el contador sumara 1
        if (venus == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara VENUS
            boton11.setBackground(Color.green);//Letra V
            boton12.setBackground(Color.green);//Letra E
            boton13.setBackground(Color.green);//Letra N
            boton14.setBackground(Color.green);//Letra U
            boton15.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra VENUS en la lista
            chulito3.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/3");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/3");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/3");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (venus == 2 && tierra == 2 && ceres == 2) {
            JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
        }
    }//GEN-LAST:event_boton11ActionPerformed

    private void btnVolver3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseEntered
        labelvolver.setText(" Menú");
    }//GEN-LAST:event_btnVolver3MouseEntered

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        contenido4.removeAll();
        tema h = new tema(name);//Una instancia
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);

        contenido4.add(h);
        contenido4.revalidate();
        contenido4.repaint();
    }//GEN-LAST:event_btnVolver3ActionPerformed
    int cont;
    int venus = 0;    int ceres = 0;    int tierra = 0;    int taux = 1, caux = 1, vaux = 1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton34;
    private javax.swing.JButton boton35;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton boton44;
    private javax.swing.JButton boton45;
    private javax.swing.JButton boton51;
    private javax.swing.JButton boton52;
    private javax.swing.JButton boton53;
    private javax.swing.JButton boton54;
    private javax.swing.JButton boton55;
    private javax.swing.JButton boton61;
    private javax.swing.JButton boton62;
    private javax.swing.JButton boton63;
    private javax.swing.JButton boton64;
    private javax.swing.JButton boton65;
    private javax.swing.JButton boton71;
    private javax.swing.JButton boton72;
    private javax.swing.JButton boton73;
    private javax.swing.JButton boton74;
    private javax.swing.JButton boton75;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel chulito1;
    private javax.swing.JLabel chulito2;
    private javax.swing.JLabel chulito3;
    private javax.swing.JPanel contenido4;
    private javax.swing.JButton instrucciones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel palabrasencontradas;
    private javax.swing.JButton pista;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton solucion;
    private javax.swing.JLabel sopadeletras;
    // End of variables declaration//GEN-END:variables
}