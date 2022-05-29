
package P2_SeleccionFutbol;

import javax.swing.JOptionPane;

public class P2_PreparadorFisico extends P2_ClaseAbstracta_SeleccionFutbol{
    private String titulacion; // Titulacion del preparador
    private String cargo; // Cargo o funcion del preparador
    private String experiencia; // Año  de experienica
    private String nombre; // Nombre del preparador fisico
   
    public P2_PreparadorFisico() { // Constructor por defecto
    }
   
     
    public P2_PreparadorFisico(String nombre, String titulacion, String cargo, String experiencia) { // Constructor común
        this.nombre = nombre;
        this.titulacion = titulacion;
        this.cargo = cargo;
        this.experiencia = experiencia;
    }
    /**
    * Crea un constructor de preparador fisico
     * @param nombre
     * @param titulacion
     * @param cargo
     * @param experiencia
     *
     */
    // Métodos  getters
    public String getTitulacion() {
        return titulacion;
    }

    public String getCargo() {
        return cargo;
    }

    public String getExperiencia() {
        return experiencia;
    }
/**
 * Devuleve el nombre seleccionado
 * @return
 */
    public String getNombre() {
        return nombre;
    }
    
    // Métodos setters
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Métodos  abstratos
   /**
    *  @Override
    */
    void entrenamiento() {
        JOptionPane.showMessageDialog(null,"El preparador fisico es el que prepara a los jugadores antes y despues de la temporada para evitar las lesiones durante toda la temporada y ayudar a que se recuperen de posibles molestias o dolencias lo mas rapido.");
    }

    /**
     * @Override
     */
    void partidoFutbol() {
        JOptionPane.showMessageDialog(null,"El preparador fisico debe estar presente en los 18 partidos que le resta a la Selección Hondureña por jugar.");
    }
    public void mostrar(String nombre, String titulacion, String cargo, String experiencia){ 
        JOptionPane.showMessageDialog(null, "Nombre del preparador fisico: "+nombre+"\nTitulacion: "+titulacion+"\nCargo: "+cargo+"\nExperincia: "+experiencia);  
    }
    public void preparacion_fisica(){
        JOptionPane.showMessageDialog(null,"La preparacion fisica en futbol es una de las partes principales en la intervencion del futbolista como componente del entrenamiento,"
                + "\n con el fin de aumentar las habilidades y capacidades fisiologicas del organismo en un nivel optimo para que puedan responder a las demandas del juego.");
    }
}
