package BielasBetaVersion;

import javax.swing.*;

public class Main {
    public static void main (String[]args){
        //Pido datos al usuario
        UsuarioBielas Usuario1 = new UsuarioBielas();
        Usuario1.usuarioPedirDatos();
        Integer opcionMenu, opcionMenuBicis;
        do {
            MenuBielas menu = new MenuBielas();
            opcionMenu =menu.elegirMenu();
            switch (opcionMenu){
                case 1:
                    RutasUsuario nuevaRutaUsuario = new RutasUsuario();
                    nuevaRutaUsuario.introducirRuta();
                    break;
                case 2:
                    RutasUsuario mostrarRutas = new RutasUsuario();
                    mostrarRutas.mostrarAcumulador();
                    break;
                case 3:
                    BicicletasUsuario menuElegirEnBicis = new BicicletasUsuario();
                    opcionMenuBicis = menuElegirEnBicis.elegirMenu();
                    if (opcionMenuBicis == 1) {
                        BicicletasUsuario introducirNuevaBici = new BicicletasUsuario();
                        introducirNuevaBici.nuevaBici();
                    }
                    else if (opcionMenuBicis ==2) {
                        BicicletasUsuario mostrarBicis = new BicicletasUsuario();
                        mostrarBicis.verBicis();
                    }
                    else if (opcionMenuBicis ==3) {
                        break;
                    }
                    else  {
                        JOptionPane.showMessageDialog(null, "Error");

                }
                    break;
                case 4:
                    UsuarioBielas mostrarPerfil = new UsuarioBielas();
                    mostrarPerfil.perfilUsuario();
                    break;
                case 5:
                    break;
                    default:JOptionPane.showMessageDialog(null, "Error");
            }

        } while (opcionMenu <5);
    }
}