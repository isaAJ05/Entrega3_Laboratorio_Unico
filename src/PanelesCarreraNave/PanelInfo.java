package PanelesCarreraNave;

public class PanelInfo extends javax.swing.JPanel {

   
    public PanelInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(710, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("INSTRUCCIONES DE USO ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 22, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("            \n            ¡Bienvenido al juego de carreras espaciales! \n\n En este juego, tendrás la oportunidad de pilotar tu propia\n nave espacial y competir contra otros jugadores por el\n primer lugar.\n\n     *  Antes de empezar la carrera, podrás elegir tu nave\n        espacial favorita. \n\n     *  Para iniciar una nueva partida selecciona la opción \n        \"Carrera\" en el menú principal. Si deseas hacer uso \n        del control remoto, puede seleccionar la opción de \n        \"Remoto\". \n\n     *  Una vez que hayas seleccionado tu nave, aparecerás\n        en la línea de salida junto con los demás pilotos.\n\n     *  Selecciona la opción \"Comenzar\" para jugar. \n         Prepárate para la carrera.\n\n     *  Para mover tu nave, utiliza las teclas de flecha de tu \n        teclado. \n\n             ↑              La tecla de flecha hacia arriba o abajo\n        ←       →         dirijira tu nave en esa dirección.\n             ↓              La tecla de flecha hacia la derecha\n                              acelerará tu nave\n \n      * Aprovecha los bonos de la pista !\n        Las esferraz de luz de color azul te ayudaran a \n        acelarar el motor, asi iras mas rápido.\n \n       * Esquiva los obstaculos de la pista !\n        Las esferaz de luz de color rojo harán que retrocedas\n        en tu camino. Ten ciudado !\n      \n       * El primer jugador en cruzar la línea de meta será\n          el ganador.\n\n       *  Si deseas volver a jugar, selecciona la opción \n         \" Carrera\" en el menú principal.\n \n\n      Ahora estás listo para competir en el juego de \n                             carreras espaciales. \n                                \n                      ¡Que gane el mejor piloto!\n\n");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/STAR_GAMES-removebg-preview (2).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
