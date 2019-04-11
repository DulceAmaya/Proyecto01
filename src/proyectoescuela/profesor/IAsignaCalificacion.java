/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;

/**
 * Interface para que el profesor asigne una calificacion
 * @author Lechuga
 */
public interface IAsignaCalificacion {
    
    /**
     * Metodo que asigna una calificacion a un alumno
     * @param alumno
     * @param calificacion 
     */
    public void asignarCalificacion(Alumno alumno, int calificacion);
    
}
