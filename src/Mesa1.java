
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
/**
 *
 * @author Paula Núñez, Isabella Arrieta y Natalia Carpintero
 */
public class Mesa1 extends javax.swing.JFrame {
private String user;
    public Mesa1(String name) {
         
        this.user = name;
        initComponents();
        this.setLocationRelativeTo(null);
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(),new Point(0,0),"Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        Ajustespanel.setVisible(true);
        
         deshabilitarbtnGame();
      
    }
     public void paint(Graphics gr) {
        super.paint(gr);
        Graphics u = MesaCartas.getGraphics();
        Font f = new Font("Berlin Sans FB Demi",Font.PLAIN,35);
        u.setFont(f);
        u.setColor(new Color(102,255,153));
        u.drawString("Dealer", 20, 55);
        u.setColor(new Color(51,255,204));
        u.drawString(user, 20, 290);
     }

    int as = 11; //Variable as que puede cambiar dependiendo de la situción
    int h = 0;
    int NumerodeMasos = 1; // validar que este numero no sea ni negativo ni se mayor a 3
    //Solo se aceptaran 3 barajas para jugar

//Creacion de matriz 2 Barajas
//    int baraja[][] = {
//        //Cartas rojas [0-3]
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Corazones     
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Picas
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // Diamantes
//
//        //Cartas azules [4-7]
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Corazones 
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Picas
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}};// Diamantes

    //Filas = tipo de carta
    int n , m = 13;
    int C ; //Numero de cartas por cajara ( fila x columnas -> 8 x 13)
    int cont = 0;
    //Vector de las dos barajas usando las filas de la matriz como referencia
   String Ccolor[] = {"r", "r", "r", "r", "n", "n", "n", "n", "r", "r", "r", "r"};

    //Corazones = fila 0 y 4
    //Picas= fila 1 y 5
    //Treboles = fila 2 y 6
    //Diamantes = fila 3 y 7
   
    boolean repartir = false, ganador = false;
    Random ran = new Random();
   public int[][] baraja = new int[n * NumerodeMasos][m];
    int sumU=0, sumD=0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ajustespanel = new javax.swing.JPanel();
        mostrarnummaso = new javax.swing.JLabel();
        masbtn = new javax.swing.JButton();
        menosbtn = new javax.swing.JButton();
        BTNbarajaConfirmar = new javax.swing.JButton();
        valdmasos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MovJugadas = new javax.swing.JPanel();
        MostrarAjustesBlackJack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Repartir = new javax.swing.JButton();
        Pedir1Carta = new javax.swing.JButton();
        ConteoCartas = new javax.swing.JLabel();
        Parar = new javax.swing.JButton();
        Doble = new javax.swing.JButton();
        Slipt = new javax.swing.JButton();
        valdRepartir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        MesaCartas = new javax.swing.JPanel();
        SumCartasUs = new javax.swing.JLabel();
        C2DE = new javax.swing.JLabel();
        C1DE = new javax.swing.JLabel();
        C1US = new javax.swing.JLabel();
        C2US = new javax.swing.JLabel();
        SumCartasDE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 39, 38));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ajustespanel.setBackground(new java.awt.Color(63, 133, 86));

        mostrarnummaso.setBackground(new java.awt.Color(204, 204, 204));
        mostrarnummaso.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        mostrarnummaso.setForeground(new java.awt.Color(51, 51, 51));
        mostrarnummaso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarnummaso.setText("1");
        mostrarnummaso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarnummaso.setOpaque(true);

        masbtn.setBackground(new java.awt.Color(102, 255, 153));
        masbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        masbtn.setForeground(new java.awt.Color(51, 51, 51));
        masbtn.setText("+");
        masbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masbtnActionPerformed(evt);
            }
        });

        menosbtn.setBackground(new java.awt.Color(102, 255, 153));
        menosbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        menosbtn.setForeground(new java.awt.Color(51, 51, 51));
        menosbtn.setText("-");
        menosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosbtnActionPerformed(evt);
            }
        });

        BTNbarajaConfirmar.setBackground(new java.awt.Color(96, 211, 98));
        BTNbarajaConfirmar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BTNbarajaConfirmar.setForeground(new java.awt.Color(51, 51, 51));
        BTNbarajaConfirmar.setText("Establecer");
        BTNbarajaConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTNbarajaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbarajaConfirmarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Numero de masos:");

        javax.swing.GroupLayout AjustespanelLayout = new javax.swing.GroupLayout(Ajustespanel);
        Ajustespanel.setLayout(AjustespanelLayout);
        AjustespanelLayout.setHorizontalGroup(
            AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustespanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AjustespanelLayout.createSequentialGroup()
                        .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valdmasos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(BTNbarajaConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(AjustespanelLayout.createSequentialGroup()
                        .addComponent(mostrarnummaso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(masbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        AjustespanelLayout.setVerticalGroup(
            AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustespanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjustespanelLayout.createSequentialGroup()
                        .addComponent(masbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrarnummaso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(BTNbarajaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valdmasos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        getContentPane().add(Ajustespanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 190, 500));

        MovJugadas.setBackground(new java.awt.Color(107, 138, 91));
        MovJugadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarAjustesBlackJack.setBackground(new java.awt.Color(102, 255, 153));
        MostrarAjustesBlackJack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MostrarAjustesBlackJack.setText("Ajustes");
        MostrarAjustesBlackJack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MostrarAjustesBlackJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAjustesBlackJackActionPerformed(evt);
            }
        });
        MovJugadas.add(MostrarAjustesBlackJack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel2.setText("Cartas");
        MovJugadas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        Repartir.setBackground(new java.awt.Color(0, 102, 51));
        Repartir.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Repartir.setText("Repartir");
        Repartir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Repartir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Repartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepartirActionPerformed(evt);
            }
        });
        MovJugadas.add(Repartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 110, 33));

        Pedir1Carta.setBackground(new java.awt.Color(96, 211, 98));
        Pedir1Carta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Pedir1Carta.setText("Pedir Carta");
        Pedir1Carta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pedir1Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir1CartaActionPerformed(evt);
            }
        });
        MovJugadas.add(Pedir1Carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 120, 36));

        ConteoCartas.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        ConteoCartas.setForeground(new java.awt.Color(51, 51, 51));
        ConteoCartas.setText("104");
        MovJugadas.add(ConteoCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 41, 30));

        Parar.setBackground(new java.awt.Color(102, 255, 153));
        Parar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Parar.setText("Parar");
        Parar.setAutoscrolls(true);
        Parar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });
        MovJugadas.add(Parar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 120, 34));

        Doble.setBackground(new java.awt.Color(102, 255, 153));
        Doble.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Doble.setText("Doble (+2)");
        Doble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MovJugadas.add(Doble, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 120, 36));

        Slipt.setBackground(new java.awt.Color(102, 255, 153));
        Slipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Slipt.setText("Separar");
        Slipt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Slipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SliptActionPerformed(evt);
            }
        });
        MovJugadas.add(Slipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, 34));

        valdRepartir.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        MovJugadas.add(valdRepartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 200, 21));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("STAR GAMES");
        MovJugadas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 220, -1));

        btnVolver1.setBackground(new java.awt.Color(107, 138, 91));
        btnVolver1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(153, 255, 153));
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
        MovJugadas.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        MovJugadas.add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 70, 20));

        MesaCartas.setBackground(new java.awt.Color(49, 79, 67));
        MesaCartas.setEnabled(false);
        MesaCartas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SumCartasUs.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        MesaCartas.add(SumCartasUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 379, 39, 39));

        C2DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        MesaCartas.add(C2DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 67, 77, 58));
        MesaCartas.add(C1DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 133, 18, 29));

        C1US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        MesaCartas.add(C1US, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 375, 39, 52));

        C2US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        MesaCartas.add(C2US, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 385, 42, 42));

        SumCartasDE.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        MesaCartas.add(SumCartasDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 38, 35));

        MovJugadas.add(MesaCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        getContentPane().add(MovJugadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed

    }//GEN-LAST:event_PararActionPerformed
    int a = 0;
    private void RepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepartirActionPerformed
       ocultarPanelAjustes();
        if (a == 0) {
            Graphics g = MesaCartas.getGraphics();
           
            repartir = true;
            Pedir1Carta.setVisible(false);

            //Usuario Cartas Iniales
            int CartaUs1 = 0, CartaUs2 = 0, Sum0Us;
            String clr, cB1 = "r", cB2 = "n";
            int dib = 0, type1U=0,type2U=0;
            for (int i = 1; i <= 2; i++) { //Se Inicia con dos cartas Visibles para el usuario
                int f = ran.nextInt(n); //Con inidices aleoatorios se escoge las cartas dentro de la matriz baraja
                int c = ran.nextInt(m); //Solo sera necesarios hacer esto dos veces
                clr = Ccolor[f];
                dib = f;
                if (baraja[f][c] == 0) { //Asegurar que la combinación al azar no de una posición que tenga el valor de 0
                    while (baraja[f][c] == 0) {
                        f = ran.nextInt(n); //Posicion en matriz aleatoria
                        c = ran.nextInt(m);
                        clr = Ccolor[f];//Que baraja pertenece
                        dib = f;
                    }
                }
                if (i == 1) { //Para la primera carta del usuario 
                    CartaUs1 = baraja[f][c]; //Valor de la carta
                    cB1 = clr;//baraja
                    type1U=dib;
                
                } else { //Para la segunda carta
                    CartaUs2 = baraja[f][c]; //Valor de la carta
                    cB2 = clr; //Numero de fila dice el color = baraja
                    type2U=dib;
                }
                baraja[f][c] = 0; //Se descuenta las cartas ya tomadas
                cont = i;
            }
            Sum0Us = CartaUs1 + CartaUs2; //Sumar las dos cartas del Usuario

            if (Sum0Us > 21 & (CartaUs1 == 11 | CartaUs2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaUs1 == 11) {
                    CartaUs1 = 1;
                }
                if (CartaUs2 == 11) {
                    CartaUs2 = 1;
                }
                Sum0Us = CartaUs1 + CartaUs2;

            }

            C = C - cont; //Toatl de cartas menos las que se repartieron
            ConteoCartas.setText(Integer.toString(C)); //Imprimir numero de cartas actual sin usar

            //Mostrar primera carta usuario
            switch (cB1) { //Casos para diferentes COLOR barajas Primera Carta
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(200, 300, 90, 130, 10, 10);

                    g.setColor(Color.white);
                    g.fillRoundRect(203, 303, 85, 125, 10, 10);

                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(200, 300, 90, 130, 10, 10);

                    g.setColor(Color.white);
                    g.fillRoundRect(203, 303, 85, 125, 10, 10);

                    g.setColor(Color.blue);
                    break;

            }
            switch (type1U) { //Casos para el tipo de tipo de carta 1 (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 205, 375);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 210, 375);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 210, 375);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦️" + "", 205, 375);
                }

            // MOSTRAR NUMERO DE LA CARTA 1 USUARIO
            //C1US.setText(Integer.toString(CartaUs1)); lo que se haria con un label, pero estamos trabajando con la clase graphic
            String cn1 = Integer.toString(CartaUs1);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(cn1 + "", 215, 356);

            //MOSTAR SEGUNDA CARTA USUARIO
            switch (cB2) { // Color de la segunda carta usuario
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(350, 300, 90, 130, 10, 10); //

                    g.setColor(Color.white);
                    g.fillRoundRect(353, 303, 85, 125, 10, 10);

                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(350, 300, 90, 130, 10, 10); //

                    g.setColor(Color.white);
                    g.fillRoundRect(353, 303, 85, 125, 10, 10);

                    g.setColor(Color.blue);
                    break;

            }
            switch (type2U) { //Casos para el tipo de tipo de carta 2 (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 356, 375);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 360, 375);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 360, 375);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦" + "", 354, 375);
                }

            //MOstrar NUmero de la carta 2
            //C2US.setText(Integer.toString(CartaUs2));
            String C2US = Integer.toString(CartaUs2);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(C2US + "", 370, 356);

            //Mostrar numero de la suma acumulada del usuario
             //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            g.setColor(new Color(204,255,102)); 
            g.fillOval(50, 305, 40, 40);
            String SumaUs = Integer.toString(Sum0Us);
            g.setColor(Color.BLACK);
            g.drawString(SumaUs + "", 60, 331);

            
            
   //Dealer Cartas Iniciales
            int CartaDe1 = 0, CartaDe2 = 0, Sum0De;
            String clrd, cB1D = "r", cB2D = "n";
            int dibDE = 0, type1D=0,type2D=0;
            for (int i = 1; i <= 2; i++) { //Se Inicia con dos cartas Visibles para el usuario
                int f = ran.nextInt(n); //Con inidices aleoatorios se escoge las cartas dentro de la matriz baraja
                int c = ran.nextInt(m); //Solo sera necesarios hacer esto dos veces
                clrd = Ccolor[f];
                dibDE=f;
                if (baraja[f][c] == 0) { //Asegurar que la combinación al azar no de una posición que tenga el valor de 0
                    while (baraja[f][c] == 0) {
                        f = ran.nextInt(n);
                        c = ran.nextInt(m);
                        clrd = Ccolor[f];//Que baraja pertenece
                        dibDE=f;
                    }
                }
                if (i == 1) { //Para la primera carta del dealer
                    CartaDe1 = baraja[f][c];
                    cB1D = clrd;//baraja
                    type1D=dibDE;
                } else { //Para la segunda carta del dealer
                    CartaDe2 = baraja[f][c];
                    cB2D = clrd;//baraja
                    type2D=dibDE;
                }
                baraja[f][c] = 0; //Se descuenta las cartas ya tomadas
                cont = i;

            }
            C = C - cont; // conteo de las cartas que quedan 
            ConteoCartas.setText(Integer.toString(C)); //Mostrar cartas que quedan 

            Sum0De = CartaDe1 + CartaDe2; 

            if (Sum0De > 21 & (CartaDe1 == 11 | CartaDe2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaDe1 == 11) {
                    CartaDe1 = 1;
                }
                if (CartaDe2 == 11) {
                    CartaDe2 = 1;
                }
                Sum0De = CartaDe1 + CartaDe2;

            }
            // C1DE.setText(Integer.toString(CartaDe1)); 
            //NO se muetra pero si se pinta la carta boca abajo 
            switch (cB1D) { //Casos para diferentes barajas
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(200, 90, 90, 130, 10, 10); //

                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(200, 90, 90, 130, 10, 10); //
                    break;
            }

            // C2DE.setText(Integer.toString(CartaDe2)); //Si se muetsra la carta 
            switch (cB2D) { //Casos para diferentes barajas
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(350, 90, 90, 130, 10, 10); //
                    g.setColor(Color.white);
                    g.fillRoundRect(353, 93, 85, 125, 10, 10);
                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(350, 90, 90, 130, 10, 10); //
                    g.setColor(Color.white);
                    g.fillRoundRect(353, 93, 85, 125, 10, 10); //
                    g.setColor(Color.blue);
                    break;
            }
            switch (type2D) { //Casos para el tipo de tipo de carta 2 dealer (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 356, 145);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 360, 145);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 360, 145);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦" + "", 354, 145);
                }

            //Solo se mostrara una carta al usuario, la otra quedara oculta hasta que el usuruario termine de jugar 
            //  CARTA 2
            String C2D = Integer.toString(CartaDe2);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(C2D + "", 370, 130);

            //Mostrar numero de la suma acumulada del usuario, pero por ahora solo la de la carta 2
            //Cuando se revele la carta si se hara la suma, pero mientras tanto el usuario no saber la carta 1 del dealer
            //Figuras
            //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            g.setColor(new Color(204,255,102));
            g.fillOval(50, 70, 40, 40);
            //Numero SUMA 
            g.setColor(Color.BLACK);
            g.drawString(C2D + "", 60,96);

            Pedir1Carta.setVisible(true); //Activar botones de juego
            a = 1;
            Repartir.setEnabled(false); //Desspues de repatir que el boton se desactive
        } else {
            valdRepartir.setText(" Reparte las cartas para iniciar");
        }
    }//GEN-LAST:event_RepartirActionPerformed
    
    private void Pedir1CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir1CartaActionPerformed
        if (repartir) { //Validación de repartir las cartas iniciales
            cont++;
            C = C - cont;
            //Usuario

        } else {
            Pedir1Carta.setVisible(false);
            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
        }
    }//GEN-LAST:event_Pedir1CartaActionPerformed

    private void SliptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SliptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SliptActionPerformed

    
    //Animacion Subrutinas
     private void ocultarA() {
        //Si variable es 0 que indica que se esta vizualizando el panel de ajustes
        //se cumple condicion para ocultar el panel de ajustes y solo mostrar el del juego
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = Ajustespanel.getWidth(); i >= 0; i--) { // se disminye el ancho del paner de ajustes
                        Thread.sleep(1); //Velocidad
                        Ajustespanel.setSize(i, Ajustespanel.getHeight()); //ACtualizar el ancho
                        Ajustespanel.setLocation(Ajustespanel.getLocation().x + 1, Ajustespanel.getLocation().y);
                        //Mover el panel a la izquierda sumando su pos en X
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
        h = 1;//cambiar variable que indiqca que se esta mostrando los juegos y no se muestra el panel de ajustes
       

    }
     
    private void mostrarA() {

        //Animacion Slide: Video Guia https://youtu.be/uYRKNVPAc-w
        //Animacion para hacer aparecer el panel Ajustes
        //confAjustes = false;
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i >= Ajustespanel.getWidth(); i++) {
                        if (Ajustespanel.getWidth() == 180) {
                            break;
                        }
                        Thread.sleep(1);
                        Ajustespanel.setSize(i, Ajustespanel.getHeight());
                        Ajustespanel.setLocation(Ajustespanel.getLocation().x - 1, Ajustespanel.getLocation().y); //mover a la izquierda
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();

    }
    private void deshabilitarbtnGame(){
        Repartir.setEnabled(false);
        Pedir1Carta.setEnabled(false);
        Parar.setEnabled(false);
        Doble.setEnabled(false);
        Slipt.setEnabled(false);
    }
    private void HabilitarbtnGame(){
         Repartir.setEnabled(true);
        Pedir1Carta.setEnabled(true);
        Parar.setEnabled(true);
        Doble.setEnabled(true);
        Slipt.setEnabled(true);
    }
    
   
    private void MostrarAjustesBlackJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAjustesBlackJackActionPerformed
         h=1;
        deshabilitarbtnGame();
        if (h == 0) { //Se ve y se oculta
            ocultarA();
            h = 1;// Estado del panel A : No visible
            
        } else { //no se ve tiene que salir
            mostrarA();
            h = 0;//Estado del panel A : Visible
        }
    }//GEN-LAST:event_MostrarAjustesBlackJackActionPerformed

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
 labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
 labelvolver.setText("");
    }//GEN-LAST:event_btnVolver1MouseExited

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Principal3 p = new Principal3(user); //Para volver al menu
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void BTNbarajaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbarajaConfirmarActionPerformed
        n=4*NumerodeMasos;//Filas = tipo de carta
        C=n*m; //Numero de cartas por baraja ( fila x columnas -> 8 x 13)
         ConteoCartas.setText(Integer.toString(C));
        System.out.println(NumerodeMasos);
        System.out.println(n);
        int i, j;
        int contvalorcarta;
        for (i = 0; i < baraja.length; i++) {
            contvalorcarta = 2;
            for (j = 0; j < m; j++) {
                if (j == 0) {
                    baraja[i][j] = as;
                } else {
                    if (j >= 10) {
                        baraja[i][j] = 10;
                    } else {
                        baraja[i][j] = contvalorcarta;
                        contvalorcarta = contvalorcarta + 1;
                    }
                }

            }
        }
        ocultarA();
        HabilitarbtnGame();
        //Creacion de matriz 2 Barajas EJEMPLO
