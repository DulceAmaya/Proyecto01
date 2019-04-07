/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.administrador;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.Profesor;
import proyectoescuela.profesor.ProfesorAsignatura;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 *
 * @author Lechuga
 */
public interface IObservado {
    
    /**
     * Metdo que regresa una lista de los alumnos totales
     * @return alumnos
     */
    public ArrayList<Alumno> AlumnosInscritos();
    
    /**
     * Metodo que regresa una lista de alumnos inscritos por area
     * @param area
     * @return alumnos
     */
    public ArrayList<Alumno> AlumnosInscritosArea(Area area);
    
    /**
     * Metodo que regresa una lista de alumnos por opcion tecnica
     * @param opcionTecnica
     * @return alumnos 
     */
    public ArrayList<Alumno> AlumnosOpcionesTecnicas(OpcionTecnica opcionTecnica);
    
    /**
     * Metodo que regresa una lista de profesores contratados
     * @return profesores
     */
    public ArrayList<Profesor> ProfesoresContratados();
    
    /**
     * Metodo del patron observer que sirve para agregar Alumnos a la lista 
     * @param nombre
     * @param fechaDeNacimiento
     * @param numeroDeCuenta
     * @param correo
     * @param grupo
     * @param materias
     */
    public void inscribirAlumno(String nombre, String fechaDeNacimiento, int numeroDeCuenta, String correo, Grupo grupo, Materia[] materias);
    
    /**
     * Metodo del patron observer que sirve para eliminar alumnos de la lista
     * @param alumno 
     */
    public void bajaAlumno (Alumno alumno);
    
    /**
     * Metodo para cambiar el estado del alumno a graduado
     * @param alumno 
     */
    public void graduarAlumno(Alumno alumno);
    
    /**
     * Metodo para cancelar la graduacion de un alumno
     * @param alumno 
     */
    public void cancelarGraduacionAlumno(Alumno alumno);
    
    /**
     * Metodo que agrega un profesor de asignatura al sistema
     * @param nombre
     * @param materia
     * @param grupo 
     */
    public void contrataProfesorAsignatura(String nombre, Materia materia, Grupo grupo);
    
    /**
     * Metodo para eliminar de la escuela a un profesor de asignatura
     * @param profesorA 
     */
    public void despedirProfesorAsignatura(ProfesorAsignatura profesorA);
    
    /**
     * Metodo que agrega un instructor de opcion tecnica al sistema
     * @param nombre
     * @param opcionTecnica 
     */
    public void contrataProfesorOpcionTecnica(String nombre, OpcionTecnica opcionTecnica);
    
    /**
     * Metodo para eliminar de la escuela a un profesor de opcion tecnica
     * @param profesorOT 
     */
    public void despedirProfesorOpcionTecnica(ProfesorOpcionTecnica profesorOT);
    
    /**
     * Metodo del patron observer para notificar a los alumnos que hay un nuevo alumno!
     */
    public void notificaNuevoAlumno();
    
    /**
     * Metodo del patron observer para notificar que un alumno fue dado de baja
     */
    public void notificaBajaAlumno();
    
    /**
     * Metodo del patron observer para notificar que un alumno se graduo
     */
    public void notificaGraduacionAlumno();
    
    /**
     * Metodo del patron observer para notificar que se contrato a un nuevo profesor
     */
    public void notificaNuevoProfesor();
    
    /**
     * Metodo que notifica la baja de un profesor
     */
    public void notificaBajaProfesor();
       
}
