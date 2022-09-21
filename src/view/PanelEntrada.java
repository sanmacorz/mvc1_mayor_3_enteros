// Define al paquete apropiado
package view;

// Importa las clases necesarias 
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

// Crea la clase PanelEntrada y extiende o hereda a la clase JPanel
public class PanelEntrada extends JPanel {
    // Declara los objetos privados para cada widget del panel
    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfX;
    private static JTextField tfY;
    private static JTextField tfZ;

    // Método constructor de la clase PanelEntrada
    public PanelEntrada() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        // Inicializa al objeto lbTitulo y define sus propiedades
        lbTitulo = new JLabel("MAYOR 3 ENTEROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);
        this.add(lbTitulo);

        // Inicializa al objeto lbX y define sus propiedades
        lbX = new JLabel("X =");
        lbX.setFont(new Font("Serif", Font.PLAIN, 18));
        lbX.setForeground(Color.BLACK);
        lbX.setBounds(240, 55, 480, 30);
        this.add(lbX);

        // Inicializa al objeto tfX y define sus propiedades
        tfX = new JTextField();
        tfX.setFont(new Font("Arial", Font.PLAIN, 18));
        tfX.setForeground(Color.BLACK);
        tfX.setBounds(280, 55, 190, 30);
        this.add(tfX);

        // Inicializa al objeto lbY y define sus propiedades
        lbY = new JLabel("Y =");
        lbY.setFont(new Font("Serif", Font.PLAIN, 18));
        lbY.setForeground(Color.BLACK);
        lbY.setBounds(240, 95, 480, 30);
        this.add(lbY);

        // Inicializa al objeto tfY y define sus propiedades
        tfY = new JTextField();
        tfY.setFont(new Font("Arial", Font.PLAIN, 18));
        tfY.setForeground(Color.BLACK);
        tfY.setBounds(280, 95, 190, 30);
        this.add(tfY);

        // Inicializa al objeto lbZ y define sus propiedades
        lbZ = new JLabel("Z =");
        lbZ.setFont(new Font("Serif", Font.PLAIN, 18));
        lbZ.setForeground(Color.BLACK);
        lbZ.setBounds(240, 135, 480, 30);
        this.add(lbZ);

        // Inicializa al objeto tfZ y define sus propiedades
        tfZ = new JTextField();
        tfZ.setFont(new Font("Arial", Font.PLAIN, 18));
        tfZ.setForeground(Color.BLACK);
        tfZ.setBounds(280, 135, 190, 30);
        this.add(tfZ);

        // Inicializa al objeto iLogo y define sus propiedades
        iLogo = new ImageIcon("src/imgs/uis.png");

        // Inicializa al objeto lbLogo y define sus propiedades
        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 60, 192, 96);
        this.add(lbLogo);
    }

    // Crea el getter para la variable tfX
    public static String getTfX() {
        return tfX.getText();
    }

    // Crea el getter para la variable tfY
    public static String getTfY() {
        return tfY.getText();
    }

    // Crea el getter para la variable tfZ
    public static String getTfZ() {
        return tfZ.getText();
    }

    // Crea el método borrarTf con UNICAMENTE el algoritmo a seguir
    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Suma 3 Enteros",
                JOptionPane.WARNING_MESSAGE);
        tfX.setText("");
        tfY.setText("");
        tfZ.setText("");
        PanelSalida.taResultados.setText("");
    }
}