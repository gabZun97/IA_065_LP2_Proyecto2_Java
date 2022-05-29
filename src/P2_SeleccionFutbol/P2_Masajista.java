
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_Masajista extends P2_PreparadorFisico {

    public P2_Masajista() { // Constructor por defecto
    }

    public P2_Masajista(String nombre, String titulacion, String cargo, String experiencia) {
        super(nombre, titulacion, cargo, experiencia);
    }
    /**
     * Sobre carga del metodo
     * @Override
     */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null,"El Masajista realiza sus funciones Después  de los entrenamientos.");
    }
    /**
     *  Sobre escritura
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"El Masajista esta presente posterior a los partidos jugados para poder asistir a los jugadores.");
    }
    /**
     * Sobre carga del metodo
     * @Override 
     */
    
    public void mostrar(String nombre, String titulacion, String cargo, String experiencia){
        JOptionPane.showMessageDialog(null, "Nombre del masajista: "+nombre+"\nTitulación : "+titulacion+"\nCargo: "+cargo+"\nExperiencia: "+experiencia);
    }
    public void masajes(){
        JOptionPane.showMessageDialog(null,"Se emplean manipulaciones Rápidas  como el amasamiento, sacudimiento y los golpeteos;\n"
                + " estas manipulaciones elevan la Excitación  del sistema nervioso.\n "
                + "\n El masaje sedante se emplea en caso de Elevación  de la excitabilidad del futbolista. "
                + "\n El masaje se basa en manipulaciones suaves como Fricción y Frotación.");
    }
}
