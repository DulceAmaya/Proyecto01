/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.Hashtable;
import java.util.ArrayList;
import proyectoescuela.profesor.*;

/**
 *
 * @author dulf2
 */
public class Administrador {
    
    Escuela escuela = new Escuela();
    
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
    
}
