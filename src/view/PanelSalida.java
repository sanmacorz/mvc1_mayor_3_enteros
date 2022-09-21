// Define al paquete apropiado
package view;

// Importa las clases necesarias 
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

// Crea la clase PanelSalida y extiende o hereda a la clase JPanel
public class PanelSalida extends JPanel {
    // Declara los objetos públicos para cada widget del panel
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    // Método constructor de la clase PanelSalida
    public PanelSalida() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        // Inicializa al objeto taResultados y define sus propiedades
        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 460, 80);

        // Inicializa al objeto spResultados y define sus propiedades
        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(9, 15, 460, 80);
        this.add(spResultados);
    }

    // Crea el método mostrarResultados con UNICAMENTE el algoritmo a seguir
    public void mostrarResultados(int mayor) {
        taResultados.append("El mayor es " + mayor + "!" + "\n");
    }

    // Crea el método borrarTa con UNICAMENTE el algoritmo a seguir
    public void borrarTa() {
        taResultados.setText("");
    }
}