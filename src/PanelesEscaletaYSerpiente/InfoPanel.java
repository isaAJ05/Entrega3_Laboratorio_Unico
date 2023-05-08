
package PanelesEscaletaYSerpiente;

public class InfoPanel extends javax.swing.JPanel {

    public InfoPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("INSTRUCCIONES DE USO ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(242, 135, 63));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("¡Bienvenido a \"Escaleras y Serpientes versión Espacial\"! \n\nEn este juego, tendrás la oportunidad de escoger tu avatar alien y recorrer un tablero \nespacial donde competirás contra nuestra adorada Stella por el primer lugar.\n\nPor favor ten en cuenta las siguientes instrucciones: \n1. Antes de comenzar, asegúrate de elegir tu avatar. \n   Recuerda que el avatar del jugador es un alien, así que elige aquel que refleje \n   mejor tu personalidad extraterrestre.\n2. Selecciona la opción de \"Jugar\" para dirigirte a nuestro tablero espacial.\n3. ¿Listo para empezar? Lanza el dado para comenzar tu turno. \n   ¡Que la suerte del universo esté de tu lado!\n4. Si caes en una casilla con una escalera, tu avatar despegará hacia arriba. \n   ¡Prepárate para llegar más rápido a la línea final!\n5. Pero ten cuidado, si caes en una casilla con una serpiente, tu avatar espacial \n   será atrapada y descenderás de golpe. ¡Intenta evitar esas serpientes espaciales! \n7. Recuerda, debes avanzar por 35 casillas para llegar a la línea final y ganar. \n   ¡Mantén tu concentración y no pierdas de vista tu objetivo final!\n\n¡Que la fuerza alienígena te acompañe! \n¡Diviértete jugando a \"Escaleras y Serpientes versión Espacial\"!");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 720, 330));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
