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

public class GamePanel11 extends javax.swing.JPanel {

    private Timer timer;
   
    private int dx = 5, dy = 5;
    private int width = 602, height = 401;
    int cont=0;
    //FUNCIONES
    
    private int  xalien(int dado){
       int alienx=0;
        int movimientosx[][]={{10,90,340,260,260,420,500},
                     {10,90,170,260,420,420,500},
                     {10,10,170,260,340,420,500},
                     {90,420,170,260,340,420,500},
                     {10,90,170,170,340,420,500}};
        int movimientosy[][]={
                     {10,10,140,10,60,10,140},
                     {60,140,60,60,10,60,60},
                     {140,60,140,60,140,140,140},
                     {300,10,220,220,220,220,220},
                     {300,300,300,220,300,300,300}};
        
       
        if (dado<=6){
            alienx=movimientosx[4][6-dado];
        }
        return alienx;
    }
    
    private int  yalien(int dado){
       int alieny=0;
       
        int movimientosx[][]={{10,90,340,260,260,420,500},
                     {10,90,170,260,420,420,500},
                     {10,10,170,260,340,420,500},
                     {90,420,170,260,340,420,500},
                     {10,90,170,170,340,420,500}};
        int movimientosy[][]={
                     {10,10,140,10,60,10,140},
                     {60,140,60,60,10,60,60},
                     {140,60,140,60,140,140,140},
                     {300,10,220,220,220,220,220},
                     {300,300,300,220,300,300,300}};
      
        if (dado<=6){
            alieny=movimientosy[4][6-dado];
            
        }
        /**if(subi==1){
            if (subi==1){
                alieny=movimientosy[3][2+dado];
            }else{
                alieny=movimientosy[3][2+dado];
            }
        }
        **/
        return alieny;
    }
    public static int dado;
    
    public GamePanel11() {
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
        jButton1 = new javax.swing.JButton();
        NumDado = new javax.swing.JLabel();
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
        add(NumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 174, 72, 46));

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
  
    Random ran = new Random();
    
  
  
    private void TirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadosActionPerformed
       int x=0, y=0;
        NumDado.setText("");
        dado = ran.nextInt(6) + 1;
        NumDado.setText(Integer.toString(dado));
  
        timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
         // Detección de colisión con los límites de la imagen
        if (x < 0 || x + AlienU.getWidth() > width) {
            dx = -dx;
        }
        if (y < 0 || y + AlienU.getHeight() > height) {
            dy = -dy;
        }
        
        // Actualizar la posición del JLabel
        AlienU.setLocation(xalien(dado), yalien(dado));
        
        }
    });
    timer.start();
    
       AlienU.requestFocus();
        //timer.start();
        
    }//GEN-LAST:event_TirarDadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlienUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlienUKeyPressed
        

        
    }//GEN-LAST:event_AlienUKeyPressed
   
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
    private javax.swing.JLabel AlienU;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NumDado;
    private javax.swing.JButton TirarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
