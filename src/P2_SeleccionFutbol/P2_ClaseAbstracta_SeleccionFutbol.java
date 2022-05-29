// La clase abstracta que implementa los Métodos  de la interfaz
package P2_SeleccionFutbol;

public abstract  class P2_ClaseAbstracta_SeleccionFutbol {

    public P2_ClaseAbstracta_SeleccionFutbol() {
    }
    
    // Métodos propios de la clase abstracta
    abstract void entrenamiento();
    abstract void partidoFutbol();
    
    public void mostrar(){
        // Con este Métodos vamos aplicar polimorfismo por sobrecarga, ya que todas las clases van imprimir
        // Decidimos usar el Overload ya que las clases difieren de atributos
    }
}
