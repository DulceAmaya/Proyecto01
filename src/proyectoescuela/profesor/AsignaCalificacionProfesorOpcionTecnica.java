/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.profesor;

import proyectoescuela.Alumno;

/**
 *
 * @author Lechuga
 */
public class AsignaCalificacionProfesorOpcionTecnica implements IAsignaCalificacion {

    Alumno alumno;
    ProfesorOpcionTecnica profesor;
            
    @Override
    public void asignarCalificacion(Alumno alumno, int calificacion) {
        alumno.setCalificacionOpcionTecnica(profesor.getOpcionTecnica(), calificacion);
    }
    
}
