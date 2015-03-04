
package fichero2;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */

public class Fichero2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Lecturas obj=new Lecturas();
        Escrituras obj2=new Escrituras();
        
        obj2.escribir("Escrito.txt");
        
        obj.leerObjetos("Alumnos.txt");
        
        
    }
    
}
