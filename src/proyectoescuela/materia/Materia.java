/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.profesor.Profesor;


/**
 * Clase abstracta de el patron template para crear las materias
 * @author dulf2
 */
public abstract class Materia {
    
    private ArrayList<Profesor> profesores = new ArrayList();
    
    /**
     * Constructor vacio
     */
    public Materia(){}
    
    /**
     * Metodo que regresa el nombre de una materia
     * @return nombre
     */
    public abstract String getNombre();
    
    /**
     * Metodo que regresa el nombre del area (String)
     * @return area
     */
    public abstract String getArea();
    
    /**
     * Metodo que regresa la lista de profesores que tiene una materia
     * @return lista de profesores
     */
    public abstract ArrayList<Profesor> getProfesores();
    
    /**
     * Metodo que agrega a un profesor a la lista de materias 
     * @param profesor 
     */
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
    
    /**
     * Metodo que elimina a un profesor de la lista de materias
     * @param profesor 
     */
    public void eliminarProfesor(Profesor profesor){
        profesores.remove(profesor);
    }
    
    
}
