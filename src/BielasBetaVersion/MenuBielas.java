package BielasBetaVersion;

import javax.swing.*;

public class MenuBielas{

    Integer opcionMenu;
    String bielasBeta = "__BIELAS BETA__\n\n";

    //método menú de 5 opciones
    public Integer elegirMenu(){
        opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(bielasBeta + "Pulsa 1 para añadir una nueva ruta\n" +
                "Pulsa 2 para ver los km recorridos\nPulsa 3 para acceder a tus bicicletas\n" +
                "Pulsa 4 para ver tu perfil\nPulsa 5 para salir"));
        return opcionMenu;
    }
}
