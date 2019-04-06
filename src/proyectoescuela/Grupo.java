/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import proyectoescuela.profesor.Profesor;
import java.util.ArrayList;

/**
 *
 * @author dulf2
 */
public class Grupo {

	ArrayList<Alumno> alumnos;
	ArrayList<Profesor> profesores;
	ArrayList<Materia> materias;
	Area area;

	public Grupo(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores, Area area){
		this.alumnos = alumnos;
		this.profesores = profesores;
		this.area = area;
		this.materias = area.getMaterias();
	}

	public ArrayList<Alumno> getAlumnos(){
		return alumnos;
	}

	public void inscribirAlumno(Alumno alumno){
		alumnos.add(alumno);
	}

	public ArrayList<Materia> getMaterias(){
		return materias;
	}

	public ArrayList<Profesor> getProfesores(){
		return profesores;
	}
    
}
