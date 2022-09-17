package model;

import javax.swing.JOptionPane;

public class Mayor3Enteros {
    public static void calcularMayor() {
        try {
            int x = Integer.parseInt(view.PanelEntrada.getTfX());
            int y = Integer.parseInt(view.PanelEntrada.getTfY());
            int z = Integer.parseInt(view.PanelEntrada.getTfZ());
            int mayor = 0;

            if (x > y && x > z) {
                mayor = x;
            } else if (y > x && y > z) {
                mayor = y;
            } else {
                mayor = z;
            }

            view.PanelSalida.taResultados.append("El mayor es " + mayor + "!" + "\n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!", "Suma 3 Enteros",
                    JOptionPane.ERROR_MESSAGE);
            view.PanelEntrada.borrarLbs();
        }
    }
}