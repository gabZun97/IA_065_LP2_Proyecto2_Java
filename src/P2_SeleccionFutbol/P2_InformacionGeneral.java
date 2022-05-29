
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_InformacionGeneral implements P2_I_SeleccionFutbol{
    // Métodos implementados de la interfaz
    /**
     * Sobre carga del metodo
     * @Override
     */
    public void vacaciones() {
        JOptionPane.showMessageDialog(null,"La Selección de Honduras al terminar la temporada tendrian vacaciones 1 mes y medio.");
    }
    /**
     * Sobre carga del metodo
     * @Override
     */
    public void horasLaborales() {
        JOptionPane.showMessageDialog(null,"La Selección  de Honduras tiene un horario laboral de 8 horas diarias, distribuidas en entrenamiento y partidos.");
    }
    /**
     * Sobre carga del metodo
     * @Override
     */
    public void viajes() {
        JOptionPane.showMessageDialog(null,"La Selección  de Honduras realiza viajes con todo pagado a su jugadores y cuerpo Táctico cuando juegan de visita en otro País.");
    }
}
