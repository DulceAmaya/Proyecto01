/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.ArrayList;

/**
 *
 * @author dulf2
 */
public class Grupo {

	String nombre;
	ArrayList<Alumno> alumnos;
	ArrayList<Profesor> profesores;
	ArrayList<Materia> materias;
	Area area;

	public Grupo(String nombre, ArrayList<Alumno> alumnos, Area area){
		this.nombre = nombre;
		this.alumnos = alumnos;
		this.area = area;
		this.materias = area.getMaterias();
		for (m : materias){
			profesores.add(materias.getProfesor());
		}
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

	public ArrayList<Materia> getMaterias(){
		return materias;
	}

	public ArrayList<Profesor> getProfesores(){
		return profesores;
	}

    
}
