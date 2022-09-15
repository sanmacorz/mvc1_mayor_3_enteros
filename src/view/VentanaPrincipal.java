package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;

    public VentanaPrincipal() {
        this.setTitle("Mayor de 3 Enteros");
        this.setSize(500, 410);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);

        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 480, 180);
        this.add(miPanelEntrada);

        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 200, 480, 80);
        this.add(miPanelProceso);

        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 290, 480, 110);
        this.add(miPanelSalida);
    }
}