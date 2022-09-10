package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        this.setTitle("Mayor de 3 Enteros");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}