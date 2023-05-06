package PanelesEscaletaYSerpiente;

import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class GamePanel2 extends javax.swing.JPanel {

    ClassLoader CL = getClass().getClassLoader();
    ImageIcon morado = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienMoradoMini.png"));
    ImageIcon rojo = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienRojoMini.png"));
    ImageIcon verde = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienVerdeMini.png"));
    int avatar = AvatarJugador.avatar;
    public static int dado;

    private void moverAlien(JLabel Alien, int pos, int jug, int avatar) {

        for (int i = 0; i < 34; i++) {

            if (i == pos) { 

                int x = i;
                Timer timer = new Timer(10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jug == 1) {
                            // Actualizar la posición del JLabel
                            Alien.setLocation(movimientosok[posj1][0], movimientosok[posj1][1]);
                        } else {
                            Alien.setLocation(movimientosok[posj2][0], movimientosok[posj2][1]);
                        }
                    }
                });
                timer.start();

            }

        }

        if (pos == 34) {

            TirarDados.setEnabled(false);
            JOptionPane.showMessageDialog(null, "el jugador " + jug + " ha ganado");
            Alien.setLocation(movimientosok[34][0], movimientosok[34][1]);
        }
        if (jug == 1) {
            turno = 2;
        } else if (jug == 2) {
            turno = 1;
        }

    }

    public static int res(int pos) {
        //Arriba
        if (pos == 3) {
            pos = 9;
        }
        if (pos == 8) {
            pos = 26;
        }
        if (pos == 19) {
            pos = 21;
        }
        if (pos == 25) {
            pos = 29;
        }

        //Abajo
        if (pos == 7) {
            pos = 5;
        }
        if (pos == 22) {
            pos = 18;
        }
        if (pos == 32) {
            pos = 16;
        }
        if (pos == 30) {
            pos = 24;
        }
        if (pos == 28) {
            pos = 15;
        }
        return pos;
    }

    public GamePanel2(int avatar) {
        System.out.println("avt" + avatar);
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.avatar = avatar;
        switch (AvatarJugador.avatar) {
            case 1:
                AlienU.setIcon(morado);
                break;
            case 2:
                AlienU.setIcon(rojo);
                break;
            case 3:
                AlienU.setIcon(verde);
                break;
                
        }
        //AvatarJugador.avatar=0;
        //cursor
        //cursor
        // Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(),new Point(0,0),"Custom Cursor");
        //this.setCursor(cursor);
        // Agregar un temporizador
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TirarDados = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        NumDado = new javax.swing.JLabel();
        AlienR = new javax.swing.JLabel();
        AlienU = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

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

        Reiniciar.setBackground(new java.awt.Color(255, 102, 0));
        Reiniciar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        NumDado.setFont(new java.awt.Font("Swis721 Ex BT", 1, 48)); // NOI18N
        NumDado.setForeground(new java.awt.Color(204, 204, 255));
        NumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(NumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 72, 80));

        AlienR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlienR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/stellaa (1).png"))); // NOI18N
        AlienR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlienRKeyPressed(evt);
            }
        });
        add(AlienR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 80, 100));

        AlienU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlienU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlienUKeyPressed(evt);
            }
        });
        add(AlienU, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, 90));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/tablero serp 1.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));
    }// </editor-fold>//GEN-END:initComponents

//Para el alien del usuario
//Matriz de movimientos coordenadas x y y 
    int movimientosok[][]
            = {{500, 300}, {420, 300}, {340, 300}, {170, 220}, {170, 300}, {90, 300}, {10, 300},
            {90, 300}, {420, 10}, {170, 220}, {260, 220}, {340, 220}, {420, 220}, {500, 220},
            {500, 140}, {420, 140}, {340, 140}, {240, 140}, {170, 140}, {10, 60}, {10, 140},
            {10, 60}, {90, 140}, {170, 60}, {260, 60}, {420, 10}, {420, 60}, {500, 60},
            {500, 140}, {420, 10}, {260, 60}, {260, 10}, {340, 140}, {90, 10}, {10, 10},};

    //posicion en el tablero 
    public static int posj1 = 0;
    public static int posj2 = 0;

    //turno de cada jugador
    private int turno = 1;

    //generar numeros aleatorios
    private Random ran = new Random();


    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed
        System.out.println("posj1 = " + PanelesEscaletaYSerpiente.GamePanel2.posj1);
        System.out.println("posj2 = " + PanelesEscaletaYSerpiente.GamePanel2.posj2);
        NumDado.setText("");
        dado = ran.nextInt(6) + 1;
        NumDado.setText(Integer.toString(dado));

        if (turno == 1) {
            if (posj1 < 34) {
                //nueva posicion
                posj1 += dado;
                res(posj1);
                if (posj1 > 34) {
                    posj1 = posj1 - dado;
                    JOptionPane.showMessageDialog(null, "Oh! Has sacado un numero superior.. \nEspera al próximo turno");
                    turno = 2;
                }
                moverAlien(AlienU, posj1, 1, avatar);
            }

        } else {
            if (posj2 < 34) {
                //nueva posicion
                posj2 += dado;
                res(posj2);
                if (posj2 > 34) {
                    posj2 = posj2 - dado;
                    JOptionPane.showMessageDialog(null, "Oh! Has sacado un numero superior.. \nEspera al próximo turno");
                    turno = 1;
                }
                moverAlien(AlienR, posj2, 2, avatar);
            }

        }


    }//GEN-LAST:event_TirarDadosActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        dado = 0;
        posj1 = 0;
        posj2 = 0;
        TirarDados.setEnabled(true);
        AlienU.setLocation(movimientosok[0][0], movimientosok[0][1]);
        AlienR.setLocation(movimientosok[0][0], movimientosok[0][1]);
        NumDado.setText("");

    }//GEN-LAST:event_ReiniciarActionPerformed

    private void AlienUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlienUKeyPressed


    }//GEN-LAST:event_AlienUKeyPressed

    private void AlienRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlienRKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlienRKeyPressed

    //Matriz Tablero
    //Tablero donde el alien (USUARIO)
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
    private javax.swing.JLabel AlienR;
    private javax.swing.JLabel AlienU;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NumDado;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton TirarDados;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
