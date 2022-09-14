package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
    private JButton btnCalcular;
    private JButton btnBorrar;
    private JButton btnSalir;

    public PanelProceso() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(58, 22, 95, 40);
        this.add(btnCalcular);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(193, 22, 95, 40);
        this.add(btnBorrar);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(330, 22, 95, 40);
        this.add(btnSalir);
    }
}