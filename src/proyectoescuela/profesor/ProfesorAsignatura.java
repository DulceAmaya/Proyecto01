/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.profesor;

import proyectoescuela.Grupo;
import proyectoescuela.Materia;

/**
 *
 * @author Lechuga
 */
public class ProfesorAsignatura extends Profesor {
    
    public String nombre;
    public int id;
    public Materia materia;
    public Grupo grupo;
    public Alumno alumno;

    public ProfesorAsignatura(String nombre, int id, Materia materia, Grupo grupo) {
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.grupo = grupo;
    }
    
    public String consultaInformacionGrupo(){
        return "" + grupo.getAlumnos().toString() + grupo.getNombre() + materia.getNombre();
    }
    
    public void asignaCalificacion(Alumno alumno, int calificacion){
        
    }
    
    
}
