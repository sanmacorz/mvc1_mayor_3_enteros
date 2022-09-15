package model;

public class Mayor3Enteros {
    public static void calcularMayor() {
        int x = Integer.parseInt(view.PanelEntrada.getLbX());
        int y = Integer.parseInt(view.PanelEntrada.getLbY());
        int z = Integer.parseInt(view.PanelEntrada.getLbZ());
        int mayor = 0;

        if (x > y && x > z) {
            mayor = x;
        } else if (y > x && y > z) {
            mayor = y;
        } else {
            mayor = z;
        }

        view.PanelSalida.taResultados.append("El mayor es " + mayor + "!" + "\n");
    }
}