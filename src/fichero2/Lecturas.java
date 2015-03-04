package fichero2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Lecturas {

    Scanner sc;

    public void leerLinea(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerUno(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNext()) {
                respuesta = sc.next();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerNumeros(String nombre) {
        int respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNextInt()) {
                respuesta = sc.nextInt();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerConDelimitador(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre)).useDelimiter(",");
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }
/**
 * Metodo de lectura de objetos.
 * @param nombreF nombre del archivo.
 */
    public void leerObjetos(String nombreF) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombreF));
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                String[] alum = respuesta.split(",");
                System.out.println(alum[0] + " " + alum[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.toString());
        } finally {
            sc.close();
        }
    }
}
