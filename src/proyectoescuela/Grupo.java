/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.io.*;
import java.util.ArrayList;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;
import proyectoescuela.profesor.Profesor;

/**
 *
 * @author dulf2
 */
public class Grupo {

	String nombre;
	ArrayList<Alumno> alumnos = new ArrayList();
	ArrayList<Profesor> profesores = new ArrayList();
	ArrayList<Materia> materias = new ArrayList();
	Area area;

	public Grupo(String nombre, Area area){
		this.nombre = nombre;
		this.area = area;
	}

	public String getNombre(){
		return nombre;
	}

	public ArrayList<Alumno> getAlumnos(){
		return alumnos;
	}

	public void inscribirAlumno(Alumno alumno){
		alumnos.add(alumno);
	}
	public void darDeBajaAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }

	public ArrayList<Materia> getMaterias(){
		return materias;
	}
        
    public void agregarMateria(Materia m) throws UnsupportedOperationException{
        if (materias.size() < 2)
            materias.add(m);
        else
            throw new UnsupportedOperationException ("Este grupo ya tiene 2 materias asignadas");       
    }
        
    public void eliminaMateria(Materia m){
        materias.remove(m);
    }
    
    public int getAreaAsInt(){
        return area.getArea();
    }
    
    public Area getArea(){
        return this.area;
    }

    public ArrayList<Profesor> getProfesores(){
	return profesores;
    }
        
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
        
    public void eliminarProfesor(Profesor profesor){
        profesores.remove(profesor);
    }

    
}
