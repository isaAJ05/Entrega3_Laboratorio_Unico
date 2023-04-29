package PanelesCarreraNave;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CarreraPANELcarros extends javax.swing.JPanel {

    private String user;

    public CarreraPANELcarros(int[][] espaciopista) {

        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

        addKeyListener(new KeyListener() { //EVENTOS DEL TECLADO 
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public CarreraPANELcarros(String name) {
        this.user = name;
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

    }

    // Tomaremos primero a la nave azul como la nave del ususurio, mas adelante se habilitara la opcion de escoger. 
    //FICHAS Y NAVES
    public JLabel getAutoAzul() {  //Para el label que tiene el carro azul
        return AZULc;
    }

    public JLabel getAutoNaranja() { //Para el label que tiene el carro naranja
        return NARANJAc;
    }

    public JLabel getAutoVerde() { //Para el label que tiene el carro verde
        return VERDEc;
    }

    Random ran = new Random();
    private final int limiteF = 17, limiteC = 34; //Limites de la matriz
    private int casilla = 20;//Lo que medira nuestras casillas imaginarias de la matriz

    //El numero de columanas y filas multiplicado por el valor de la casilla debe dar valores 
    //cercanos o aproximas (segun el gusto) a las dimensiones del panel (Ancho, alto )
    private int[][] espaciopista;
    //Creacion de la matriz de la pista
    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos

    public int[][] Hacerespaciopista() {
        int F = 0, C = 0;
        int espaciopista[][] = new int[800][500];
        for (F = 0; F < limiteF; F++) {
            for (C = 0; C < limiteC; C++) {
                if (F == limiteF - 1 || F == 0 || C == 0) {
                    espaciopista[F][C] = 1; //Bordes de la pista
                } else {
                    if ((F >= 1 | F < limiteF - 2) & C == limiteC - 1) {
                        espaciopista[F][C] = 2; //Linea de meta
                    } else {
                        espaciopista[F][C] = 0; //Espacio donde los carritos se moveran 
                    }
                }
            }
        }
        return espaciopista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioBTN = new javax.swing.JButton();
        Mensajito = new javax.swing.JLabel();
        VERDEc = new javax.swing.JLabel();
        NARANJAc = new javax.swing.JLabel();
        AZULc = new javax.swing.JLabel();
        pistafondo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(780, 370));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioBTN.setBackground(new java.awt.Color(153, 153, 255));
        InicioBTN.setFont(new java.awt.Font("Monotxt_IV50", 1, 14)); // NOI18N
        InicioBTN.setText("Comenzar!");
        InicioBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InicioBTN.setBorderPainted(false);
        InicioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioBTNActionPerformed(evt);
            }
        });
        add(InicioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, 50));

        Mensajito.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        Mensajito.setForeground(new java.awt.Color(204, 204, 255));
        add(Mensajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 180, 30));

        VERDEc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2).png"))); // NOI18N
        add(VERDEc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 70));

        NARANJAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro_1.png"))); // NOI18N
        add(NARANJAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 70));

        AZULc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro (1).png"))); // NOI18N
        AZULc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AZULcKeyReleased(evt);
            }
        });
        add(AZULc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, -1));

        pistafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoPistaSinFOndo.png"))); // NOI18N
        add(pistafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 780, 390));
    }// </editor-fold>//GEN-END:initComponents


    private void InicioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioBTNActionPerformed
        InicioBTN.setVisible(false);
        Mensajito.setText("");
        
        //Primero la ubicacion de inicio para todas las naves
        AZULc.setLocation(0, AZULc.getLocation().y);
        NARANJAc.setLocation(0, NARANJAc.getLocation().y);
        VERDEc.setLocation(0, VERDEc.getLocation().y);

        espaciopista = Hacerespaciopista(); //llamar al que crea la matriz
        AZULc.requestFocus(); //CENTRAR EL MOVIMIENTO CON TECLAS A LA NAVE DEL USUARIO
        //Fin.setLocation(WIDTH, WIDTH);
        timer.start(); //Iniciar el timer para las otras dos naves competidores

    }//GEN-LAST:event_InicioBTNActionPerformed
    
// auto del usuario
private KeyListener AZULcKeyListener;
    private void AZULcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AZULcKeyReleased

        int x = AZULc.getX(), y = AZULc.getY();
        //En la matriz si es 0 el auto se movera, si no, no avanzara en esa casilla.
        
