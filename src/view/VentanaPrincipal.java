// Define al paquete apropiado
package view;

// Importa las clases necesarias 
import javax.swing.JFrame;

// Crea la clase VentanaPrincipal y extiende o hereda a la clase JFrame
public class VentanaPrincipal extends JFrame {
    // Declara los objetos públicos para cada panel de la ventana
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;

    // Método constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        this.setTitle("Mayor de 3 Enteros");
        this.setSize(500, 410);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);

        // Inicializa al objeto miPanelEntrada y define sus propiedades
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 480, 180);
        this.add(miPanelEntrada);

        // Inicializa al objeto miPanelProceso y define sus propiedades
        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 200, 480, 80);
        this.add(miPanelProceso);

        // Inicializa al objeto miPanelSalida y define sus propiedades
        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 290, 480, 110);
        this.add(miPanelSalida);
    }
}