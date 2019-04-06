/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import proyectoescuela.profesor.ProfesorInstructorOpcionTencnica;

/**
 * Clase de la opcion tecnica Laboratorista
 * @author Lechuga
 */
public class OpcionTecnicaLaboratorista extends OpcionTecnica {
    
    public OpcionTecnicaLaboratorista(ProfesorInstructorOpcionTencnica instructor){
        super(instructor);
    }
    
    /**
     * Metodo que regresa el nombre de la opcion tecnica
     * @return nombre
     */
    @Override
    public String getNombre(){
        return "Quimico laboratorista";
    }
    
}
