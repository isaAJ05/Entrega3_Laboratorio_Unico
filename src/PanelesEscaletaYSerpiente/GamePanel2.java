package PanelesEscaletaYSerpiente;

import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class GamePanel2 extends javax.swing.JPanel {

    //Variables Globales
    //- Imagenes
    ClassLoader CL = getClass().getClassLoader();
    ImageIcon morado = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienMoradoMini.png"));
    ImageIcon rojo = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienRojoMini.png"));
    ImageIcon verde = new ImageIcon(CL.getResource("IMGescaleraSerp/AlienVerdeMini.png"));
    ImageIcon dado1 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado1.png"));
    ImageIcon dado2 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado2.png"));
    ImageIcon dado3 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado3.png"));
    ImageIcon dado4 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado4.png"));
    ImageIcon dado5 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado5.png"));
    ImageIcon dado6 = new ImageIcon(CL.getResource("IMGescaleraSerp/dado6.png"));
    ImageIcon fondodado = new ImageIcon(CL.getResource("IMGescaleraSerp/fondodado_6.png"));

    //- Seleccion de avatar
    int avatar = AvatarJugador.avatar;

    //- Matriz de movimientos coordenadas x y y de cada posicion del tablero
    int movimientosok[][]
            = {{500, 300}, {410, 300}, {330, 300}, {250, 300}, {170, 300}, {90, 300}, {20, 300},
            {20, 220}, {90, 220}, {170, 220}, {250, 220}, {330, 220}, {410, 220}, {500, 220},
            {500, 150}, {410, 150}, {330, 150}, {250, 150}, {170, 150}, {90, 150}, {20, 150},
            {20, 70}, {90, 70}, {170, 70}, {250, 70}, {330, 70}, {410, 70}, {500, 70},
            {500, 0}, {410, 0}, {330, 0}, {250, 0}, {170, 0}, {90, 0}, {20, 0},};

    //- Posicion en el tablero 
    int jugador1 = 0;
    int jugador2 = 0;

    //- Turno de cada jugador
    int turno = 1;

    //- Generar numeros aleatorios - Dados
    Random ran = new Random();
    int dado;

    //SUBRUTINAS
    // - Subrutina para realizar movimientos de los personajes en el tablero
    private void moverAlien(JLabel Alien, int pos, int jug, int avatar) {
        // Este codigo está inspirado en base a 
       
        for (int i = 0; i < 34; i++) {
            if (i == pos) {
                Timer timer = new Timer(10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jug == 1) {//Se valida que jugador es
                            // Actualizar la posición del JLabel
                            Alien.setLocation(movimientosok[jugador1][0], movimientosok[jugador1][1]);
                        } else {
                            Alien.setLocation(movimientosok[jugador2][0], movimientosok[jugador2][1]);
                        }
                    }
                });
                timer.start();

            }
            //Para agregar imagen del # de dado acorde al numero aleatorio generado
            if (dadoimg.getIcon() != null) {
                dado00.setIcon(fondodado);
            }
            switch (dado) {
                case 1:
                    dadoimg.setIcon(dado1);
                    break;
                case 2:
                    dadoimg.setIcon(dado2);
                    break;
                case 3:
                    dadoimg.setIcon(dado3);
                    break;
                case 4:
                    dadoimg.setIcon(dado4);
                    break;
                case 5:
                    dadoimg.setIcon(dado5);
                    break;
                case 6:
                    dadoimg.setIcon(dado6);
                    break;
            }

        }
        //Para verificar si ha ganado un usuario o en su defecto Stella:)
        if (pos == 34) {
            TirarDados.setEnabled(false);//Deshabilitar boton de tirar
            if (jug == 1) {
                Resultado.Ganador g = new Resultado.Ganador();
            } else if (jug == 2) {
                Resultado.Perdedor g = new Resultado.Perdedor();
            }
            //JOptionPane.showMessageDialog(null, "el jugador " + jug + " ha ganado");
            Alien.setLocation(movimientosok[34][0], movimientosok[34][1]);
        }
        //Ceder turnos
        if (jug == 1) {
            turno = 2;
        } else if (jug == 2) {
            turno = 1;
        }

    }
    // -Subrutina para verificar si la posicion de x jugador lo conlleva a una escalera o una serpiente
    public void res(int pos) {
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
        //Para asignar nueva posicion al jugador correspondiente
        if (turno == 1) {
            jugador1 = pos;
        } else {
            jugador2 = pos;
        }

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
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadoimg = new javax.swing.JLabel();
        dado00 = new javax.swing.JLabel();
        TirarDados = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        NumDado = new javax.swing.JLabel();
        AlienR = new javax.swing.JLabel();
        AlienU = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dadoimg.setPreferredSize(new java.awt.Dimension(120, 120));
        add(dadoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 130, 130));

        dado00.setBackground(new java.awt.Color(255, 255, 255));
        dado00.setForeground(new java.awt.Color(255, 255, 255));
        dado00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dado00.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dado00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dado00.setPreferredSize(new java.awt.Dimension(130, 130));
        add(dado00, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        TirarDados.setBackground(new java.awt.Color(255, 102, 51));
        TirarDados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TirarDados.setText("Tirar");
        TirarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarDadosActionPerformed(evt);
            }
        });
        add(TirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

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
        add(NumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 72, 80));

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


    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed

        NumDado.setText("");//Label que contiene el numero del dado
        dado = ran.nextInt(6) + 1;//variable que se le asigna numero aleatorio entre el 1 y 6
        NumDado.setText(Integer.toString(dado));
        //De acuerdo al turno manejar posiciones (ya que tenemos variables globales, se dificulto manejar todo en una sola subrutina)
        if (turno == 1) {
            if (jugador1 < 34) { //validacion 1
                //nueva posicion
                jugador1 += dado;
                res(jugador1);//Ejecutar subrutina que verifica si se encuentra en una escalera o serpiente

                if (jugador1 > 34) { // validacion 2
                    jugador1 = jugador1 - dado;
                    JOptionPane.showMessageDialog(null, "GAMER\nOh! Has sacado un numero superior.. \nEspera al próximo turno");
                    turno = 2;
                }
            }
            moverAlien(AlienU, jugador1, 1, avatar);// Ejecutar subrutina que mueve JLabel osea icono asignado

        } else {
            if (jugador2 < 34) {
                //nueva posicion
                jugador2 += dado;
                res(jugador2);
                if (jugador2 > 34) {
                    jugador2 = jugador2 - dado;
                    JOptionPane.showMessageDialog(null, "STELLA\nOh! Has sacado un numero superior.. \nEspera al próximo turno");
                    turno = 1;
                }
            }
            moverAlien(AlienR, jugador2, 2, avatar);

        }


    }//GEN-LAST:event_TirarDadosActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        //Volver variables a sus posiciones/valores originales
        dado = 0;
        jugador1 = 0;
        jugador2 = 0;
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
    private javax.swing.JLabel dado00;
    private javax.swing.JLabel dadoimg;
    // End of variables declaration//GEN-END:variables
}
