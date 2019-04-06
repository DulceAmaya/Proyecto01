/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.profesor;

import proyectoescuela.Alumno;
import proyectoescuela.ExcepcionMateriaNoInscrita;
import proyectoescuela.Materia;

/**
 *
 * @author Lechuga
 */
public class AsignarCalificacionProfesorAsignatura implements IAsignaCalificacion  {
    
    Alumno alumno;
    ProfesorAsignatura profesor;
    Materia materia = profesor.getMateria();

    @Override
    public void asignarCalificacion(Alumno alumno, int calificacion) {
        try{
        alumno.setCalificaciones(this.materia, calificacion);
        }catch (ExcepcionMateriaNoInscrita e){
            System.out.println("El alumno no tiene esa materia inscrita");
        }
    }
    
}
