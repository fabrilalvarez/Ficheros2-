package fichero2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Escrituras {

    String escrito = "";
    PrintWriter fichero;
    Scanner ficheroo;
/**
 * Escribimos dentro del documento.
 * 
 * @param nombre nombre del archivo de texto
 */
    public void escribir(String nombre) {
        int confirmar;
        try {
            fichero = new PrintWriter(new File(nombre));
            do {
                escrito = JOptionPane.showInputDialog("Escribe Algo");
                fichero.println(escrito);
                confirmar = JOptionPane.showConfirmDialog(null, "Escribir mas?");
            } while (confirmar == 0);

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.toString());
        } finally {
            fichero.close();
        }
    }
    
    /**
     *
     * public void leeYescribe (String nombre, String del){ ArrayList<Alumno>
     * al=new ArrayList<Alumno>(); String frase=null; int confirmar;
     *
     *
     * ficheroo = new Scanner(new File(nombre).useDelimiter(del)); do{ escrito =
     * JOptionPane.showInputDialog("Escribe Algo"); fichero.println(escrito);
     * confirmar=JOptionPane.showConfirmDialog(null, "Escribir mas?");
     * }while(confirmar==0);
     *
     *
     * }
     * }
     */
    
}
