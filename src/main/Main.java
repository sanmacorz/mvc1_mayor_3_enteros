// Define al paquete apropiado
package main;

// Importa las clases necesarias 
import controller.Controlador;
import model.Mayor3Enteros;
import view.VentanaPrincipal;

// Crea la clase Main
public class Main {
    // Método main de la clase Main
    public static void main(String[] args) {
        Mayor3Enteros miMayor3Enteros = new Mayor3Enteros();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miMayor3Enteros);
    }
}