package view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;

public class PanelSalida extends JPanel {
    private JTextArea taResultados;

    public PanelSalida() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 460, 80);
        this.add(taResultados);
    }
}