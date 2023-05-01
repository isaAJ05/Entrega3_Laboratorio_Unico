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
import javax.swing.JFrame;

/**
 *
 * @author Paula Núñez, Isabella Arrieta y Natalia Carpintero
 */
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
        VERDEc = new javax.swing.JLabel();
        NARANJAc = new javax.swing.JLabel();
        AZULc = new javax.swing.JLabel();
        BonoAzul1 = new javax.swing.JLabel();
        BonoAzul2 = new javax.swing.JLabel();
        ObsRojo2 = new javax.swing.JLabel();
        ObsRojo1 = new javax.swing.JLabel();
        Mensajito = new javax.swing.JLabel();
        pistafondo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(780, 370));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioBTN.setBackground(new java.awt.Color(153, 153, 255));
        InicioBTN.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InicioBTN.setForeground(new java.awt.Color(51, 51, 51));
        InicioBTN.setText("Comenzar!");
        InicioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioBTNActionPerformed(evt);
            }
        });
        add(InicioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 70));

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

        BonoAzul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BonoAzul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaAzu60l.png"))); // NOI18N
        add(BonoAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 60, 50));

        BonoAzul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BonoAzul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaAzul40.png"))); // NOI18N
        add(BonoAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 50, 50));

        ObsRojo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaRoja40.png"))); // NOI18N
        add(ObsRojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 50, 50));

        ObsRojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaRoja60.png"))); // NOI18N
        add(ObsRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 60, 50));

        Mensajito.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        Mensajito.setForeground(new java.awt.Color(204, 204, 255));
        add(Mensajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, 40));

        pistafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoPistaSinFOndo.png"))); // NOI18N
        add(pistafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 780, 390));
    }// </editor-fold>//GEN-END:initComponents

//    public void PosBolitas(int x1, int y1, int x2, int y2) {
//        if ((x1 == x2) & (y1 == y2)) {
//            x2 = ran.nextInt(limiteF - 2) + 1;
//            y2 = ran.nextInt(limiteC - 2) + 1;
//        }
//      
//    }
    int PermisoParaMover = 1;
    int rx1, rx2, ry1, ry2, ax1, ax2, ay1, ay2;
//    private void reubicarBolitas(JLabel bolita){
//       int x=bolita.getX();
//       int y=bolita.getY();
//        System.out.println(" x "+x+ " y "+y);
//       
//       int X=780-bolita.getWidth()-(bolita.getWidth()*ran.nextInt(limiteF-2)+1);
//       int Y=370-bolita.getHeight()-(bolita.getHeight()*ran.nextInt(limiteC-2)+1);
//        System.out.println(" Y ");
//        bolita.setLocation(X, Y);
//    }
    private void InicioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioBTNActionPerformed
        InicioBTN.setVisible(false);
        Mensajito.setText("");
        PermisoParaMover = 0;

        //Primero la ubicacion de inicio para todas las naves
        AZULc.setLocation(0, AZULc.getLocation().y);
        NARANJAc.setLocation(0, NARANJAc.getLocation().y);
        VERDEc.setLocation(0, VERDEc.getLocation().y);

//        rx1 = ObsRojo1.getX();
//        rx2 = ObsRojo2.getX();
//        ry1 = ObsRojo1.getY();
//        ry2 = ObsRojo2.getY();
//
//        ax1 = BonoAzul1.getX();
//        ax2 = BonoAzul2.getX();
//        ay1 = BonoAzul1.getY();
//        ay2 = BonoAzul2.getY();
        //  reubicarBolitas(BonoAzul1);
        espaciopista = Hacerespaciopista(); //llamar al que crea la matriz

        AZULc.requestFocus(); //CENTRAR EL MOVIMIENTO CON TECLAS A LA NAVE DEL USUARIO
        timer.start(); //Iniciar el timer para las otras dos naves competidores

    }//GEN-LAST:event_InicioBTNActionPerformed
    int bolita;
