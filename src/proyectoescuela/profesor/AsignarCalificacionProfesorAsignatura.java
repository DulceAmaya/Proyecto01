/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;
import proyectoescuela.materia.ExcepcionMateriaNoInscrita;
import proyectoescuela.profesor.ProfesorAsignatura;

/**
 * Clase que se encarga de implementar AsignarCalificacionProfesorAsignatura
 * @author Lechuga
 */
public class AsignarCalificacionProfesorAsignatura implements IAsignaCalificacion  {
    

    @Override
    public void asignarCalificacion(Object profesor, Alumno alumno, int calificacion) {
        ProfesorAsignatura profesorA = (ProfesorAsignatura)profesor;
        try{
        alumno.setCalificaciones(profesorA.getMateria(), calificacion);
        }catch (ExcepcionMateriaNoInscrita e){
            System.out.println("El alumno no tiene esa materia inscrita");
        }
    }
    
}
