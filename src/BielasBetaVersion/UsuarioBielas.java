package BielasBetaVersion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioBielas {
    String bielasBeta = "__BIELAS BETA__\n\n";
    // atributos
    static String nombreUsuario = "";
    static String localizacion = "";

    //metodo pedir datos al usuario
    public void usuarioPedirDatos() {
        nombreUsuario = JOptionPane.showInputDialog("Introduce usuario");
        localizacion = JOptionPane.showInputDialog("Introduce ciudad");
    }

    //perfil de usuario Bielas
    public void perfilUsuario(){
        Float acumuladorKm = RutasUsuario.acumuladorKm;
        JOptionPane.showMessageDialog(null, bielasBeta + "USUARIO: " +
                nombreUsuario + "\nCIUDAD: "+ localizacion + "\nKM RECORRIDOS: "+ acumuladorKm);
    }

}
