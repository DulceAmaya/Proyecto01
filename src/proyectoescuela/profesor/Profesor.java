/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.Alumno;
import proyectoescuela.administrador.IObservador;

/**
 * Define los tipos de profesores en la escuela (patron Strategy)
 * @author Lechuga
 */
public abstract class Profesor implements IObservador{
    
    /**
     * Metodo que consulta la informacion de un grupo
     * @return 
     */
    public abstract String consultaInformacionGrupo();
    
    /**
     * Metodo que asigna la calificacion a un alumno de una materia
     * @param alumno
     * @param calificacion 
     */
    public abstract void asignarCalificacion(Alumno alumno, int calificacion);
    
    
}
