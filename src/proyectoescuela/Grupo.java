/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela;

import proyectoescuela.alumno.Alumno;
import java.util.ArrayList;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;
import proyectoescuela.profesor.*;

/**
 * Clase que se encargara de grupo
 * @author dulf2
 */
public class Grupo {

    String nombre;
    ArrayList<Alumno> alumnos = new ArrayList();
    ArrayList<ProfesorAsignatura> profesores = new ArrayList();
    ArrayList<Materia> materias = new ArrayList();
    Area area;
        
    /**
     * Constructor de grupos
     * @param nombre
     * @param area 
     */
    public Grupo(String nombre, Area area){
	this.nombre = nombre;
	this.area = area;
    }

    /**
     * Metodo que regresa el nombre del grupo
     * @return nombre
     */
    public String getNombre(){
    	return nombre;
    }

    /**
     * Metodo que regresa los alumnos inscritos en el grupo
     * @return alumnos
     */
    public ArrayList<Alumno> getAlumnos(){
	return alumnos;
    }

    /**
     * metodo que inscribe un alumno a un grupo
     * @param alumno 
     */
    public void inscribirAlumno(Alumno alumno){
	alumnos.add(alumno);
    }
    
    /**
     * Metodo que da de baja un alumno de un grupo
     * @param alumno 
     */
    public void darDeBajaAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }
    
    /**
     * Metodo que regresa las materias del grupo
     * @return materias
     */
    public ArrayList<Materia> getMaterias(){
	return materias;
    }
        
    /**
     * Metodo que agrega una materia al grupo
     * @param m
     * @throws UnsupportedOperationException 
     */
    public void agregarMateria(Materia m) throws UnsupportedOperationException{
        if (materias.size() < 2)
            materias.add(m);
        else
            throw new UnsupportedOperationException ("Este grupo ya tiene 2 materias asignadas");       
    }
        
    /**
     * Metodo que elimina una materia del grupo
     * @param m 
     */
    public void eliminaMateria(Materia m){
        materias.remove(m);
    }
    
    /**
     * Metodo que regresa la area como entero
     * @return area as int
     */
    public int getAreaAsInt(){
        return area.getArea();
    }
    
    /**
     * Metodo que regresa el area
     * @return area
     */
    public Area getArea(){
        return this.area;
    }

    /**
     * Metodo que regresa la lista de profesores
     * @return profesores
     */
    public ArrayList<ProfesorAsignatura> getProfesores(){
	return profesores;
    }
        
    /**
     * Metodo que agrega un profesor al grupo
     * @param profesor 
     */
    public void agregarProfesor(ProfesorAsignatura profesor){
        profesores.add(profesor);
    }
        
    /**
     * Metodo que elimina un profesor del grupo
     * @param profesor 
     */
    public void eliminarProfesor(ProfesorAsignatura profesor){
        profesores.remove(profesor);
    }

    
}
