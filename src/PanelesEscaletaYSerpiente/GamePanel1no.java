package PanelesEscaletaYSerpiente;

import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class GamePanel1no extends javax.swing.JPanel {

    private final int limiteF = 5, limiteC = 6; //Limites de la matriz

    public static int cont = 0;
    //El numero de columanas y filas multiplicado por el valor de la casilla debe dar valores 
    //cercanos o aproximas (segun el gusto) a las dimensiones del panel (Ancho, alto )

    public static int casillaAncho = 90;//Lo que medira nuestras casillas imaginarias de la matriz
    public static int casillaAlto = 90;
    public static int dado;

    public GamePanel1no() {
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TirarDados = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        NumDado = new javax.swing.JLabel();
        AlienU = new javax.swing.JLabel();
        PSube1 = new javax.swing.JLabel();
        Precive1 = new javax.swing.JLabel();
        PSube2 = new javax.swing.JLabel();
        Precive2 = new javax.swing.JLabel();
        PSube3 = new javax.swing.JLabel();
        Precive3 = new javax.swing.JLabel();
        PSube4 = new javax.swing.JLabel();
        Precive4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        PlanetaSube4 = new javax.swing.JLabel();
        PlanetaSube5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/Eldado.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 18, 108, 104));

        TirarDados.setBackground(new java.awt.Color(255, 102, 51));
        TirarDados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TirarDados.setText("Tirar");
        TirarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarDadosActionPerformed(evt);
            }
        });
        add(TirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        NumDado.setFont(new java.awt.Font("Swis721 Ex BT", 1, 18)); // NOI18N
        NumDado.setForeground(new java.awt.Color(204, 204, 255));
        NumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(NumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 72, 46));

        AlienU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlienU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerdeMini.png"))); // NOI18N
        AlienU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlienUKeyPressed(evt);
            }
        });
        add(AlienU, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 80, 80));
        add(PSube1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 50));
        add(Precive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 40));
        add(PSube2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 50));
        add(Precive2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 40));
        add(PSube3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 40, 40));
        add(Precive3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 50));
        add(PSube4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 40, 40));
        add(Precive4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/tablero serp 1.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));
        add(PlanetaSube4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 50, 50));
        add(PlanetaSube5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 50, 50));
    }// </editor-fold>//GEN-END:initComponents
int x, y;

    Random ran = new Random();
    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed
        NumDado.setText("");
        dado = ran.nextInt(6) + 1;
        NumDado.setText(Integer.toString(dado));
//       tablero = Hacertablero();
        AlienU.requestFocus();
        x = AlienU.getX();
        y = AlienU.getY();
        timer.start();
        System.out.println("\n USUARIO x= " + x + " , y= " + y); //Valor Coorenada Usuario

        //timer.start();
    }//GEN-LAST:event_TirarDadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlienU.setLocation(AlienU.getLocation().x, AlienU.getLocation().y);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlienUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlienUKeyPressed
        int x = AlienU.getX(), y = AlienU.getY();
        //En la matriz si es 0 el auto se movera, si no, no avanzara en esa casilla. 
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT: //DERECHA

                //(que no cruce el limite de la matriz) Y (verificar el valor dentro de la matriz sea valido (!=1))
                //Si cumple las condiciones, podra moverse
                if (x < (limiteC - 1) * casillaAncho & tablero[(x / casillaAncho) + 1][y / casillaAncho] != 1) {
                    AlienU.setLocation(x + casillaAncho, y);
                }
                break;
            case KeyEvent.VK_UP: //ARRIBA

                if (y > 0 & tablero[(y / casillaAlto) - 1][x / casillaAlto] != 1) {
                    AlienU.setLocation(x, y - casillaAlto);

                }
                break;
            case KeyEvent.VK_DOWN: //ABAJO
                if (y < (limiteF - 1) * casillaAlto & tablero[(y / casillaAlto) + 1][x / casillaAlto] != 1) {
                    AlienU.setLocation(x, y + casillaAlto);

                }
               break;
            case KeyEvent.VK_LEFT: //Izquierda 
                if (x > 0 * casillaAncho & tablero[y / casillaAncho][(x / casillaAncho) - 1] != 1) {
                   AlienU.setLocation(x - casillaAncho, y);

                }
               break;

       }
        System.out.println("\n USUARIO x= " + x + " , y= " + y); //Valor Coorenada Usuario

        //valor de casilla en la matriz
        System.out.println("Casilla de la derecha = " + tablero[(x / casillaAncho) + 1][y / casillaAlto]);
        System.out.println("Casilla de la UP = " + tablero[x / casillaAncho][(y / casillaAlto) - 1]);
        System.out.println("Casilla de la Abajo = " + tablero[x / casillaAncho][(y / casillaAlto) + 1]);
        System.out.println("Casilla de la izquierda= " + tablero[(x / casillaAncho) - 1][y / casillaAlto]);
        System.out.println("Casilla actual = " + tablero[(x / casillaAncho)][y / casillaAlto]);


    }//GEN-LAST:event_AlienUKeyPressed
    int con = 0;
    int limancho = 602;
    int limInfx = 30, limMaxx = 602, limInfy = 420, limMAXy = 10;
    Timer timer = new Timer(500, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            int distancia = 0;

            if (con < dado) {
                if (distancia < limancho - casillaAncho & x != limInfx) {

                    AlienU.setLocation(x - casillaAncho, y);

                }
                if (x == limInfx) {
                    AlienU.setLocation(x, y - casillaAlto);
                }

                con++;
                distancia = distancia + casillaAncho;
            } else {
                ((Timer) e.getSource()).stop();

            }
        }

    });

    //Matriz Tablero
    //Tablero donde el alien (USUARIO)
    private int[][] tablero = new int[1000][10000];
