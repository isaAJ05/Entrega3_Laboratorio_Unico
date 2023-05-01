/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelesSP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class medium extends javax.swing.JPanel {

    /**
     * Creates new form medium
     */
    //Variables globales
    // - Contadores
    int entre = 0;//para contabilizar las veces que el usuario presione los botones
    int cont = 0;//para contabilizar palabras halladas y mostrarlas al usuario

    // - Matrices
    int movimientos[][] = new int[100][100];
    int correctos[][] = {{2, 2}, {3, 3}, {4, 4},{5, 5},};

    // -Verifican si la palabra ya la encontró
    boolean yaloencontre1 = false;
    boolean yaloencontre2 = false;
    boolean yaloencontre3 = false;
    boolean yaloencontre4 = false;

    //SUBRUTINAS
    // - Subrutina para que cada vez que el usuario presione un boton guarde su movimiento y posteriormente lo verifique 
    private void botonpresionado(JButton boton, JButton botones[][], JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[], JLabel chulito1, JLabel chulito2, JLabel chulito3,JLabel chulito4) {
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int f;
                entre++;

                f = comprobacion(entre);//Funcion para saber si he presionado botones dos veces o multiplos de 2
                //La idea es que cada vez que presione dos botones guarde ese movimiento (con contadores) y verifique si esos dos son una seleccion correcta

                movimientos(boton, f, vector1, vector2, vector3, vector4);//Subrutina que asigna dos numeros en una fila y dos columnas de una matriz si el boton seleccionado hace parte de un boton inicial o final de una palabra
                verifiquemos(movimientos, f, botones, vector1, vector2, vector3, vector4, chulito1, chulito2, chulito3,chulito4);//Subrutina que verifica si la matriz movimientos hace parte de una seleccion correcta

            }
        }
        );
    }

    //  -Subrutina que asigna dos numeros en una fila y dos columnas de una matriz si el boton seleccionado hace parte de un boton inicial o final de una palabra
    private void movimientos(JButton boton, int f, JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[]) {
        if (boton == vector1[0]) {
            movimientos[f][0] = 2;
        } else if (boton == vector1[vector1.length - 1]) {
            movimientos[f][1] = 2;
        }
        if (boton == vector2[0]) {
            movimientos[f][0] = 3;
        } else if (boton == vector2[vector2.length - 1]) {
            movimientos[f][1] = 3;
        }
        if (boton == vector3[0]) {
            movimientos[f][0] = 4;
        } else if (boton == vector3[vector3.length - 1]) {
            movimientos[f][1] = 4;
        }
        if (boton == vector4[0]) {
            movimientos[f][0] = 5;
        } else if (boton == vector4[vector4.length - 1]) {
            movimientos[f][1] = 5;
        }
    }

    //  -Subrutina que verifica si la matriz movimientos hace parte de una seleccion correcta
    private void verifiquemos(int movimientos[][], int f, JButton botones[][], JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[], JLabel chulito1, JLabel chulito2, JLabel chulito3,JLabel chulito4) {
        int i;
        if (movimientos[f][0] == correctos[0][0] && movimientos[f][1] == correctos[0][1]) {
            for (i = 0; i < vector1.length; i++) {
                vector1[i].setBackground(Color.green);

            }

            if (yaloencontre1 == false) {
                comprobacion2(chulito1);
            }
            yaloencontre1 = true;
        }
        if (movimientos[f][0] == correctos[1][0] && movimientos[f][1] == correctos[1][1]) {
            for (i = 0; i < vector2.length; i++) {
                vector2[i].setBackground(Color.green);

            }

            if (yaloencontre2 == false) {
                comprobacion2(chulito2);
            }
            yaloencontre2 = true;
        }
        if (movimientos[f][0] == correctos[2][0] && movimientos[f][1] == correctos[2][1]) {
            for (i = 0; i < vector3.length; i++) {
                vector3[i].setBackground(Color.green);

            }

            if (yaloencontre3 == false) {
                comprobacion2(chulito3);
            }
            yaloencontre3 = true;
        }
        if (movimientos[f][0] == correctos[3][0] && movimientos[f][1] == correctos[3][1]) {
            for (i = 0; i < vector4.length; i++) {
                vector4[i].setBackground(Color.green);

            }

            if (yaloencontre4 == false) {
                comprobacion2(chulito4);
            }
            yaloencontre4 = true;
        }

    }

    //Subrutina que produce diversas verificaciones y contabilizaciones cada vez que un usuario encuentra una palabra
    private void comprobacion2(JLabel chulito) {
        //Se volverá visible una estrella al lado de la palabra Correspondiente en la lista
        chulito.setVisible(true);
        //Para contabilizar palabras halladas y mostrarlas al usuario
        cont += 1;// cada palabra hallada se le suma 1 al contador

        if (cont == 1) {
            palabrasencontradas.setText("1/4");
        } else if (cont == 2) {
            palabrasencontradas.setText("2/4");
        } else if (cont == 3) {
            palabrasencontradas.setText("3/4");

        } else if (cont == 4) {
            palabrasencontradas.setText("4/4");
            cont += 1;
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (cont == 5) {
            JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
            //Para que no se realicen mas cambios en la sopa

            //para que no pueda pedir mas pistas ver la solucion o instrucciones
            pista.setEnabled(false);
            solucion.setEnabled(false);
            instrucciones.setEnabled(false);

        }

    }
    //FUNCIONES

    // - Funcion para saber si he presionado botones dos veces o multiplos de 2
    private int comprobacion(int entre) {
        int res = entre;
        if (entre % 2 == 0) {
            res = entre - 1;
        }
        return res;

    }
    private String name = null;

    public medium(String user) {
        initComponents();

        this.name = user;
        int i, j, auxt = 5, auxt2 = 6, auxp = 0, auxp2 = 1, auxv = 4, auxv2 = 5;
        //Matriz de botones [6][6]
        JButton botones[][] = {{boton11, boton12, boton13, boton14, boton15, boton16},
        {boton21, boton22, boton23, boton24, boton25, boton26},
        {boton31, boton32, boton33, boton34, boton35, boton36},
        {boton41, boton42, boton43, boton44, boton45, boton46},
        {boton51, boton52, boton53, boton54, boton55, boton56},
        {boton61, boton62, boton63, boton64, boton65, boton66},
        {boton71, boton72, boton73, boton74, boton75, boton76},
        {boton81, boton82, boton83, boton84, boton85, boton86}};//matriz de botones

        //Vector de planetas [5] pero solo se usan 4 espacios
        String[] planetas = {"TIERRA", "MARTE", "VENUS", "PLUTON", ""};

        // Palabra TIERRA
        JButton[] tierra = {boton36, boton35, boton34, boton33, boton32, boton31,};

        // Palabra MARTE
        JButton[] marte = {boton11, boton22, boton33, boton44, boton55,};

        // Palabra VENUS
        JButton[] venus = {boton86, boton76, boton66, boton56, boton46,};

        // Palabra PLUTON
        JButton[] pluton = {boton61, boton62, boton63, boton64, boton65, boton66,};

        //Asignacion de letras a texto de la matriz de botones
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 6; j++) {
botonpresionado(botones[i][j], botones, tierra, marte, venus,pluton, chulito1, chulito2, chulito3,chulito4);
                //Letras aleatorias mayusculas usando Random
                Random random = new Random();
                char letra = (char) (random.nextInt(26) + 'A');
                String letraStr = String.valueOf(letra);
                botones[i][j].setText(letraStr);// se le asigna una letra aleatoria al texto de los botones

                //ORGANIZAR LETRAS DE PALABRAS SEGUN LA POSICIÓN DESEADA
                //De acuerdo a mi matriz planteada:
                //i representará mis filas
                //j representará mis columnas
                // TIERRA 
                if (i == 2 && j <= 5) { // Posición Horizontal inversa: Fila 2, columnas de 0 - 5
                    String caracter = planetas[0].substring(auxt, auxt2);//extraer caracteres de la palabra TIERRA
                    auxt2 = auxt;// uso de auxiliares para obtener valores deseados para una correcta extracción de caracteres
                    auxt = auxt - 1;
                    botones[i][j].setText(caracter);//se le asignan las letras correspondientes
                    //MARTE
                } else if (i < 5 && j < 5) { //Posición Diagonal: fila de 0-4, columnas 0-4
                    if (j == 0 && i == 0) {
                        String caracter2 = planetas[1].substring(j, j + 1);//extracción de caracter personalizado 
                        botones[i][j].setText(caracter2);//LETRA M
                    } else if (j == 1 && i == 1) {
                        String caracter21 = planetas[1].substring(j, j + 1);
                        botones[i][j].setText(caracter21);//LETRA A
                    } else if (j == 2 && i == 2) {
                        String caracter22 = planetas[1].substring(j, j + 1);
                        botones[i][j].setText(caracter22);//LETRA R
                    } else if (j == 3 && i == 3) {
                        String caracter23 = planetas[1].substring(j, j + 1);
                        botones[i][j].setText(caracter23);//LETRA T
                    } else if (j == 4 && i == 4) {
                        String caracter24 = planetas[1].substring(j, j + 1);
                        botones[i][j].setText(caracter24);//LETRA E 
                    }
                    //VENUS
                } else if (i >= 3 && i <= 7 && j == 5) { //Posición Vertical inversa : fila de 7-3, columna 5
                    String caracter3 = planetas[2].substring(auxv, auxv2);
                    auxv2 = auxv;
                    auxv = auxv - 1;
                    botones[i][j].setText(caracter3);
                    //PLUTON
                } else if (i == 5 && j <= 5) {// Posición Horizontal: Fila 5, columnas de 0 - 5
                    String caracter4 = planetas[3].substring(j, j + 1);
                    botones[i][j].setText(caracter4);

                }
            }
        }

        //Hacer invisible estrellas al inicio de apertura de la ventana
        chulito1.setVisible(false);
        chulito2.setVisible(false);
        chulito3.setVisible(false);
        chulito4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido5 = new javax.swing.JPanel();
        boton11 = new javax.swing.JButton();
        boton61 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton51 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton81 = new javax.swing.JButton();
        boton71 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton52 = new javax.swing.JButton();
        boton62 = new javax.swing.JButton();
        boton82 = new javax.swing.JButton();
        boton72 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        boton63 = new javax.swing.JButton();
        boton53 = new javax.swing.JButton();
        boton73 = new javax.swing.JButton();
        boton83 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton44 = new javax.swing.JButton();
        boton34 = new javax.swing.JButton();
        boton54 = new javax.swing.JButton();
        boton64 = new javax.swing.JButton();
        boton74 = new javax.swing.JButton();
        boton84 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton35 = new javax.swing.JButton();
        boton45 = new javax.swing.JButton();
        boton55 = new javax.swing.JButton();
        boton65 = new javax.swing.JButton();
        boton75 = new javax.swing.JButton();
        boton85 = new javax.swing.JButton();
        boton26 = new javax.swing.JButton();
        boton36 = new javax.swing.JButton();
        boton46 = new javax.swing.JButton();
        boton56 = new javax.swing.JButton();
        boton66 = new javax.swing.JButton();
        boton76 = new javax.swing.JButton();
        boton86 = new javax.swing.JButton();
        sopadeletras = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pista = new javax.swing.JButton();
        solucion = new javax.swing.JButton();
        palabrasencontradas = new javax.swing.JLabel();
        instrucciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chulito1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chulito2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chulito3 = new javax.swing.JLabel();
        chulito4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelvolver = new javax.swing.JLabel();
        btnVolver3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 496));

        contenido5.setBackground(new java.awt.Color(0, 0, 204));
        contenido5.setName("STAR GAMES: Sopa de letras Planetas"); // NOI18N
        contenido5.setOpaque(false);
        contenido5.setPreferredSize(new java.awt.Dimension(800, 496));
        contenido5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                contenido5MouseMoved(evt);
            }
        });

        boton11.setText("jButton2");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton61.setText("jButton2");
        boton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton61ActionPerformed(evt);
            }
        });

        boton41.setText("jButton2");

        boton51.setText("jButton2");

        boton21.setText("jButton2");

        boton31.setText("jButton2");
        boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton31ActionPerformed(evt);
            }
        });

        boton81.setText("jButton2");
        boton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton81ActionPerformed(evt);
            }
        });

        boton71.setText("jButton2");

        boton12.setText("jButton2");

        boton22.setText("jButton2");

        boton32.setText("jButton2");
        boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton32ActionPerformed(evt);
            }
        });

        boton42.setText("jButton2");

        boton52.setText("jButton2");

        boton62.setText("jButton2");

        boton82.setText("jButton2");

        boton72.setText("jButton2");
        boton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton72ActionPerformed(evt);
            }
        });

        boton13.setText("jButton2");

        boton23.setText("jButton2");

        boton43.setText("jButton2");

        boton33.setText("jButton2");

        boton63.setText("jButton2");

        boton53.setText("jButton2");
        boton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton53ActionPerformed(evt);
            }
        });

        boton73.setText("jButton2");
        boton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton73ActionPerformed(evt);
            }
        });

        boton83.setText("jButton2");
        boton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton83ActionPerformed(evt);
            }
        });

        boton14.setText("jButton2");
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setText("jButton2");
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton16.setText("jButton2");
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });

        boton24.setText("jButton2");
        boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton24ActionPerformed(evt);
            }
        });

        boton44.setText("jButton2");
        boton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton44ActionPerformed(evt);
            }
        });

        boton34.setText("jButton2");
        boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton34ActionPerformed(evt);
            }
        });

        boton54.setText("jButton2");
        boton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton54ActionPerformed(evt);
            }
        });

        boton64.setText("jButton2");
        boton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton64ActionPerformed(evt);
            }
        });

        boton74.setText("jButton2");
        boton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton74ActionPerformed(evt);
            }
        });

        boton84.setText("jButton2");
        boton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton84ActionPerformed(evt);
            }
        });

        boton25.setText("jButton2");
        boton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton25ActionPerformed(evt);
            }
        });

        boton35.setText("jButton2");
        boton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton35ActionPerformed(evt);
            }
        });

        boton45.setText("jButton2");
        boton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton45ActionPerformed(evt);
            }
        });

        boton55.setText("jButton2");
        boton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton55ActionPerformed(evt);
            }
        });

        boton65.setText("jButton2");
        boton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton65ActionPerformed(evt);
            }
        });

        boton75.setText("jButton2");
        boton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton75ActionPerformed(evt);
            }
        });

        boton85.setText("jButton2");
        boton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton85ActionPerformed(evt);
            }
        });

        boton26.setText("jButton2");
        boton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton26ActionPerformed(evt);
            }
        });

        boton36.setText("jButton2");
        boton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton36ActionPerformed(evt);
            }
        });

        boton46.setText("jButton2");
        boton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton46ActionPerformed(evt);
            }
        });

        boton56.setText("jButton2");
        boton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton56ActionPerformed(evt);
            }
        });

        boton66.setText("jButton2");
        boton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton66ActionPerformed(evt);
            }
        });

        boton76.setText("jButton2");
        boton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton76ActionPerformed(evt);
            }
        });

        boton86.setText("jButton2");
        boton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton86ActionPerformed(evt);
            }
        });

        sopadeletras.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        sopadeletras.setForeground(new java.awt.Color(255, 255, 255));
        sopadeletras.setText("SOPA DE LETRAS STAR ");

        jButton2.setBackground(new java.awt.Color(255, 153, 255));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("NEXT LEVEL");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pista.setBackground(new java.awt.Color(255, 153, 255));
        pista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        pista.setForeground(new java.awt.Color(0, 0, 51));
        pista.setText("Pista");
        pista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaActionPerformed(evt);
            }
        });

        solucion.setBackground(new java.awt.Color(255, 153, 255));
        solucion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        solucion.setForeground(new java.awt.Color(0, 0, 51));
        solucion.setText("Ver solución");
        solucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionActionPerformed(evt);
            }
        });

        palabrasencontradas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        palabrasencontradas.setForeground(new java.awt.Color(255, 255, 255));
        palabrasencontradas.setText("0/4");

        instrucciones.setBackground(new java.awt.Color(255, 153, 255));
        instrucciones.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        instrucciones.setForeground(new java.awt.Color(0, 0, 51));
        instrucciones.setText("Instrucciones");
        instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLANETAS");

        chulito1.setForeground(new java.awt.Color(255, 0, 0));
        chulito1.setText("★");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIERRA");

        chulito2.setForeground(new java.awt.Color(255, 0, 0));
        chulito2.setText("★");

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MARTE");

        chulito3.setForeground(new java.awt.Color(255, 0, 0));
        chulito3.setText("★");

        chulito4.setForeground(new java.awt.Color(255, 0, 0));
        chulito4.setText("★");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VENUS");

        jLabel13.setBackground(new java.awt.Color(153, 204, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PLUTÓN");

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver3.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnVolver3.setContentAreaFilled(false);
        btnVolver3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver3.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver3MouseExited(evt);
            }
        });
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenido5Layout = new javax.swing.GroupLayout(contenido5);
        contenido5.setLayout(contenido5Layout);
        contenido5Layout.setHorizontalGroup(
            contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido5Layout.createSequentialGroup()
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton83, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton84, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton85, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton86, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton64, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton65, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton66, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(boton71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton73, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton74, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton76, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(boton51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton53, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton56, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                            .addComponent(boton41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chulito2)
                            .addComponent(chulito1)
                            .addComponent(chulito3)
                            .addComponent(chulito4))
                        .addGap(18, 18, 18)
                        .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contenido5Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenido5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(contenido5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solucion)
                .addGap(40, 40, 40)
                .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(contenido5Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(sopadeletras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        contenido5Layout.setVerticalGroup(
            contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido5Layout.createSequentialGroup()
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrucciones)
                            .addComponent(pista)
                            .addComponent(solucion)
                            .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido5Layout.createSequentialGroup()
                        .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido5Layout.createSequentialGroup()
                        .addComponent(sopadeletras)
                        .addGap(18, 18, 18)))
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton11)
                    .addComponent(boton12)
                    .addComponent(boton13)
                    .addComponent(boton14)
                    .addComponent(boton15)
                    .addComponent(boton16)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton22)
                    .addComponent(boton23)
                    .addComponent(boton24)
                    .addComponent(boton25)
                    .addComponent(boton26)
                    .addComponent(boton21)
                    .addComponent(jLabel3)
                    .addComponent(chulito1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton32)
                    .addComponent(boton33)
                    .addComponent(boton34)
                    .addComponent(boton35)
                    .addComponent(boton36)
                    .addComponent(boton31)
                    .addComponent(jLabel10)
                    .addComponent(chulito2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton42)
                    .addComponent(boton43)
                    .addComponent(boton44)
                    .addComponent(boton45)
                    .addComponent(boton46)
                    .addComponent(boton41)
                    .addComponent(jLabel12)
                    .addComponent(chulito3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton56)
                        .addComponent(jLabel13)
                        .addComponent(chulito4))
                    .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton51)
                        .addComponent(boton52)
                        .addComponent(boton53)
                        .addComponent(boton54)
                        .addComponent(boton55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton61)
                    .addComponent(boton62)
                    .addComponent(boton63)
                    .addComponent(boton64)
                    .addComponent(boton65)
                    .addComponent(boton66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton72)
                    .addComponent(boton73)
                    .addComponent(boton74)
                    .addComponent(boton75)
                    .addComponent(boton76)
                    .addComponent(boton71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton86)
                    .addComponent(boton85)
                    .addComponent(boton84)
                    .addComponent(boton83)
                    .addComponent(boton82)
                    .addComponent(boton81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido5, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed

    }//GEN-LAST:event_boton11ActionPerformed

    private void boton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton61ActionPerformed

    }//GEN-LAST:event_boton61ActionPerformed

    private void boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton31ActionPerformed

    }//GEN-LAST:event_boton31ActionPerformed

    private void boton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton81ActionPerformed

    }//GEN-LAST:event_boton81ActionPerformed

    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed

    }//GEN-LAST:event_boton32ActionPerformed

    private void boton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton72ActionPerformed

    }//GEN-LAST:event_boton72ActionPerformed

    private void boton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton53ActionPerformed

    private void boton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton73ActionPerformed

    private void boton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton83ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed

    }//GEN-LAST:event_boton16ActionPerformed

    private void boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton24ActionPerformed

    private void boton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton44ActionPerformed

    private void boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton34ActionPerformed

    private void boton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton54ActionPerformed

    private void boton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton64ActionPerformed

    private void boton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton74ActionPerformed

    private void boton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton84ActionPerformed

    }//GEN-LAST:event_boton84ActionPerformed

    private void boton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton25ActionPerformed

    private void boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton35ActionPerformed

    private void boton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton45ActionPerformed

    private void boton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton55ActionPerformed

    }//GEN-LAST:event_boton55ActionPerformed

    private void boton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton65ActionPerformed

    private void boton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton75ActionPerformed

    private void boton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton85ActionPerformed

    private void boton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton26ActionPerformed

    private void boton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton36ActionPerformed

    }//GEN-LAST:event_boton36ActionPerformed

    private void boton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton46ActionPerformed

    }//GEN-LAST:event_boton46ActionPerformed

    private void boton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton56ActionPerformed

    private void boton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton66ActionPerformed


    }//GEN-LAST:event_boton66ActionPerformed

    private void boton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton76ActionPerformed

    }//GEN-LAST:event_boton76ActionPerformed

    private void boton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton86ActionPerformed

    }//GEN-LAST:event_boton86ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        contenido5.removeAll();
        hard h = new hard(name);
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);
        contenido5.add(h);
        contenido5.revalidate();
        contenido5.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        //Para mostrar pistas:
        //tengo en cuenta si ya el contador de la palabra está lleno ademas creo un auxiliar para cerciorarme de no repetir la palabra si ya la encontraron
        //la pista consiste en crear un fondo verde en la inicial de la letra de un planeta que no haya encontrado el usuario
        //psra la palabra urano la pista esta en las dos 2 ultimas letras
        if (yaloencontre1 == false) { //pista letra inicial TIERRA
            boton36.setBackground(new Color(153, 255, 153));
            ;
        } else if (yaloencontre2 == false) {//pista letra inicial MARTE
            boton11.setBackground(new Color(153, 255, 153));

        } else if (yaloencontre3 == false) {//pista letra inicial VENUS
            boton86.setBackground(new Color(153, 255, 153));

        } else if (yaloencontre4 == false) {//pista letra inicial PLUTON
            boton61.setBackground(new Color(153, 255, 153));

        }
    }//GEN-LAST:event_pistaActionPerformed

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
        //Al presionar este boton se podra visualizar la solución de la sopa de letras al ver con un fondo verde las letras de las palabras propuestas al usuario
        //TIERRA
        boton36.setBackground(Color.green);//Letra T
        boton35.setBackground(Color.green);//Letra I
        boton34.setBackground(Color.green);//Letra E
        boton33.setBackground(Color.green);//Letra R
        boton32.setBackground(Color.green);//Letra R
        boton31.setBackground(Color.green);//Letra A
        //MARTE
        boton11.setBackground(Color.green);//Letra M
        boton22.setBackground(Color.green);//Letra A
        boton33.setBackground(Color.green);//Letra R
        boton44.setBackground(Color.green);//Letra T
        boton55.setBackground(Color.green);//Letra E
        //VENUS
        boton86.setBackground(Color.green);//Letra V
        boton76.setBackground(Color.green);//Letra E
        boton66.setBackground(Color.green);//Letra N
        boton56.setBackground(Color.green);//Letra U
        boton46.setBackground(Color.green);//Letra S
        //PLUTON
        boton61.setBackground(Color.green);//Letra P
        boton62.setBackground(Color.green);//Letra L
        boton63.setBackground(Color.green);//Letra U
        boton64.setBackground(Color.green);//Letra T
        boton65.setBackground(Color.green);//Letra O
        boton66.setBackground(Color.green);//Letra N
        //MOSTRAR PALABRAS ENCONTRADAS
        palabrasencontradas.setText("4/4");
        //MOSTRAR ESTRELLAS (CHULITOS)
        chulito1.setVisible(true);
        chulito2.setVisible(true);
        chulito3.setVisible(true);
        chulito4.setVisible(true);

    }//GEN-LAST:event_solucionActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
        //Mostrar Joption pane de instrucciones
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 8x6 donde encontrarás 4 palabras ocultas"
                + "\nrelacionadas a nombres de planetas del sistema solar."
                + "\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                + "\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                + "\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                + "\n     o inverso."
                + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                + "\n      para que el sistema verifique tu elección.\n"
                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                + "\n      una estrella al lado de la palabra de la lista.\n"
                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                + "\n\n𝐏𝐋𝐔𝐒: Si lo deseas puedes pedir pistas o revelar la solución de la sopa de letras al seleccionar dichas opciones."
                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_instruccionesActionPerformed

    private void contenido5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenido5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_contenido5MouseMoved

    private void btnVolver3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseEntered
        labelvolver.setText(" Menú");
    }//GEN-LAST:event_btnVolver3MouseEntered

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        contenido5.removeAll();
        tema h = new tema(name);//Una instancia
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);

        contenido5.add(h);
        contenido5.revalidate();
        contenido5.repaint();
    }//GEN-LAST:event_btnVolver3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton26;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton34;
    private javax.swing.JButton boton35;
    private javax.swing.JButton boton36;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton boton44;
    private javax.swing.JButton boton45;
    private javax.swing.JButton boton46;
    private javax.swing.JButton boton51;
    private javax.swing.JButton boton52;
    private javax.swing.JButton boton53;
    private javax.swing.JButton boton54;
    private javax.swing.JButton boton55;
    private javax.swing.JButton boton56;
    private javax.swing.JButton boton61;
    private javax.swing.JButton boton62;
    private javax.swing.JButton boton63;
    private javax.swing.JButton boton64;
    private javax.swing.JButton boton65;
    private javax.swing.JButton boton66;
    private javax.swing.JButton boton71;
    private javax.swing.JButton boton72;
    private javax.swing.JButton boton73;
    private javax.swing.JButton boton74;
    private javax.swing.JButton boton75;
    private javax.swing.JButton boton76;
    private javax.swing.JButton boton81;
    private javax.swing.JButton boton82;
    private javax.swing.JButton boton83;
    private javax.swing.JButton boton84;
    private javax.swing.JButton boton85;
    private javax.swing.JButton boton86;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel chulito1;
    private javax.swing.JLabel chulito2;
    private javax.swing.JLabel chulito3;
    private javax.swing.JLabel chulito4;
    private javax.swing.JPanel contenido5;
    private javax.swing.JButton instrucciones;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel palabrasencontradas;
    private javax.swing.JButton pista;
    private javax.swing.JButton solucion;
    private javax.swing.JLabel sopadeletras;
    // End of variables declaration//GEN-END:variables
}
