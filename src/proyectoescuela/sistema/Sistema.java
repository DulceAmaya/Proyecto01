/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.sistema;

import static java.lang.System.in;
import java.util.Scanner;

/**
 * clase que se encarga de definir el sistema
 * @author josel
 */
public class Sistema {
    
    int seleccion;
    EstadoSistema estado;
    EstadoAdministrador estadoA = new EstadoAdministrador();
    EstadoProfesor estadoP = new EstadoProfesor();
    EstadoEstudiante estadoE = new EstadoEstudiante();
      
    public Sistema(EstadoSistema estado){
        this.estado = estado;
    }

    /**
     * Metodo que permite cambiar el estado del sisteam
     * @param nuevoEstado 
     */
    public void setEstado(EstadoSistema nuevoEstado){
        this.estado = nuevoEstado;
    }
    
    /**
     * Metodo que regresa el estado de un robot
     * @return estado
     */
    public EstadoSistema getEstado(){
        return this.estado;
    } 
    
    public void cambiaEstado(){
        Scanner sc = new Scanner(in); 
        seleccion = sc.nextInt();
        
        System.out.println("Selecciona el estado que deseas"
                + "\n 1 Administrador"
                + "\n 2 Profesor"
                + "\n 3 Alumno");
        
        switch(seleccion){
            case 1: 
                this.estado = estadoA;
                break;
            case 2: 
                this.estado = estadoP;
                break;
            case 3: 
                this.estado = estadoE;
                break;
            default:
                System.out.println("No se cambio el estado");
        }
    }
    
}