//    public int[][] Hacertablero() {
//        int F = 0, C = 0, cont= 0;
//        for (F = 0; F < limiteF; F++) {
//            for (C = limiteC - 1; C >= 0; C--) {
//                if ( F == limiteF - 1 || F == 0 || C == 0|| C >limiteC-3) {
//                    tablero[F][C] = 1; //Bordes de la pista
//                } else {
//
//                    tablero[F][C] = 0; //Espacio donde los carritos se moveran 
//                }
//            }
//
//        }
//       return tablero;
//      
//    }

    //Movimiento del ALien
    int c = 0;
    int Pos[] = {0, 1, -1};

//     Timer timer = new Timer(500, new ActionListener() {
//       
//         @Override
//        public void actionPerformed(ActionEvent e) {
//        
//          if(c<dado){ //Mientras el contador de las veces sea menor o igual al valor del dado
//           if ((AlienU.getLocation().x < (limiteC ) * casilla) && (AlienU.getLocation().y < (limiteF ) * casilla )
//               &&(AlienU.getLocation().y >=0 )&(AlienU.getLocation().x >= 0 )) {
//             int i=0,j=0;
//             int x=AlienU.getX(),y=AlienU.getY();//Obtener Componentes de las coordenadas
//             int casillaactual=tablero[y / casilla][(x / casilla)];
//          
//             
//           
//               
//               x=x+casilla*Pos[i];
//               y=y+casilla*Pos[j];
//               System.out.println(" casilla="+casillaactual);
//               
//           c++;
//           AlienU.setLocation(x, y);
//           
//          }}
//          //Si cae en una posicion de escaleras
//          if(tablero1M[y / casilla][x / casilla] ==31|
//             tablero1M[y / casilla][x / casilla]==26 |
//             tablero1M[y / casilla][x / casilla]==15 |
//             tablero1M[y / casilla][x / casilla]==9 ){
//              
//          }
//          //Si cae e una de serpiente (agujeros negros)
//          if(tablero1M[y / casilla][x / casilla] ==27|
//             tablero1M[y / casilla][x / casilla]==2 |
//             tablero1M[y / casilla][x / casilla]==4 |
//             tablero1M[y / casilla][x / casilla]==6 |
//             tablero1M[y / casilla][x / casilla]==12  ){
//              
//          }
//        }
//         
//     });

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlienU;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NumDado;
    private javax.swing.JLabel PSube1;
    private javax.swing.JLabel PSube2;
    private javax.swing.JLabel PSube3;
    private javax.swing.JLabel PSube4;
    private javax.swing.JLabel PlanetaSube4;
    private javax.swing.JLabel PlanetaSube5;
    private javax.swing.JLabel Precive1;
    private javax.swing.JLabel Precive2;
    private javax.swing.JLabel Precive3;
    private javax.swing.JLabel Precive4;
    private javax.swing.JButton TirarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
