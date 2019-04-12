/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 * clase que se encarga de AsignarCalificacionProfesorOpcionTecnica
 * @author Lechuga
 */
public class AsignarCalificacionProfesorOpcionTecnica implements IAsignaCalificacion {

    Alumno alumno;
    ProfesorOpcionTecnica profesor;
            
    @Override
    public void asignarCalificacion(Object profesor, Alumno alumno, int calificacion) {
        ProfesorOpcionTecnica profesorOT = (ProfesorOpcionTecnica)profesor;
        alumno.setCalificacionOpcionTecnica(profesorOT.getOpcionTecnica(), calificacion);
    }
    
}
