import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BielasMenu {
    public static void main (String[]args){
        int menuOpcion, menuBicis;
        float acumuladorKm = 0, nuevosKm = 0;
        boolean salirPrograma = false;
        String nombreUsuario, bicis, bicisModificar = " ";
        String bielasBeta = "__BIELAS BETA__\n\n", nuevaBici;
        List<String> listadoBicis = new ArrayList<String>();

        nombreUsuario = JOptionPane.showInputDialog("Usuario");

        do {
            menuOpcion = Integer.parseInt(JOptionPane.showInputDialog(bielasBeta + "Pulsa 1 para ver km recorridos\nPulsa 2 para añadir los km de la última ruta\nPulsa 3 para acceder a tus bicicletas\n" +
                    "Pulsa 4 para ver tu perfil\nPulsa 5 para salir"));

            switch (menuOpcion){
                case 1:
                    JOptionPane.showMessageDialog(null, bielasBeta + nombreUsuario +" has recorrido " + acumuladorKm + "km en total");
                    break;
                case 2:
                    nuevosKm = Float.parseFloat(JOptionPane.showInputDialog(bielasBeta + nombreUsuario +" introduce los km de tu última ruta"));
                    acumuladorKm = acumuladorKm + nuevosKm;
                    JOptionPane.showMessageDialog(null, bielasBeta + "Se han guardado los km correctamente");
                    JOptionPane.showMessageDialog(null, bielasBeta + nombreUsuario+ "\n\nKm recorridos en la última ruta: "
                            + nuevosKm + "\nKm recorridos en total: " + acumuladorKm);
                    break;
                case 3:
                    menuBicis = Integer.parseInt(JOptionPane.showInputDialog("Pulsa 1 para ver tus bicicletas\n" +
                            "Pulsa 2 para añadir una nueva bicicleta\nPulsa 3 para modificar tus bicicletas"));

                    switch (menuBicis) {
                        case 1:
                            bicis = listadoBicis.toString();
                            JOptionPane.showMessageDialog(null, bielasBeta + bicis);
                            break;

                        case 2:
                            nuevaBici = JOptionPane.showInputDialog("Introduce los datos de tu nueva bicicleta");
                            listadoBicis.add(nuevaBici);
                            bicis = listadoBicis.toString();
                            break;

                        case 3:
                            for (int i = 0; i < listadoBicis.size(); i++) {
                                bicisModificar += (i+1) + ":  " + listadoBicis.get(i) + "\n";
                            }
                            JOptionPane.showMessageDialog(null, bicisModificar);
                            break;
                            default:JOptionPane.showMessageDialog(null, "ERROR");
                            break;
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, bielasBeta + "USUARIO: " + nombreUsuario + "\n KM DE LA ÚLTIMA RUTA: "
                    + nuevosKm +"\nKM RECORRIDOS EN TOTAL: " + acumuladorKm);
                    break;

                case 5:
                    salirPrograma = true;
                    break;

                default: JOptionPane.showMessageDialog(null, "Error");
            }
        } while (menuOpcion <5);
    }

}