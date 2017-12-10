
package Vista;

import Modelo.Autobus;
import Modelo.Taxi;
import Modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author SHIELD
 */
public class Aplicacion {
    public static void main(String[] args) {
        //Taxi obj1 = new Vehiculo(); solo puedo crear objetos de clases hijas, no de clases padres Hija a padre
//        Vehiculo obj1 = new Taxi();        //padre a hija
//        Vehiculo obj2 = new Autobus();
//        JOptionPane.showMessageDialog(null, obj1.toString()+obj2.toString());
//        obj1.consumo();
    ingresarDatos obj = new ingresarDatos();
    obj.setVisible(true);
    }
}