// auto del usuario
    private void AZULcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AZULcKeyReleased

        int x = AZULc.getX(), y = AZULc.getY();
        //En la matriz si es 0 el auto se movera, si no, no avanzara en esa casilla.

//        if ((AZULc.getLocation().x < (limiteC - 1) * casilla) && (NARANJAc.getLocation().x < (limiteC - 1) * casilla)
//                    && (VERDEc.getLocation().x < (limiteC - 1) * casilla)) {
        if (PermisoParaMover == 0) {

            switch (evt.getKeyCode()) {
                case KeyEvent.VK_RIGHT: //DERECHA
                    Mensajito.setText("");
                    //(que no cruce el limite de la matriz) Y (verificar el valor dentro de la matriz sea valido (!=1))
                    //Si cumple las condiciones, podra moverse

                    if (x < (limiteC - 1) * casilla & espaciopista[y / casilla][(x / casilla) + 1] != 1) {
                        bolita = 1; //Obstaculos y Bonos
                        if (AZULc.getBounds().intersects(BonoAzul1.getBounds()) || AZULc.getBounds().intersects(BonoAzul2.getBounds())) {
                            bolita = 3; // Si toca una boolita AZUL obtiene bono se movera el triple de casillas
                        }
                        if (AZULc.getBounds().intersects(ObsRojo1.getBounds()) || AZULc.getBounds().intersects(ObsRojo2.getBounds())) {
                            bolita = -1; // Si toca una boolita ROJA obtiene retrocedara una casilla y no podra avanzar si vuelve a tocarla
                        }
                        AZULc.setLocation(x + (casilla * bolita), y);
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
        }
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
    Timer timer = new Timer(600, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int AX = AZULc.getX(), AY = AZULc.getY();
            int NX = NARANJAc.getX(), NY = NARANJAc.getY();//Obtener Componentes de las coordenadas
            int VX = VERDEc.getX(), VY = VERDEc.getY(); //Obtener Componentes de las coordenadas
            if ((AZULc.getLocation().x < (limiteC) * casilla) && (NARANJAc.getLocation().x < (limiteC) * casilla)
                    && (VERDEc.getLocation().x < (limiteC) * casilla)) {
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

            } else {

                PermisoParaMover = 1;
                timer.stop(); 
            }
                //si llegan a una casilla con valor 2 ( linea de meta)
                if ((espaciopista[AY / casilla][(AX / casilla)] == 2) || (espaciopista[VY / casilla][(VX / casilla)] == 2) || (espaciopista[NY / casilla][(NX / casilla)] == 2)) {
                    timer.stop();
                    if (AX > VX & AX > NX) {
                        JOptionPane.showMessageDialog(null, "\t!FELICIDADES " + user + "\n! HA GANADO LA CARRERA:D");

                    }
                    if ((NX > VX & NX > AX) | (VX > AX & VX > NX) | (VX == NX)) {
                        JOptionPane.showMessageDialog(null, "\t Game Over " + user);

                    } else {
                        if (AX == NX) {
                            JOptionPane.showMessageDialog(null, "\t Empate " + user);
                        } else if (AX == VX) {
                            JOptionPane.showMessageDialog(null, "\t Empate " + user);

                        }
                    }

                    InicioBTN.setText("Reiniciar");
                    InicioBTN.setVisible(true);
                }
            

        }

    });


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AZULc;
    private javax.swing.JLabel BonoAzul1;
    private javax.swing.JLabel BonoAzul2;
    private javax.swing.JButton InicioBTN;
    private javax.swing.JLabel Mensajito;
    private javax.swing.JLabel NARANJAc;
    private javax.swing.JLabel ObsRojo1;
    private javax.swing.JLabel ObsRojo2;
    private javax.swing.JLabel VERDEc;
    private javax.swing.JLabel pistafondo;
    // End of variables declaration//GEN-END:variables

}
