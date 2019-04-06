/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import proyectoescuela.profesor.ProfesorInstructorOpcionTencnica;

/**
 * Clase que se encarga de manejar las opciones tecnicas (Patron Factory)
 * @author Lechuga
 */


public abstract class OpcionTecnica {

    public ProfesorInstructorOpcionTencnica instructor;
    
    /**
     * Constructor que recibe un instructor
     * @param instructor 
     */
    public OpcionTecnica(ProfesorInstructorOpcionTencnica instructor){
        this.instructor = instructor;
    }
    
    /**
     * Metodo que regresa el nombre de la opcion tecnica
     * @return nombre
     */
    public abstract String getNombre();
}
