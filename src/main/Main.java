package main;

import controller.Controlador;
import model.Mayor3Enteros;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Mayor3Enteros miMayor3Enteros = new Mayor3Enteros();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miMayor3Enteros);
    }
}