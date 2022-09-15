package controller;

import model.Mayor3Enteros;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Mayor3Enteros modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("calcularMayor")) {
            model.Mayor3Enteros.calcularMayor();
        }

        else if (comando.equals("borrarLbs")) {
            view.PanelEntrada.borrarLbs();
        }

        else if (comando.equals("cerrarVentana")) {
            view.PanelEntrada.cerrarVentana();
        }
    }
}