// Define al paquete apropiado
package view;

// Importa las clases necesarias 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

// Crea la clase PanelProceso y extiende o hereda a la clase JPanel
public class PanelProceso extends JPanel {
    // Declara los objetos públicos para cada widget del panel
    public JButton btnCalcular;
    public JButton btnBorrar;
    public JButton btnSalir;

    // Método constructor de la clase PanelProceso
    public PanelProceso() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        // Inicializa al objeto btnCalcular y define sus propiedades
        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(58, 22, 95, 40);
        btnCalcular.setActionCommand("calcularMayor");
        this.add(btnCalcular);

        // Inicializa al objeto btnBorrar y define sus propiedades
        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(193, 22, 95, 40);
        btnBorrar.setActionCommand("borrarTexto");
        this.add(btnBorrar);

        // Inicializa al objeto btnSalir y define sus propiedades
        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(330, 22, 95, 40);
        btnSalir.setActionCommand("cerrarVentana");
        this.add(btnSalir);
    }
}