/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.Hashtable;
import java.util.ArrayList;
import proyectoescuela.materia.Materia;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.*;

/**
 *
 * @author dulf2
 */
public class Administrador implements IObservado{
    
    Escuela escuela = new Escuela();
    ArrayList<Alumno> alumnos;
    ProfesorAsignatura[] profesoresAsignatura = new ProfesorAsignatura [100];
    ProfesorOpcionTecnica[] profesoresOpcionTecnica = new ProfesorOpcionTecnica [100];
    ArrayList<IObservador> observadores;
    boolean hayEspacio;
    
    public Administrador(){}
    
    public Hashtable<Integer, Alumno> obtenerAlumnosInscritos(){
        return escuela.alumnosInscritos;
    }

    public ArrayList<Alumno> obtenerAlumnosAreas(int area){
        ArrayList<Alumno> tmp = new ArrayList();
        for(Grupo g : escuela.grupos){
        	if(g.getArea() == area)
        		tmp.addAll(g.getAlumnos());
        } 
        return tmp;
    }

    // public ArrayList<Alumno> obtenerAlumnosCarreraTecnica(CarreraTecnica ct)

    public Profesor[] obtenerProfesores(){
    	return escuela.profesores;
    }

    
    /////////////////Parte de lechuga//////////////////////////////
    
    @Override
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    @Override
    public void agregarProfesorAsignatura(ProfesorAsignatura profesor) {
           
    }

    @Override
    public void eliminarProfesorAsignatura(ProfesorAsignatura profesor) {

    }

    @Override
    public void agregarProfesoresOpcionTecnica(ProfesorOpcionTecnica profesor) {

    }

    @Override
    public void eliminarProfesoresOpcionTecnica(ProfesorOpcionTecnica profesor) {

    }

    @Override
    public void notificarAlumno() {
        for(Alumno alumno : alumnos){
            alumno.actualiza();
        }
    }
    
    @Override
    public void notificaProfesorAsignatura(){
        
    }
    
    @Override
    public void notificaProfesorOpcionTecnica(){
        
    }
    
    /**
     * Metodo para cambiar el estado del alumno a graduado
     * @param alumno 
     */
    public void graduarAlumno(Alumno alumno){
        
    }
    
    /**
     * Metodo para cancelar la graduacion de un alumno
     * @param alumno 
     */
    public void cancelarGraduacionAlumno(Alumno alumno){
        
    }
    
    /**
     * Metodo para inscribir un alumno a la escuela
     * @param nombre
     * @param fechaDeNacimiento
     * @param numeroDeCuenta
     * @param correo
     * @param grupo
     * @param materias 
     */
    public void inscribirAlumno(String nombre, String fechaDeNacimiento, int numeroDeCuenta, String correo, Grupo grupo, Materia[] materias){
        
    }
    
    /**
     * Metodo para borrar a un alumno del sistema
     * @param alumno 
     */
    public void bajaAlumno(Alumno alumno){
        
    }
    
    /**
     * Metodo que agrega un profesor de asignatura al sistema
     * @param nombre
     * @param materia
     * @param grupo 
     */
    public void contrataProfesorAsignatura(String nombre, Materia materia, Grupo grupo){
        
    }
    
    /**
     * Metodo que agrega un instructor de opcion tecnica al sistema
     * @param nombre
     * @param opcionTecnica 
     */
    public void contrataProfesorOpcionTecnica(String nombre, OpcionTecnica opcionTecnica){
        
    }
    
    /**
     * Metodo para eliminar de la escuela a un profesor de asignatura
     * @param profesorA 
     */
    public void despedirProfesorAsignatura(ProfesorAsignatura profesorA){
        
    }
    
    /**
     * Metodo para eliminar de la escuela a un profesor de opcion tecnica
     * @param profesorOT 
     */
    public void despedirProfesorOpcionTecnica(ProfesorOpcionTecnica profesorOT){
        
    }   
    
}
