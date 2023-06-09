package PanelesSP;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class hardanime extends javax.swing.JPanel {

    /**
     * Creates new form hard
     */
    //Variables globales
    // - Contadores
    int entre = 0;//para contabilizar las veces que el usuario presione los botones
    int cont = 0;//para contabilizar palabras halladas y mostrarlas al usuario

    // - Matrices
    int movimientos[][] = new int[100][100];
    int correctos[][] = {{2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}, {7, 7},};

    // -Verifican si la palabra ya la encontró
    boolean yaloencontre1 = false;
    boolean yaloencontre2 = false;
    boolean yaloencontre3 = false;
    boolean yaloencontre4 = false;
    boolean yaloencontre5 = false;
    boolean yaloencontre6 = false;
    
    //HashSet: Un HashSet es una colección de elementos en Java que no permite elementos duplicados.
    private HashSet<JButton> botonesAfectados = new HashSet<>();

    //SUBRUTINAS
    // - Subrutina para que cada vez que el usuario presione un boton guarde su movimiento y posteriormente lo verifique 
    private void botonpresionado(JButton boton, JButton botones[][], JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[], JButton vector5[], JButton vector6[], JLabel chulito1, JLabel chulito2, JLabel chulito3, JLabel chulito4, JLabel chulito5, JLabel chulito6) {
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int f;
                entre++;
if (botonesAfectados.contains(boton ) ||cont==4) {
                            return; // si el botón ya ha sido afectado, no suena
                        } else {
                    sonidosp("/Sonidos/seleccion.wav");
                }
                f = comprobacion(entre);//Funcion para saber si he presionado botones dos veces o multiplos de 2
                //La idea es que cada vez que presione dos botones guarde ese movimiento (con contadores) y verifique si esos dos son una seleccion correcta

                movimientos(boton, f, vector1, vector2, vector3, vector4, vector5, vector6);//Subrutina que asigna dos numeros en una fila y dos columnas de una matriz si el boton seleccionado hace parte de un boton inicial o final de una palabra
                verifiquemos(movimientos, f, botones, vector1, vector2, vector3, vector4, vector5, vector6, chulito1, chulito2, chulito3, chulito4, chulito5, chulito6);//Subrutina que verifica si la matriz movimientos hace parte de una seleccion correcta

            }
        }
        );
    }

    //  -Subrutina que asigna dos numeros en una fila y dos columnas de una matriz si el boton seleccionado hace parte de un boton inicial o final de una palabra
    private void movimientos(JButton boton, int f, JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[], JButton vector5[], JButton vector6[]) {
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
        if (boton == vector5[0]) {
            movimientos[f][0] = 6;
        } else if (boton == vector5[vector5.length - 1]) {
            movimientos[f][1] = 6;
        }
        if (boton == vector6[0]) {
            movimientos[f][0] = 7;
        } else if (boton == vector6[vector6.length - 1]) {
            movimientos[f][1] = 7;
        }
    }

    //  -Subrutina que verifica si la matriz movimientos hace parte de una seleccion correcta
    private void verifiquemos(int movimientos[][], int f, JButton botones[][], JButton vector1[], JButton vector2[], JButton vector3[], JButton vector4[], JButton vector5[], JButton vector6[], JLabel chulito1, JLabel chulito2, JLabel chulito3, JLabel chulito4, JLabel chulito5, JLabel chulito6) {
        int i;
        if (movimientos[f][0] == correctos[0][0] && movimientos[f][1] == correctos[0][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector1.length; i++) {
                vector1[i].setBackground(Color.green);
                botonesAfectados.add(vector1[i]);

            }

            if (yaloencontre1 == false) {
                comprobacion2(chulito1);
            }
            yaloencontre1 = true;
        }
        if (movimientos[f][0] == correctos[1][0] && movimientos[f][1] == correctos[1][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector2.length; i++) {
                vector2[i].setBackground(Color.green);
                botonesAfectados.add(vector2[i]);

            }

            if (yaloencontre2 == false) {
                comprobacion2(chulito2);
            }
            yaloencontre2 = true;
        }
        if (movimientos[f][0] == correctos[2][0] && movimientos[f][1] == correctos[2][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector3.length; i++) {
                vector3[i].setBackground(Color.green);
                botonesAfectados.add(vector3[i]);

            }

            if (yaloencontre3 == false) {
                comprobacion2(chulito3);
            }
            yaloencontre3 = true;
        }
        if (movimientos[f][0] == correctos[3][0] && movimientos[f][1] == correctos[3][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector4.length; i++) {
                vector4[i].setBackground(Color.green);
                botonesAfectados.add(vector4[i]);

            }

            if (yaloencontre4 == false) {
                comprobacion2(chulito4);
            }
            yaloencontre4 = true;
        }
        if (movimientos[f][0] == correctos[4][0] && movimientos[f][1] == correctos[4][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector5.length; i++) {
                vector5[i].setBackground(Color.green);
                botonesAfectados.add(vector5[i]);

            }

            if (yaloencontre5 == false) {
                comprobacion2(chulito5);
            }
            yaloencontre5 = true;
        }
        if (movimientos[f][0] == correctos[5][0] && movimientos[f][1] == correctos[5][1]) {
            sonidosp("/Sonidos/pastella.wav");
            for (i = 0; i < vector6.length; i++) {
                vector6[i].setBackground(Color.green);
                botonesAfectados.add(vector6[i]);

            }

            if (yaloencontre6 == false) {
                comprobacion2(chulito6);
            }
            yaloencontre6 = true;
        }

    }

    //Subrutina que produce diversas verificaciones y contabilizaciones cada vez que un usuario encuentra una palabra
    private void comprobacion2(JLabel chulito) {
        //Se volverá visible una estrella al lado de la palabra Correspondiente en la lista
        chulito.setVisible(true);
        //Para contabilizar palabras halladas y mostrarlas al usuario
        cont += 1;// cada palabra hallada se le suma 1 al contador

        if (cont == 1) {
            palabrasencontradas.setText("1/6");
        } else if (cont == 2) {
            palabrasencontradas.setText("2/6");
        } else if (cont == 3) {
            palabrasencontradas.setText("3/6");

        } else if (cont == 4) {
            palabrasencontradas.setText("4/6");

        } else if (cont == 5) {
            palabrasencontradas.setText("5/6");

        } else if (cont == 6) {
            palabrasencontradas.setText("6/6");
            cont += 1;
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (cont == 7) {
            Resultado.Ganador g = new Resultado.Ganador(name);
            //JOptionPane.showMessageDialog(null, "¡Felicidades " + name + "! \nHas resuelto el primer nivel\nPresiona NEXT LEVEL para seguir con el siguiente");
            //Para que no se realicen mas cambios en la sopa

            //para que no pueda pedir mas pistas ver la solucion o instrucciones
            pista.setEnabled(false);
            solucion.setEnabled(false);

        }

    }
    //subrutina para cambiar color de las letras cuando se pasa el mouse por ellas
private MouseAdapter listener;

private void cambiarcolor(JButton botones[][]) {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            final int finalI = i;
            final int finalJ = j;
            listener = new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent evt) {
                    if (botonesAfectados.contains(botones[finalI][finalJ]) || cont==4) {
                return; // si el botón ya ha sido afectado, salimos del método sin hacer nada
            } else {
                    botones[finalI][finalJ].setBackground(new Color(255, 153, 255));
                    botones[finalI][finalJ].setFont(new Font("Segoe UI", Font.PLAIN, 11));
                    Timer timer = new Timer(2000, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            botones[finalI][finalJ].setFont(new Font("Segoe UI", Font.PLAIN, 12));
                            if (botonesAfectados.contains(botones[finalI][finalJ])) {
                return; // si el botón ya ha sido afectado, salimos del método sin hacer nada
            } else {
                            
                            botones[finalI][finalJ].setBackground(new Color(255, 255, 255));
                        }
                    }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
            };
            botones[i][j].addMouseListener(listener);
        }
    }
}
public void sonidosp(String cadena) {
        try {
            Clip clip = AudioSystem.getClip();
            URL url = getClass().getResource(cadena);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip.open(audioIn);
            clip.start();

        } catch (Exception e) {
           System.err.println(e.getMessage());
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

    public hardanime(String user) {
        initComponents();
        this.name = user;

        int i, j, auxs = 1, auxs2 = 0, auxa2 = 3, auxa = 4, auxd = 1, auxd2 = 0, auxh = 5, auxh2 = 6;
        //Matriz de botones [8][8]
        JButton botones[][] = {{boton11, boton12, boton13, boton14, boton15, boton16, boton17, boton18},
        {boton21, boton22, boton23, boton24, boton25, boton26, boton27, boton28},
        {boton31, boton32, boton33, boton34, boton35, boton36, boton37, boton38},
        {boton41, boton42, boton43, boton44, boton45, boton46, boton47, boton48},
        {boton51, boton52, boton53, boton54, boton55, boton56, boton57, boton58},
        {boton61, boton62, boton63, boton64, boton65, boton66, boton67, boton68},
        {boton71, boton72, boton73, boton74, boton75, boton76, boton77, boton78},
        {boton81, boton82, boton83, boton84, boton85, boton86, boton87, boton88}};//matriz de botones

        //Vector de animes [8] pero solo se usan 6 espacios
        String[] animes = {"SHINZO", "ANYA", "DAZAI", "HANAKO", "MIYAMURA", "MIRKO", "", ""};

        //SHINZO
        JButton[] shinzo = {boton22, boton23, boton24, boton25, boton26, boton27, };

        //ANYA
        JButton[] anya = {boton58, boton68, boton78, boton88, };

        //DAZAI
        JButton[] dazai = {boton46, boton56, boton66, boton76, boton86, };

        //HANAKO
        JButton[] hanako = {boton82, boton72, boton62, boton52, boton42, boton32, };

        //MIYAMURA
        JButton[] miyamura = {boton14, boton24, boton34, boton44, boton54, boton64, boton74, boton84, };

        //MIRKO
        JButton[] mirko = {boton15, boton24, boton33, boton42, boton51, };
        
        //Asignacion de letras a texto de la matriz de botones
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                botonpresionado(botones[i][j], botones, shinzo, anya, dazai, hanako, miyamura, mirko, chulito1, chulito2, chulito3, chulito4, chulito5, chulito6);
                cambiarcolor(botones);
                //Letras aleatorias mayusculas usando Random
                Random random = new Random();
                char letra = (char) (random.nextInt(26) + 'A');
                String letraStr = String.valueOf(letra);
                botones[i][j].setText(letraStr);// se le asigna una letra aleatoria al texto de los botones

                //ORGANIZAR LETRAS DE PALABRAS SEGUN LA POSICIÓN DESEADA
                //De acuerdo a mi matriz planteada:
                //i representará mis filas
                //j representará mis columnas
                // SHINZO
                if (i == 1 && j >= 1 && j <= 6) { // Posición Horizontal: Fila 1, columnas de 1 - 6
                    String caracter = animes[0].substring(auxs2, auxs);//extraer caracteres de la palabra SHINZO
                    auxs2 = auxs;
                    auxs = auxs + 1;
                    botones[i][j].setText(caracter);//se le asignan las letras correspondientes
                    //ANYA
                } else if (i >= 4 && i <= 7 && j == 7) { //Posición Vertical inversa: fila de 4-7, columnas 7
                    String caracter2 = animes[1].substring(auxa2, auxa);
                    auxa = auxa2;
                    auxa2 = auxa2 - 1;
                    botones[i][j].setText(caracter2);
                    //DAZAI
                } else if (j == 5 && i >= 3 && j <= 7) { //Posición Vertical : fila de 3-7, columna 5
                    String caracter2 = animes[2].substring(auxd2, auxd);// uso de auxiliares para obtener valores deseados para una correcta extracción de caracteres
                    auxd2 = auxd;
                    auxd = auxd + 1;
                    botones[i][j].setText(caracter2);
                    //HANAKO
                } else if (j == 1 && i >= 2 && i <= 7) { //Posición Vertical inversa: fila de 2-7, columna 1
                    String caracter3 = animes[3].substring(auxh, auxh2);
                    auxh2 = auxh;
                    auxh = auxh - 1;
                    botones[i][j].setText(caracter3);
                    // MIYAMURA
                } else if (j == 3 && i >= 0 && i <= 7) {// Posición vertical: Fila 0-7, columna 3 
                    String caracter4 = animes[4].substring(i, i + 1);

                    botones[i][j].setText(caracter4);
                    // MIRKO
                } else if (j >= 0 && j <= 6 && i >= 0 && i <= 4) {// Posición Diagonal inversa: Fila de 0-4, columnas de 0- 4
                    if (i == 0 && j == 4) {
                        String caracter5 = animes[5].substring(i, i + 1);//extracción de caracter personalizado 
                        botones[i][j].setText(caracter5);//LETRA M
                    } else if (i == 1 && j == 3) {
                        String caracter51 = animes[5].substring(i, i + 1);
                        botones[i][j].setText(caracter51);//LETRA I
                    } else if (i == 2 && j == 2) {
                        String caracter52 = animes[5].substring(i, i + 1);
                        botones[i][j].setText(caracter52);//LETRA R
                    } else if (i == 3 && j == 1) {
                        String caracter53 = animes[5].substring(i, i + 1);
                        botones[i][j].setText(caracter53);//LETRA K
                    } else if (i == 4 && j == 0) {
                        String caracter54 = animes[5].substring(i, i + 1);
                        botones[i][j].setText(caracter54);//LETRA O
                    }
                }

            }
        }
       
        //Hacer invisible estrellas al inicio de apertura de la ventana
        chulito1.setVisible(false);
        chulito2.setVisible(false);
        chulito3.setVisible(false);
        chulito4.setVisible(false);
        chulito5.setVisible(false);
        chulito6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido6 = new javax.swing.JPanel();
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
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
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
        boton27 = new javax.swing.JButton();
        boton37 = new javax.swing.JButton();
        boton47 = new javax.swing.JButton();
        boton57 = new javax.swing.JButton();
        boton67 = new javax.swing.JButton();
        boton77 = new javax.swing.JButton();
        boton87 = new javax.swing.JButton();
        boton28 = new javax.swing.JButton();
        boton38 = new javax.swing.JButton();
        boton48 = new javax.swing.JButton();
        boton58 = new javax.swing.JButton();
        boton68 = new javax.swing.JButton();
        boton78 = new javax.swing.JButton();
        boton88 = new javax.swing.JButton();
        sopadeletras = new javax.swing.JLabel();
        pista = new javax.swing.JButton();
        solucion = new javax.swing.JButton();
        palabrasencontradas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chulito1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chulito2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chulito3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chulito4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chulito5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chulito6 = new javax.swing.JLabel();
        FD = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();

        contenido6.setBackground(new java.awt.Color(0, 0, 204));
        contenido6.setName("STAR GAMES: Sopa de letras Planetas"); // NOI18N
        contenido6.setOpaque(false);
        contenido6.setPreferredSize(new java.awt.Dimension(800, 496));
        contenido6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                contenido6MouseMoved(evt);
            }
        });

        boton11.setText("jButton2");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton61.setText("jButton2");

        boton41.setText("jButton2");

        boton51.setText("jButton2");
        boton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton51ActionPerformed(evt);
            }
        });

        boton21.setText("jButton2");

        boton31.setText("jButton2");

        boton81.setText("jButton2");
        boton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton81ActionPerformed(evt);
            }
        });

        boton71.setText("jButton2");

        boton12.setText("jButton2");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton22.setText("jButton2");
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

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
        boton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton82ActionPerformed(evt);
            }
        });

        boton72.setText("jButton2");
        boton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton72ActionPerformed(evt);
            }
        });

        boton13.setText("jButton2");
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

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

        boton17.setText("jButton2");
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        boton18.setText("jButton2");
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
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

        boton27.setText("jButton2");
        boton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton27ActionPerformed(evt);
            }
        });

        boton37.setText("jButton2");
        boton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton37ActionPerformed(evt);
            }
        });

        boton47.setText("jButton2");
        boton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton47ActionPerformed(evt);
            }
        });

        boton57.setText("jButton2");
        boton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton57ActionPerformed(evt);
            }
        });

        boton67.setText("jButton2");
        boton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton67ActionPerformed(evt);
            }
        });

        boton77.setText("jButton2");
        boton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton77ActionPerformed(evt);
            }
        });

        boton87.setText("jButton2");
        boton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton87ActionPerformed(evt);
            }
        });

        boton28.setText("jButton2");
        boton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton28ActionPerformed(evt);
            }
        });

        boton38.setText("jButton2");
        boton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton38ActionPerformed(evt);
            }
        });

        boton48.setText("jButton2");
        boton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton48ActionPerformed(evt);
            }
        });

        boton58.setText("jButton2");
        boton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton58ActionPerformed(evt);
            }
        });

        boton68.setText("jButton2");
        boton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton68ActionPerformed(evt);
            }
        });

        boton78.setText("jButton2");
        boton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton78ActionPerformed(evt);
            }
        });

        boton88.setText("jButton2");
        boton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton88ActionPerformed(evt);
            }
        });

        sopadeletras.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        sopadeletras.setForeground(new java.awt.Color(255, 255, 255));
        sopadeletras.setText("SOPA DE LETRAS STAR ");

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
        palabrasencontradas.setText("0/6");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERSONAJES DE ANIME");

        chulito1.setForeground(new java.awt.Color(255, 0, 0));
        chulito1.setText("★");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHINZO");

        chulito2.setForeground(new java.awt.Color(255, 0, 0));
        chulito2.setText("★");

        jLabel9.setBackground(new java.awt.Color(153, 204, 255));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANYA");

        chulito3.setForeground(new java.awt.Color(255, 0, 0));
        chulito3.setText("★");

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DAZAI");

        chulito4.setForeground(new java.awt.Color(255, 0, 0));
        chulito4.setText("★");

        jLabel11.setBackground(new java.awt.Color(153, 204, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("HANAKO");

        chulito5.setForeground(new java.awt.Color(255, 0, 0));
        chulito5.setText("★");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MIYAMURA");

        chulito6.setForeground(new java.awt.Color(255, 0, 0));
        chulito6.setText("★");

        FD.setBackground(new java.awt.Color(153, 204, 255));
        FD.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        FD.setForeground(new java.awt.Color(255, 255, 255));
        FD.setText("MIRKO");

        siguiente1.setBackground(new java.awt.Color(255, 153, 255));
        siguiente1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        siguiente1.setForeground(new java.awt.Color(0, 0, 51));
        siguiente1.setText("REGRESAR AL MENU");
        siguiente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente1ActionPerformed(evt);
            }
        });

        btnVolver2.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnVolver2.setContentAreaFilled(false);
        btnVolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver2.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver2.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver2.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver2MouseExited(evt);
            }
        });
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenido6Layout = new javax.swing.GroupLayout(contenido6);
        contenido6.setLayout(contenido6Layout);
        contenido6Layout.setHorizontalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boton81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelvolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenido6Layout.createSequentialGroup()
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton38, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton47, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addComponent(boton53, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton56, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton57, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton58, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton64, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton65, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton66, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton67, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton68, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito6)
                                        .addGap(18, 18, 18)
                                        .addComponent(FD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito1)
                                        .addGap(18, 18, 18)
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(4, 4, 4))))
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(solucion)
                                .addGap(116, 116, 116)))
                        .addGap(189, 189, 189))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addComponent(boton72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton73, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton74, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton76, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton77, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton78, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addComponent(boton82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton83, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton84, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton85, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton86, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton87, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton88, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(sopadeletras)
                .addGap(57, 57, 57)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siguiente1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenido6Layout.setVerticalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pista)
                            .addComponent(solucion)
                            .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sopadeletras, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton11)
                    .addComponent(boton12)
                    .addComponent(boton13)
                    .addComponent(boton14)
                    .addComponent(boton15)
                    .addComponent(boton16)
                    .addComponent(boton17)
                    .addComponent(boton18)
                    .addComponent(chulito1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton22)
                            .addComponent(boton23)
                            .addComponent(boton24)
                            .addComponent(boton25)
                            .addComponent(boton26)
                            .addComponent(boton27)
                            .addComponent(boton28)
                            .addComponent(chulito2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton32)
                            .addComponent(boton33)
                            .addComponent(boton34)
                            .addComponent(boton35)
                            .addComponent(boton36)
                            .addComponent(boton37)
                            .addComponent(boton38)
                            .addComponent(chulito3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton42)
                            .addComponent(boton43)
                            .addComponent(boton44)
                            .addComponent(boton45)
                            .addComponent(boton46)
                            .addComponent(boton47)
                            .addComponent(boton48)
                            .addComponent(chulito4)
                            .addComponent(jLabel11)))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addComponent(boton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton51)
                    .addComponent(boton52)
                    .addComponent(boton53)
                    .addComponent(boton54)
                    .addComponent(boton55)
                    .addComponent(boton56)
                    .addComponent(boton57)
                    .addComponent(boton58)
                    .addComponent(chulito5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton61)
                    .addComponent(boton62)
                    .addComponent(boton63)
                    .addComponent(boton64)
                    .addComponent(boton65)
                    .addComponent(boton66)
                    .addComponent(boton67)
                    .addComponent(boton68)
                    .addComponent(chulito6)
                    .addComponent(FD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton72)
                            .addComponent(boton73)
                            .addComponent(boton74)
                            .addComponent(boton75)
                            .addComponent(boton76)
                            .addComponent(boton77)
                            .addComponent(boton78)
                            .addComponent(boton71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton82)
                        .addComponent(boton83)
                        .addComponent(boton84)
                        .addComponent(boton85)
                        .addComponent(boton86)
                        .addComponent(boton87)
                        .addComponent(boton88)))
                .addGap(7, 7, 7)
                .addComponent(siguiente1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed

    }//GEN-LAST:event_boton11ActionPerformed

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
        
    }//GEN-LAST:event_boton14ActionPerformed
  
    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
       
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed

    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed

    }//GEN-LAST:event_boton18ActionPerformed

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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_boton66ActionPerformed

    private void boton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton76ActionPerformed

    }//GEN-LAST:event_boton76ActionPerformed

    private void boton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton86ActionPerformed
       
    }//GEN-LAST:event_boton86ActionPerformed

    private void boton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton27ActionPerformed
       
        
    }//GEN-LAST:event_boton27ActionPerformed

    private void boton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton37ActionPerformed

    private void boton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton47ActionPerformed

    private void boton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton57ActionPerformed

    private void boton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton67ActionPerformed

    private void boton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton77ActionPerformed

    private void boton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton87ActionPerformed

    private void boton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton28ActionPerformed

    private void boton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton38ActionPerformed

    private void boton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton48ActionPerformed

    private void boton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton58ActionPerformed
       
         
    }//GEN-LAST:event_boton58ActionPerformed

    private void boton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton68ActionPerformed

    private void boton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton78ActionPerformed

    }//GEN-LAST:event_boton78ActionPerformed

    private void boton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton88ActionPerformed
       
    }//GEN-LAST:event_boton88ActionPerformed
  int contp=0;
    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        //Para mostrar pistas:
        //tengo en cuenta si ya el contador de la palabra está lleno ademas creo un auxiliar para cerciorarme de no repetir la palabra si ya la encontraron
        //la pista consiste en crear un fondo verde en la inicial o final de la letra de un planeta que no haya encontrado el usuario
        //psra la palabra HANAKO la pista esta en las ultima letra
       
        if (yaloencontre1 == false&&contp<4) {//pista letra inicial SHINZO
            boton22.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
         
        } else if (yaloencontre5 == false&&contp<4) {//pista letra inicial MIYAMURA
            boton14.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
           
        } else if (yaloencontre3 == false&&contp<4) {//pista letra inicisl DAZAI
            boton46.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
       
        } else if (yaloencontre4 == false&&contp<4) {//pista letra final HANAKO
            boton82.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
           
        } else if (yaloencontre2 == false&&contp<4) {//pista letra final ANYA
            boton57.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
           
        } else if (yaloencontre6 == false&&contp<4) {//pista letra final MIRKO
            boton51.setBackground(new Color(153, 255, 153));
            sonidosp("/Sonidos/pista.wav");
           
        }
        contp += 1;
        if (contp > 4) {
            JOptionPane.showMessageDialog(null, "\nLo sentimos " + name + ":(..\nHas usado el número máximo de pistas");
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
        //Al presionar este boton se podra visualizar la solución de la sopa de letras al ver con un fondo verde las letras de las palabras propuestas al usuario
        //SHINZO
        boton22.setBackground(Color.green);//Letra S
        boton23.setBackground(Color.green);//Letra H
        boton24.setBackground(Color.green);//Letra I
        boton25.setBackground(Color.green);//Letra N
        boton26.setBackground(Color.green);//Letra Z
        boton27.setBackground(Color.green);//Letra O 
        //ANYA
        boton58.setBackground(Color.green);//Letra A
        boton68.setBackground(Color.green);//Letra N
        boton78.setBackground(Color.green);//Letra Y
        boton88.setBackground(Color.green);//Letra A
        //DAZAI
        boton46.setBackground(Color.green);//Letra D
        boton56.setBackground(Color.green);//Letra A
        boton66.setBackground(Color.green);//Letra Z
        boton76.setBackground(Color.green);//Letra A
        boton86.setBackground(Color.green);//Letra A
        //HANAKO
        boton82.setBackground(Color.green);//Letra H
        boton72.setBackground(Color.green);//Letra A
        boton62.setBackground(Color.green);//Letra N
        boton52.setBackground(Color.green);//Letra A
        boton42.setBackground(Color.green);//Letra K
        boton32.setBackground(Color.green);//Letra O
        //MIYAMURA
        boton14.setBackground(Color.green);//Letra M
        boton24.setBackground(Color.green);//Letra I
        boton34.setBackground(Color.green);//Letra Y
        boton44.setBackground(Color.green);//Letra A
        boton54.setBackground(Color.green);//Letra M
        boton64.setBackground(Color.green);//Letra U
        boton74.setBackground(Color.green);//Letra R
        boton84.setBackground(Color.green);//Letra A
        //MIRKO
        boton15.setBackground(Color.green);//Letra M
        boton24.setBackground(Color.green);//Letra I
        boton33.setBackground(Color.green);//Letra R
        boton42.setBackground(Color.green);//Letra K
        boton51.setBackground(Color.green);//Letra O
        //MOSTRAR PALABRAS ENCONTRADAS
        palabrasencontradas.setText("6/6");
        //MOSTRAR ESTRELLAS (CHULITOS)
        chulito1.setVisible(true);
        chulito2.setVisible(true);
        chulito3.setVisible(true);
        chulito4.setVisible(true);
        chulito5.setVisible(true);
        chulito6.setVisible(true);
        //DESHABILITAR BOTONES
        pista.setEnabled(false);
        solucion.setEnabled(false);
        //verificacion 2.0
        cont=4;
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Establecer la visibilidad del JPanel después del tiempo establecido
                Resultado.Perdedor g = new Resultado.Perdedor(name);
                g.setVisible(true);
                //DESHABILITAR BOTONES
        pista.setEnabled(false);
        solucion.setEnabled(false);
            }
        });
        
        // Iniciar el temporizador
        timer.setRepeats(false); // solo se ejecutará una vez
        timer.start();

    }//GEN-LAST:event_solucionActionPerformed

    private void contenido6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenido6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_contenido6MouseMoved

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
       sonidosp("/Sonidos/boop.wav");
        contenido6.removeAll();
        tema m = new tema(name);
        m.setSize(800, 496);
        m.setLocation(0, 0);
        m.setOpaque(false);
        contenido6.add(m);
        contenido6.revalidate();
        contenido6.repaint();
    }//GEN-LAST:event_siguiente1ActionPerformed
    
    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        
        
    }//GEN-LAST:event_boton22ActionPerformed

    private void boton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton82ActionPerformed
      
     
    }//GEN-LAST:event_boton82ActionPerformed

    private void boton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton51ActionPerformed
       
      
    }//GEN-LAST:event_boton51ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton13ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        sonidosp("/Sonidos/boop.wav");
        contenido6.removeAll();
        tema m = new tema(name);
        m.setSize(800, 496);
        m.setLocation(0, 0);
        m.setOpaque(false);
        contenido6.add(m);
        contenido6.revalidate();
        contenido6.repaint();
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseEntered
        labelvolver.setText(" Menú");
    }//GEN-LAST:event_btnVolver2MouseEntered

    private void btnVolver2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FD;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton26;
    private javax.swing.JButton boton27;
    private javax.swing.JButton boton28;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton34;
    private javax.swing.JButton boton35;
    private javax.swing.JButton boton36;
    private javax.swing.JButton boton37;
    private javax.swing.JButton boton38;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton boton44;
    private javax.swing.JButton boton45;
    private javax.swing.JButton boton46;
    private javax.swing.JButton boton47;
    private javax.swing.JButton boton48;
    private javax.swing.JButton boton51;
    private javax.swing.JButton boton52;
    private javax.swing.JButton boton53;
    private javax.swing.JButton boton54;
    private javax.swing.JButton boton55;
    private javax.swing.JButton boton56;
    private javax.swing.JButton boton57;
    private javax.swing.JButton boton58;
    private javax.swing.JButton boton61;
    private javax.swing.JButton boton62;
    private javax.swing.JButton boton63;
    private javax.swing.JButton boton64;
    private javax.swing.JButton boton65;
    private javax.swing.JButton boton66;
    private javax.swing.JButton boton67;
    private javax.swing.JButton boton68;
    private javax.swing.JButton boton71;
    private javax.swing.JButton boton72;
    private javax.swing.JButton boton73;
    private javax.swing.JButton boton74;
    private javax.swing.JButton boton75;
    private javax.swing.JButton boton76;
    private javax.swing.JButton boton77;
    private javax.swing.JButton boton78;
    private javax.swing.JButton boton81;
    private javax.swing.JButton boton82;
    private javax.swing.JButton boton83;
    private javax.swing.JButton boton84;
    private javax.swing.JButton boton85;
    private javax.swing.JButton boton86;
    private javax.swing.JButton boton87;
    private javax.swing.JButton boton88;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel chulito1;
    private javax.swing.JLabel chulito2;
    private javax.swing.JLabel chulito3;
    private javax.swing.JLabel chulito4;
    private javax.swing.JLabel chulito5;
    private javax.swing.JLabel chulito6;
    private javax.swing.JPanel contenido6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel palabrasencontradas;
    private javax.swing.JButton pista;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton solucion;
    private javax.swing.JLabel sopadeletras;
    // End of variables declaration//GEN-END:variables
}
