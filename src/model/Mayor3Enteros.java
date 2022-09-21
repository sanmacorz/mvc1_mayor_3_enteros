// Define al paquete apropiado
package model;

// Crea la clase Mayor3Enteros
public class Mayor3Enteros {
    // Declara las variables x, y, z como privadas
    private int x;
    private int y;
    private int z;
    private int mayor;

    // Crea el setter para la variable x
    public void setX(int x) {
        this.x = x;
    }

    // Crea el setter para la variable y
    public void setY(int y) {
        this.y = y;
    }

    // Crea el setter para la variable z
    public void setZ(int z) {
        this.z = z;
    }

    // Crea el getter para la variable mayor
    public int getMayor() {
        return mayor;
    }

    // Crea el método hallarMayor con UNICAMENTE el algoritmo a seguir
    public void hallarMayor() {
        if (x > y && x > z) {
            mayor = x;
        } else if (y > x && y > z) {
            mayor = y;
        } else {
            mayor = z;
        }
    }
}