//    int baraja[][] = {
//        //Cartas rojas [0-3]
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Corazones     
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Picas
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // Diamantes
//
//        //Cartas azules [4-7]
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Corazones 
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Picas
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
//        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}};// Diamantes
        //Corazones = fila 0 y 4
        //Picas= fila 1 y 5
        //Treboles = fila 2 y 6
        //Diamantes = fila 3 y 7
        h = 0;

    }//GEN-LAST:event_BTNbarajaConfirmarActionPerformed

    private void masbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masbtnActionPerformed
         NumerodeMasos = NumerodeMasos + 1; //Aumenta 1
        valdmasos.setText("");
        if (NumerodeMasos > 3) {
            valdmasos.setText("(◕ v ◕) Número maximo");
            NumerodeMasos =3;
        }
        mostrarnummaso.setText(String.valueOf(NumerodeMasos));
    }//GEN-LAST:event_masbtnActionPerformed

    private void menosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosbtnActionPerformed
         NumerodeMasos = NumerodeMasos - 1; //dISMINUYE 1
        valdmasos.setText("");
        if (NumerodeMasos <= 0) {
            valdmasos.setText("(◕ v ◕) Número minimo");
            NumerodeMasos = 1;
        }

        mostrarnummaso.setText(String.valueOf(NumerodeMasos));
    }//GEN-LAST:event_menosbtnActionPerformed

    void ocultarPanelAjustes() { //Subrutina Deshabiliatar Ajustes del todo 
        Ajustespanel.setEnabled(false);
        Ajustespanel.setVisible(false);
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa1(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajustespanel;
    private javax.swing.JButton BTNbarajaConfirmar;
    private javax.swing.JLabel C1DE;
    private javax.swing.JLabel C1US;
    private javax.swing.JLabel C2DE;
    private javax.swing.JLabel C2US;
    private javax.swing.JLabel ConteoCartas;
    private javax.swing.JButton Doble;
    private javax.swing.JPanel MesaCartas;
    private javax.swing.JButton MostrarAjustesBlackJack;
    private javax.swing.JPanel MovJugadas;
    private javax.swing.JButton Parar;
    private javax.swing.JButton Pedir1Carta;
    private javax.swing.JButton Repartir;
    private javax.swing.JButton Slipt;
    private javax.swing.JLabel SumCartasDE;
    private javax.swing.JLabel SumCartasUs;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JButton masbtn;
    private javax.swing.JButton menosbtn;
    private javax.swing.JLabel mostrarnummaso;
    private javax.swing.JLabel valdRepartir;
    private javax.swing.JLabel valdmasos;
    // End of variables declaration//GEN-END:variables

   
}
