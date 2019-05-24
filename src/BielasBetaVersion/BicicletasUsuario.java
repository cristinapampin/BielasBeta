package BielasBetaVersion;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BicicletasUsuario {
    Integer opcioBicis;
    static ArrayList listadoBicis = new ArrayList();

    //metodo menu 3 opciones
    public Integer elegirMenu(){
        Integer opcionBicis;
        opcionBicis = Integer.parseInt(JOptionPane.showInputDialog("Pulsa 1 para añadir una bicicleta\n" +
                "Pulsa 2 para ver tus bicicletas\nPulsa 3 para volver"));
        return opcionBicis;
    }

    public void nuevaBici(){
        String nuevaBici = JOptionPane.showInputDialog("Introduce los datos de tu bicicleta");
        listadoBicis.add(nuevaBici);
        JOptionPane.showMessageDialog(null, "Tus bicicletas:\n" +listadoBicis );

    }
    public void verBicis(){
            JOptionPane.showMessageDialog(null, "Tus bicicletas\n"+listadoBicis);

    }
}
