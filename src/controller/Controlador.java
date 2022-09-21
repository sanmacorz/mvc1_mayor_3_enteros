// Define al paquete apropiado
package controller;

// Importa las clases necesarias 
import model.Mayor3Enteros;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// Crea la clase controlador e implementa la interfaz ActionListener
public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Mayor3Enteros modelo;

    // Método constructor de la clase controlador
    public Controlador(VentanaPrincipal miVentanaPrincipal, Mayor3Enteros modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.modelo = modelo;
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    // Método para la atención de eventos
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        // Identifica el comando recibido y ejecuta el método correspondiente
        if (comando.equals("calcularMayor")) {
            // Intenta leer los datos como enteros
            try {
                this.modelo.setX(Integer.parseInt(view.PanelEntrada.getTfX()));
                this.modelo.setY(Integer.parseInt(view.PanelEntrada.getTfY()));
                this.modelo.setZ(Integer.parseInt(view.PanelEntrada.getTfZ()));
                this.modelo.hallarMayor();
                this.miVentanaPrincipal.miPanelSalida.mostrarResultados(this.modelo.getMayor());
                // Si obtiene una excepcion significa que los datos no son enteros
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!",
                        "Suma 3 Enteros", JOptionPane.ERROR_MESSAGE);
                view.PanelEntrada.borrarTf();
            }
        } else if (comando.equals("borrarTexto")) {
            view.PanelEntrada.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Suma 3 Enteros",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}