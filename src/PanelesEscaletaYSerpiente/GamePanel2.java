package PanelesEscaletaYSerpiente;

import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class GamePanel2 extends javax.swing.JPanel {

    
    public static int dado;

    public GamePanel2() {
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

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

        NumDado.setFont(new java.awt.Font("Swis721 Ex BT", 1, 18)); // NOI18N
        NumDado.setForeground(new java.awt.Color(204, 204, 255));
        NumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(NumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 174, 72, 46));

        AlienR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlienR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojoMini.png"))); // NOI18N
        AlienR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlienRKeyPressed(evt);
            }
        });
        add(AlienR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 90, 90));

        AlienU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlienU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerdeMini.png"))); // NOI18N
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
                {500, 140}, {420, 140}, {340, 140}, {260, 60}, {170, 140}, {10, 60}, {10, 140},
                {10, 60}, {90, 140}, {170, 60}, {260, 60}, {420, 10}, {420, 60}, {500, 60},
                {500, 140}, {420, 10}, {260, 60}, {260, 10}, {340, 140}, {90, 10}, {10, 10},};

    //posicion en el tablero 
    private int posj1 = 0;
    private int posj2 = 0;

    //turno de cada jugador
    private int turno = 0;

    //generar numeros aleatorios
    private Random ran = new Random();
    
    
    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed

        NumDado.setText("");
        dado = ran.nextInt(6) + 1;
        NumDado.setText(Integer.toString(dado));

        

        
if (posj1<34){
    //nueva posicion
        posj1 += dado;
        for (int i = 0; i <34; i++) {

            //Arriba
            if (posj1 == 3) {
                posj1 = 9;
            }
            if (posj1 == 8) {
                posj1 = 26;
            }
            if (posj1 == 19) {
                posj1 = 21;
            }
            if (posj1 == 25) {
                posj1 = 29;
            }
            if (posj1 == 17) {
                posj1 = 26;
            }
            //Abajo
            if (posj1 == 7) {
                posj1 = 5;
            }
            if (posj1 == 22) {
                posj1 = 18;
            }
            if (posj1 == 32) {
                posj1 = 16;
            }
            if (posj1 == 30) {
                posj1 = 24;
            }
            if (posj1 == 28) {
                posj1 = 15;
            }

            if (i == posj1) {

                Timer timer = new Timer(30, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // Actualizar la posición del JLabel
                        AlienU.setLocation(movimientosok[posj1][0], movimientosok[posj1][1]);

                    }
                });
                timer.start();
            }

        }
}

        if (posj1 == 34) {
            
            TirarDados.setEnabled(false);
            JOptionPane.showMessageDialog(null, "el jugador 1 ha ganado");
            AlienU.setLocation(movimientosok[34][0], movimientosok[34][1]);
        }

        //timer.start();

    }//GEN-LAST:event_TirarDadosActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        dado = 0;
        posj1 = 0;
        TirarDados.setEnabled(true);
        AlienU.setLocation(movimientosok[posj1][0], movimientosok[posj1][1]);
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
