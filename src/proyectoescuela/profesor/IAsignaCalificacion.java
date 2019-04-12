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
     * @param materia 
     * @param calificacion
     */
    public void asignarCalificacion(Object profesor, Alumno alumno, int calificacion);
    
}
