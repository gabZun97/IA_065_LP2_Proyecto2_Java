// La clase principal
package P2_SeleccionFutbol;

import java.util.Scanner;
public class P2_MainPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int opcion = 0;
        int repetir = 0;
        
        P2_InformacionGeneral info = new P2_InformacionGeneral();
        info.horasLaborales();
        info.vacaciones();
        info.viajes();
       
        do{ 
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Bienvenido al Sistema de Información  de la Selección  de Honduras");
            System.out.println("1. Futbolista \n2. Entrenador \n3. Entrenador Auxiliar \n4. Preparador Físico  \n5. Medico  \n6. Masajista");
            System.out.print("->");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    P2_Futbolista fut = new P2_Futbolista();
                    fut.mostrar("Cristiano Ronaldo", "Portero", "Derecho", "7", "Titular");
                    fut.entrenamiento();
                    fut.partidoFutbol();
                    fut.concentracion();
                    fut.realizacion();
                    break;
                case 2:
                    P2_Entrenador entre = new P2_Entrenador();
                    entre.mostrar("Marcos Lainez", "Sub-20","Entrenador");
                    entre.entrenamiento();
                    entre.partidoFutbol();
                    break;
                case 3:
                    P2_EntrenadorAuxiliar ent = new P2_EntrenadorAuxiliar();
                    ent.mostrar("Melvin Pastrana", "Sub-20","Entrenador auxiliar");
                    ent.entrenamiento();
                    ent.partidoFutbol();
                    break;
                case 4:
                    P2_PreparadorFisico fisico = new P2_PreparadorFisico();
                    fisico.mostrar("Juan Perez", "Ciencias de la actividad F�sico  y el deporte", "Preparador Físico ", "2 años");
                    fisico.entrenamiento();
                    fisico.partidoFutbol();
                    fisico.preparacion_fisica();
                    break; 
                case 5:
                    P2_Medico medico = new P2_Medico();
                    medico.mostrar("Daniel Irias", "Medicina general", "medico ", "4 Años");
                    medico.entrenamiento();
                    medico.partidoFutbol();
                    medico.atencion_medica();
                    break;
                case 6:
                    P2_Masajista masajista = new P2_Masajista();
                    masajista.mostrar("Andre Sandoval", "Fisioterapeuta", "Masajista", "6 Años");
                    masajista.entrenamiento();
                    masajista.partidoFutbol();
                    masajista.masajes();
                    break; 
                default:
                    System.out.println("Opción Invalida ");
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("*************************************************************************************");
            System.out.println("Desea consultar otra Información ? \n1.Si \n2.No");
            System.out.print("->");
            repetir = in.nextInt();
            System.out.println("*************************************************************************************");
        }while (repetir==1 );
        System.out.println("-------------------------------------------------------------------------------------");
        
    }
}
/*
Autorización y renuncia: 
Los (as) autores (as) 
facultan a la carrera de Informática Administrativa del Departamento de
Informática adscrito a la Facultad de Ciencias Econámicas, Administrativas y
Contables de la Universidad Nacional Autánoma de Honduras a través de sus
docentes para socializar el presente trabajo en los medios que estimen 
conveniente así mismo se seden los derechos sobre el mismo. La carrera de
Informática Administrativa o los docentes no son responsables por el contenido
y las implicaciones de lo que esta expresado en este documento.
*/
