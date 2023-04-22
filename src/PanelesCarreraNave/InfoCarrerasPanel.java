package PanelesCarreraNave;

public class InfoCarrerasPanel extends javax.swing.JPanel {

   
    public InfoCarrerasPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 51));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(710, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("INSTRUCCIONES DE USO ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 22, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("¡Bienvenido al juego de carreras espaciales! \n\nEn este juego, tendrás la oportunidad de pilotar tu propia nave espacial y competir contra\notros jugadores por el primer lugar.\n\n* Antes de empezar la carrera, podrás elegir tu nave espacial favorita. \n\n* Para iniciar una nueva partida selecciona la opción \"Carrera\" en el menú principal. \n\n* Una vez que hayas seleccionado tu nave, aparecerás en la línea de salida junto con los \n   demás pilotos.\n\n* Selecciona la opción \"Comenzar\" para jugar. Prepárate para la carrera.\n\n* Para mover tu nave, utiliza las teclas de flecha de tu teclado. \n\n                         ⬆\n                      ⬅   ➜\n                         ⬇\n\n  La tecla de flecha hacia la izquierda acelerará tu nave\n  la tecla de flecha hacia abajo frenará (LO CUAL NO ESTÁ PERMITIDO) \n  la tecla de flecha hacia arriba o abajo girará tu nave en esa dirección.\n \n* El primer jugador en cruzar la línea de meta será el ganador.\n\n* Si deseas volver a jugar, selecciona la opción \"Carrera\" en el menú principal.\n \n\n            Ahora estás listo para competir en el juego de carreras espaciales. \n                                \n                                 ¡Que gane el mejor piloto!");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 290));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
