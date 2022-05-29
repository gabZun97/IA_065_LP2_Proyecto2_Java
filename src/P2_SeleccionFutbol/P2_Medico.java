
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_Medico extends P2_PreparadorFisico {

    public P2_Medico() { // Constructor por defecto
    }

    public P2_Medico(String nombre, String titulacion, String cargo, String experiencia) { // Constructor común de la clase padre ya que hereda los mismo atributos
        super(nombre, titulacion, cargo, experiencia);
    }
    
    /**
     * Sobre carga del metodo
     * @Override
     */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null,"El Medico  esta presente en los entrenamientos para poder asistir algun jugador lesionado.");
    }

    /**
     * Sobre carga del metodo
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"El Medico  esta presente en los partidos para poder asistir algun jugador lesionado.");
    }
    
    /**
     * 
     * @Override
     */
    public void mostrar(String nombre, String titulacion, String cargo, String experiencia){
        JOptionPane.showMessageDialog(null, "Nombre del Medico : "+nombre+"\nTitulacion: "+titulacion+"\nCargo: "+cargo+"\nExperincia: "+experiencia);  
    }
    public void atencion_medica(){
        JOptionPane.showMessageDialog(null,"La Medicina del Deporte es una especialidad medica que estudia los efectos del ejercicio fisico y el deporte en el organismo humano,"
                + "\n desde el punto de vista de la prevencion y tratamiento de las enfermedades y lesiones.");
    }
    
}
