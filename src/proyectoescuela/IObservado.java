/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import proyectoescuela.profesor.ProfesorAsignatura;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 *
 * @author Lechuga
 */
public interface IObservado {
    
    /**
     * Metodo del patron observer que sirve para agregar Alumnos a la lista
     * @param alumno 
     */
    public void agregarAlumno(Alumno alumno);
    
    /**
     * Metodo del patron observer que sirve para eliminar alumnos de la lista
     * @param alumno 
     */
    public void eliminarAlumno(Alumno alumno);
    
    /**
     * Metodo del patron observer que sirve para agregar profesores de asignatura a la lista
     * @param profesor 
     */
    public void agregarProfesorAsignatura(ProfesorAsignatura profesor);
    
    /**
     * Metodo del patron observer que sirve para eliminar profesores de asignatura de la lista
     * @param profesor 
     */
    public void eliminarProfesorAsignatura(ProfesorAsignatura profesor);
    
    /**
     * Metodo del patron observer que sirve para agregar profesores de opcion tecnica a la lista
     * @param profesor 
     */
    public void agregarProfesoresOpcionTecnica(ProfesorOpcionTecnica profesor);
    
    /**
     * Metodo del patron observer que sirve para eliminar profesores de opcion tecnica de la lista
     * @param profesor 
     */
    public void eliminarProfesoresOpcionTecnica(ProfesorOpcionTecnica profesor);
    
    /**
     * Metodo del patron observer para notificar a los Observadores
     */
    public void notificarAlumno();
    
    public void notificaProfesorAsignatura();
    
    public void notificaProfesorOpcionTecnica
    
    
}
