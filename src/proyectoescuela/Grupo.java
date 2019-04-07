/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import proyectoescuela.area.Area;
import java.util.ArrayList;
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
	ArrayList<Materia> materias;
	Area area;

	public Grupo(String nombre, Area area){
		this.nombre = nombre;
		this.area = area;
		this.materias = area.getMaterias();
		
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
