/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;

/**
 * clase que se encarga de AsignarCalificacionProfesorOpcionTecnica
 * @author Lechuga
 */
public class AsignarCalificacionProfesorOpcionTecnica implements IAsignaCalificacion {

    Alumno alumno;
    ProfesorOpcionTecnica profesor;
            
    @Override
    public void asignarCalificacion(Alumno alumno, int calificacion) {
        alumno.setCalificacionOpcionTecnica(profesor.getOpcionTecnica(), calificacion);
    }
    
}
