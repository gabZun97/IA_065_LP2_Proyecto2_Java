
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

// En esta clase solo creamos un futbolista
// La lista la vamos a crear en el formulario mostrandola a través de tabla.

public class P2_Futbolista extends P2_ClaseAbstracta_SeleccionFutbol{ // Implementamos los métodos abstractos de nuestra clase abstracta
    private String posicion;// Posición  en la que juega
    private String diestroZurdo; // Si es derecho o izquierdo
    private String dorsal; // Numero  con el que juega
    private String nombre; // Nombre del jugador
    private String titular;

    public P2_Futbolista() { // Constructor por defecto
    }

    public P2_Futbolista(String nombre, String posicion, String diestroZurdo, String dorsal, String titular) { // Constructor comun
        this.posicion = posicion;
        this.diestroZurdo = diestroZurdo;
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.titular = titular;
    }
    
    //Métodos  getters
    public String getPosicion() {
        return posicion;
    }

    public String getDiestroZurdo() {
        return diestroZurdo;
    }

    public String getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitular() {
        return titular;
    }
    
    
    // Métodos  setters
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDiestroZurdo(String diestroZurdo) {
        this.diestroZurdo = diestroZurdo;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    // Métodos  abtractos
    /**
     * @Override
     */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null, "El entrenamiento del futbolista se centra en tres categorías: \n1. Preparación física: Coordinación, fuerza, velocidad, resistencia.\n2. Técnica: Mejora la capacidad individual. \n3. Táctica: Aspectos tácticos que definen el estilo del juego del equipo.");
    }

    /**
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"Al Futbolista le restan 18 partidos por jugar.");
    }
    
    public void mostrar(String nombre,String posicion,String diestroZurdo,String dorsal, String titular){
        JOptionPane.showMessageDialog(null, "Nombre del futbolista: "+nombre+"\nPosici�n : "+posicion+"\nEs: "+diestroZurdo+"\nDorsal: "+dorsal+"\nTitular: "+titular);  
    }
    public void concentracion(){
        JOptionPane.showMessageDialog(null,"El Futbolista debe concentrarse para el siguiente partido a jugar.");
    }
    public void realizacion(){// Si va jugar el partido o no
        JOptionPane.showMessageDialog(null,"El cuerpo T�ctico ha decido que el futbolista no esta� acto para jugar el partido de hoy.");
    }
}
