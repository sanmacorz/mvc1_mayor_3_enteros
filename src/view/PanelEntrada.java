package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JLabel lbLogo;
    private JTextField tfX;
    private JTextField tfY;
    private JTextField tfZ;

    public PanelEntrada() {
        this.setLayout(null);
        this.setBackground(Color.decode("#64b446"));
        this.setVisible(true);

        lbTitulo = new JLabel("MAYOR 3 ENTEROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);
        this.add(lbTitulo);

        lbX = new JLabel("X =");
        lbX.setFont(new Font("Serif", Font.PLAIN, 18));
        lbX.setForeground(Color.BLACK);
        lbX.setBounds(240, 55, 480, 30);
        this.add(lbX);

        tfX = new JTextField();
        tfX.setFont(new Font("Arial", Font.PLAIN, 18));
        tfX.setForeground(Color.BLACK);
        tfX.setBounds(280, 55, 190, 30);
        this.add(tfX);

        lbY = new JLabel("Y =");
        lbY.setFont(new Font("Serif", Font.PLAIN, 18));
        lbY.setForeground(Color.BLACK);
        lbY.setBounds(240, 95, 480, 30);
        this.add(lbY);

        tfY = new JTextField();
        tfY.setFont(new Font("Arial", Font.PLAIN, 18));
        tfY.setForeground(Color.BLACK);
        tfY.setBounds(280, 95, 190, 30);
        this.add(tfY);

        lbZ = new JLabel("Z =");
        lbZ.setFont(new Font("Serif", Font.PLAIN, 18));
        lbZ.setForeground(Color.BLACK);
        lbZ.setBounds(240, 135, 480, 30);
        this.add(lbZ);

        tfZ = new JTextField();
        tfZ.setFont(new Font("Arial", Font.PLAIN, 18));
        tfZ.setForeground(Color.BLACK);
        tfZ.setBounds(280, 135, 190, 30);
        this.add(tfZ);

        lbLogo = new JLabel(new ImageIcon("imgs/uis.png"));
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 60, 192, 96);
        this.add(lbLogo);
    }
}