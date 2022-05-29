
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_Entrenador extends P2_ClaseAbstracta_SeleccionFutbol{
    private String idfederacion; // Identificación de Federación
    private String cargo; // Cargo o Función
    private String nombentrenador; // Nombre del entrenador

    public P2_Entrenador() { // Constructor por defecto
    }

    public P2_Entrenador(String nombentrenador, String idfederacion, String cargo) { // Constructor común
        this.nombentrenador = nombentrenador;
        this.idfederacion = idfederacion;
        this.cargo = cargo;
    }
    
    // Métodos  getters
    public String getIdfederacion() {
        return idfederacion;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombentrenador() {
        return nombentrenador;
    }
    
    // Métodos  setters
    public void setIdfederacion(String idfederacion) {
        this.idfederacion = idfederacion;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombentrenador(String nombentrenador) {
        this.nombentrenador = nombentrenador;
    }
    
    
    //Métodos abstractos
    /**
     * @Override
     */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null,"El Entrenador es el encargado del entrenamiento físico, mental y técnico de la Selección Hondureña. ");
    }

    /**
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"Al entrenador le restan 18 partidos por dirigir.");
    }
    
    public void mostrar(String nombentrenador, String idfederacion, String cargo){
        JOptionPane.showMessageDialog(null, "Nombre del entrenador: "+nombentrenador+"\nId de federación: "+idfederacion+"\nCargo: "+cargo);  
    }
}
