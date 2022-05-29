
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_EntrenadorAuxiliar extends P2_Entrenador{

    public P2_EntrenadorAuxiliar() { // Constructor por defecto
    }

    public P2_EntrenadorAuxiliar(String nombentrenador, String idfederacion, String cargo) { // Constructor común de la clase padre Entrenador
        super(nombentrenador, idfederacion, cargo);
    }
    
    // Métodos  abstractos
    /**
     * @Override
     */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null,"El Entrenador auxiliar es el encargado del entrenamiento Físico , mental y Táctico de la Selección  Hondureña. ");
    }

    /**
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"Al entrenador auxiliar le restan 18 partidos por dirigir.");
    }
    
    /**
     * @Override
     */
    public void mostrar(String nombentrenador, String idfederacion, String cargo){
        JOptionPane.showMessageDialog(null, "Nombre del entrenador auxiliar: "+nombentrenador+"\nId de Federación : "+idfederacion+"\nCargo: "+cargo);
    }
    
    
}