//        if ((AZULc.getLocation().x < (limiteC - 1) * casilla) && (NARANJAc.getLocation().x < (limiteC - 1) * casilla)
//                    && (VERDEc.getLocation().x < (limiteC - 1) * casilla)) {

            switch (evt.getKeyCode()) {
                case KeyEvent.VK_RIGHT: //DERECHA
                    Mensajito.setText("");
                    //(que no cruce el limite de la matriz) Y (verificar el valor dentro de la matriz sea valido (!=1))
                    //Si cumple las condiciones, podra moverse
                    if (x < (limiteC - 1) * casilla & espaciopista[y / casilla][(x / casilla) + 1] != 1) {
                        AZULc.setLocation(x + casilla, y);
                    }
                    break;
                case KeyEvent.VK_UP: //ARRIBA
                    Mensajito.setText("");
                    if (y > 0 & espaciopista[(y / casilla) - 1][x / casilla] != 1) {
                        AZULc.setLocation(x, y - casilla);

                    }
                    break;
                case KeyEvent.VK_DOWN: //ABAJO
                    Mensajito.setText("");
                    if (y < (limiteF - 1) * casilla & espaciopista[(y / casilla) + 1][x / casilla] != 1) {
                        AZULc.setLocation(x, y + casilla);

                    }
                    break;
                case KeyEvent.VK_LEFT: //Izquierda No PODRA retroceder, si lo hace empieza desde el inicio XD
                    Mensajito.setText(" No puedes retroceder !");
                    AZULc.setLocation(x, y);
                    InicioBTN.setVisible(true);
                    timer.stop();
                    break;

            }
            System.out.println("\n USUARIO x= " + x + " , y= " + y); //Valor Coorenada Usuario

            //valor de casilla en la matriz
            System.out.println("Casilla de la derecha = " + espaciopista[y / casilla][(x / casilla) + 1]);
            System.out.println("Casilla de la UP = " + espaciopista[(y / casilla) - 1][x / casilla]);
            System.out.println("Casilla de la Abajo = " + espaciopista[(y / casilla) + 1][x / casilla]);
        
    }//GEN-LAST:event_AZULcKeyReleased

    //Naves Competencia
    int Pos[] = {1, -1};
    int Vel[] = {0, 1, 2, 3};

    //Funcion para calcular las nuevas coordenadas del movimiento
    private int[] movimiento(int X, int Y, int casilla, int[][] espaciopista, int[] Pos, int[] Vel) {
        int[] xy = new int[2];
        //(Movimiento horizontal)
        int i = 0, j = 0;
        i = ran.nextInt(4);
        X = X + casilla * Vel[i];//Actualizar Coordenada X

        //( Movimiento vertical )
        j = ran.nextInt(2);
        if (espaciopista[(Y / casilla) - 1][X / casilla] != 0) {
            j = 0;
        }
        if (espaciopista[(Y / casilla) + 1][Y / casilla] != 0) {
            j = 1;
        }
        Y = Y + casilla * Pos[j]; //Actualizar Coordenada Y

        xy[0] = X;
        xy[1] = Y;
        return xy;
    }
//Iteracion
    Timer timer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int AX = AZULc.getX(), AY = AZULc.getY();
            int NX = NARANJAc.getX(), NY = NARANJAc.getY();//Obtener Componentes de las coordenadas
            int VX = VERDEc.getX(), VY = VERDEc.getY(); //Obtener Componentes de las coordenadas
            if ((AZULc.getLocation().x < (limiteC - 1) * casilla) && (NARANJAc.getLocation().x < (limiteC - 2) * casilla)
                    && (VERDEc.getLocation().x < (limiteC - 2) * casilla)) {
                /* Condicianl para que se muevan si aun no ha
                    llegado a la linea de meta( o al final de la matriz */

                //Nave Naranja ---------------------
                int[] xy = movimiento(NX, NY, casilla, espaciopista, Pos, Vel);
                NX = xy[0];
                NY = xy[1];
                NARANJAc.setLocation(NX, NY);//Actualizar Ubicacion

                //Nave Verde ---------------------
                xy = movimiento(VX, VY, casilla, espaciopista, Pos, Vel);
                VX = xy[0];
                VY = xy[1];
                VERDEc.setLocation(VX, VY);//Actualizar Ubicacion

                System.out.println("\n NARANJA NX= " + NX + " , y= " + NY); //Valor Coorenada NARANJA
                System.out.println(" casilla N " + espaciopista[NY / casilla][(NX / casilla)]);

                System.out.println("\n VERDE VX= " + VX + " , y= " + VY); //Valor Coorenada VERDE
                System.out.println("casila  V " + espaciopista[VY / casilla][(VX / casilla)]);

            }
//                if((AZULc.getLocation().x >= (limiteC - 1) * casilla)
//                        | (VERDEc.getLocation().x >= (limiteC - 1) * casilla)
//                        | (NARANJAc.getLocation().x >= (limiteC - 1) * casilla)){
//               
//                }
            if (espaciopista[AY / casilla][(AX / casilla)] == 2 | espaciopista[VY / casilla][(VX / casilla)] == 2 | espaciopista[NY / casilla][(NX / casilla)] == 2) {
                AZULc.removeKeyListener(AZULcKeyListener);
               
                if (AX > VX & AX > NX) {
                    JOptionPane.showMessageDialog(null, "\t!FELICIDADES " + user + "\n! HA GANADO LA CARRERA:D");

                } else {
                    if (NX > VX & NX > AX | VX > AX & VX > NX | VX == NX) {
                        JOptionPane.showMessageDialog(null, "\t Game Over " + user);

                    } else {
                        if (AX == NX) {
                            JOptionPane.showMessageDialog(null, "\t Empate " + user);
                        } else if (AX == VX) {
                            JOptionPane.showMessageDialog(null, "\t Empate " + user);

                        }
                    }

                }
                timer.stop();
                InicioBTN.setVisible(true);
               
            }

        }

    });

    //Obstaculos y bonus 
    /*Exisitiran unos obtaculos y premios que aumentaran o disminuiran la velocidad de TODAS las naves
    si pasan por cierta sona de la pista*/
//    Timer timer1 = new Timer(500, new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            
//            }
//        }
//    });

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AZULc;
    private javax.swing.JButton InicioBTN;
    private javax.swing.JLabel Mensajito;
    private javax.swing.JLabel NARANJAc;
    private javax.swing.JLabel VERDEc;
    private javax.swing.JLabel pistafondo;
    // End of variables declaration//GEN-END:variables

}
