package PanelesCarreraNave;

import PanelesEscaletaYSerpiente.AvatarJugador;
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

    ClassLoader CL = getClass().getClassLoader();
    ImageIcon naranja = new ImageIcon(CL.getResource("IMGcars/naranjacarro_1.png"));
    ImageIcon azul = new ImageIcon(CL.getResource("IMGcars/axullcarro (1)_1.png"));
    ImageIcon verde = new ImageIcon(CL.getResource("IMGcars/verdecarro (2).png"));
    private String name = null;
    int nave = NaveJugador.nave;
    
    public CarreraPANELcarros(int[][] espaciopista, int nave) {
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.nave = nave;
        
      

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
    
   

    public CarreraPANELcarros(String user) {
        this.name = user;
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();
          System.out.println("CARRO" + NaveJugador.nave);  
        switch (NaveJugador.nave) {
            case 1:
                carrousuario.setIcon(naranja);
                carro1.setIcon(azul);
                carro2.setIcon(verde);
                break;
            case 2:
                carrousuario.setIcon(azul);
                carro1.setIcon(naranja);
                carro2.setIcon(verde);
                break;
            case 3:
                carrousuario.setIcon(verde);
                carro1.setIcon(azul);
                carro2.setIcon(naranja);
                break;
        }

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
        carrousuario = new javax.swing.JLabel();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        BonoAzul1 = new javax.swing.JLabel();
        BonoAzul2 = new javax.swing.JLabel();
        ObsRojo3 = new javax.swing.JLabel();
        ObsRojo2 = new javax.swing.JLabel();
        ObsRojo1 = new javax.swing.JLabel();
        BonoAzul3 = new javax.swing.JLabel();
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
        add(InicioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 140, 70));

        carrousuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carrousuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        carrousuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carrousuarioKeyReleased(evt);
            }
        });
        add(carrousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 70));
        add(carro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 140, 70));
        add(carro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 70));

        BonoAzul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BonoAzul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaAzu60l.png"))); // NOI18N
        add(BonoAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 60, 60));

        BonoAzul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BonoAzul2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaAzul40.png"))); // NOI18N
        add(BonoAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 40, 40));

        ObsRojo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaRoja50.png"))); // NOI18N
        add(ObsRojo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 50, -1));

        ObsRojo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaRoja40.png"))); // NOI18N
        add(ObsRojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 40, 30));

        ObsRojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaRoja60.png"))); // NOI18N
        ObsRojo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(ObsRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 60, 50));

        BonoAzul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BonoAzul3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/BolaAzul50.png"))); // NOI18N
        add(BonoAzul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 50, 50));

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
        carrousuario.setLocation(0, carrousuario.getLocation().y);
        carro2.setLocation(0, carro2.getLocation().y);
        carro1.setLocation(0, carro1.getLocation().y);

        espaciopista = Hacerespaciopista(); //llamar al que crea la matriz

        carrousuario.requestFocus(); //CENTRAR EL MOVIMIENTO CON TECLAS A LA NAVE DEL USUARIO
        timer.start(); //Iniciar el timer para las otras dos naves competidores

    }//GEN-LAST:event_InicioBTNActionPerformed
    int bolita;
// auto del usuario
    private void carrousuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carrousuarioKeyReleased

        int x = carrousuario.getX(), y = carrousuario.getY();
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
                        if (carrousuario.getBounds().intersects(BonoAzul1.getBounds()) || carrousuario.getBounds().intersects(BonoAzul2.getBounds()) || carrousuario.getBounds().intersects(BonoAzul3.getBounds())) {
                            bolita = 3; // Si toca una boolita AZUL obtiene bono se movera el triple de casillas
                        }
                        if (carrousuario.getBounds().intersects(ObsRojo1.getBounds()) || carrousuario.getBounds().intersects(ObsRojo2.getBounds()) | carrousuario.getBounds().intersects(ObsRojo3.getBounds())) {
                            bolita = -1; // Si toca una boolita ROJA obtiene retrocedara una casilla y no podra avanzar si vuelve a tocarla
                        }
                        carrousuario.setLocation(x + (casilla * bolita), y);
                    }
                    break;
                case KeyEvent.VK_UP: //ARRIBA
                    Mensajito.setText("");
                    if (y > 0 & espaciopista[(y / casilla) - 1][x / casilla] != 1) {
                        carrousuario.setLocation(x, y - casilla);

                    }
                    break;
                case KeyEvent.VK_DOWN: //ABAJO
                    Mensajito.setText("");
                    if (y < (limiteF - 1) * casilla & espaciopista[(y / casilla) + 1][x / casilla] != 1) {
                        carrousuario.setLocation(x, y + casilla);

                    }
                    break;
                case KeyEvent.VK_LEFT: //Izquierda No PODRA retroceder, si lo hace empieza desde el inicio XD
                    Mensajito.setText(" No puedes retroceder !");
                    carrousuario.setLocation(x, y);
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
    }//GEN-LAST:event_carrousuarioKeyReleased

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
    Timer timer = new Timer(450, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int AX = carrousuario.getX(), AY = carrousuario.getY();
            int NX = carro2.getX(), NY = carro2.getY();//Obtener Componentes de las coordenadas
            int VX = carro1.getX(), VY = carro1.getY(); //Obtener Componentes de las coordenadas
            if ((carrousuario.getLocation().x < (limiteC) * casilla) && (carro2.getLocation().x < (limiteC) * casilla)
                    && (carro1.getLocation().x < (limiteC) * casilla)) {
                /* Condicianl para que se muevan si aun no ha
                    llegado a la linea de meta( o al final de la matriz */

                //Nave Naranja ---------------------
                int[] xy = movimiento(NX, NY, casilla, espaciopista, Pos, Vel);
                NX = xy[0];
                NY = xy[1];
                carro2.setLocation(NX, NY);//Actualizar Ubicacion

                //Nave Verde ---------------------
                xy = movimiento(VX, VY, casilla, espaciopista, Pos, Vel);
                VX = xy[0];
                VY = xy[1];
                carro1.setLocation(VX, VY);//Actualizar Ubicacion

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
                PermisoParaMover = 1;
                if (AX > VX & AX > NX) {
                    Resultado.Ganador g = new Resultado.Ganador(name);
                   // JOptionPane.showMessageDialog(null, "\t!FELICIDADES " + name + "\n! HA GANADO LA CARRERA:D");

                }
                if ((NX > VX & NX > AX) | (VX > AX & VX > NX) | (VX == NX)) {
                    Resultado.Perdedor g = new Resultado.Perdedor(name);
                    //JOptionPane.showMessageDialog(null, "\t Game Over " + name);

                } else {
                    if (AX == NX) {
                        Resultado.Empate emp = new Resultado.Empate(name);
                        //JOptionPane.showMessageDialog(null, "\t Empate " + name);
                    } else if (AX == VX) {
                        Resultado.Empate emp = new Resultado.Empate(name);
                        //JOptionPane.showMessageDialog(null, "\t Empate " + name);

                    }
                }

                InicioBTN.setText("Reiniciar");
                InicioBTN.setVisible(true);
            }

        }

    });


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BonoAzul1;
    private javax.swing.JLabel BonoAzul2;
    private javax.swing.JLabel BonoAzul3;
    private javax.swing.JButton InicioBTN;
    private javax.swing.JLabel Mensajito;
    private javax.swing.JLabel ObsRojo1;
    private javax.swing.JLabel ObsRojo2;
    private javax.swing.JLabel ObsRojo3;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carrousuario;
    private javax.swing.JLabel pistafondo;
    // End of variables declaration//GEN-END:variables

}
