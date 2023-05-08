
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
import javax.swing.JLabel;

/**
 *
 * @author Paula Núñez, Isabella Arrieta y Natalia Carpintero
 */
public class Mesa1 extends javax.swing.JFrame {

    private String user;

    public Mesa1(String name) {
setIconImage(new ImageIcon(getClass().getResource("general/stellaicono.png")).getImage());
        this.user = name;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Blackjack");
        //cursor
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(), new Point(0, 0), "Custom Cursor");
        this.setCursor(cursor);
        this.setResizable(false);
        Ajustespanel.setVisible(true);
        labelNombreUser.setText(user + ":");
        deshabilitarbtnGame();

    }

    boolean repartir = false;
    Random ran = new Random();

    //Variambles que llevan la suma de las cartas
    int sumU = 0, sumD = 0;

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
        Mensajito = new javax.swing.JLabel();
        MostrarAjustesBlackJack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        VolveraJugar = new javax.swing.JButton();
        Repartir = new javax.swing.JButton();
        Pedir1Carta = new javax.swing.JButton();
        ConteoCartas = new javax.swing.JLabel();
        Parar = new javax.swing.JButton();
        Doble = new javax.swing.JButton();
        valdRepartir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        MesaCartas = new javax.swing.JPanel();
        labelNombreUser = new javax.swing.JLabel();
        labelStellaNombre = new javax.swing.JLabel();
        SumCartasU = new javax.swing.JLabel();
        SumCartasDE = new javax.swing.JLabel();
        C5DE = new javax.swing.JLabel();
        C4DE = new javax.swing.JLabel();
        C3DE = new javax.swing.JLabel();
        C2DE = new javax.swing.JLabel();
        C1DE = new javax.swing.JLabel();
        C5US = new javax.swing.JLabel();
        C4US = new javax.swing.JLabel();
        C3US = new javax.swing.JLabel();
        C2US = new javax.swing.JLabel();
        C1US = new javax.swing.JLabel();
        cartaD5 = new javax.swing.JLabel();
        cartaD4 = new javax.swing.JLabel();
        cartaD3 = new javax.swing.JLabel();
        cartaD2 = new javax.swing.JLabel();
        cartaD1 = new javax.swing.JLabel();
        cartaU5 = new javax.swing.JLabel();
        cartaU4 = new javax.swing.JLabel();
        cartaU3 = new javax.swing.JLabel();
        cartaU2 = new javax.swing.JLabel();
        cartaU1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

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
        jLabel3.setText("Número de masos:");

        javax.swing.GroupLayout AjustespanelLayout = new javax.swing.GroupLayout(Ajustespanel);
        Ajustespanel.setLayout(AjustespanelLayout);
        AjustespanelLayout.setHorizontalGroup(
            AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustespanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(AjustespanelLayout.createSequentialGroup()
                            .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valdmasos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTNbarajaConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(55, Short.MAX_VALUE)))
                    .addGroup(AjustespanelLayout.createSequentialGroup()
                        .addComponent(mostrarnummaso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AjustespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(masbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        Mensajito.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Mensajito.setForeground(new java.awt.Color(255, 0, 0));
        MovJugadas.add(Mensajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 200, 50));

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

        VolveraJugar.setBackground(new java.awt.Color(102, 255, 153));
        VolveraJugar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        VolveraJugar.setText("Volver a Jugar");
        VolveraJugar.setAutoscrolls(true);
        VolveraJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VolveraJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolveraJugarActionPerformed(evt);
            }
        });
        MovJugadas.add(VolveraJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 180, 34));

        Repartir.setBackground(new java.awt.Color(0, 102, 51));
        Repartir.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Repartir.setText("Repartir");
        Repartir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Repartir.setBorderPainted(false);
        Repartir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Repartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepartirActionPerformed(evt);
            }
        });
        MovJugadas.add(Repartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 172, 120, 33));

        Pedir1Carta.setBackground(new java.awt.Color(96, 211, 98));
        Pedir1Carta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Pedir1Carta.setText("Pedir Carta");
        Pedir1Carta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pedir1Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir1CartaActionPerformed(evt);
            }
        });
        MovJugadas.add(Pedir1Carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 215, 120, 36));

        ConteoCartas.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        ConteoCartas.setText("104");
        MovJugadas.add(ConteoCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 30));

        Parar.setBackground(new java.awt.Color(102, 255, 153));
        Parar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Parar.setText("Plantar");
        Parar.setAutoscrolls(true);
        Parar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });
        MovJugadas.add(Parar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 306, 120, 34));

        Doble.setBackground(new java.awt.Color(102, 255, 153));
        Doble.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Doble.setText("Doble (+2)");
        Doble.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Doble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobleActionPerformed(evt);
            }
        });
        MovJugadas.add(Doble, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 120, 36));

        valdRepartir.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        MovJugadas.add(valdRepartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 200, 21));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("STAR GAMES");
        MovJugadas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 220, -1));

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

        labelNombreUser.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 36)); // NOI18N
        labelNombreUser.setForeground(new java.awt.Color(0, 153, 102));
        MesaCartas.add(labelNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, 40));

        labelStellaNombre.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 36)); // NOI18N
        labelStellaNombre.setForeground(new java.awt.Color(255, 204, 0));
        labelStellaNombre.setText("Stella:");
        MesaCartas.add(labelStellaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        SumCartasU.setBackground(new java.awt.Color(102, 255, 102));
        SumCartasU.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        SumCartasU.setForeground(new java.awt.Color(0, 153, 0));
        SumCartasU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SumCartasU.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 0)));
        SumCartasU.setOpaque(true);
        MesaCartas.add(SumCartasU, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 70, 35));

        SumCartasDE.setBackground(new java.awt.Color(102, 255, 102));
        SumCartasDE.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        SumCartasDE.setForeground(new java.awt.Color(0, 153, 0));
        SumCartasDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SumCartasDE.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 0)));
        SumCartasDE.setOpaque(true);
        MesaCartas.add(SumCartasDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 70, 35));

        C5DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C5DE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C5DE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C5DE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C5DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 60, 110));

        C4DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C4DE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C4DE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C4DE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C4DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 60, 110));

        C3DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C3DE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C3DE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C3DE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C3DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 60, 110));

        C2DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C2DE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C2DE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C2DE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C2DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 60, 110));

        C1DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C1DE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C1DE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C1DE.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C1DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 110));

        C5US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C5US.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C5US.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C5US.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C5US, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 60, 110));

        C4US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C4US.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C4US.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C4US.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C4US, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 60, 110));

        C3US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C3US.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C3US.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C3US.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C3US, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 110));

        C2US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C2US.setForeground(new java.awt.Color(204, 0, 0));
        C2US.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C2US.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C2US.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C2US, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 60, 110));

        C1US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        C1US.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        C1US.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C1US.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MesaCartas.add(C1US, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 110));
        MesaCartas.add(cartaD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 124));
        MesaCartas.add(cartaD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, 124));
        MesaCartas.add(cartaD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 80, 124));
        MesaCartas.add(cartaD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, 124));
        MesaCartas.add(cartaD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 124));
        MesaCartas.add(cartaU5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 80, 124));
        MesaCartas.add(cartaU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 80, 124));
        MesaCartas.add(cartaU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 124));
        MesaCartas.add(cartaU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 124));
        MesaCartas.add(cartaU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 124));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/Ilustración_sin_título (2).png"))); // NOI18N
        MesaCartas.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        MovJugadas.add(MesaCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        getContentPane().add(MovJugadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ConteoCartaSinUsar(int C, int cont) {
        C = C - cont;//Toatl de cartas menos las que se repartieron
        ConteoCartas.setText(Integer.toString(C)); //Imprimir numero de cartas actual sin usar
    }

    public void cartasdealer() {
        CartaBlanca(cartaD1); //Se revela la carta oculta de estela
        TipoDeCarta(Dtipodibujo1, C1DE, CartaDe1);
        SumCartasDE.setText(String.valueOf(Sum0DE));
        Pedir1Carta.setEnabled(false);
        Parar.setEnabled(false);
        VolveraJugar.setEnabled(true);
        s = 3;
        while (Sum0DE < 17) {
            if (s <= 5) {
                cont++;
                ConteoCartaSinUsar(C, cont);

                elegircarta(baraja, Ccolor); //Subrutina para la eleccion de carta al azar 
                switch (s) {
                    case 3:
                        CartaDe3 = valorCarta;
                        Dtipodibujo3 = fila;
                        colorDB3 = colorB;
                        DColum3 = columna;
                        Sum0DE = CartaDe3 + Sum0DE;
                        if (Sum0US > 21 & CartaUs3 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaDe3 = 1;
                            Sum0DE = CartaDe3 + (Sum0DE - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaD3);
                        TipoDeCarta(Dtipodibujo3, C3DE, CartaDe3);
                        break;
                    case 4:
                        CartaDe4 = valorCarta;
                        Dtipodibujo4 = fila;
                        colorDB4 = colorB;
                        DColum4 = columna;
                        Sum0DE = CartaDe4 + Sum0US;
                        if (Sum0DE > 21 & CartaDe4 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaDe4 = 1;
                            Sum0DE = CartaDe4 + (Sum0DE - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaD4);
                        TipoDeCarta(Dtipodibujo4, C4DE, CartaDe4);
                        break;
                    case 5:
                        CartaDe5 = valorCarta;
                        Dtipodibujo5 = fila;
                        colorDB5 = colorB;
                        DColum5 = columna;
                        Sum0DE = CartaDe5 + Sum0DE;
                        if (Sum0DE > 21 & CartaDe5 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaDe5 = 1;
                            Sum0DE = CartaDe5 + (Sum0DE - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaD5);
                        TipoDeCarta(Dtipodibujo5, C5DE, CartaDe5);
                        break;
                }
                SumCartasDE.setText(String.valueOf(Sum0DE));
                s++;
            }
        }

    }
    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        if (repartir) {
            cartasdealer();
            if(Sum0US==21 &(Sum0DE<21|Sum0DE>21)){
                
            }
             if(Sum0US==Sum0DE){ //
                
            }
        } else {
            Pedir1Carta.setEnabled(false);
            Parar.setEnabled(false);
            Doble.setEnabled(false);
            VolveraJugar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
        }

    }//GEN-LAST:event_PararActionPerformed

    boolean Ganador;
    public void ColorBarajaMostrar(String cB, JLabel label) {
        switch (cB) {
            case "r": //Baraja Roja
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/cartaroj80a.png")));
                break;
            case "n"://Baraja Azul
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/cartaazul80.png")));
                break;
        }
    }

    public void CartaBlanca(JLabel label) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/cartablanca (1).png")));
    }

    public void TipoDeCarta(int tipodibujo, JLabel label, int valor) {

        switch (tipodibujo) {
            case 0:
            case 4:
            case 8://Corazon
                label.setForeground(new java.awt.Color(204, 0, 0)); //Rojo
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/IMGcorazón (1).png")));
                label.setText(String.valueOf(valor));
                break;
            case 1:
            case 5:
            case 9: //Picas
                label.setForeground(new java.awt.Color(0, 0, 0)); //Negro
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/IMGpicas-removebg-preview (1).png")));
                label.setText(String.valueOf(valor));
                break;
            case 2:
            case 6:
            case 10://Trebol
                label.setForeground(new java.awt.Color(0, 0, 0));//Negro
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/IMGtrebol-removebg-preview (1).png")));
                label.setText(String.valueOf(valor));
                break;
            case 3:
            case 7:
            case 11://Diamante
                label.setForeground(new java.awt.Color(204, 0, 0)); //Rojo
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBJK/IMGdiamante-removebg-preview (1).png")));
                label.setText(String.valueOf(valor));
                break;
        }
    }
    int Sum0US = 0;//Suma contador de cartas del usuario
    int Sum0DE = 0;

    int CartaUs1 = 0, CartaUs2 = 0, tipodibujo1 = 0, tipodibujo2 = 0, Ucolum1 = 0, Ucolum2 = 0;
    String colorB1, colorB2;

    int CartaDe1 = 0, CartaDe2 = 0, Dtipodibujo1 = 0, Dtipodibujo2 = 0, DColum1 = 0, DColum2 = 0;
    int CartaDe3, CartaDe5, CartaDe4 = 0, Dtipodibujo3 = 0, Dtipodibujo5 = 0, Dtipodibujo4 = 0, DColum3 = 0, DColum4 = 0, DColum5;
    String colorDB1, colorDB2, colorDB3, colorDB4, colorDB5;

    int a = 0; //Variable que verifica si antes de jugar ya repartio las cartas
    private void RepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepartirActionPerformed
        ocultarPanelAjustes();
        VolveraJugar.setEnabled(false);
        MostrarAjustesBlackJack.setEnabled(false);
        if (a == 0) {
            HabilitarbtnGame();
            repartir = true;
            // Cartas iniciales para el usuario
            //carta 1
            elegircarta(baraja, Ccolor); //Subrutina para la eleccion de carta al azar 
            CartaUs1 = valorCarta;
            tipodibujo1 = fila;
            colorB1 = colorB;
            Ucolum1 = columna;
            cont++;
            //carta 2
            elegircarta(baraja, Ccolor);
            CartaUs2 = valorCarta;
            tipodibujo2 = fila;
            colorB2 = colorB;
            Ucolum2 = columna;
            cont++;
            System.out.println("Carta 1 " + CartaUs1);
            System.out.println("Carta 2 " + CartaUs2);
            Sum0US = CartaUs1 + CartaUs2;//Sumar las dos cartas del usuario
            //Validacion del sistema
            if (Sum0US > 21 & (CartaUs1 == 11 | CartaUs2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaUs1 == 11) {
                    CartaUs1 = 1;
                }
                if (CartaUs2 == 11) {
                    CartaUs2 = 1;
                }
                Sum0US = CartaUs1 + CartaUs2;
            }
            ConteoCartaSinUsar(C, cont);
            //Mostrar primera carta
            CartaBlanca(cartaU1);
            TipoDeCarta(tipodibujo1, C1US, CartaUs1);
            //Mostrar segunda carta
            CartaBlanca(cartaU2);
            TipoDeCarta(tipodibujo2, C2US, CartaUs2);

            SumCartasU.setText(String.valueOf(Sum0US));

            // Cartas iniciales para Stella (DEALER)      
            //carta 1
            elegircarta(baraja, Ccolor); //Subrutina para la eleccion de carta al azar 
            CartaDe1 = valorCarta;
            Dtipodibujo1 = fila;
            colorDB1 = colorB;
            DColum1 = columna;
            cont++;
            //carta 2
            elegircarta(baraja, Ccolor);
            CartaDe2 = valorCarta;
            Dtipodibujo2 = fila;
            colorDB2 = colorB;
            DColum2 = columna;
            cont++;
            System.out.println("Carta 1 " + CartaDe1);
            System.out.println("Carta 2 " + CartaDe2);
            Sum0DE = CartaDe1 + CartaDe2;//Sumar las dos cartas del usuario
            //Validacion del sistema
            if (Sum0DE > 21 & (CartaDe1 == 11 | CartaDe2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaDe1 == 11) {
                    CartaDe1 = 1;
                } else {
                    if (CartaDe2 == 11) {
                        CartaDe2 = 1;
                    }
                }
                Sum0US = CartaDe1 + CartaDe2;
            }
            ConteoCartaSinUsar(C, cont);
            //Mostrar primera carta
            ColorBarajaMostrar(colorDB1, cartaD1);

            //Mostrar segunda carta
            CartaBlanca(cartaD2);
            TipoDeCarta(Dtipodibujo2, C2DE, CartaDe2);

            SumCartasDE.setText(String.valueOf(CartaDe2));

            Pedir1Carta.setVisible(true); //Activar botones de juego
            a = 1;
            Repartir.setEnabled(false); //Desspues de repatir que el boton se desactive
            VolveraJugar.setEnabled(false);

            if (Sum0US > 21) { //Si el usuario se pasa
                Pedir1Carta.setEnabled(false);
                Doble.setEnabled(false);
                VolveraJugar.setEnabled(true);
                cartasdealer();
            }
            if (Sum0US == 21) { //Panel de GANO
                Pedir1Carta.setEnabled(false);
                Doble.setEnabled(false);
                VolveraJugar.setEnabled(true);
                cartasdealer();
            }
        } else {
            deshabilitarbtnGame();
            valdRepartir.setText(" Reparte las cartas para iniciar");
        }
    }//GEN-LAST:event_RepartirActionPerformed
    int valorCarta;
    int columna, fila;
    String colorB;

    public void elegircarta(int[][] baraja, String[] Ccolor) {
        int f = ran.nextInt(n); //Con inidices aleoatorios se escoge las cartas dentro de la matriz baraja
        int c = ran.nextInt(m); //Solo sera necesarios hacer esto dos veces

        if (baraja[f][c] == 0) { //Asegurar que la combinación al azar no de una posición que tenga el valor de 0
            while (baraja[f][c] == 0) {
                f = ran.nextInt(n); //Posicion en matriz aleatoria
                c = ran.nextInt(m);
            }
        }
        System.out.println(" F =" + f + "   C= " + c);
        colorB = Ccolor[f];//Color de la baraja segun la fila
        fila = f; //Tipo de dibujo segun la fila
        columna = c;
        valorCarta = baraja[f][c];//Se le asigna el valor de la carta 
        baraja[f][c] = 0; //Se descuenta las cartas ya tomadas

    }
    int s = 3;

    String colorB3, colorB4, colorB5;
    int CartaUs5 = 0, CartaUs3 = 0, CartaUs4 = 0, tipodibujo3 = 0, tipodibujo4 = 0, tipodibujo5 = 0, Ucolum3 = 0, Ucolum4 = 0, Ucolum5 = 0;

    private void Pedir1CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir1CartaActionPerformed
      
        if (repartir) { //Validación de repartir las cartas iniciales
            HabilitarbtnGame();
            Doble.setEnabled(false);
            Repartir.setEnabled(false);
            VolveraJugar.setEnabled(false);
            Parar.setEnabled(true);
            if (s <= 5) {
                cont++;
                ConteoCartaSinUsar(C, cont);
                elegircarta(baraja, Ccolor); //Subrutina para la eleccion de carta al azar 
                switch (s) {
                    case 3:
                        CartaUs3 = valorCarta;
                        tipodibujo3 = fila;
                        colorB3 = colorB;
                        Ucolum3 = columna;
                        Sum0US = CartaUs3 + Sum0US;
                        if (Sum0US > 21 & CartaUs3 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaUs3 = 1;
                            Sum0US = CartaUs3 + (Sum0US - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaU3);
                        TipoDeCarta(tipodibujo3, C3US, CartaUs3);
                        break;
                    case 4:
                        CartaUs4 = valorCarta;
                        tipodibujo4 = fila;
                        colorB4 = colorB;
                        Ucolum4 = columna;
                        Sum0US = CartaUs4 + Sum0US;
                        if (Sum0US > 21 & CartaUs4 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaUs4 = 1;
                            Sum0US = CartaUs4 + (Sum0US - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaU4);
                        TipoDeCarta(tipodibujo4, C4US, CartaUs4);
                        break;
                    case 5:
                        CartaUs5 = valorCarta;
                        tipodibujo5 = fila;
                        colorB5 = colorB;
                        Ucolum5 = columna;
                        Sum0US = CartaUs5 + Sum0US;
                        if (Sum0US > 21 & CartaUs5 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                            //as=1;
                            CartaUs5 = 1;
                            Sum0US = CartaUs5 + (Sum0US - 11);
                        }
                        ConteoCartaSinUsar(C, cont);
                        //Mostrar carta
                        CartaBlanca(cartaU5);
                        TipoDeCarta(tipodibujo5, C5US, CartaUs5);
                        break;
                }
                SumCartasU.setText(String.valueOf(Sum0US));
                s++;

                if (Sum0US > 21) {
                    Pedir1Carta.setEnabled(false);
                    Doble.setEnabled(false);
                    VolveraJugar.setEnabled(true);
                    cartasdealer();
                }
                if (Sum0US == 21) { //Ya Gano
                    Pedir1Carta.setEnabled(false);
                    Doble.setEnabled(false);
                    VolveraJugar.setEnabled(true);
                    cartasdealer();
                }
            } else {
                Mensajito.setText("Ya no puede pedir mas cartas");

                Pedir1Carta.setEnabled(false);
                //mensajito de se lleno, ya no puede pedir mas
            }
        } else {
            Pedir1Carta.setEnabled(false);
            Parar.setEnabled(false);
            Doble.setEnabled(false);
            VolveraJugar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
        }
    }//GEN-LAST:event_Pedir1CartaActionPerformed

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

    private void deshabilitarbtnGame() {
        Repartir.setEnabled(false);
        Pedir1Carta.setEnabled(false);
        Parar.setEnabled(false);
        Doble.setEnabled(false);
        VolveraJugar.setEnabled(false);
    }

    private void HabilitarbtnGame() {
        Repartir.setEnabled(true);
        Pedir1Carta.setEnabled(true);
        Parar.setEnabled(true);
        Doble.setEnabled(true);
        VolveraJugar.setEnabled(true);
    }

    private void MostrarAjustesBlackJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAjustesBlackJackActionPerformed
        h=1;
        Ajustespanel.setVisible(true);
        if (h == 0) { //Se ve y se oculta
            ocultarA();
            h = 1;// Estado del panel A : No visible
        } else { //no se ve tiene que salir
            mostrarA();
            h = 0;//Estado del panel A : Visible
            deshabilitarbtnGame();
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

    //Variable globales matriz 
    int as = 11; //Variable as que puede cambiar dependiendo de la situción
    int h = 0;
    int NumerodeMasos = 1; // validar que este numero no sea ni negativo ni se mayor a 3
    //Solo se aceptaran 3 barajas para jugar

    //Filas = tipo de carta
    int n;
    static int m = 13;
    int C; //Numero de cartas por baraja ( fila x columnas -> 8 x 13)
    int cont = 0;
    //Vector de las dos barajas usando las filas de la matriz como referencia
    String Ccolor[] = {"r", "r", "r", "r", "n", "n", "n", "n", "r", "r", "r", "r"};

    int baraja[][] = new int[100][100];

    public int[][] llenarM(int n, int m) {
        int i, j;
        int contvalorcarta;
        int[][] B = new int[n][m];

        for (i = 0; i < n; i++) {
            contvalorcarta = 2;
            for (j = 0; j < m; j++) {
                if (j == 0) {
                    B[i][j] = as;
                } else {
                    if (j >= 10) {
                        B[i][j] = 10;
                    } else {
                        B[i][j] = contvalorcarta;
                        contvalorcarta = contvalorcarta + 1;
                    }
                }
            }
        }
        return B;
    }
    private void BTNbarajaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbarajaConfirmarActionPerformed
        n = 4 * NumerodeMasos;//Filas = tipo de carta
        C = n * m; //Numero de cartas por baraja ( fila x columnas -> 8 x 13)
        ConteoCartas.setText(Integer.toString(C));
        System.out.println(NumerodeMasos);
        System.out.println(n);
        baraja = llenarM(n, m);
        ocultarA();
        HabilitarbtnGame();
        h = 0;
        MostrarAjustesBlackJack.setEnabled(false);
        a=0;

        //Creacion de matriz 2 Barajas EJEMPLO
        /*int baraja[][] = {
        //Cartas rojas [0-3]
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Corazones     
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Picas
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // Diamantes

        //Cartas azules [4-7]
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Corazones 
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Picas
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}};// Diamantes
        Corazones = fila 0,  4 , 8
        Picas= fila 1, 5, 9
        Treboles = fila 2 , 6 , 10
        Diamantes = fila 3 , 7, 11
    
   col  0  1 2 3 4 5 6 7 8 9  10 11 12  | fila
        ______________________________
        11 2 3 4 5 6 7 8 9 10 10 10 10  |0
        11 2 3 4 5 6 7 8 9 10 10 10 10  |1
        11 2 3 4 5 6 7 8 9 10 10 10 10  |2
        11 2 3 4 5 6 7 8 9 10 10 10 10  |3
        _____________________________
        11 2 3 4 5 6 7 8 9 10 10 10 10  |4
        11 2 3 4 5 6 7 8 9 10 10 10 10  |5
        11 2 3 4 5 6 7 8 9 10 10 10 10  |6
        11 2 3 4 5 6 7 8 9 10 10 10 10  |7
        ______________________________
        11 2 3 4 5 6 7 8 9 10 10 10 10  |8
        11 2 3 4 5 6 7 8 9 10 10 10 10  |9
        11 2 3 4 5 6 7 8 9 10 10 10 10  |10
        11 2 3 4 5 6 7 8 9 10 10 10 10  |11
       
         */
    }//GEN-LAST:event_BTNbarajaConfirmarActionPerformed

    private void masbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masbtnActionPerformed
        NumerodeMasos = NumerodeMasos + 1; //Aumenta 1
        valdmasos.setText("");
        if (NumerodeMasos > 3) {
            valdmasos.setText("(◕ v ◕) Número maximo");
            NumerodeMasos = 3;
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

    private void DobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobleActionPerformed
        if (repartir) { //Validación de repartir las cartas iniciales
            HabilitarbtnGame();
            Repartir.setEnabled(false);
            Doble.setEnabled(false);
            VolveraJugar.setEnabled(false);

            Pedir1Carta.setEnabled(false);
            String colorB3;
            int CartaUs3, tipodibujo3, Ucolum3;
            elegircarta(baraja, Ccolor);
            CartaUs3 = valorCarta;
            tipodibujo3 = fila;
            colorB3 = colorB;
            Ucolum3 = columna;
            Sum0US = CartaUs3 + Sum0US;
            if (Sum0US > 21 & CartaUs3 == 11) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                CartaUs3 = 1;
                Sum0US = CartaUs3 + (Sum0US - 11);
            }
            ConteoCartaSinUsar(C, cont);
            //Mostrar carta
            CartaBlanca(cartaU3);
            TipoDeCarta(tipodibujo3, C3US, CartaUs3);
            SumCartasU.setText(String.valueOf(Sum0US));

            Doble.setEnabled(false);

            if (Sum0US > 21) { //Si el usuario se pasa
                Pedir1Carta.setEnabled(false);
                Doble.setEnabled(false);
                VolveraJugar.setEnabled(true);
                cartasdealer();
            }
            if (Sum0US == 21) { //Panel de GANO
                Pedir1Carta.setEnabled(false);
                Doble.setEnabled(false);
                VolveraJugar.setEnabled(true);
                cartasdealer();
            }

        } else {
            Pedir1Carta.setEnabled(false);
            Parar.setEnabled(false);
            Doble.setEnabled(false);
            VolveraJugar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
        }
    }//GEN-LAST:event_DobleActionPerformed

    private void VolveraJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolveraJugarActionPerformed
        //if (repartir) {//Validación de repartir las cartas iniciales
           mostrarA();
            MostrarAjustesBlackJack.setEnabled(true);
            h = 0;//Estado del panel A : Visible
           
            NumerodeMasos = 1; cont=0;Sum0US=0;Sum0DE=0;C=0;s=3;
            cartaU1.setIcon(null);cartaU2.setIcon(null);cartaU3.setIcon(null);cartaU4.setIcon(null);cartaU5.setIcon(null);
            cartaD1.setIcon(null); cartaD2.setIcon(null); cartaD3.setIcon(null); cartaD4.setIcon(null); cartaD5.setIcon(null);
            C1US.setIcon(null);C2US.setIcon(null);C3US.setIcon(null);C4US.setIcon(null);C5US.setIcon(null);
            C1DE.setIcon(null); C2DE.setIcon(null); C3DE.setIcon(null); C4DE.setIcon(null); C5DE.setIcon(null);
            cartaU1.setText("");cartaU2.setText("");cartaU3.setText("");cartaU4.setText("");cartaU5.setText("");
            cartaD1.setText(""); cartaD2.setText(""); cartaD3.setText(""); cartaD4.setText(""); cartaD5.setText("");
            C1US.setText("");C2US.setText("");C3US.setText("");C4US.setText("");C5US.setText("");
            C1DE.setText(""); C2DE.setText(""); C3DE.setText(""); C4DE.setText(""); C5DE.setText("");
            SumCartasU.setText("");SumCartasDE.setText("");
            HabilitarbtnGame();
            repartir=false;
//       
            Pedir1Carta.setEnabled(false);
            Parar.setEnabled(false);
            Doble.setEnabled(false);
            Repartir.setEnabled(false);
            VolveraJugar.setEnabled(false);
//            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
//       
    }//GEN-LAST:event_VolveraJugarActionPerformed

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
    private javax.swing.JLabel C3DE;
    private javax.swing.JLabel C3US;
    private javax.swing.JLabel C4DE;
    private javax.swing.JLabel C4US;
    private javax.swing.JLabel C5DE;
    private javax.swing.JLabel C5US;
    private javax.swing.JLabel ConteoCartas;
    private javax.swing.JButton Doble;
    private javax.swing.JLabel Mensajito;
    private javax.swing.JPanel MesaCartas;
    private javax.swing.JButton MostrarAjustesBlackJack;
    private javax.swing.JPanel MovJugadas;
    private javax.swing.JButton Parar;
    private javax.swing.JButton Pedir1Carta;
    private javax.swing.JButton Repartir;
    private javax.swing.JLabel SumCartasDE;
    private javax.swing.JLabel SumCartasU;
    private javax.swing.JButton VolveraJugar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel cartaD1;
    private javax.swing.JLabel cartaD2;
    private javax.swing.JLabel cartaD3;
    private javax.swing.JLabel cartaD4;
    private javax.swing.JLabel cartaD5;
    private javax.swing.JLabel cartaU1;
    private javax.swing.JLabel cartaU2;
    private javax.swing.JLabel cartaU3;
    private javax.swing.JLabel cartaU4;
    private javax.swing.JLabel cartaU5;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelNombreUser;
    private javax.swing.JLabel labelStellaNombre;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JButton masbtn;
    private javax.swing.JButton menosbtn;
    private javax.swing.JLabel mostrarnummaso;
    private javax.swing.JLabel valdRepartir;
    private javax.swing.JLabel valdmasos;
    // End of variables declaration//GEN-END:variables

}
