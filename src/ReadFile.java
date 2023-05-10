
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class ReadFile {
public static void leer(String nombre, String nivel, String clicks){
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
       // String nombre = "", nivel = "", clicks = "";
        archivo = new File("puntuacion.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
//                nombre = rompecabezas01.puntaje[0];
//                nivel = rompecabezas01.puntaje[1];
//                clicks = rompecabezas01.puntaje[2];
                escribir = new FileWriter(archivo, true); // escribir en una linea de texto
                linea = new PrintWriter(escribir); // escribir en varias lineas de texto

                //escribir en el archivo
                linea.println(nombre);
                linea.println(nivel);
                linea.println(clicks);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                nombre = rompecabezas01.puntaje[0];
                nivel = rompecabezas01.puntaje[1];
                clicks = rompecabezas01.puntaje[2];
                escribir = new FileWriter(archivo, true); // escribir en una linea de texto
                linea = new PrintWriter(escribir); // escribir en varias lineas de texto

                //escribir en el archivo
                linea.println(nombre);
                linea.println(nivel);
                linea.println(clicks);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
