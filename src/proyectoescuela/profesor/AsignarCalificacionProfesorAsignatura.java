/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;
import proyectoescuela.materia.ExcepcionMateriaNoInscrita;
import proyectoescuela.materia.Materia;

/**
 * Clase que se encarga de implementar AsignarCalificacionProfesorAsignatura
 * @author Lechuga
 */
public class AsignarCalificacionProfesorAsignatura implements IAsignaCalificacion  {
    
    Alumno alumno;
    ProfesorAsignatura profesor;
    Materia materia = profesor.getMateria();

    @Override
    public void asignarCalificacion(Alumno alumno, int calificacion) {
        try{
        alumno.setCalificaciones(materia, calificacion);
        }catch (ExcepcionMateriaNoInscrita e){
            System.out.println("El alumno no tiene esa materia inscrita");
        }
    }
    
}
