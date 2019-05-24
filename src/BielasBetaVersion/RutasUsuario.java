package BielasBetaVersion;

import javax.swing.*;

public class RutasUsuario {

    Float nuevosKm;
    static Float acumuladorKm = 0f;

    //metodo añadir ruta
    public void introducirRuta(){
        nuevosKm = Float.parseFloat(JOptionPane.showInputDialog(" introduce los km de tu última ruta"));
        acumuladorKm = acumuladorKm + nuevosKm;
        JOptionPane.showMessageDialog(null,  "Se han guardado los km correctamente");
        JOptionPane.showMessageDialog(null, "Km recorridos en la última ruta: "
                + nuevosKm + "\nKm recorridos en total: " + acumuladorKm);
    }

    //metodo mostrar rutas
    public void mostrarAcumulador(){
        JOptionPane.showMessageDialog(null, "Has recorrido " + acumuladorKm + "km");
    }


}
