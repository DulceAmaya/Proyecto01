/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.profesor.Profesor;


/**
 *
 * @author dulf2
 */
public abstract class Materia {
    
    private ArrayList<Profesor> profesores = new ArrayList();
    
    public Materia(){}
    
    public abstract String getNombre();
    
    public abstract String getArea();
    
    public abstract ArrayList<Profesor> getProfesores();
    
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
    
    public void eliminarProfesor(Profesor profesor){
        profesores.remove(profesor);
    }
    
    
}
