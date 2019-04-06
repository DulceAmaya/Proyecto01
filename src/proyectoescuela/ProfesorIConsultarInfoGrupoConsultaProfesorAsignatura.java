/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

/**
 *
 * @author Lechuga
 */
public class ProfesorIConsultarInfoGrupoConsultaProfesorAsignatura implements ProfesorIConsultarInfoGrupo{
    public String nombre;
    public int id;
    public Materia materia;
    public Grupo grupo;
    public Alumno alumno;
    
    public void asignaCalificacion(Alumno alumno, int calificacion){
        alumno.setCalificacion(materia, calificacion);
        System.out.println("La calificacion fue asignada");
    }
}
